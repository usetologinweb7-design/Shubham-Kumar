package com.example.ui.screens

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.data.model.AppLanguage
import com.example.data.model.Recipe
import com.example.ui.components.RasoiChefEmblem
import com.example.ui.components.RasoiFoodImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    language: AppLanguage,
    isDarkMode: Boolean,
    favoriteCount: Int,
    recentlyViewedRecipes: List<Recipe>,
    totalReviewsCount: Int,
    onToggleDarkMode: (Boolean) -> Unit,
    onSetLanguage: (AppLanguage) -> Unit,
    onOpenFavorites: () -> Unit,
    onRecipeClick: (Recipe) -> Unit,
    modifier: Modifier = Modifier
) {
    val isHindi = language == AppLanguage.HINDI
    val context = LocalContext.current

    var showRecentlyViewedSheet by remember { mutableStateOf(false) }
    var showSafetyTipsSheet by remember { mutableStateOf(false) }
    var showLanguageDialog by remember { mutableStateOf(false) }
    var showAboutDialog by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("profile_screen")
    ) {
        // Terracotta Top Header
        Surface(
            color = MaterialTheme.colorScheme.primary,
            shadowElevation = 4.dp,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsPadding()
                    .padding(horizontal = 16.dp, vertical = 14.dp)
            ) {
                Text(
                    text = if (isHindi) "प्रोफ़ाइल" else "Profile",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                IconButton(
                    onClick = { showSafetyTipsSheet = true },
                    modifier = Modifier.testTag("profile_tips_icon")
                ) {
                    Icon(
                        imageVector = Icons.Filled.Lightbulb,
                        contentDescription = "Kitchen tips",
                        tint = Color.White
                    )
                }
            }
        }

        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            // Avatar + Brand Header
            item {
                Card(
                    shape = RoundedCornerShape(22.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                    ) {
                        RasoiChefEmblem(size = 76.dp)
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = "Rasoi Lover",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = if (isHindi) "खाना बनाना है आसान!" else "Cooking made simple for everyone!",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            StatPill(
                                value = "$favoriteCount",
                                label = if (isHindi) "पसंदीदा" else "Favorites"
                            )
                            StatPill(
                                value = "${recentlyViewedRecipes.size}",
                                label = if (isHindi) "देखी गईं" else "Viewed"
                            )
                            StatPill(
                                value = "$totalReviewsCount",
                                label = if (isHindi) "समीक्षाएं" else "Reviews"
                            )
                        }
                    }
                }
            }

            // Menu Options Card
            item {
                Card(
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column {
                        ProfileMenuRow(
                            icon = Icons.Filled.Favorite,
                            iconTint = Color(0xFFE53935),
                            title = if (isHindi) "मेरी पसंदीदा रेसिपी" else "My Favorite Recipes",
                            trailingText = "$favoriteCount",
                            testTag = "profile_favorites_row",
                            onClick = onOpenFavorites
                        )
                        HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
                        ProfileMenuRow(
                            icon = Icons.Filled.History,
                            iconTint = MaterialTheme.colorScheme.primary,
                            title = if (isHindi) "हाल में देखी गई रेसिपी" else "Recently Viewed Recipes",
                            trailingText = "${recentlyViewedRecipes.size}",
                            testTag = "profile_recently_viewed_row",
                            onClick = { showRecentlyViewedSheet = true }
                        )
                        HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
                        // Dark Mode Switch Row
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { onToggleDarkMode(!isDarkMode) }
                                .padding(horizontal = 16.dp, vertical = 10.dp)
                                .testTag("profile_dark_mode_row")
                        ) {
                            Icon(
                                imageVector = if (isDarkMode) Icons.Filled.DarkMode else Icons.Filled.LightMode,
                                contentDescription = null,
                                tint = Color(0xFFF59E0B),
                                modifier = Modifier.size(22.dp)
                            )
                            Spacer(modifier = Modifier.width(14.dp))
                            Text(
                                text = if (isHindi) "डार्क मोड" else "Dark Mode",
                                style = MaterialTheme.typography.bodyLarge,
                                modifier = Modifier.weight(1f)
                            )
                            Switch(
                                checked = isDarkMode,
                                onCheckedChange = onToggleDarkMode,
                                modifier = Modifier.testTag("profile_dark_mode_switch")
                            )
                        }
                        HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
                        ProfileMenuRow(
                            icon = Icons.Filled.Language,
                            iconTint = Color(0xFFEA580C),
                            title = if (isHindi) "भाषा चुनें" else "App Language",
                            trailingText = if (isHindi) "हिंदी" else "English",
                            testTag = "profile_language_row",
                            onClick = { showLanguageDialog = true }
                        )
                        HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
                        ProfileMenuRow(
                            icon = Icons.Filled.HealthAndSafety,
                            iconTint = MaterialTheme.colorScheme.tertiary,
                            title = if (isHindi) "किचन सेफ्टी और कुकिंग टिप्स" else "Cooking & Kitchen Safety Tips",
                            testTag = "profile_safety_tips_row",
                            onClick = { showSafetyTipsSheet = true }
                        )
                        HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
                        ProfileMenuRow(
                            icon = Icons.Filled.Share,
                            iconTint = Color(0xFF0284C7),
                            title = if (isHindi) "ऐप साझा करें" else "Share Rasoi Guru",
                            testTag = "profile_share_row",
                            onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND).apply {
                                    type = "text/plain"
                                    putExtra(
                                        Intent.EXTRA_TEXT,
                                        "Rasoi Guru - हर किसी के लिए आसान Cooking! Learn step-by-step Indian & international recipes in easy Hindi & English."
                                    )
                                }
                                context.startActivity(
                                    Intent.createChooser(
                                        shareIntent,
                                        if (isHindi) "Rasoi Guru साझा करें" else "Share Rasoi Guru"
                                    )
                                )
                            }
                        )
                        HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
                        ProfileMenuRow(
                            icon = Icons.Filled.Info,
                            iconTint = MaterialTheme.colorScheme.secondary,
                            title = if (isHindi) "हमारे बारे में" else "About Rasoi Guru",
                            testTag = "profile_about_row",
                            onClick = { showAboutDialog = true }
                        )
                    }
                }
            }
        }
    }

    // Recently Viewed Modal Sheet
    if (showRecentlyViewedSheet) {
        ModalBottomSheet(onDismissRequest = { showRecentlyViewedSheet = false }) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 24.dp)
            ) {
                Text(
                    text = if (isHindi) "हाल में देखी गई रेसिपी" else "Recently Viewed Recipes",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(12.dp))
                if (recentlyViewedRecipes.isEmpty()) {
                    Text(
                        text = if (isHindi) "आपने अभी तक कोई रेसिपी नहीं खोली है।" else "You haven't opened any recipes yet.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.padding(vertical = 20.dp)
                    )
                } else {
                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                        modifier = Modifier.heightIn(max = 360.dp)
                    ) {
                        items(recentlyViewedRecipes, key = { it.id }) { recipe ->
                            Surface(
                                shape = RoundedCornerShape(14.dp),
                                color = MaterialTheme.colorScheme.surfaceVariant,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(14.dp))
                                    .clickable {
                                        showRecentlyViewedSheet = false
                                        onRecipeClick(recipe)
                                    }
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.padding(10.dp)
                                ) {
                                    RasoiFoodImage(
                                        localRes = recipe.imageRes,
                                        imageUrl = recipe.imageUrl,
                                        contentDescription = recipe.title(language),
                                        modifier = Modifier
                                            .size(52.dp)
                                            .clip(RoundedCornerShape(10.dp))
                                    )
                                    Spacer(modifier = Modifier.width(12.dp))
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(
                                            text = recipe.title(language),
                                            style = MaterialTheme.typography.titleSmall,
                                            fontWeight = FontWeight.Bold
                                        )
                                        Text(
                                            text = "${recipe.country.flag} ${if (isHindi) "${recipe.totalMinutes} मिनट" else "${recipe.totalMinutes} min"}",
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    }
                                    Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null)
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // Kitchen Safety & Beginner Tips Sheet
    if (showSafetyTipsSheet) {
        ModalBottomSheet(onDismissRequest = { showSafetyTipsSheet = false }) {
            val tips = listOf(
                Pair(
                    if (isHindi) "1. सब्ज़ियाँ काटने से पहले धोएं" else "1. Wash Before Cutting",
                    if (isHindi) "हमेशा सब्ज़ियाँ और फल काटने से पहले धोएं ताकि धूल-मिट्टी और कीटाणु दूर रहें।"
                    else "Always rinse whole vegetables before slicing so vitamins stay locked in."
                ),
                Pair(
                    if (isHindi) "2. उंगलियों को अंदर मोड़कर काटें" else "2. Claw Grip While Chopping",
                    if (isHindi) "चाकू चलाते समय दूसरे हाथ की उंगलियों को हल्का अंदर मोड़ लें ताकि चोट न लगे।"
                    else "Curl your fingertips inward when holding produce steady on the cutting board."
                ),
                Pair(
                    if (isHindi) "3. गरम तेल और पानी से दूरी" else "3. Watch Hot Oil & Water",
                    if (isHindi) "गीली सब्ज़ी या मसाले कभी भी तेज़ गरम तेल में न डालें—आंच हमेशा धीमी रखें।"
                    else "Pat wet veggies dry and lower the flame before adding them to hot oil."
                ),
                Pair(
                    if (isHindi) "4. तड़के और कुकर की सावधानी" else "4. Pressure Cooker Safety",
                    if (isHindi) "कुकर का प्रेशर अपने आप शांत होने के बाद ही ढक्कन खोलें, ज़ोर लगाकर न खोलें।"
                    else "Let cooker steam release naturally before opening the lid."
                ),
                Pair(
                    if (isHindi) "5. 'तैयारी पहले' नियम (Mise en Place)" else "5. Prep Ingredients First",
                    if (isHindi) "गैस जलाने से पहले सभी मसाले और कटी सब्ज़ियाँ पास रख लें—खाना कभी नहीं जलेगा!"
                    else "Measure spices and chop veggies before turning on the stove for stress-free cooking."
                )
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 26.dp)
            ) {
                Text(
                    text = if (isHindi) "🛡️ किचन सेफ्टी और कुकिंग टिप्स" else "🛡️ Kitchen Safety & Beginner Tips",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                tips.forEach { (heading, detail) ->
                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = MaterialTheme.colorScheme.surfaceVariant,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Text(heading, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(detail, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        }
                    }
                }
            }
        }
    }

    // Language Selection Dialog
    if (showLanguageDialog) {
        AlertDialog(
            onDismissRequest = { showLanguageDialog = false },
            title = { Text(if (isHindi) "भाषा चुनें" else "Choose Language") },
            text = {
                Column {
                    AppLanguage.entries.forEach { lang ->
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(10.dp))
                                .clickable {
                                    onSetLanguage(lang)
                                    showLanguageDialog = false
                                }
                                .padding(vertical = 10.dp, horizontal = 8.dp)
                                .testTag("language_option_${lang.name.lowercase()}")
                        ) {
                            RadioButton(
                                selected = language == lang,
                                onClick = {
                                    onSetLanguage(lang)
                                    showLanguageDialog = false
                                }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "${lang.labelHi} (${lang.labelEn})",
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { showLanguageDialog = false }) {
                    Text(if (isHindi) "बंद करें" else "Close")
                }
            }
        )
    }

    // About Dialog
    if (showAboutDialog) {
        AlertDialog(
            onDismissRequest = { showAboutDialog = false },
            title = { Text("Rasoi Guru") },
            text = {
                Text(
                    if (isHindi) {
                        "Rasoi Guru — हर किसी के लिए आसान Cooking!\n\nशुरुआती रसोइयों के लिए आसान हिंदी और अंग्रेज़ी में स्टेप-बाय-स्टेप विज़ुअल रेसिपी गाइड।"
                    } else {
                        "Rasoi Guru — Easy Cooking for Everyone!\n\nA beginner-friendly visual step-by-step recipe companion in Hindi and English."
                    }
                )
            },
            confirmButton = {
                TextButton(onClick = { showAboutDialog = false }) {
                    Text(if (isHindi) "ठीक है" else "OK")
                }
            }
        )
    }
}

@Composable
private fun StatPill(value: String, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = value,
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

@Composable
private fun ProfileMenuRow(
    icon: ImageVector,
    iconTint: Color,
    title: String,
    trailingText: String? = null,
    testTag: String,
    onClick: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 14.dp)
            .testTag(testTag)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = iconTint,
            modifier = Modifier.size(22.dp)
        )
        Spacer(modifier = Modifier.width(14.dp))
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.weight(1f)
        )
        if (trailingText != null) {
            Text(
                text = trailingText,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(modifier = Modifier.width(4.dp))
        }
        Icon(
            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}
