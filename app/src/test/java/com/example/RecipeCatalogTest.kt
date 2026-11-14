package com.example

import com.example.data.catalog.RecipeCatalog
import com.example.data.model.Country
import com.example.data.model.formatScaledQuantity
import org.junit.Assert.*
import org.junit.Test

class RecipeCatalogTest {

    @Test
    fun allSixCountriesHaveRecipes() {
        val countries = RecipeCatalog.allRecipes.map { it.country }.toSet()
        assertEquals(Country.entries.toSet(), countries)
    }

    @Test
    fun allFiveMinuteSpecialsAreFiveMinutesOrLess() {
        val fiveMin = RecipeCatalog.fiveMinuteRecipes
        assertEquals(15, fiveMin.size)
        fiveMin.forEach { recipe ->
            assertTrue("${recipe.nameEn} exceeded 5 min", recipe.totalMinutes <= 5)
            assertTrue("${recipe.nameEn} should have 3–5 natural steps", recipe.steps.size in 3..5)
        }
    }

    @Test
    fun recipesHaveNaturalVariableStepCountsAcrossSimpleMediumAndComplex() {
        val stepCounts = RecipeCatalog.allRecipes.map { it.steps.size }
        assertTrue("Expected simple recipes with 4–5 steps", stepCounts.any { it in 3..5 })
        assertTrue("Expected medium recipes with 6–9 steps", stepCounts.any { it in 6..9 })
        assertTrue("Expected complex recipes with 10+ steps", stepCounts.any { it >= 10 })
        assertTrue("Expected at least 12+ step complex recipe", stepCounts.max() >= 12)
        assertTrue("Expected varied step counts rather than uniform fixed length", stepCounts.toSet().size >= 6)
    }

    @Test
    fun everyRecipeHasValidBilingualStepsPhotosAndSequentialNumbering() {
        assertTrue(RecipeCatalog.allRecipes.isNotEmpty())
        RecipeCatalog.allRecipes.forEach { recipe ->
            assertTrue(recipe.nameEn.isNotBlank())
            assertTrue(recipe.nameHi.isNotBlank())
            assertTrue(recipe.ingredients.isNotEmpty())
            assertTrue("${recipe.id} must have at least 3 steps", recipe.steps.size >= 3)

            recipe.steps.forEachIndexed { index, step ->
                assertEquals(
                    "Non-sequential stepNumber in ${recipe.id}",
                    index + 1,
                    step.stepNumber
                )
                assertTrue("Missing titleHi in ${recipe.id} step ${step.stepNumber}", step.titleHi.isNotBlank())
                assertTrue("Missing titleEn in ${recipe.id} step ${step.stepNumber}", step.titleEn.isNotBlank())
                assertTrue("Missing instructionHi in ${recipe.id} step ${step.stepNumber}", step.instructionHi.isNotBlank())
                assertTrue("Missing instructionEn in ${recipe.id} step ${step.stepNumber}", step.instructionEn.isNotBlank())
                assertTrue("Invalid duration in ${recipe.id} step ${step.stepNumber}", step.durationMinutes > 0)
                assertNotEquals("Missing step photograph in ${recipe.id} step ${step.stepNumber}", 0, step.imageRes)

                if (index > 0) {
                    assertNotEquals(
                        "Adjacent duplicate step photo in ${recipe.id} steps $index and ${index + 1}",
                        recipe.steps[index - 1].imageRes,
                        step.imageRes
                    )
                }

                if (!recipe.isFiveMinuteSpecial) {
                    assertFalse("Missing timingDetailHi in ${recipe.id} step ${step.stepNumber}", step.timingDetailHi.isNullOrBlank())
                    assertFalse("Missing timingDetailEn in ${recipe.id} step ${step.stepNumber}", step.timingDetailEn.isNullOrBlank())
                    assertFalse("Missing heatLevelHi in ${recipe.id} step ${step.stepNumber}", step.heatLevelHi.isNullOrBlank())
                    assertFalse("Missing heatLevelEn in ${recipe.id} step ${step.stepNumber}", step.heatLevelEn.isNullOrBlank())
                }
            }
        }
    }

    @Test
    fun servingsScalerFormatsFractionsAndMultipliers() {
        assertEquals("1/2", formatScaledQuantity(0.5, 2, 2, true))
        assertEquals("1", formatScaledQuantity(0.5, 2, 4, true))
        assertEquals("1 1/2", formatScaledQuantity(1.0, 2, 3, true))
        assertEquals("", formatScaledQuantity(0.5, 2, 4, false))
    }
}
