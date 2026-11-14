package com.example.data.model

import androidx.annotation.DrawableRes
import com.example.R

enum class AppLanguage(val labelEn: String, val labelHi: String) {
    HINDI("Hindi", "हिंदी"),
    ENGLISH("English", "अंग्रेज़ी")
}

enum class Country(
    val code: String,
    val flag: String,
    val nameEn: String,
    val nameHi: String,
    @DrawableRes val imageRes: Int
) {
    INDIA("IN", "\uD83C\uDDEE\uD83C\uDDF3", "India", "भारत", R.drawable.img_dish_biryani),
    JAPAN("JP", "\uD83C\uDDEF\uD83C\uDDF5", "Japan", "जापान", R.drawable.img_dish_sushi),
    CHINA("CN", "\uD83C\uDDE8\uD83C\uDDF3", "China", "चीन", R.drawable.img_dish_noodles),
    MEXICO("MX", "\uD83C\uDDF2\uD83C\uDDFD", "Mexico", "मेक्सिको", R.drawable.img_dish_tacos),
    ITALY("IT", "\uD83C\uDDEE\uD83C\uDDF9", "Italy", "इटली", R.drawable.img_dish_pizza),
    PAKISTAN("PK", "\uD83C\uDDF5\uD83C\uDDF0", "Pakistan", "पाकिस्तान", R.drawable.img_dish_naan_curry)
}

enum class FoodCategory(
    val nameEn: String,
    val nameHi: String,
    val isIndian: Boolean,
    @DrawableRes val imageRes: Int
) {
    BIRYANI_PULAO("Biryani & Pulao", "बिरयानी और पुलाव", true, R.drawable.img_dish_biryani),
    PANEER_VEG("Paneer & Veg", "पनीर और सब्ज़ी", true, R.drawable.img_paneer_masala_1794638377530),
    CHICKEN_SPECIAL("Chicken Special", "चिकन स्पेशल", true, R.drawable.img_dish_naan_curry),
    DAL_CURRY("Dal & Curry", "दाल और करी", true, R.drawable.img_dish_curry_bowl),
    STREET_FOOD("Indian Street Food", "भारतीय स्ट्रीट फूड", true, R.drawable.img_step_chutney_dip),
    BREAKFAST_SNACKS("Breakfast & Snacks", "नाश्ता और स्नैक्स", true, R.drawable.img_dish_bread),
    INDIAN_SWEETS("Indian Sweets", "भारतीय मिठाइयाँ", true, R.drawable.img_step_raita),
    INTERNATIONAL("International", "इंटरनेशनल", false, R.drawable.img_world_platter_1794638378079)
}

enum class MealTime(val nameEn: String, val nameHi: String) {
    BREAKFAST("Breakfast", "नाश्ता"),
    LUNCH("Lunch", "दोपहर का खाना"),
    DINNER("Dinner", "रात का खाना"),
    SNACKS("Snacks", "स्नैक्स"),
    DESSERTS("Desserts", "मिठाई")
}

enum class Difficulty(val nameEn: String, val nameHi: String) {
    EASY("Easy", "आसान"),
    MEDIUM("Medium", "मध्यम")
}

enum class PrepStage(
    val labelEn: String,
    val labelHi: String,
    @DrawableRes val defaultDrawable: Int
) {
    WASH("Wash", "धोना", R.drawable.img_step_wash),
    CHOP("Chop & Prep", "काटना व तैयारी", R.drawable.img_step_chop),
    SPICE("Spice & Temper", "मसाले व तड़का", R.drawable.img_step_spices),
    MIX("Mix & Combine", "मिलाना", R.drawable.img_step_salad_mix),
    COOK_SIMMER("Cook & Simmer", "पकाना", R.drawable.img_dish_curry_bowl),
    SERVE("Serve & Plate", "परोसना", R.drawable.img_salad_bowl_1794638376646)
}

data class Ingredient(
    val nameEn: String,
    val nameHi: String,
    val baseQuantity: Double,
    val unitEn: String,
    val unitHi: String,
    val isScalable: Boolean = true,
    val imageUrl: String? = null,
    @DrawableRes val fallbackRes: Int = R.drawable.img_step_chop
)

data class CookingStep(
    val stepNumber: Int,
    val titleEn: String,
    val titleHi: String,
    val instructionEn: String,
    val instructionHi: String,
    val beginnerTipEn: String? = null,
    val beginnerTipHi: String? = null,
    val durationMinutes: Int,
    val stage: PrepStage,
    @DrawableRes val imageRes: Int,
    val imageUrl: String? = null,
    val heatLevelEn: String? = null,
    val heatLevelHi: String? = null,
    val timingDetailEn: String? = null,
    val timingDetailHi: String? = null
)

data class Recipe(
    val id: String,
    val nameEn: String,
    val nameHi: String,
    val country: Country,
    val category: FoodCategory,
    val mealTimes: List<MealTime>,
    val isVeg: Boolean,
    val difficulty: Difficulty,
    val prepMinutes: Int,
    val cookMinutes: Int,
    val defaultServings: Int,
    val isFiveMinuteSpecial: Boolean = false,
    val priorPrepNoteEn: String? = null,
    val priorPrepNoteHi: String? = null,
    val isPopular: Boolean = false,
    val isTrending: Boolean = false,
    val descriptionEn: String,
    val descriptionHi: String,
    val cookingTipEn: String,
    val cookingTipHi: String,
    val safetyTipEn: String,
    val safetyTipHi: String,
    @DrawableRes val imageRes: Int,
    val imageUrl: String? = null,
    val ingredients: List<Ingredient>,
    val steps: List<CookingStep>
) {
    val totalMinutes: Int get() = prepMinutes + cookMinutes

    fun title(lang: AppLanguage): String = if (lang == AppLanguage.HINDI) nameHi else nameEn
    fun subtitle(lang: AppLanguage): String = if (lang == AppLanguage.HINDI) nameEn else nameHi
    fun description(lang: AppLanguage): String = if (lang == AppLanguage.HINDI) descriptionHi else descriptionEn
    fun priorPrepNote(lang: AppLanguage): String? = if (lang == AppLanguage.HINDI) priorPrepNoteHi else priorPrepNoteEn
    fun cookingTip(lang: AppLanguage): String = if (lang == AppLanguage.HINDI) cookingTipHi else cookingTipEn
    fun safetyTip(lang: AppLanguage): String = if (lang == AppLanguage.HINDI) safetyTipHi else safetyTipEn
}

data class DirectoryEntry(
    val nameEn: String,
    val nameHi: String,
    val country: Country,
    val category: FoodCategory,
    val linkedRecipeId: String? = null
)

data class RecipeRatingSummary(
    val averageRating: Double = 0.0,
    val reviewCount: Int = 0
)

fun formatScaledQuantity(baseQty: Double, defaultServings: Int, targetServings: Int, isScalable: Boolean): String {
    if (!isScalable || baseQty <= 0.0) return ""
    val scaled = baseQty * (targetServings.toDouble() / defaultServings.coerceAtLeast(1).toDouble())
    val whole = scaled.toInt()
    val frac = scaled - whole
    val fracText = when {
        frac < 0.12 -> ""
        frac < 0.32 -> "1/4"
        frac < 0.42 -> "1/3"
        frac < 0.62 -> "1/2"
        frac < 0.72 -> "2/3"
        frac < 0.88 -> "3/4"
        else -> null
    }
    return when {
        fracText == null -> "${whole + 1}"
        whole == 0 && fracText.isNotEmpty() -> fracText
        whole > 0 && fracText.isNotEmpty() -> "$whole $fracText"
        else -> "$whole"
    }
}

fun themealdbIngredientUrl(ingredientEnglish: String): String {
    val formatted = ingredientEnglish.trim().replace(" ", "%20")
    return "https://www.themealdb.com/images/ingredients/$formatted-Small.png"
}
