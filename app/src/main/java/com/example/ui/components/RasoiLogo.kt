package com.example.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.ui.theme.DeepBrown
import com.example.ui.theme.PlusJakartaFontFamily

@Composable
fun RasoiChefEmblem(
    size: Dp = 36.dp,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(size)
            .clip(CircleShape)
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.rasoi_guru_logo),
            contentDescription = "Rasoi Guru chef logo",
            modifier = Modifier
                .fillMaxSize()
                .padding(1.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun RasoiWordmark(
    fontSize: TextUnit = 22.sp,
    darkBrownOverride: Color? = null,
    modifier: Modifier = Modifier
) {
    val firstColor = darkBrownOverride ?: if (MaterialTheme.colorScheme.background.red < 0.3f) {
        MaterialTheme.colorScheme.onBackground
    } else {
        DeepBrown
    }
    Text(
        text = buildAnnotatedString {
            withStyle(
                SpanStyle(
                    color = firstColor,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = PlusJakartaFontFamily
                )
            ) {
                append("Rasoi ")
            }
            withStyle(
                SpanStyle(
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = PlusJakartaFontFamily
                )
            ) {
                append("Guru")
            }
        },
        fontSize = fontSize,
        modifier = modifier
    )
}
