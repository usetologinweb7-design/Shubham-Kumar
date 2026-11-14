package com.example

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollTo
import com.example.data.catalog.RecipeCatalog
import com.example.data.model.AppLanguage
import com.example.ui.screens.CookingStepsScreen
import com.example.ui.theme.RasoiGuruTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class CookingStepsScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun simpleFourStepRecipeNavigatesFromStartToFinish() {
        val recipe = requireNotNull(RecipeCatalog.getById("lemon_water"))
        assert(recipe.steps.size == 4)

        composeTestRule.setContent {
            RasoiGuruTheme {
                CookingStepsScreen(
                    recipe = recipe,
                    language = AppLanguage.ENGLISH,
                    onBack = {},
                    onFinishToDetail = {}
                )
            }
        }
        composeTestRule.waitForIdle()

        composeTestRule.onNodeWithTag("step_progress_header").assertTextEquals("Step 1 of 4")
        composeTestRule.onNodeWithTag("step_badge_text").assertTextEquals("Step 1 of 4")
        composeTestRule.onNodeWithTag("step_photo_card").assertIsDisplayed()
        composeTestRule.onNodeWithTag("step_segmented_progress").assertIsDisplayed()
        composeTestRule.onNodeWithTag("step_title_text").performScrollTo().assertIsDisplayed()
            .assertTextEquals(recipe.steps[0].titleEn)
        composeTestRule.onNodeWithTag("prev_step_button").assertIsNotEnabled()
        composeTestRule.onNodeWithTag("next_step_button").assertIsEnabled()

        repeat(3) { stepIdx ->
            composeTestRule.onNodeWithTag("next_step_button").performClick()
            composeTestRule.waitForIdle()
            val expectedStep = stepIdx + 2
            composeTestRule.onNodeWithTag("step_progress_header").assertTextEquals("Step $expectedStep of 4")
            composeTestRule.onNodeWithTag("step_badge_text").assertTextEquals("Step $expectedStep of 4")
            composeTestRule.onNodeWithTag("step_title_text").performScrollTo().assertIsDisplayed()
                .assertTextEquals(recipe.steps[expectedStep - 1].titleEn)
            composeTestRule.onNodeWithTag("prev_step_button").assertIsEnabled()
        }

        composeTestRule.onNodeWithText("Finish!").assertIsDisplayed()
        composeTestRule.onNodeWithTag("prev_step_button").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("step_progress_header").assertTextEquals("Step 3 of 4")
    }

    @Test
    fun mediumEightStepRecipeDisplaysHindiStepsTipsAndPhotos() {
        val recipe = requireNotNull(RecipeCatalog.getById("palak_paneer"))
        assert(recipe.steps.size == 8)

        composeTestRule.setContent {
            RasoiGuruTheme {
                CookingStepsScreen(
                    recipe = recipe,
                    language = AppLanguage.HINDI,
                    onBack = {},
                    onFinishToDetail = {}
                )
            }
        }
        composeTestRule.waitForIdle()

        composeTestRule.onNodeWithTag("step_progress_header").assertTextEquals("कदम 1 / 8")
        composeTestRule.onNodeWithTag("step_badge_text").assertTextEquals("कदम 1 / 8")
        composeTestRule.onNodeWithTag("step_photo_card").assertIsDisplayed()
        composeTestRule.onNodeWithTag("step_title_text").performScrollTo().assertIsDisplayed()
            .assertTextEquals(recipe.steps[0].titleHi)
        composeTestRule.onNodeWithTag("step_instruction_text").performScrollTo().assertIsDisplayed()
            .assertTextEquals(recipe.steps[0].instructionHi)
        composeTestRule.onNodeWithTag("step_timing_card").performScrollTo().assertIsDisplayed()
        composeTestRule.onNodeWithTag("step_tip_card").performScrollTo().assertIsDisplayed()

        repeat(4) {
            composeTestRule.onNodeWithTag("next_step_button").performClick()
            composeTestRule.waitForIdle()
        }

        composeTestRule.onNodeWithTag("step_progress_header").assertTextEquals("कदम 5 / 8")
        composeTestRule.onNodeWithTag("step_title_text").performScrollTo().assertIsDisplayed()
            .assertTextEquals(recipe.steps[4].titleHi)
        composeTestRule.onNodeWithTag("prev_step_button").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("step_progress_header").assertTextEquals("कदम 4 / 8")
    }

    @Test
    fun complexThirteenStepBiryaniNavigatesAllThirteenStepsAndBack() {
        val recipe = requireNotNull(RecipeCatalog.getById("chicken_biryani"))
        assert(recipe.steps.size == 13)

        composeTestRule.setContent {
            RasoiGuruTheme {
                CookingStepsScreen(
                    recipe = recipe,
                    language = AppLanguage.HINDI,
                    onBack = {},
                    onFinishToDetail = {}
                )
            }
        }
        composeTestRule.waitForIdle()

        composeTestRule.onNodeWithTag("step_progress_header").assertTextEquals("कदम 1 / 13")
        composeTestRule.onNodeWithTag("prev_step_button").assertIsNotEnabled()

        for (nextStep in 2..13) {
            composeTestRule.onNodeWithTag("next_step_button").performClick()
            composeTestRule.waitForIdle()
            composeTestRule.onNodeWithTag("step_progress_header").assertTextEquals("कदम $nextStep / 13")
            composeTestRule.onNodeWithTag("step_badge_text").assertTextEquals("कदम $nextStep / 13")
            composeTestRule.onNodeWithTag("step_photo_card").assertIsDisplayed()
            composeTestRule.onNodeWithTag("step_title_text").performScrollTo().assertIsDisplayed()
                .assertTextEquals(recipe.steps[nextStep - 1].titleHi)
        }

        composeTestRule.onNodeWithText("पूरा हुआ!").assertIsDisplayed()
        composeTestRule.onNodeWithTag("prev_step_button").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithTag("step_progress_header").assertTextEquals("कदम 12 / 13")
    }
}
