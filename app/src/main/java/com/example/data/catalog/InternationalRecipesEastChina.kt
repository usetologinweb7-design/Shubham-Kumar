package com.example.data.catalog

import com.example.R
import com.example.data.model.*

val internationalRecipesEastChina: List<Recipe> = listOf(
    // CHINA
    Recipe(
        id = "hakka_noodles",
        nameEn = "Veg Hakka Noodles",
        nameHi = "वेज हक्का नूडल्स",
        country = Country.CHINA,
        category = FoodCategory.INTERNATIONAL,
        mealTimes = listOf(MealTime.SNACKS, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 12,
        cookMinutes = 12,
        defaultServings = 2,
        isPopular = true,
        isTrending = true,
        descriptionEn = "Smoky street-style wok noodles stir-fried on high heat with crisp julienned veggies, garlic, and savory soy-vinegar.",
        descriptionHi = "तेज़ आंच पर कुरकुरी सब्ज़ियों, लहसुन और सोया सॉस के साथ बने बाज़ार जैसे देसी चाइनीज़ वेज हक्का नूडल्स।",
        cookingTipEn = "Rinse boiled noodles immediately in cold water and coat with 1 tsp oil so they never stick or clump!",
        cookingTipHi = "उबले नूडल्स को तुरंत ठंडे पानी से धोकर 1 चम्मच तेल लगा दें—नूडल्स बिल्कुल खिले-खिले रहेंगे।",
        safetyTipEn = "Line up all chopped veggies and measured sauces beside the stove before lighting high heat.",
        safetyTipHi = "नूडल्स तेज़ आंच पर मिनटों में पकते हैं, इसलिए सारी कटी सब्ज़ियाँ व सॉस पहले से पास रख लें।",
        imageRes = R.drawable.img_dish_noodles,
        ingredients = listOf(
            Ingredient("Hakka Noodles", "हक्का नूडल्स", 150.0, "g", "ग्राम", true, null, R.drawable.img_dish_noodles),
            Ingredient("Cabbage, Carrot & Capsicum (julienned)", "लंबी कटी पत्तागोभी, गाजर व शिमला मिर्च", 1.5, "cups", "कप", true, themealdbIngredientUrl("Carrots"), R.drawable.img_step_chop),
            Ingredient("Onion, Garlic & Spring Onion", "प्याज, लहसुन व हरी प्याज", 0.5, "cup", "कप", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_chop),
            Ingredient("Soy Sauce, Chilli Sauce & Vinegar", "सोया सॉस, चिली सॉस व सिरका", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Soy Sauce"), R.drawable.img_step_spices),
            Ingredient("Cooking Oil & Black Pepper", "तेल व काली मिर्च पाउडर", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Boil hakka noodles 85% al dente", "नूडल्स को 4–5 मिनट (85%) उबालें",
                "Bring 5 cups water with 1 tsp salt and 1 tsp oil to a rolling boil; drop noodles and boil 4–5 minutes until tender outside with a tiny firm bite inside.",
                "5 कप उबलते पानी में 1 चम्मच नमक व तेल डालें, नूडल्स डालकर 4-5 मिनट (85% पकने तक) उबालें; बहुत ज़्यादा न गलाएं।",
                "Overboiled noodles turn mushy when tossed later.", "नूडल्स 85% ही उबालें वरना भूनते समय टूट जाएंगे।",
                5, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "High Boil", heatLevelHi = "तेज़ उबाल",
                timingDetailEn = "Boil 4–5 min (+1 min if thick)", timingDetailHi = "4-5 मिनट उबालें (मोटे हों तो 1m और)"
            ),
            CookingStep(
                2, "Drain, rinse cold & toss with 1 tsp oil", "ठंडे पानी से धोकर 1 चम्मच तेल लगाकर फैलाएं",
                "Drain immediately into a colander, rinse well under cold running water to stop cooking, drain dry 2 min, and coat lightly with 1 tsp oil on a tray.",
                "तुरंत छलनी में छानकर ऊपर से ठंडा पानी चलाएं, 2 मिनट पानी निथारें और 1 चम्मच तेल लगाकर थाली में फैला दें।",
                "Cold wash + light oil keeps every strand bouncy and separate!", "ठंडा पानी व 1 चम्मच तेल नूडल्स को आपस में चिपकने नहीं देता।",
                3, PrepStage.WASH, R.drawable.img_step_drain,
                heatLevelEn = "No Flame (Rinse & Oil)", heatLevelHi = "बिना गैस (धोना व तेल)",
                timingDetailEn = "Cold rinse + 2 min drain", timingDetailHi = "ठंडे पानी से धोकर 2 मिनट छनने दें"
            ),
            CookingStep(
                3, "Slice vegetables into thin matchstick strips", "गाजर, शिमला मिर्च, पत्तागोभी व प्याज पतला काटें",
                "Wash carrot, capsicum, cabbage, and onion; slice them into uniform thin strips, and finely mince garlic, ginger, and spring onion greens.",
                "गाजर, शिमला मिर्च, पत्तागोभी व प्याज को पतली लंबी स्ट्रिप्स में तथा लहसुन, अदरक व हरी प्याज बारीक काट लें।",
                "Thin juliennes sear crisp in 2 minutes and twirl smoothly with noodles.", "पतले लंबे टुकड़े तेज़ आंच पर जल्दी पकते हैं और नूडल्स संग अच्छे लिपटते हैं।",
                5, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "5 min slicing", timingDetailHi = "5 मिनट में सारी कटिंग तैयार"
            ),
            CookingStep(
                4, "Sear garlic & ginger in smoking hot wok", "तेज़ आंच पर लहसुन-अदरक 20 सेकंड भूनें",
                "Heat 1.5 tbsp oil in a wide wok/kadhai on HIGH flame until shimmering hot; drop minced garlic, ginger, and white onion strips for 20–30 seconds.",
                "चौड़ी कड़ाही में तेज़ आंच पर तेल गरम कर बारीक लहसुन, अदरक और प्याज डालकर 20-30 सेकंड तेज़ भूनें।",
                "High flame creates authentic smoky street-style aroma ('wok hei').", "तेज़ आंच पर भूनने से ठेले जैसा स्मोकी स्वाद आता है।",
                1, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "High Flame", heatLevelHi = "तेज़ आंच",
                timingDetailEn = "Sear 20–30 sec", timingDetailHi = "20-30 सेकंड तेज़ आंच पर भूनें"
            ),
            CookingStep(
                5, "Stir-fry vegetables crisp-tender (2 min)", "सब्ज़ियों को तेज़ आंच पर 2 मिनट क्रंची भूनें",
                "Toss in carrot first for 30 sec, then capsicum and shredded cabbage; stir-fry continuously on HIGH heat for 1.5 minutes so veggies stay crunchy without leaking water.",
                "पहले गाजर 30 सेकंड, फिर शिमला मिर्च व पत्तागोभी डालकर तेज़ आंच पर लगातार चलाते हुए 1.5 मिनट भूनें ताकि क्रंची रहें व पानी न छोड़ें।",
                "Never lower flame or cover lid during veggie stir-fry!", "आंच धीमी न करें और न ही ढक्कन लगाएं वरना सब्ज़ियाँ पानी छोड़ देंगी।",
                2, PrepStage.COOK_SIMMER, R.drawable.img_step_fry_onion,
                heatLevelEn = "High Flame", heatLevelHi = "तेज़ आंच",
                timingDetailEn = "Stir-fry 2 min uncovered", timingDetailHi = "बिना ढके 2 मिनट तेज़ आंच पर भूनें"
            ),
            CookingStep(
                6, "Toss noodles with sauces & pepper (2 min)", "नूडल्स, सॉस व काली मिर्च डालकर 2 मिनट टॉस करें",
                "Add boiled oiled noodles, soy sauce, green chilli sauce, vinegar, salt, and freshly crushed black pepper; lift and toss with two forks/tongs on high heat for 2 minutes.",
                "नूडल्स, सोया सॉस, चिली सॉस, सिरका, नमक व काली मिर्च डालें; दो कांटों या चिमटे से उठाते हुए तेज़ आंच पर 2 मिनट अच्छे से मिलाएं।",
                "Using two forks lifts noodles cleanly without breaking strands.", "चिमटे या दो कांटों से टॉस करने पर नूडल्स टूटते नहीं।",
                2, PrepStage.MIX, R.drawable.img_dish_noodles,
                heatLevelEn = "High Flame", heatLevelHi = "तेज़ आंच",
                timingDetailEn = "Toss 2 min until steaming hot", timingDetailHi = "2 मिनट तेज़ आंच पर टॉस करें"
            ),
            CookingStep(
                7, "Finish with spring onions & serve piping hot", "हरी प्याज सजाकर गरमागरम तुरंत परोसें",
                "Switch off stove, fold in crisp green spring onions, transfer to plates, and serve piping hot right away (pairs wonderfully with Veg Manchurian)!",
                "गैस बंद कर ताज़ी कटी हरी प्याज मिलाएं और गरमागरम वेज मंचूरियन या चिली सॉस के साथ तुरंत परोसें!",
                "Serve straight off the wok while smoky and crisp!", "गरमागरम परोसें — स्ट्रीट स्टाइल हक्का नूडल्स तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Serve Immediately", heatLevelHi = "तुरंत परोसें",
                timingDetailEn = "Garnish & serve -> Ready!", timingDetailHi = "सजाकर तुरंत परोसें!"
            )
        )
    ),
    Recipe(
        id = "veg_fried_rice",
        nameEn = "Veg Fried Rice",
        nameHi = "वेज फ्राइड राइस",
        country = Country.CHINA,
        category = FoodCategory.INTERNATIONAL,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 10,
        cookMinutes = 10,
        defaultServings = 2,
        priorPrepNoteEn = "Best made with cooled, pre-cooked rice (or boil rice 8–9 min and spread to cool 15 min beforehand).",
        priorPrepNoteHi = "नोट: पका हुआ ठंडा चावल उपयोग करें (कच्चा हो तो 8-9 मिनट उबालकर 15 मिनट थाली में ठंडा कर लें)।",
        descriptionEn = "Aromatic smoky wok-tossed rice packed with colorful diced carrots, beans, corn, garlic, spring onions, and soy sauce.",
        descriptionHi = "रंग-बिरंगी बारीक कटी सब्ज़ियों, लहसुन और सोया सॉस से बना झटपट, खिला-खिला और स्वादिष्ट वेज फ्राइड राइस।",
        cookingTipEn = "Chilled cooked rice grains stay separate and bouncy when stir-fried on blazing high heat.",
        cookingTipHi = "ठंडे किए हुए उबले चावल तेज़ आंच पर भूनने पर भी बिल्कुल नहीं टूटते और खिले रहते हैं।",
        safetyTipEn = "Keep tossing continuously once rice enters the hot wok so garlic and soy don't stick.",
        safetyTipHi = "तेज़ आंच पर लगातार चलाते रहें ताकि लहसुन या चावल तले में न लगे।",
        imageRes = R.drawable.img_dish_biryani,
        ingredients = listOf(
            Ingredient("Cooled Cooked Long-Grain Rice", "पका हुआ ठंडा बासमती चावल", 2.0, "cups", "कप", true, themealdbIngredientUrl("Rice"), R.drawable.img_dish_biryani),
            Ingredient("Carrot, French Beans & Capsicum (diced)", "बारीक कटी गाजर, बीन्स व शिमला मिर्च", 1.0, "cup", "कप", true, themealdbIngredientUrl("Carrots"), R.drawable.img_step_chop),
            Ingredient("Garlic, Ginger & Spring Onion", "लहसुन, अदरक व हरी प्याज", 3.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_chop),
            Ingredient("Soy Sauce & White Vinegar", "सोया सॉस व सिरका", 1.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Soy Sauce"), R.drawable.img_step_spices),
            Ingredient("Oil & Black Pepper Powder", "तेल व काली मिर्च पाउडर", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash & finely dice colorful veggies", "सब्ज़ियाँ धोकर बिल्कुल बारीक चौकोर काटें",
                "Wash carrot, French beans, bell pepper, and spring onions; cut veggies into tiny uniform 1/4-inch dice so they cook evenly in 2–3 minutes.",
                "गाजर, फ्रेंच बीन्स, शिमला मिर्च व हरी प्याज धोकर बिल्कुल बारीक चौकोर टुकड़ों में काटें (सफेद और हरा प्याज अलग रखें)।",
                "Tiny dice matches rice scale and stays crisp-tender fast.", "बारीक टुकड़े चावल के दानों संग मिल जाते हैं और जल्दी पकते हैं।",
                5, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Wash & Dice)", heatLevelHi = "बिना गैस (धोना व काटना)",
                timingDetailEn = "5 min washing & dicing", timingDetailHi = "5 मिनट में बारीक कटिंग"
            ),
            CookingStep(
                2, "Loosen cooled cooked rice grains cleanly", "ठंडे पके चावल की गांठें हाथ से अलग करें",
                "Gently fluff chilled cooked rice between fingertips so zero clumps remain (if cooking fresh rice, boil 8–9 min, drain, and cool on a wide plate 15 min first).",
                "पके हुए ठंडे चावल की गांठों को उंगलियों से हल्के हाथ से अलग कर लें (ताज़ा बनाना हो तो 8-9 मिनट उबालकर 15 मिनट थाली में ठंडा करें)।",
                "Dry loose grains soak up soy sauce cleanly without turning soggy.", "खुले दाने भूनने पर भी टूटते नहीं और हर दाना मसाला सोखता है।",
                2, PrepStage.CHOP, R.drawable.img_dish_biryani,
                heatLevelEn = "No Flame (Fluff)", heatLevelHi = "बिना गैस (तैयारी)",
                timingDetailEn = "2 min fluffing", timingDetailHi = "2 मिनट में दाने अलग करें"
            ),
            CookingStep(
                3, "Saute garlic, ginger & scallion whites", "तेज़ आंच पर लहसुन, अदरक व सफेद प्याज भूनें",
                "Heat 2 tbsp oil in a wok on HIGH heat until faint smoke appears; toss minced garlic, ginger, and white spring onion bulbs for 20 seconds.",
                "कड़ाही में 2 चम्मच तेल तेज़ आंच पर गरम कर बारीक लहसुन, अदरक व हरी प्याज का सफेद हिस्सा 20 सेकंड भूनें।",
                "Move quickly so garlic turns golden-fragrant, not dark.", "लहसुन जले नहीं इसलिए तेज़ चलाते हुए भूनें।",
                1, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "High Flame", heatLevelHi = "तेज़ आंच",
                timingDetailEn = "20–30 sec aromatic sear", timingDetailHi = "20-30 सेकंड तेज़ आंच पर भूनें"
            ),
            CookingStep(
                4, "Stir-fry diced veggies crisp on high heat", "कटी सब्ज़ियों को 2–3 मिनट तेज़ आंच पर भूनें",
                "Add diced carrots and beans first for 1.5 min, then capsicum and peas/corn for 1.5 min more on high flame until vibrant and crisp-tender.",
                "पहले गाजर-बीन्स 1.5 मिनट, फिर शिमला मिर्च व मटर/कॉर्न डालकर तेज़ आंच पर 1.5 मिनट और भूनें (सब्ज़ियाँ क्रंची रखें)।",
                "High flame locks bright veggie colors and crunch.", "तेज़ आंच पर सब्ज़ियों का रंग व क्रंच दोनों बरकरार रहते हैं।",
                3, PrepStage.COOK_SIMMER, R.drawable.img_step_fry_onion,
                heatLevelEn = "High Flame", heatLevelHi = "तेज़ आंच",
                timingDetailEn = "Stir-fry 3 min uncovered", timingDetailHi = "बिना ढके 3 मिनट तेज़ आंच पर भूनें"
            ),
            CookingStep(
                5, "Toss rice with soy, vinegar & pepper", "चावल, सोया सॉस, सिरका व काली मिर्च 3 मिनट भूनें",
                "Add loosened rice, drizzle soy sauce and white vinegar along the hot wok edges, sprinkle salt and crushed black pepper, and toss vigorously from bottom for 3 minutes.",
                "चावल डालें, किनारे से सोया सॉस व सिरका डालें, नमक व कुटी काली मिर्च छिड़कें और तले से पलटते हुए तेज़ आंच पर 3 मिनट भूनें।",
                "Drizzling soy sauce onto the hot metal edge caramelizes instant smoky flavor!", "गरम कड़ाही की दीवार पर सोया सॉस डालने से बढ़िया स्मोकी स्वाद आता है।",
                3, PrepStage.MIX, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "High Flame", heatLevelHi = "तेज़ आंच",
                timingDetailEn = "Toss 3 min until grains dance", timingDetailHi = "3 मिनट तेज़ आंच पर टॉस करें"
            ),
            CookingStep(
                6, "Fold green spring onions & serve steaming hot", "हरी प्याज मिलाएं और गरमागरम परोसें",
                "Turn off flame, toss in crisp green spring onion tops, plate neatly, and serve hot on its own or alongside Veg Manchurian gravy!",
                "गैस बंद कर ताज़ी कटी हरी प्याज की पत्तियाँ मिलाएं और गरमागरम वेज मंचूरियन या चिली पनीर संग परोसें!",
                "Ready in just 20 minutes from prep to plate!", "सिर्फ 20 मिनट में रेस्टोरेंट स्टाइल फ्राइड राइस तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Serve Hot", heatLevelHi = "गरमागरम परोसें",
                timingDetailEn = "Garnish & serve -> Ready!", timingDetailHi = "सजाकर परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "veg_manchurian",
        nameEn = "Veg Manchurian (Dry/Gravy)",
        nameHi = "वेज मंचूरियन",
        country = Country.CHINA,
        category = FoodCategory.INTERNATIONAL,
        mealTimes = listOf(MealTime.SNACKS, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 22,
        cookMinutes = 22,
        defaultServings = 3,
        descriptionEn = "Crispy vegetable-cabbage balls tossed in a glossy, tangy garlic-ginger-soy Indo-Chinese sauce.",
        descriptionHi = "कुरकुरे सब्ज़ी बॉल्स को लहसुन, अदरक, सोया और चिली सॉस की चमकदार चटपटी ग्रेवी में लपेटकर बना वेज मंचूरियन।",
        cookingTipEn = "Squeeze water firmly from grated veggies so you only need minimal cornflour & maida—this keeps balls light, never doughy!",
        cookingTipHi = "कद्दूकस सब्ज़ियों का पानी अच्छे से निचोड़ लें ताकि कम कॉर्नफ्लोर-मैदा लगे और बॉल्स अंदर से हल्के व बाहर से कुरकुरे बनें।",
        safetyTipEn = "Always dissolve cornflour in cold/room-temp water before pouring into hot gravy so zero lumps form.",
        safetyTipHi = "कॉर्नफ्लोर को हमेशा ठंडे पानी में घोलकर ही गरम सॉस में डालें ताकि गुठली न बने।",
        imageRes = R.drawable.img_dish_noodles,
        ingredients = listOf(
            Ingredient("Finely Grated Cabbage & Carrot", "कद्दूकस पत्तागोभी व गाजर", 2.0, "cups", "कप", true, themealdbIngredientUrl("Cabbage"), R.drawable.img_step_chop),
            Ingredient("Cornflour & Maida (for balls + slurry)", "कॉर्नफ्लोर व मैदा", 5.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_knead_roll),
            Ingredient("Garlic, Ginger, Capsicum & Spring Onion", "लहसुन, अदरक, शिमला मिर्च व हरी प्याज", 0.75, "cup", "कप", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_chop),
            Ingredient("Soy, Red Chilli & Tomato Sauce + Vinegar", "सोया, चिली व टोमैटो सॉस + सिरका", 3.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Soy Sauce"), R.drawable.img_step_spices),
            Ingredient("Oil & Black Pepper", "तेल व काली मिर्च", 4.0, "tbsp", "बड़ी चम्मच", false, null, R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Grate cabbage-carrot & rest with salt 5 min", "पत्तागोभी-गाजर घिसें व नमक लगाकर 5 मिनट रखें",
                "Finely grate cabbage, carrot, and 3 tbsp capsicum/beans; sprinkle 1/2 tsp salt in a bowl and let rest 5 minutes to release moisture.",
                "पत्तागोभी, गाजर व थोड़ी शिमला मिर्च बारीक घिस लें; आधा चम्मच नमक मिलाकर 5 मिनट रखें ताकि सब्ज़ियाँ पानी छोड़ दें।",
                "Grated (not chunky) veggies bind tightly into round smooth balls.", "बारीक कद्दूकस सब्ज़ियों के बॉल्स गोल और बिना टूटे बनते हैं।",
                6, PrepStage.WASH, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Grate & Salt)", heatLevelHi = "बिना गैस (तैयारी)",
                timingDetailEn = "Grate & rest 5 min", timingDetailHi = "घिसकर 5 मिनट नमक लगाकर रखें"
            ),
            CookingStep(
                2, "Squeeze out every drop of veggie water", "सब्ज़ियों का सारा पानी कसकर निचोड़ दें",
                "Squeeze salted veggies firmly between palms or inside a clean muslin cloth until thoroughly dry.",
                "नमक लगी सब्ज़ियों को दोनों हाथों से कसकर निचोड़ लें ताकि सारा अतिरिक्त पानी निकल जाए।",
                "Keep that nutritious squeezed veggie water to mix into your sauce later!", "निचुड़ा हुआ सब्ज़ी का पानी फेंकें नहीं, ग्रेवी बनाते वक्त उपयोग करें।",
                2, PrepStage.WASH, R.drawable.img_step_drain,
                heatLevelEn = "No Flame (Squeeze)", heatLevelHi = "बिना गैस (निचोड़ना)",
                timingDetailEn = "2 min firm squeezing", timingDetailHi = "2 मिनट में सारा पानी निचोड़ें"
            ),
            CookingStep(
                3, "Bind mix with cornflour-maida & roll balls", "कॉर्नफ्लोर-मैदा मिलाकर छोटे गोल बॉल्स बनाएं",
                "Mix squeezed veggies with grated ginger, minced garlic, pepper, 2 tbsp cornflour, and 2 tbsp maida gently into a cohesive mix; roll into smooth lemon-sized balls.",
                "निचोड़ी सब्ज़ियों में अदरक, लहसुन, काली मिर्च, 2 चम्मच कॉर्नफ्लोर व 2 चम्मच मैदा मिलाएं और छोटे नींबू बराबर गोल बॉल्स बना लें।",
                "Don't knead hard or veggies will leak more water—bind lightly and roll fast!", "हल्के हाथ से मिलाकर तुरंत गोल बॉल्स बनाएं वरना फिर पानी छूटेगा।",
                5, PrepStage.MIX, R.drawable.img_step_fold_stuff,
                heatLevelEn = "No Flame (Shape)", heatLevelHi = "बिना गैस (बॉल्स बनाएं)",
                timingDetailEn = "5 min shaping all balls", timingDetailHi = "5 मिनट में सभी बॉल्स बना लें"
            ),
            CookingStep(
                4, "Deep-fry balls on medium heat until golden crisp", "मध्यम आंच पर 6-7 मिनट सुनहरा कुरकुरा तलें",
                "Slide balls into medium-hot oil; don't disturb for the first 60 sec, then fry gently turning for 6–7 minutes until deep golden brown inside and out; drain on tissue.",
                "मध्यम गरम तेल में बॉल्स डालें, 1 मिनट न छेड़ें फिर पलटते हुए 6-7 मिनट गहरा सुनहरा कुरकुरा तलकर टिश्यू पर निकालें।",
                "High oil heat leaves centers raw & doughy—keep flame strictly medium!", "तेज़ आंच पर ऊपर से जल जाएंगे व अंदर कच्चे रहेंगे—आंच मध्यम ही रखें।",
                7, PrepStage.COOK_SIMMER, R.drawable.img_dish_noodles,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Fry 6–7 min (+1 min if soft)", timingDetailHi = "6-7 मिनट सुनहरा कुरकुरा तलें"
            ),
            CookingStep(
                5, "Chop aromatics & prepare cold cornflour slurry", "लहसुन-शिमला मिर्च काटें व कॉर्नफ्लोर घोल बनाएं",
                "Finely mince 1 tbsp garlic, 1 tsp ginger, green chillies, and dice onion & capsicum; stir 1 tbsp cornflour into 1/4 cup cold water smoothly.",
                "1 बड़ी चम्मच लहसुन, अदरक, हरी मिर्च व प्याज-शिमला मिर्च काट लें; अलग कटोरी में 1 चम्मच कॉर्नफ्लोर को चौथाई कप ठंडे पानी में घोलकर रखें।",
                "Pre-mixed slurry avoids panic when wok is roaring hot!", "सॉस बनाने से पहले कॉर्नफ्लोर घोल तैयार रखना बहुत आसान रहता है।",
                3, PrepStage.CHOP, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "No Flame (Prep Slurry)", heatLevelHi = "बिना गैस (स्लरी व कटिंग)",
                timingDetailEn = "3 min prep", timingDetailHi = "3 मिनट में घोल व कटिंग तैयार"
            ),
            CookingStep(
                6, "Saute garlic, ginger, chilli & capsicum on high", "तेज़ आंच पर लहसुन, अदरक व शिमला मिर्च भूनें",
                "Heat 1 tbsp oil in a clean wok on HIGH flame; toss minced garlic, ginger, and green chillies 20 sec, then stir-fry diced onion & capsicum 1.5 minutes crisp.",
                "साफ कड़ाही में तेज़ आंच पर 1 चम्मच तेल गरम कर लहसुन, अदरक व हरी मिर्च 20 सेकंड भूनें, फिर कटा प्याज व शिमला मिर्च 1.5 मिनट क्रंची भूनें।",
                "Generous chopped garlic makes authentic Indo-Chinese punch!", "खूब सारा बारीक लहसुन मंचूरियन सॉस में असली स्वाद लाता है।",
                2, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "High Flame", heatLevelHi = "तेज़ आंच",
                timingDetailEn = "Stir-fry 2 min high flame", timingDetailHi = "2 मिनट तेज़ आंच पर भूनें"
            ),
            CookingStep(
                7, "Simmer soy, chilli & tomato sauces with stock", "सॉस व पानी डालकर 2 मिनट तेज़ उबाल लाएं",
                "Lower flame briefly, pour soy sauce, red chilli sauce, tomato ketchup, vinegar, pepper, salt, and 3/4 cup water (1.5 cups for gravy); raise heat to boil 2 minutes.",
                "आंच कम कर सोया सॉस, रेड चिली सॉस, टोमैटो केचप, सिरका, काली मिर्च व पौना कप पानी (ग्रेवी के लिए 1.5 कप) डालें और 2 मिनट उबलने दें।",
                "Save 1/2 tsp salt until after tasting because sauces are salty.", "सॉस में नमक होता है इसलिए चखने के बाद ही नमक डालें।",
                2, PrepStage.COOK_SIMMER, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Medium-High Flame", heatLevelHi = "मध्यम-तेज़ आंच",
                timingDetailEn = "Boil 2 min", timingDetailHi = "2 मिनट उबाल आने दें"
            ),
            CookingStep(
                8, "Thicken sauce glossy with cornflour slurry", "कॉर्नफ्लोर घोल डालकर सॉस चमकदार गाढ़ा करें",
                "Stir the cold cornflour slurry again, pour slowly into boiling sauce while stirring continuously, and simmer 2 minutes until translucent and glossy thick.",
                "ठंडा कॉर्नफ्लोर घोल फिर चलाएं और उबलते सॉस में धीरे-धीरे डालते हुए लगातार चलाएं; 2 मिनट चमकदार गाढ़ा होने तक पकाएं।",
                "Boiling 2 minutes removes any raw cornstarch chalkiness cleanly.", "2 मिनट उबालने से सॉस बिल्कुल पारदर्शी व चमकदार बनता है।",
                2, PrepStage.COOK_SIMMER, R.drawable.img_dish_curry_bowl,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Simmer 2–3 min until glossy", timingDetailHi = "2-3 मिनट चमकदार गाढ़ा होने तक उबालें"
            ),
            CookingStep(
                9, "Toss fried balls 1 minute, garnish & serve hot", "तले बॉल्स 1 मिनट लपेटें, हरी प्याज सजाकर परोसें",
                "Drop crisp fried veggie balls into the hot glossy sauce, toss gently for 1 minute until coated evenly, scatter spring onions, and serve immediately with fried rice or noodles!",
                "गरम चमकदार सॉस में कुरकुरे मंचूरियन बॉल्स डालकर 1 मिनट हल्के हाथ से मिलाएं, ऊपर कटी हरी प्याज सजाएं और फ्राइड राइस या नूडल्स संग तुरंत परोसें!",
                "Drop balls right before serving so they stay crisp outside!", "खाने से ठीक पहले बॉल्स सॉस में मिलाएं ताकि वे कुरकुरे रहें!",
                2, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Low (1m) -> Serve Hot", heatLevelHi = "धीमी (1m) -> तुरंत परोसें",
                timingDetailEn = "Coat 1 min -> Ready!", timingDetailHi = "1 मिनट सॉस में लपेटें — गरमागरम तैयार!"
            )
        )
    )
)
