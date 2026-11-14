package com.example.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

private val RasoiLightColorScheme = lightColorScheme(
    primary = TerracottaOrange,
    onPrimary = Color.White,
    primaryContainer = TerracottaSoft,
    onPrimaryContainer = DeepBrown,
    secondary = DeepBrown,
    onSecondary = Color.White,
    secondaryContainer = CreamSurfaceVariant,
    onSecondaryContainer = EspressoBrown,
    tertiary = HerbGreen,
    onTertiary = Color.White,
    tertiaryContainer = HerbGreenContainer,
    onTertiaryContainer = HerbGreen,
    background = CreamBackground,
    onBackground = EspressoBrown,
    surface = CardWhite,
    onSurface = EspressoBrown,
    surfaceVariant = CreamSurfaceVariant,
    onSurfaceVariant = MutedTextLight,
    outline = SoftBorderLight,
    outlineVariant = Color(0xFFF3E7DB),
    error = NonVegRed,
    onError = Color.White,
    errorContainer = NonVegContainer,
    onErrorContainer = NonVegRed
)

private val RasoiDarkColorScheme = darkColorScheme(
    primary = TerracottaBright,
    onPrimary = EspressoBrown,
    primaryContainer = Color(0xFF54250B),
    onPrimaryContainer = TerracottaSoft,
    secondary = Color(0xFFDABBA6),
    onSecondary = EspressoBrown,
    secondaryContainer = DarkCardSurface,
    onSecondaryContainer = CreamTextDark,
    tertiary = HerbGreenBright,
    onTertiary = Color(0xFF0A260D),
    tertiaryContainer = HerbGreenDarkContainer,
    onTertiaryContainer = HerbGreenBright,
    background = DarkEspressoBackground,
    onBackground = CreamTextDark,
    surface = DarkSurface,
    onSurface = CreamTextDark,
    surfaceVariant = DarkCardSurface,
    onSurfaceVariant = MutedTextDark,
    outline = DarkSoftBorder,
    outlineVariant = Color(0xFF3A281E),
    error = Color(0xFFEF5350),
    onError = Color.Black,
    errorContainer = Color(0xFF4A1919),
    onErrorContainer = Color(0xFFFFDAD6)
)

val RasoiShapes = Shapes(
    small = RoundedCornerShape(10.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(22.dp),
    extraLarge = RoundedCornerShape(28.dp)
)

@Composable
fun RasoiGuruTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) RasoiDarkColorScheme else RasoiLightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = RasoiTypography,
        shapes = RasoiShapes,
        content = content
    )
}
