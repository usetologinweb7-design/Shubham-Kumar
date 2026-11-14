package com.example.ui.screens

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.AppLanguage
import com.example.data.model.CookingStep
import com.example.data.model.PrepStage
import com.example.data.model.Recipe
import com.example.ui.components.RasoiFoodImage
import com.example.ui.theme.HerbGreen
import com.example.ui.theme.HerbGreenContainer
import kotlinx.coroutines.delay
import java.util.Locale

@Composable
fun CookingStepsScreen(
    recipe: Recipe,
    language: AppLanguage,
    onBack: () -> Unit,
    onFinishToDetail: () -> Unit,
    modifier: Modifier = Modifier
) {
    val isHindi = language == AppLanguage.HINDI
    val steps = recipe.steps
    var currentIndex by remember(recipe.id) { mutableIntStateOf(0) }
    var showCompletionDialog by remember { mutableStateOf(false) }

    val currentStep = steps[currentIndex]
    val remainingMinutes = remember(currentIndex, steps) {
        steps.drop(currentIndex).sumOf { it.durationMinutes }.coerceAtLeast(1)
    }

    val progress by animateFloatAsState(
        targetValue = (currentIndex + 1).toFloat() / steps.size.coerceAtLeast(1).toFloat(),
        label = "step_progress"
    )

    // Interactive step timer state
    val totalStepSeconds = (currentStep.durationMinutes.coerceAtLeast(1)) * 60
    var remainingSeconds by remember(currentIndex, recipe.id) { mutableIntStateOf(totalStepSeconds) }
    var isTimerRunning by remember(currentIndex, recipe.id) { mutableStateOf(false) }

    LaunchedEffect(isTimerRunning, currentIndex) {
        while (isTimerRunning && remainingSeconds > 0) {
            delay(1000L)
            remainingSeconds--
        }
        if (remainingSeconds == 0) {
            isTimerRunning = false
        }
    }

    Scaffold(
        topBar = {
            Surface(
                color = MaterialTheme.colorScheme.primary,
                shadowElevation = 4.dp
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .statusBarsPadding()
                        .padding(horizontal = 8.dp, vertical = 10.dp)
                ) {
                    IconButton(
                        onClick = onBack,
                        modifier = Modifier.testTag("steps_back_button")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = if (isHindi) "${recipe.nameHi} बनाना सीखें" else "Learn ${recipe.nameEn}",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1
                    )
                }
            }
        },
        bottomBar = {
            Surface(
                shadowElevation = 10.dp,
                color = MaterialTheme.colorScheme.background
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .navigationBarsPadding()
                        .padding(horizontal = 16.dp, vertical = 12.dp)
                ) {
                    OutlinedButton(
                        onClick = { if (currentIndex > 0) currentIndex-- },
                        enabled = currentIndex > 0,
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .weight(1f)
                            .height(52.dp)
                            .testTag("prev_step_button")
                    ) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null)
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = if (isHindi) "पिछला" else "Previous",
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Button(
                        onClick = {
                            if (currentIndex < steps.lastIndex) {
                                currentIndex++
                            } else {
                                showCompletionDialog = true
                            }
                        },
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (currentIndex == steps.lastIndex) HerbGreen else MaterialTheme.colorScheme.primary
                        ),
                        modifier = Modifier
                            .weight(1f)
                            .height(52.dp)
                            .testTag("next_step_button")
                    ) {
                        Text(
                            text = when {
                                currentIndex == steps.lastIndex && isHindi -> "पूरा हुआ!"
                                currentIndex == steps.lastIndex -> "Finish!"
                                isHindi -> "अगला"
                                else -> "Next"
                            },
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Icon(
                            imageVector = if (currentIndex == steps.lastIndex) Icons.Filled.CheckCircle else Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = null
                        )
                    }
                }
            }
        },
        modifier = modifier
            .fillMaxSize()
            .testTag("cooking_steps_screen")
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background)
        ) {
            // Dynamic Progress Indicator & Remaining Ready Time Banner
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp)) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = if (isHindi) "कदम ${currentIndex + 1} / ${steps.size}" else "Step ${currentIndex + 1} of ${steps.size}",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.testTag("step_progress_header")
                    )
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = MaterialTheme.colorScheme.primaryContainer
                    ) {
                        Text(
                            text = if (isHindi) "🍽 लगभग $remainingMinutes मिनट में तैयार" else "🍽 Ready in ~$remainingMinutes min",
                            style = MaterialTheme.typography.labelMedium,
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(6.dp))
                if (steps.size <= 16) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("step_segmented_progress")
                    ) {
                        steps.forEachIndexed { idx, _ ->
                            val segmentColor = when {
                                idx < currentIndex -> HerbGreen
                                idx == currentIndex -> MaterialTheme.colorScheme.primary
                                else -> MaterialTheme.colorScheme.surfaceVariant
                            }
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(8.dp)
                                    .clip(RoundedCornerShape(4.dp))
                                    .background(segmentColor)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                }
                LinearProgressIndicator(
                    progress = { progress },
                    color = HerbGreen,
                    trackColor = MaterialTheme.colorScheme.surfaceVariant,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .testTag("step_linear_progress")
                )
            }

            // Responsive Image + Instruction Card (Side-by-Side on wide screens, Stacked on mobile)
            AnimatedContent(
                targetState = currentStep,
                label = "step_transition",
                modifier = Modifier.weight(1f)
            ) { step ->
                BoxWithConstraints(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    val isWide = maxWidth >= 600.dp
                    if (isWide) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(20.dp),
                            verticalAlignment = Alignment.Top,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            StepPhotoCard(
                                step = step,
                                isHindi = isHindi,
                                modifier = Modifier
                                    .weight(1f)
                                    .height(290.dp)
                            )
                            StepInstructionColumn(
                                step = step,
                                totalSteps = steps.size,
                                isHindi = isHindi,
                                remainingSeconds = remainingSeconds,
                                totalSeconds = totalStepSeconds,
                                isTimerRunning = isTimerRunning,
                                onToggleTimer = { isTimerRunning = !isTimerRunning },
                                onResetTimer = {
                                    isTimerRunning = false
                                    remainingSeconds = totalStepSeconds
                                },
                                modifier = Modifier.weight(1f)
                            )
                        }
                    } else {
                        Column(
                            verticalArrangement = Arrangement.spacedBy(14.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            StepPhotoCard(
                                step = step,
                                isHindi = isHindi,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(222.dp)
                            )
                            StepInstructionColumn(
                                step = step,
                                totalSteps = steps.size,
                                isHindi = isHindi,
                                remainingSeconds = remainingSeconds,
                                totalSeconds = totalStepSeconds,
                                isTimerRunning = isTimerRunning,
                                onToggleTimer = { isTimerRunning = !isTimerRunning },
                                onResetTimer = {
                                    isTimerRunning = false
                                    remainingSeconds = totalStepSeconds
                                },
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }
                }
            }
        }
    }

    if (showCompletionDialog) {
        AlertDialog(
            onDismissRequest = { showCompletionDialog = false },
            icon = {
                Icon(
                    imageVector = Icons.Filled.CheckCircle,
                    contentDescription = null,
                    tint = HerbGreen,
                    modifier = Modifier.size(44.dp)
                )
            },
            title = {
                Text(
                    text = if (isHindi) "वाह! डिश तैयार है 🎉" else "Awesome! Dish Ready 🎉",
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Text(
                    if (isHindi) {
                        "आपने ${recipe.nameHi} बनाने के सभी ${steps.size} चरण पूरे कर लिए हैं! चाहें तो रेसिपी पेज पर जाकर 5-स्टार रेटिंग दें।"
                    } else {
                        "You completed all ${steps.size} steps for ${recipe.nameEn}! Head back to rate and review your dish."
                    }
                )
            },
            confirmButton = {
                Button(
                    onClick = {
                        showCompletionDialog = false
                        onFinishToDetail()
                    }
                ) {
                    Text(if (isHindi) "रेटिंग दें व समाप्त करें" else "Rate & Finish")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        showCompletionDialog = false
                        currentIndex = 0
                    }
                ) {
                    Text(if (isHindi) "फिर से देखें" else "Review Steps")
                }
            }
        )
    }
}

@Composable
private fun StepPhotoCard(
    step: CookingStep,
    isHindi: Boolean,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(22.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = modifier.testTag("step_photo_card")
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            RasoiFoodImage(
                localRes = step.imageRes,
                imageUrl = step.imageUrl,
                contentDescription = if (isHindi) step.titleHi else step.titleEn,
                modifier = Modifier.fillMaxSize()
            )
            Surface(
                shape = RoundedCornerShape(12.dp),
                color = Color.Black.copy(alpha = 0.65f),
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(12.dp)
            ) {
                Text(
                    text = if (isHindi) step.stage.labelHi else step.stage.labelEn,
                    style = MaterialTheme.typography.labelMedium,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                )
            }
        }
    }
}

@Composable
private fun StepInstructionColumn(
    step: CookingStep,
    totalSteps: Int,
    isHindi: Boolean,
    remainingSeconds: Int,
    totalSeconds: Int,
    isTimerRunning: Boolean,
    onToggleTimer: () -> Unit,
    onResetTimer: () -> Unit,
    modifier: Modifier = Modifier
) {
    val defaultHeatHi = when (step.stage) {
        PrepStage.COOK_SIMMER -> "धीमी से मध्यम आंच"
        PrepStage.SPICE -> "मध्यम आंच"
        else -> "बिना गैस (तैयारी)"
    }
    val defaultHeatEn = when (step.stage) {
        PrepStage.COOK_SIMMER -> "Low to Medium Flame"
        PrepStage.SPICE -> "Medium Flame"
        else -> "No Flame (Prep)"
    }
    val heatText = if (isHindi) (step.heatLevelHi ?: defaultHeatHi) else (step.heatLevelEn ?: defaultHeatEn)
    val timingText = if (isHindi) {
        step.timingDetailHi ?: "${step.durationMinutes} मिनट तक यह चरण करें"
    } else {
        step.timingDetailEn ?: "Hold / perform for ${step.durationMinutes} min"
    }

    val mins = remainingSeconds / 60
    val secs = remainingSeconds % 60
    val formattedTimer = String.format(Locale.US, "%02d:%02d", mins, secs)

    Column(modifier = modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Surface(
                shape = RoundedCornerShape(14.dp),
                color = MaterialTheme.colorScheme.primary
            ) {
                Text(
                    text = if (isHindi) "कदम ${step.stepNumber} / $totalSteps" else "Step ${step.stepNumber} of $totalSteps",
                    style = MaterialTheme.typography.labelLarge,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(horizontal = 14.dp, vertical = 6.dp)
                        .testTag("step_badge_text")
                )
            }
            Surface(
                shape = RoundedCornerShape(12.dp),
                color = MaterialTheme.colorScheme.surfaceVariant
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Schedule,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = if (isHindi) "${step.durationMinutes} मिनट" else "${step.durationMinutes} min",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
            Surface(
                shape = RoundedCornerShape(12.dp),
                color = MaterialTheme.colorScheme.secondaryContainer
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.LocalFireDepartment,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(15.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = heatText,
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = if (isHindi) step.titleHi else step.titleEn,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.testTag("step_title_text")
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = if (isHindi) step.instructionHi else step.instructionEn,
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 16.5.sp,
            lineHeight = 25.sp,
            modifier = Modifier.testTag("step_instruction_text")
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Explicit Boil / Simmer / Wait Timing + Interactive Countdown Timer Card
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = MaterialTheme.colorScheme.surface,
            tonalElevation = 2.dp,
            modifier = Modifier
                .fillMaxWidth()
                .testTag("step_timing_card")
        ) {
            Column(modifier = Modifier.padding(12.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Filled.Timer,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = if (isHindi) "कितनी देर पकाना / रखना है:" else "Boil / Simmer / Hold Time:",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = timingText,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = if (remainingSeconds == 0) {
                            if (isHindi) "✓ समय पूरा हो गया!" else "✓ Time's Up!"
                        } else {
                            formattedTimer
                        },
                        style = MaterialTheme.typography.titleLarge,
                        color = if (remainingSeconds == 0) HerbGreen else MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        FilledTonalButton(
                            onClick = onToggleTimer,
                            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                            modifier = Modifier.testTag("step_timer_toggle_button")
                        ) {
                            Icon(
                                imageVector = if (isTimerRunning) Icons.Filled.Pause else Icons.Filled.PlayArrow,
                                contentDescription = null,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = when {
                                    isTimerRunning && isHindi -> "रोकें"
                                    isTimerRunning -> "Pause"
                                    remainingSeconds < totalSeconds && isHindi -> "जारी रखें"
                                    remainingSeconds < totalSeconds -> "Resume"
                                    isHindi -> "टाइमर चलाएं"
                                    else -> "Start Timer"
                                }
                            )
                        }
                        if (remainingSeconds != totalStepSeconds(step)) {
                            IconButton(
                                onClick = onResetTimer,
                                modifier = Modifier.testTag("step_timer_reset_button")
                            ) {
                                Icon(Icons.Filled.Refresh, contentDescription = "Reset timer")
                            }
                        }
                    }
                }
            }
        }

        val tip = if (isHindi) step.beginnerTipHi else step.beginnerTipEn
        if (!tip.isNullOrBlank()) {
            Spacer(modifier = Modifier.height(12.dp))
            Surface(
                shape = RoundedCornerShape(16.dp),
                color = HerbGreenContainer,
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag("step_tip_card")
            ) {
                Row(
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier.padding(12.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Lightbulb,
                        contentDescription = null,
                        tint = HerbGreen
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = if (isHindi) "आसान टिप (Beginner Tip)" else "Beginner Tip",
                            style = MaterialTheme.typography.labelLarge,
                            color = HerbGreen,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = tip,
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color(0xFF1B431E)
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}

private fun totalStepSeconds(step: CookingStep): Int = (step.durationMinutes.coerceAtLeast(1)) * 60
