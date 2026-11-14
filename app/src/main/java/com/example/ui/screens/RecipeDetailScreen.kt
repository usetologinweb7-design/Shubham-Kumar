package com.example.ui.screens

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.StarBorder
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.local.ReviewEntity
import com.example.data.model.*
import com.example.ui.components.RasoiFoodImage
import com.example.ui.components.VegIndicatorBadge
import com.example.ui.theme.GoldenStar
import com.example.ui.theme.HerbGreen
import com.example.ui.theme.HerbGreenContainer
import com.example.ui.theme.TerracottaOrange
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun RecipeDetailScreen(
    recipe: Recipe,
    language: AppLanguage,
    isFavorite: Boolean,
    ratingSummary: RecipeRatingSummary?,
    reviews: List<ReviewEntity>,
    ingredientChecks: Map<Int, Boolean>,
    onBack: () -> Unit,
    onToggleFavorite: () -> Unit,
    onToggleIngredient: (Int, Boolean) -> Unit,
    onStartCooking: () -> Unit,
    onSubmitReview: (reviewerName: String, rating: Int, comment: String) -> Unit,
    modifier: Modifier = Modifier
) {
    val isHindi = language == AppLanguage.HINDI
    val context = LocalContext.current

    var servings by remember(recipe.id) { mutableIntStateOf(recipe.defaultServings) }
    var selectedStars by remember { mutableIntStateOf(0) }
    var reviewerName by remember { mutableStateOf("") }
    var reviewComment by remember { mutableStateOf("") }
    var showReviewSuccess by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("recipe_detail_screen")
    ) {
        LazyColumn(
            contentPadding = PaddingValues(bottom = 96.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            // Hero Image with Back, Share, Favorite
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(276.dp)
                ) {
                    RasoiFoodImage(
                        localRes = recipe.imageRes,
                        imageUrl = recipe.imageUrl,
                        contentDescription = recipe.title(language),
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(bottomStart = 28.dp, bottomEnd = 28.dp))
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(bottomStart = 28.dp, bottomEnd = 28.dp))
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(Color.Black.copy(alpha = 0.4f), Color.Transparent, Color.Black.copy(alpha = 0.25f))
                                )
                            )
                    )

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .statusBarsPadding()
                            .padding(horizontal = 14.dp, vertical = 10.dp)
                    ) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier
                                .size(44.dp)
                                .clip(CircleShape)
                                .background(Color.Black.copy(alpha = 0.45f))
                                .testTag("detail_back_button")
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                tint = Color.White
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            IconButton(
                                onClick = {
                                    val shareText = buildString {
                                        append("${recipe.title(language)} (${recipe.subtitle(language)})\n")
                                        append("${recipe.country.flag} ${if (isHindi) recipe.country.nameHi else recipe.country.nameEn} | ${recipe.totalMinutes} min\n\n")
                                        append(if (isHindi) "सामग्री:\n" else "Ingredients:\n")
                                        recipe.ingredients.forEach { ing ->
                                            val qty = formatScaledQuantity(ing.baseQuantity, recipe.defaultServings, servings, ing.isScalable)
                                            val unit = if (isHindi) ing.unitHi else ing.unitEn
                                            val name = if (isHindi) ing.nameHi else ing.nameEn
                                            append("• $name: $qty $unit\n")
                                        }
                                        append("\nShared from Rasoi Guru - हर किसी के लिए आसान Cooking")
                                    }
                                    val sendIntent = Intent(Intent.ACTION_SEND).apply {
                                        type = "text/plain"
                                        putExtra(Intent.EXTRA_TEXT, shareText)
                                    }
                                    context.startActivity(
                                        Intent.createChooser(sendIntent, if (isHindi) "रेसिपी साझा करें" else "Share Recipe")
                                    )
                                },
                                modifier = Modifier
                                    .size(44.dp)
                                    .clip(CircleShape)
                                    .background(Color.White.copy(alpha = 0.92f))
                                    .testTag("detail_share_button")
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.Share,
                                    contentDescription = "Share recipe",
                                    tint = Color(0xFF4A2511)
                                )
                            }

                            IconButton(
                                onClick = onToggleFavorite,
                                modifier = Modifier
                                    .size(44.dp)
                                    .clip(CircleShape)
                                    .background(Color.White.copy(alpha = 0.92f))
                                    .testTag("detail_favorite_button")
                            ) {
                                Icon(
                                    imageVector = if (isFavorite) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                                    contentDescription = if (isFavorite) "Remove favorite" else "Add favorite",
                                    tint = if (isFavorite) TerracottaOrange else Color(0xFF4A2511)
                                )
                            }
                        }
                    }
                }
            }

            // Title, Country, Rating, Difficulty & Time Info Cards
            item {
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 14.dp)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        VegIndicatorBadge(isVeg = recipe.isVeg)
                        Text(
                            text = "${recipe.country.flag} ${if (isHindi) recipe.country.nameHi else recipe.country.nameEn} • ${if (isHindi) recipe.category.nameHi else recipe.category.nameEn}",
                            style = MaterialTheme.typography.labelLarge,
                            color = MaterialTheme.colorScheme.primary
                        )
                    }

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = recipe.title(language),
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "(${recipe.subtitle(language)})",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = recipe.description(language),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    // Rating & Difficulty Summary Row
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(14.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Filled.Star,
                                contentDescription = null,
                                tint = GoldenStar,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            val reviewCount = ratingSummary?.reviewCount ?: 0
                            val avgText = if (reviewCount > 0) {
                                String.format(Locale.US, "%.1f (%d)", ratingSummary!!.averageRating, reviewCount)
                            } else {
                                if (isHindi) "कोई रेटिंग नहीं" else "No ratings yet"
                            }
                            Text(
                                text = avgText,
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = FontWeight.SemiBold
                            )
                        }

                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = HerbGreenContainer
                        ) {
                            Text(
                                text = if (isHindi) "स्तर: ${recipe.difficulty.nameHi}" else "Level: ${recipe.difficulty.nameEn}",
                                style = MaterialTheme.typography.labelMedium,
                                color = HerbGreen,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Prep, Cook & Total Time Info Cards
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        TimeStatCard(
                            icon = Icons.Filled.Restaurant,
                            label = if (isHindi) "तैयारी" else "Prep Time",
                            value = if (isHindi) "${recipe.prepMinutes} मिनट" else "${recipe.prepMinutes} min",
                            modifier = Modifier.weight(1f)
                        )
                        TimeStatCard(
                            icon = Icons.Filled.LocalFireDepartment,
                            label = if (isHindi) "पकाने का समय" else "Cook Time",
                            value = if (isHindi) "${recipe.cookMinutes} मिनट" else "${recipe.cookMinutes} min",
                            modifier = Modifier.weight(1f)
                        )
                        TimeStatCard(
                            icon = Icons.Filled.Schedule,
                            label = if (isHindi) "कुल समय" else "Total Time",
                            value = if (isHindi) "${recipe.totalMinutes} मिनट" else "${recipe.totalMinutes} min",
                            modifier = Modifier.weight(1f)
                        )
                    }

                    // Prior-prep honest notice if applicable
                    recipe.priorPrepNote(language)?.let { note ->
                        Spacer(modifier = Modifier.height(12.dp))
                        Surface(
                            shape = RoundedCornerShape(14.dp),
                            color = MaterialTheme.colorScheme.primaryContainer,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(12.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.Info,
                                    contentDescription = null,
                                    tint = MaterialTheme.colorScheme.primary
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = note,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                                    fontWeight = FontWeight.Medium
                                )
                            }
                        }
                    }
                }
            }

            // Ingredients Section Header + Servings Adjuster
            item {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = if (isHindi) "🧺 सामग्री ($servings लोगों के लिए)" else "🧺 Ingredients ($servings servings)",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = if (isHindi) "उपलब्ध सामग्री पर टिक (✓) लगाएं" else "Check off items you have ready",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    // Servings Stepper
                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = MaterialTheme.colorScheme.surfaceVariant
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            IconButton(
                                onClick = { if (servings > 1) servings-- },
                                enabled = servings > 1,
                                modifier = Modifier
                                    .size(40.dp)
                                    .testTag("servings_decrease_button")
                            ) {
                                Icon(Icons.Filled.Remove, contentDescription = "Decrease servings")
                            }
                            Text(
                                text = "$servings",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(horizontal = 6.dp)
                            )
                            IconButton(
                                onClick = { if (servings < 12) servings++ },
                                enabled = servings < 12,
                                modifier = Modifier
                                    .size(40.dp)
                                    .testTag("servings_increase_button")
                            ) {
                                Icon(Icons.Filled.Add, contentDescription = "Increase servings")
                            }
                        }
                    }
                }
            }

            // Ingredient Rows
            itemsIndexed(recipe.ingredients) { index, ingredient ->
                val isChecked = ingredientChecks[index] == true
                val qty = formatScaledQuantity(
                    baseQty = ingredient.baseQuantity,
                    defaultServings = recipe.defaultServings,
                    targetServings = servings,
                    isScalable = ingredient.isScalable
                )
                val unit = if (isHindi) ingredient.unitHi else ingredient.unitEn
                val primaryName = if (isHindi) ingredient.nameHi else ingredient.nameEn
                val secondaryName = if (isHindi) ingredient.nameEn else ingredient.nameHi

                Surface(
                    shape = RoundedCornerShape(14.dp),
                    color = MaterialTheme.colorScheme.surface,
                    tonalElevation = 1.dp,
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 4.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .clickable { onToggleIngredient(index, !isChecked) }
                        .testTag("ingredient_row_$index")
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp)
                    ) {
                        RasoiFoodImage(
                            localRes = ingredient.fallbackRes,
                            imageUrl = ingredient.imageUrl,
                            contentDescription = primaryName,
                            modifier = Modifier
                                .size(44.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = primaryName,
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Medium,
                                textDecoration = if (isChecked) TextDecoration.LineThrough else TextDecoration.None,
                                color = if (isChecked) MaterialTheme.colorScheme.onSurfaceVariant else MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                text = secondaryName,
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        Text(
                            text = if (qty.isNotEmpty()) "$qty $unit" else unit,
                            style = MaterialTheme.typography.labelLarge,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(end = 6.dp)
                        )
                        Checkbox(
                            checked = isChecked,
                            onCheckedChange = { onToggleIngredient(index, it) },
                            modifier = Modifier.testTag("ingredient_checkbox_$index")
                        )
                    }
                }
            }

            // Step-by-Step Timing Overview ("कितनी देर उबालना/रखना है")
            item {
                Spacer(modifier = Modifier.height(14.dp))
                Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                    Text(
                        text = if (isHindi) "⏱ सभी कदम और समय (${recipe.steps.size} चरण)" else "⏱ Cooking Steps & Timing (${recipe.steps.size} steps)",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = if (isHindi) {
                            "कुल समय: ${recipe.totalMinutes} मिनट (तैयारी ${recipe.prepMinutes} + पकाना ${recipe.cookMinutes})"
                        } else {
                            "Ready in ~${recipe.totalMinutes} min (Prep ${recipe.prepMinutes}m + Cook ${recipe.cookMinutes}m)"
                        },
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        color = MaterialTheme.colorScheme.surface,
                        tonalElevation = 1.dp,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            recipe.steps.forEachIndexed { idx, step ->
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 6.dp)
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier.weight(1f)
                                    ) {
                                        Surface(
                                            shape = CircleShape,
                                            color = MaterialTheme.colorScheme.primaryContainer,
                                            modifier = Modifier.size(26.dp)
                                        ) {
                                            Box(contentAlignment = Alignment.Center) {
                                                Text(
                                                    text = "${step.stepNumber}",
                                                    style = MaterialTheme.typography.labelMedium,
                                                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                                                    fontWeight = FontWeight.Bold
                                                )
                                            }
                                        }
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Column {
                                            Text(
                                                text = if (isHindi) step.titleHi else step.titleEn,
                                                style = MaterialTheme.typography.bodyMedium,
                                                fontWeight = FontWeight.SemiBold
                                            )
                                            val timing = if (isHindi) step.timingDetailHi else step.timingDetailEn
                                            if (!timing.isNullOrBlank()) {
                                                Text(
                                                    text = timing,
                                                    style = MaterialTheme.typography.bodySmall,
                                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                                )
                                            }
                                        }
                                    }
                                    Text(
                                        text = if (isHindi) "${step.durationMinutes} मि" else "${step.durationMinutes}m",
                                        style = MaterialTheme.typography.labelMedium,
                                        color = MaterialTheme.colorScheme.primary,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(start = 8.dp)
                                    )
                                }
                                if (idx < recipe.steps.lastIndex) {
                                    HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
                                }
                            }
                        }
                    }
                }
            }

            // Cooking & Safety Tips Cards
            item {
                Spacer(modifier = Modifier.height(14.dp))
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.padding(horizontal = 16.dp)
                ) {
                    TipBannerCard(
                        icon = Icons.Filled.Lightbulb,
                        title = if (isHindi) "शेफ की खास सलाह (Cooking Tip)" else "Chef's Cooking Tip",
                        body = recipe.cookingTip(language),
                        containerColor = MaterialTheme.colorScheme.secondaryContainer,
                        iconTint = MaterialTheme.colorScheme.primary
                    )
                    TipBannerCard(
                        icon = Icons.Filled.HealthAndSafety,
                        title = if (isHindi) "किचन सुरक्षा टिप (Safety Tip)" else "Kitchen Safety Tip",
                        body = recipe.safetyTip(language),
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        iconTint = MaterialTheme.colorScheme.tertiary
                    )
                }
            }

            // Ratings & Reviews Section
            item {
                Spacer(modifier = Modifier.height(20.dp))
                Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                    Text(
                        text = if (isHindi) "⭐ रेटिंग और समीक्षाएं" else "⭐ Ratings & Reviews",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    // Add Review Card
                    Card(
                        shape = RoundedCornerShape(18.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Text(
                                text = if (isHindi) "इस रेसिपी को रेट करें:" else "Rate this recipe:",
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = FontWeight.SemiBold
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                (1..5).forEach { star ->
                                    IconButton(
                                        onClick = { selectedStars = star },
                                        modifier = Modifier
                                            .size(44.dp)
                                            .testTag("rate_star_$star")
                                    ) {
                                        Icon(
                                            imageVector = if (star <= selectedStars) Icons.Filled.Star else Icons.Outlined.StarBorder,
                                            contentDescription = "$star stars",
                                            tint = if (star <= selectedStars) GoldenStar else MaterialTheme.colorScheme.onSurfaceVariant,
                                            modifier = Modifier.size(30.dp)
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            OutlinedTextField(
                                value = reviewerName,
                                onValueChange = { reviewerName = it },
                                label = { Text(if (isHindi) "आपका नाम (वैकल्पिक)" else "Your Name (optional)") },
                                singleLine = true,
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("review_name_input")
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            OutlinedTextField(
                                value = reviewComment,
                                onValueChange = { reviewComment = it },
                                label = { Text(if (isHindi) "अपना अनुभव लिखें..." else "Write your review...") },
                                minLines = 2,
                                maxLines = 4,
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("review_comment_input")
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Button(
                                onClick = {
                                    if (selectedStars > 0) {
                                        onSubmitReview(reviewerName, selectedStars, reviewComment)
                                        selectedStars = 0
                                        reviewerName = ""
                                        reviewComment = ""
                                        showReviewSuccess = true
                                    }
                                },
                                enabled = selectedStars > 0,
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("submit_review_button")
                            ) {
                                Text(if (isHindi) "समीक्षा सबमिट करें" else "Submit Rating & Review")
                            }
                            if (showReviewSuccess) {
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = if (isHindi) "✓ आपकी समीक्षा सेव हो गई है!" else "✓ Your review has been saved!",
                                    style = MaterialTheme.typography.labelMedium,
                                    color = MaterialTheme.colorScheme.tertiary
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Honest Reviews Empty State or User Reviews List
                    if (reviews.isEmpty()) {
                        Surface(
                            shape = RoundedCornerShape(16.dp),
                            color = MaterialTheme.colorScheme.surfaceVariant,
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("reviews_empty_state")
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.padding(18.dp)
                            ) {
                                Text(
                                    text = if (isHindi) "अभी कोई समीक्षा नहीं है" else "No reviews yet",
                                    style = MaterialTheme.typography.titleSmall,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = if (isHindi) "यह डिश बनाकर पहली समीक्षा देने वाले बनें!" else "Cook this recipe and be the first to leave a genuine review!",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    } else {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            reviews.forEach { review ->
                                Surface(
                                    shape = RoundedCornerShape(14.dp),
                                    color = MaterialTheme.colorScheme.surface,
                                    tonalElevation = 1.dp,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Column(modifier = Modifier.padding(12.dp)) {
                                        Row(
                                            horizontalArrangement = Arrangement.SpaceBetween,
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Text(
                                                text = review.reviewerName,
                                                style = MaterialTheme.typography.titleSmall,
                                                fontWeight = FontWeight.Bold
                                            )
                                            Row {
                                                repeat(review.rating) {
                                                    Icon(
                                                        imageVector = Icons.Filled.Star,
                                                        contentDescription = null,
                                                        tint = GoldenStar,
                                                        modifier = Modifier.size(15.dp)
                                                    )
                                                }
                                            }
                                        }
                                        if (review.comment.isNotBlank()) {
                                            Spacer(modifier = Modifier.height(4.dp))
                                            Text(
                                                text = review.comment,
                                                style = MaterialTheme.typography.bodyMedium
                                            )
                                        }
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            text = SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(Date(review.createdAt)),
                                            style = MaterialTheme.typography.labelSmall,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // Sticky Bottom CTA Button ("आगे बढ़ें →")
        Surface(
            shadowElevation = 10.dp,
            color = MaterialTheme.colorScheme.background.copy(alpha = 0.96f),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .navigationBarsPadding()
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                Button(
                    onClick = onStartCooking,
                    shape = RoundedCornerShape(18.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(54.dp)
                        .testTag("start_cooking_steps_button")
                ) {
                    Text(
                        text = if (isHindi) "आगे बढ़ें (स्टेप-बाय-स्टेप सीखें)" else "Start Step-by-Step Guide",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = null
                    )
                }
            }
        }
    }
}

@Composable
private fun TimeStatCard(
    icon: ImageVector,
    label: String,
    value: String,
    modifier: Modifier = Modifier
) {
    Surface(
        shape = RoundedCornerShape(14.dp),
        color = MaterialTheme.colorScheme.surface,
        tonalElevation = 1.dp,
        modifier = modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(vertical = 10.dp, horizontal = 6.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = label,
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                text = value,
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
private fun TipBannerCard(
    icon: ImageVector,
    title: String,
    body: String,
    containerColor: Color,
    iconTint: Color
) {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = containerColor,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.Top,
            modifier = Modifier.padding(12.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = iconTint,
                modifier = Modifier.padding(top = 2.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = body,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}
