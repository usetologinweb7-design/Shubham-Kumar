package com.example.ui.screens

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.ui.components.RasoiChefEmblem
import com.example.ui.components.RasoiWordmark
import com.example.ui.theme.CreamBackground
import com.example.ui.theme.DeepBrown
import com.example.ui.theme.TerracottaDark
import com.example.ui.theme.TerracottaOrange
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    onFinished: () -> Unit
) {
    val scale = remember { Animatable(0.82f) }

    LaunchedEffect(Unit) {
        scale.animateTo(
            targetValue = 1f,
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
        )
        delay(1100)
        onFinished()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(CreamBackground, Color(0xFFFFF0DE))
                )
            )
            .clickable { onFinished() }
            .testTag("splash_screen")
    ) {
        // Decorative terracotta wave at the bottom
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
                .align(Alignment.BottomCenter)
        ) {
            val w = size.width
            val h = size.height
            val path = Path().apply {
                moveTo(0f, h * 0.45f)
                quadraticTo(w * 0.25f, h * 0.05f, w * 0.55f, h * 0.38f)
                quadraticTo(w * 0.82f, h * 0.68f, w, h * 0.22f)
                lineTo(w, h)
                lineTo(0f, h)
                close()
            }
            drawPath(
                path = path,
                brush = Brush.horizontalGradient(listOf(TerracottaOrange, TerracottaDark))
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.safeDrawing)
                .padding(horizontal = 24.dp)
        ) {
            Spacer(modifier = Modifier.weight(0.6f))

            RasoiChefEmblem(
                size = 112.dp,
                modifier = Modifier.scale(scale.value)
            )

            Spacer(modifier = Modifier.height(18.dp))

            RasoiWordmark(
                fontSize = 38.sp,
                darkBrownOverride = DeepBrown
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "हर किसी के लिए आसान Cooking",
                style = MaterialTheme.typography.titleMedium,
                color = DeepBrown,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "स्वाद भी... सेहत भी...",
                style = MaterialTheme.typography.bodyMedium,
                color = TerracottaDark,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(26.dp))

            Surface(
                shape = RoundedCornerShape(24.dp),
                shadowElevation = 6.dp,
                modifier = Modifier
                    .widthIn(max = 300.dp)
                    .fillMaxWidth(0.84f)
                    .height(148.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_salad_bowl_1794638376646),
                    contentDescription = "Fresh ingredients and vegetables",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }

            Spacer(modifier = Modifier.height(26.dp))

            CircularProgressIndicator(
                color = TerracottaOrange,
                strokeWidth = 3.dp,
                modifier = Modifier.size(32.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Loading...",
                style = MaterialTheme.typography.labelLarge,
                color = DeepBrown.copy(alpha = 0.78f)
            )

            Spacer(modifier = Modifier.weight(1f))
        }
    }
}
