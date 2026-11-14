package com.example.data.catalog

import com.example.R
import com.example.data.model.*

val quickFiveMinRecipesPart2: List<Recipe> = listOf(
    Recipe(
        id = "tomato_onion_salad",
        nameEn = "Tomato Onion Salad",
        nameHi = "टमाटर प्याज सलाद",
        country = Country.INDIA,
        category = FoodCategory.BREAKFAST_SNACKS,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 4,
        cookMinutes = 0,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        descriptionEn = "Classic Indian everyday kachumber-style tomato and onion salad with lemon and green chilli.",
        descriptionHi = "रोज़मर्रा के खाने के साथ परोसा जाने वाला ताज़ा टमाटर-प्याज का कचूमर सलाद।",
        cookingTipEn = "Soak sliced onion in cold water for 2 minutes if you want milder sharpness.",
        cookingTipHi = "प्याज का तीखापन कम करने के लिए कटे प्याज को 2 मिनट ठंडे पानी में भिगो दें।",
        safetyTipEn = "Use a sharp knife gently on tomatoes so they slice cleanly without slipping.",
        safetyTipHi = "टमाटर काटते समय धीरे और संभलकर चाकू चलाएं।",
        imageRes = R.drawable.img_salad_bowl_1794638376646,
        ingredients = listOf(
            Ingredient("Tomato", "टमाटर", 2.0, "medium", "मध्यम", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_wash),
            Ingredient("Onion", "प्याज", 1.0, "medium", "मध्यम", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_chop),
            Ingredient("Lemon", "नींबू", 0.5, "piece", "नग", true, themealdbIngredientUrl("Lemon"), R.drawable.img_step_lemon),
            Ingredient("Salt", "नमक", 0.5, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Salt"), R.drawable.img_step_spices),
            Ingredient("Black Pepper", "काली मिर्च", 0.25, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Black Pepper"), R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash tomatoes & chop into cubes", "टमाटर धोकर छोटे टुकड़ों में काटें",
                "Rinse firm ripe tomatoes, remove the top green stem eye, and chop into neat bite-sized cubes.",
                "पके सख्त टमाटर धोकर ऊपर का डंठल हटाएं और छोटे टुकड़ों में काट लें।",
                "Firm tomatoes cut cleanly without squishing.", "सख्त टमाटर काटने में आसान रहते हैं और पानी कम छोड़ते हैं।",
                1, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min washing & chopping", timingDetailHi = "1 मिनट धोकर काटें"
            ),
            CookingStep(
                2, "Slice or dice the onion", "प्याज छीलकर पतला काटें",
                "Peel the onion and slice thinly into crisp rings or small dice; rinse in cold water if you want mild flavor.",
                "प्याज छीलकर पतले लच्छों या छोटे टुकड़ों में काटें; तीखापन कम करने को ठंडे पानी से धो सकते हैं।",
                "Thin slices look neat and distribute evenly.", "पतले लच्छे खाने में स्वाद और दिखने में सुंदर लगते हैं।",
                1, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min slicing", timingDetailHi = "1 मिनट में प्याज काटें"
            ),
            CookingStep(
                3, "Toss with lemon, salt & black pepper", "नींबू, नमक और काली मिर्च मिलाएं",
                "Combine tomatoes and onions in a bowl with squeezed lemon juice, salt, and freshly crushed black pepper.",
                "बाउल में टमाटर-प्याज के साथ नींबू का रस, नमक और कुटी काली मिर्च डालकर हल्के से मिलाएं।",
                "Add salt just before eating!", "नमक बिल्कुल खाने के समय मिलाएं ताकि सलाद कुरकुरा रहे।",
                1, PrepStage.MIX, R.drawable.img_step_salad_mix,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min tossing", timingDetailHi = "1 मिनट मसाले मिलाएं"
            ),
            CookingStep(
                4, "Plate and serve alongside meal", "प्लेट में सजाकर तुरंत परोसें",
                "Arrange on a serving plate, top with fresh coriander leaves, and serve with dal-rice or roti.",
                "प्लेट में सजाएं, ऊपर हरा धनिया रखें और दाल-चावल या रोटी संग तुरंत परोसें।",
                "Simple, healthy & zero-cook!", "बिना गैस जलाए झटपट सेहतमंद सलाद तैयार!",
                1, PrepStage.SERVE, R.drawable.img_salad_bowl_1794638376646,
                heatLevelEn = "Serve Fresh", heatLevelHi = "ताज़ा परोसें",
                timingDetailEn = "Serve immediately -> Ready!", timingDetailHi = "तुरंत परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "bread_butter",
        nameEn = "Bread Butter",
        nameHi = "ब्रेड बटर",
        country = Country.INDIA,
        category = FoodCategory.BREAKFAST_SNACKS,
        mealTimes = listOf(MealTime.BREAKFAST, MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 2,
        cookMinutes = 3,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        descriptionEn = "Quick golden toasted bread slices spread evenly with creamy salted butter.",
        descriptionHi = "सुबह की चाय के साथ 5 मिनट में बनने वाला सुनहरा और स्वादिष्ट ब्रेड बटर।",
        cookingTipEn = "Take butter out of the fridge 5 minutes early so it spreads smoothly without tearing bread.",
        cookingTipHi = "मक्खन को 5 मिनट पहले फ्रिज से बाहर निकाल लें ताकि वह ब्रेड पर आसानी से फैल जाए।",
        safetyTipEn = "Keep flame low when toasting on tawa so the bread turns golden instead of burning.",
        safetyTipHi = "तवे पर सेंकते समय गैस धीमी रखें ताकि ब्रेड जले नहीं।",
        imageRes = R.drawable.img_dish_bread,
        ingredients = listOf(
            Ingredient("Bread Slices", "ब्रेड स्लाइस", 4.0, "slices", "स्लाइस", true, themealdbIngredientUrl("Bread"), R.drawable.img_dish_bread),
            Ingredient("Butter", "मक्खन", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Butter"), R.drawable.img_dish_bread),
            Ingredient("Black Pepper (optional)", "काली मिर्च", 0.25, "tsp", "छोटी चम्मच", false, themealdbIngredientUrl("Black Pepper"), R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Spread soft butter on bread", "ब्रेड स्लाइस पर नरम मक्खन लगाएं",
                "Use a butter knife or back of a spoon to spread softened butter evenly across one side of each bread slice.",
                "चम्मच या बटर नाइफ से हर ब्रेड स्लाइस के एक तरफ बराबर मक्खन फैला लें।",
                "Spread all the way to edges for crispy corners.", "किनारों तक मक्खन लगाने से ब्रेड चारों तरफ कुरकुरी बनती है।",
                1, PrepStage.MIX, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min buttering", timingDetailHi = "1 मिनट में मक्खन लगाएं"
            ),
            CookingStep(
                2, "Warm tawa & toast first side (1 min)", "धीमे तवे पर पहली तरफ से 1 मिनट सेंकें",
                "Warm a clean tawa on LOW flame for 30 sec, place bread butter-side down, and toast 1 minute until light golden.",
                "धीमी आंच पर तवा हल्का गरम कर ब्रेड को मक्खन वाली ओर से रखें और 1 मिनट सुनहरा होने तक सेंकें।",
                "Gentle low heat gives crisp, never-burnt toast.", "धीमी आंच पर ब्रेड जलती नहीं और सुनहरी सिकती है।",
                1, PrepStage.COOK_SIMMER, R.drawable.img_step_tawa_roast,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Toast first side 1 min", timingDetailHi = "1 मिनट नीचे से सुनहरा सेंकें"
            ),
            CookingStep(
                3, "Butter top, flip & toast 45 sec", "ऊपर मक्खन लगाकर पलटें व 45 सेकंड सेंकें",
                "Spread thin butter on the top side, flip carefully with a spatula, and toast 45 seconds until both sides are crisp golden.",
                "ऊपरी तरफ हल्का मक्खन लगाकर पलटें और 45 सेकंड दूसरी तरफ से भी कुरकुरा सेंक लें।",
                "Press lightly with spatula for even browning.", "कड़छी से हल्का दबाने पर दोनों तरफ बराबर सुनहरा रंग आता है।",
                1, PrepStage.COOK_SIMMER, R.drawable.img_dish_bread,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Toast other side 45 sec", timingDetailHi = "45 सेकंड दूसरी ओर से सेंकें"
            ),
            CookingStep(
                4, "Cut diagonally & serve with tea", "तिकोना काटकर गरमागरम चाय संग परोसें",
                "Transfer to plate, sprinkle a pinch of black pepper if liked, cut into triangles, and serve hot!",
                "प्लेट में निकालकर चाहें तो चुटकी काली मिर्च छिड़कें, तिकोना काटें और गरम चाय संग परोसें!",
                "Classic 5-minute beginner breakfast!", "सबसे आसान और कुरकुरा नाश्ता तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Serve Hot", heatLevelHi = "गरमागरम परोसें",
                timingDetailEn = "Serve hot -> Ready!", timingDetailHi = "तुरंत गरम परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "quick_sprouts_chaat",
        nameEn = "Quick Sprouts Chaat",
        nameHi = "झटपट अंकुरित चाट",
        country = Country.INDIA,
        category = FoodCategory.BREAKFAST_SNACKS,
        mealTimes = listOf(MealTime.BREAKFAST, MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 5,
        cookMinutes = 0,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        priorPrepNoteEn = "Moong sprouts must already be soaked/sprouted (or lightly steamed) beforehand.",
        priorPrepNoteHi = "नोट: मूंग पहले से भीगे और अंकुरित (Sprouted) तैयार होने चाहिए।",
        descriptionEn = "Nutritious, high-protein sprouted moong salad with fresh veggies, lemon, and spices.",
        descriptionHi = "पहले से अंकुरित मूंग में ताज़ी सब्ज़ियाँ और नींबू मिलाकर बनने वाली सेहतमंद चाट।",
        cookingTipEn = "Rinse sprouts cleanly before mixing so they taste extra fresh.",
        cookingTipHi = "मिलाने से पहले अंकुरित मूंग को एक बार साफ पानी से धोकर छान लें।",
        safetyTipEn = "If you prefer softer sprouts, steam them in a covered pot for 2 minutes first.",
        safetyTipHi = "अगर कच्चे अंकुरित मूंग पचने में भारी लगें तो हल्का भाप में पका लें।",
        imageRes = R.drawable.img_step_salad_mix,
        ingredients = listOf(
            Ingredient("Pre-sprouted Moong", "पहले से अंकुरित मूंग", 1.0, "cup", "कप", true, null, R.drawable.img_step_wash),
            Ingredient("Onion (chopped)", "कटा प्याज", 1.0, "small", "छोटा", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_chop),
            Ingredient("Tomato (chopped)", "कटा टमाटर", 1.0, "small", "छोटा", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Cucumber (chopped)", "कटा खीरा", 0.5, "cup", "कप", true, themealdbIngredientUrl("Cucumber"), R.drawable.img_step_chop),
            Ingredient("Lemon", "नींबू", 0.5, "piece", "नग", true, themealdbIngredientUrl("Lemon"), R.drawable.img_step_lemon),
            Ingredient("Chaat Masala & Salt", "चाट मसाला व नमक", 0.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Rinse & drain prepared sprouts", "अंकुरित मूंग धोकर पानी निथार लें",
                "Rinse pre-sprouted moong cleanly in a mesh strainer and let all water drain for 1 minute.",
                "तैयार अंकुरित मूंग को छलनी में साफ पानी से धो लें और 1 मिनट सारा पानी निथरने दें।",
                "Well-drained sprouts keep chaat crisp.", "पानी अच्छे से निथारने पर चाट पानी नहीं छोड़ती।",
                1, PrepStage.WASH, R.drawable.img_step_drain,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min rinsing & draining", timingDetailHi = "1 मिनट धोकर पानी निकालें"
            ),
            CookingStep(
                2, "Finely dice cucumber, onion & tomato", "खीरा, प्याज और टमाटर बारीक काटें",
                "Wash cucumber & tomato; finely dice cucumber, onion, tomato, and fresh coriander.",
                "खीरा व टमाटर धोकर प्याज व धनिये के साथ छोटे-छोटे एक जैसे टुकड़ों में काट लें।",
                "Small pieces blend well with tiny sprouts.", "छोटे टुकड़े अंकुरित दानों के साथ आसानी से मिक्स होते हैं।",
                2, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "2 min chopping", timingDetailHi = "2 मिनट में सब काट लें"
            ),
            CookingStep(
                3, "Toss sprouts, veggies, lemon & spices", "सब्ज़ियाँ, नींबू और चाट मसाला मिलाएं",
                "Combine sprouts and chopped veggies in a bowl; squeeze half a lemon, sprinkle chaat masala & black salt, and toss well.",
                "बाउल में अंकुरित मूंग व सब्ज़ियाँ डालें; आधा नींबू निचोड़ें, चाट मसाला व काला नमक मिलाकर अच्छे से चलाएं।",
                "Toss pomegranate seeds in for natural sweetness!", "चाहें तो थोड़े अनार दाने भी मिला सकते हैं।",
                1, PrepStage.MIX, R.drawable.img_step_salad_mix,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min tossing", timingDetailHi = "1 मिनट अच्छे से मिक्स करें"
            ),
            CookingStep(
                4, "Garnish & serve healthy bowl", "धनिया सजाकर ताज़ा परोसें",
                "Scoop into serving bowls, top with coriander leaves, and enjoy immediately!",
                "कटोरियों में निकालकर हरा धनिया सजाएं और तुरंत ताज़ा परोसें!",
                "Protein & fiber powerhouse in 5 min!", "प्रोटीन और फाइबर से भरपूर 5-मिनट नाश्ता तैयार!",
                1, PrepStage.SERVE, R.drawable.img_salad_bowl_1794638376646,
                heatLevelEn = "Serve Fresh", heatLevelHi = "ताज़ा परोसें",
                timingDetailEn = "Serve immediately -> Ready!", timingDetailHi = "तुरंत परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "instant_curd_rice",
        nameEn = "Instant Curd Rice",
        nameHi = "झटपट दही चावल",
        country = Country.INDIA,
        category = FoodCategory.BIRYANI_PULAO,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 3,
        cookMinutes = 2,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        priorPrepNoteEn = "Requires pre-cooked soft rice (leftover or already boiled rice).",
        priorPrepNoteHi = "नोट: चावल पहले से पके हुए (उबले हुए) होने चाहिए।",
        descriptionEn = "Soothing South Indian style curd rice using already-cooked rice, creamy yogurt, and quick mustard temper.",
        descriptionHi = "पहले से पके हुए चावल, ताज़ी दही और राई-करी पत्ते के तड़के से बना ठंडा दही चावल।",
        cookingTipEn = "Adding 2 tbsp milk keeps curd rice soft and creamy even if chilled.",
        cookingTipHi = "2 चम्मच दूध मिलाने से दही चावल ज़्यादा क्रीमी और मुलायम रहता है।",
        safetyTipEn = "Stand slightly back when mustard seeds pop (तड़कना) in hot oil.",
        safetyTipHi = "तड़के में राई चटकते समय पैन से थोड़ी दूरी रखें।",
        imageRes = R.drawable.img_step_raita,
        ingredients = listOf(
            Ingredient("Pre-cooked Rice", "पहले से पका चावल", 1.5, "cups", "कप", true, themealdbIngredientUrl("Rice"), R.drawable.img_dish_biryani),
            Ingredient("Fresh Curd", "ताज़ा दही", 1.0, "cup", "कप", true, themealdbIngredientUrl("Yogurt"), R.drawable.img_step_raita),
            Ingredient("Milk", "दूध", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Milk"), R.drawable.img_step_raita),
            Ingredient("Oil or Ghee", "तेल या घी", 1.0, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Mustard Seeds & Curry Leaves", "राई व करी पत्ता", 0.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Salt", "नमक", 0.5, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Salt"), R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Lightly mash room-temp cooked rice", "पके चावल को चम्मच से हल्का मसल लें",
                "Put room-temperature pre-cooked rice in a bowl and mash gently with the back of a spoon.",
                "पहले से पके सामान्य तापमान वाले चावल बाउल में लेकर चम्मच से हल्का मसल लें।",
                "Never mix curd into piping hot rice or it curdles.", "बहुत गरम चावल में दही न मिलाएं वरना दही फट सकता है।",
                1, PrepStage.CHOP, R.drawable.img_dish_biryani,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min mashing", timingDetailHi = "1 मिनट हल्का मसलें"
            ),
            CookingStep(
                2, "Whisk in fresh curd, milk & salt", "ताज़ा दही, दूध और नमक मिलाएं",
                "Add thick fresh curd, 2 tbsp milk, and salt; mix until smooth and velvety creamy.",
                "चावल में ताज़ा दही, 2 चम्मच दूध और नमक डालकर बिल्कुल क्रीमी होने तक मिलाएं।",
                "Milk stops curd rice from stiffening later.", "दूध डालने से दही चावल रखने के बाद भी मुलायम रहता है।",
                1, PrepStage.MIX, R.drawable.img_step_raita,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min creamy mixing", timingDetailHi = "1 मिनट क्रीमी होने तक चलाएं"
            ),
            CookingStep(
                3, "Heat oil in small tadka pan", "तड़का पैन में 1 चम्मच तेल गरम करें",
                "Heat 1 tsp oil or ghee in a small tadka pan over medium-low flame for 30 seconds.",
                "छोटी तड़का कटोरी में धीमी-मध्यम आंच पर 1 चम्मच तेल या घी 30 सेकंड गरम करें।",
                "Keep pan dry before adding oil.", "तेल डालने से पहले कटोरी सूखी हो।",
                1, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Medium-Low Flame", heatLevelHi = "धीमी-मध्यम आंच",
                timingDetailEn = "Warm oil 30 sec", timingDetailHi = "30 सेकंड तेल गरम करें"
            ),
            CookingStep(
                4, "Pop mustard seeds & curry leaves (20 sec)", "राई और करी पत्ता चटकाकर गैस बंद करें",
                "Add mustard seeds; as soon as they pop, add curry leaves & pinch of hing and turn off flame immediately.",
                "तेल में राई डालें, चटकते ही करी पत्ता व चुटकी हींग डालें और तुरंत गैस बंद कर दें।",
                "Switching off flame keeps curry leaves crisp & green.", "गैस बंद करने से करी पत्ते जलते नहीं हैं।",
                1, PrepStage.COOK_SIMMER, R.drawable.img_step_fry_onion,
                heatLevelEn = "Low -> Off", heatLevelHi = "धीमी -> गैस बंद",
                timingDetailEn = "Crackle 20 sec -> Flame off", timingDetailHi = "20 सेकंड चटकते ही गैस बंद करें"
            ),
            CookingStep(
                5, "Pour tadka over curd rice & serve", "तड़का मिलाकर धनिया संग परोसें",
                "Pour sizzling tadka over curd rice, stir gently, garnish with chopped coriander, and serve!",
                "गरम तड़का दही चावल के ऊपर डालकर मिलाएं, हरा धनिया सजाएं और तुरंत परोसें!",
                "Cooling comfort food in 5 minutes!", "पेट के लिए हल्का और स्वादिष्ट दही चावल तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off", heatLevelHi = "गैस बंद",
                timingDetailEn = "Stir & serve -> Ready!", timingDetailHi = "मिलाकर परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "quick_corn_chaat",
        nameEn = "Quick Corn Chaat",
        nameHi = "झटपट कॉर्न चाट",
        country = Country.INDIA,
        category = FoodCategory.STREET_FOOD,
        mealTimes = listOf(MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 4,
        cookMinutes = 0,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        priorPrepNoteEn = "Requires sweet corn kernels that are already boiled or steamed.",
        priorPrepNoteHi = "नोट: मीठे भुट्टे के दाने (Sweet Corn) पहले से उबले होने चाहिए।",
        descriptionEn = "Warm buttered sweet corn tossed with lemon, chaat masala, onion, and tomato in minutes.",
        descriptionHi = "पहले से उबले स्वीट कॉर्न में मक्खन, नींबू और चाट मसाला मिलाकर बनी झटपट चाट।",
        cookingTipEn = "Mix butter while the pre-boiled corn is still warm so it melts right in.",
        cookingTipHi = "उबले कॉर्न हल्के गरम हों तभी मक्खन मिलाएं ताकि वह अच्छे से घुल जाए।",
        safetyTipEn = "Drain hot boiling water from pre-boiled corn carefully using a strainer.",
        safetyTipHi = "गरम कॉर्न का पानी छलनी से सावधानी से छान लें।",
        imageRes = R.drawable.img_step_salad_mix,
        ingredients = listOf(
            Ingredient("Pre-boiled Sweet Corn", "पहले से उबला स्वीट कॉर्न", 1.5, "cups", "कप", true, themealdbIngredientUrl("Sweetcorn"), R.drawable.img_step_spices),
            Ingredient("Butter", "मक्खन", 1.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Butter"), R.drawable.img_dish_bread),
            Ingredient("Onion (finely chopped)", "बारीक कटा प्याज", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_chop),
            Ingredient("Tomato (finely chopped)", "बारीक कटा टमाटर", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Chaat Masala", "चाट मसाला", 0.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Lemon", "नींबू", 0.5, "piece", "नग", true, themealdbIngredientUrl("Lemon"), R.drawable.img_step_lemon)
        ),
        steps = listOf(
            CookingStep(
                1, "Drain pre-boiled warm corn", "उबले कॉर्न का पानी छान लें",
                "Drain all water from warm pre-boiled sweet corn in a colander and transfer kernels to a bowl.",
                "पहले से उबले गरम स्वीट कॉर्न को छलनी में डालकर सारा पानी छान लें और बाउल में निकालें।",
                "Warm kernels melt butter effortlessly.", "हल्के गरम कॉर्न में मक्खन तुरंत घुल जाता है।",
                1, PrepStage.WASH, R.drawable.img_step_drain,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min draining", timingDetailHi = "1 मिनट पानी छानें"
            ),
            CookingStep(
                2, "Finely chop onion, tomato & coriander", "प्याज, टमाटर और धनिया बारीक काटें",
                "Wash tomato & coriander; finely dice onion, tomato, and coriander leaves.",
                "टमाटर व धनिया धोकर प्याज के साथ बिल्कुल बारीक काट लें।",
                "Tiny diced pieces look neat alongside corn.", "कॉर्न के आकार के छोटे टुकड़े दिखने में अच्छे लगते हैं।",
                1, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min chopping", timingDetailHi = "1 मिनट में बारीक काटें"
            ),
            CookingStep(
                3, "Toss warm corn with butter, veggies & spices", "मक्खन, सब्ज़ी, चाट मसाला व नींबू मिलाएं",
                "Stir butter into warm corn until glossy, then mix in chopped veggies, chaat masala, chilli powder & lemon juice.",
                "गरम कॉर्न में मक्खन मिलाकर चमकाएं, फिर प्याज-टमाटर, चाट मसाला, लाल मिर्च व नींबू निचोड़कर मिलाएं।",
                "Taste and adjust salt or lemon.", "चखकर नींबू या नमक अपने स्वाद अनुसार ठीक करें।",
                1, PrepStage.MIX, R.drawable.img_step_lemon,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min tossing", timingDetailHi = "1 मिनट में सब मिलाएं"
            ),
            CookingStep(
                4, "Serve warm in snack cups", "कप में डालकर गरमागरम परोसें",
                "Spoon into serving cups, sprinkle fresh coriander, and enjoy right away!",
                "सर्विंग कप या कटोरी में निकालें, धनिया सजाएं और गरमागरम खाएं!",
                "Movie-theater style snack in 4 min!", "मॉल जैसा स्वादिष्ट कॉर्न चाट 4 मिनट में तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_salad_mix,
                heatLevelEn = "Serve Warm", heatLevelHi = "गुनगुना परोसें",
                timingDetailEn = "Serve warm -> Ready!", timingDetailHi = "तुरंत गरम परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "simple_veg_sandwich",
        nameEn = "Simple Vegetable Sandwich",
        nameHi = "सादा वेज सैंडविच",
        country = Country.INDIA,
        category = FoodCategory.BREAKFAST_SNACKS,
        mealTimes = listOf(MealTime.BREAKFAST, MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 5,
        cookMinutes = 0,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        isPopular = true,
        descriptionEn = "Fresh no-cook cold vegetable sandwich layered with crisp cucumber, tomato, butter, and green chutney.",
        descriptionHi = "खीरा, टमाटर, मक्खन और हरी चटनी से बिना गैस जलाए 5 मिनट में बनने वाला वेज सैंडविच।",
        cookingTipEn = "Butter the bread lightly first—it acts as a barrier so chutney doesn't make bread soggy.",
        cookingTipHi = "पहले ब्रेड पर हल्का मक्खन लगाएं, इससे चटनी से ब्रेड गीली नहीं होती।",
        safetyTipEn = "Slice tomatoes thin with a steady sawing motion so slices stay neat.",
        safetyTipHi = "टमाटर के पतले स्लाइस काटते समय चाकू को धीरे आगे-पीछे चलाएं।",
        imageRes = R.drawable.img_dish_bread,
        ingredients = listOf(
            Ingredient("Bread Slices", "ब्रेड स्लाइस", 4.0, "slices", "स्लाइस", true, themealdbIngredientUrl("Bread"), R.drawable.img_dish_bread),
            Ingredient("Cucumber (thin slices)", "खीरे के पतले स्लाइस", 0.5, "piece", "नग", true, themealdbIngredientUrl("Cucumber"), R.drawable.img_step_wash),
            Ingredient("Tomato (thin slices)", "टमाटर के पतले स्लाइस", 1.0, "small", "छोटा", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Butter", "मक्खन", 1.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Butter"), R.drawable.img_dish_bread),
            Ingredient("Green Chutney", "हरी चटनी", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_chutney_dip),
            Ingredient("Chaat Masala", "चाट मसाला", 0.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash & dry cucumber and tomato", "खीरा और टमाटर धोकर पोंछ लें",
                "Wash cucumber and tomato under clean running water and wipe completely dry with a cloth.",
                "खीरा व टमाटर साफ पानी से धोकर सूखे कपड़े से अच्छी तरह पोंछ लें।",
                "Dry veggies keep bread soft yet firm, never soggy.", "सब्ज़ियाँ सूखी रखने से ब्रेड गीली नहीं पड़ती।",
                1, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min washing", timingDetailHi = "1 मिनट धोकर पोंछें"
            ),
            CookingStep(
                2, "Slice veggies into thin flat rounds", "खीरे व टमाटर के पतले गोल स्लाइस काटें",
                "Trim cucumber ends and slice cucumber and firm tomato into thin flat rounds.",
                "खीरे के सिरे हटाकर खीरा और टमाटर दोनों को बिल्कुल पतले गोल स्लाइस में काट लें।",
                "Even thin slices prevent sandwich from sliding apart.", "पतले स्लाइस रखने से सैंडविच अच्छे से बंद होता है।",
                1, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min slicing", timingDetailHi = "1 मिनट पतले स्लाइस काटें"
            ),
            CookingStep(
                3, "Spread butter & green chutney", "ब्रेड पर मक्खन और हरी चटनी लगाएं",
                "Spread soft butter lightly on all 4 slices, then spread green mint chutney over 2 slices.",
                "चारों ब्रेड पर हल्का मक्खन लगाएं और दो स्लाइस पर हरी चटनी बराबर फैलाएं।",
                "Butter forms a protective coat against moisture.", "मक्खन ब्रेड को चटनी से गीला होने से बचाता है।",
                1, PrepStage.MIX, R.drawable.img_step_chutney_dip,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min spreading", timingDetailHi = "1 मिनट मक्खन-चटनी लगाएं"
            ),
            CookingStep(
                4, "Layer veggies, sprinkle masala & close", "सब्ज़ी सजाकर मसाला डालें व बंद करें",
                "Arrange cucumber & tomato rounds neatly, sprinkle chaat masala, cover with remaining buttered slices, and press gently.",
                "चटनी वाली ब्रेड पर खीरा-टमाटर सजाएं, चाट मसाला छिड़कें, दूसरी ब्रेड रखकर हथेली से हल्का दबाएं।",
                "Gentle palm press helps layers stay together.", "हल्का दबाने से ब्रेड व सब्ज़ियाँ आपस में चिपक जाती हैं।",
                1, PrepStage.MIX, R.drawable.img_step_fold_stuff,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min layering", timingDetailHi = "1 मिनट लेयरिंग करें"
            ),
            CookingStep(
                5, "Cut diagonally & serve fresh", "तिकोना काटकर तुरंत परोसें",
                "Slice diagonally into triangles using a serrated or sharp knife and serve with tomato ketchup!",
                "तेज़ चाकू से तिकोना काटें और टोमैटो केचप या चटनी के साथ तुरंत परोसें!",
                "Perfect quick tiffin & morning snack!", "टिफिन और सुबह के नाश्ते के लिए बढ़िया सैंडविच तैयार!",
                1, PrepStage.SERVE, R.drawable.img_dish_bread,
                heatLevelEn = "Serve Fresh", heatLevelHi = "ताज़ा परोसें",
                timingDetailEn = "Slice & serve -> Ready!", timingDetailHi = "काटकर परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "banana_smoothie",
        nameEn = "Banana Smoothie",
        nameHi = "केला स्मूदी",
        country = Country.INDIA,
        category = FoodCategory.BREAKFAST_SNACKS,
        mealTimes = listOf(MealTime.BREAKFAST, MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 4,
        cookMinutes = 0,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        descriptionEn = "Thick, velvety yogurt and banana breakfast smoothie sweetened naturally with honey.",
        descriptionHi = "दही, पके केले और शहद से झटपट बनने वाली गाढ़ी और सेहतमंद स्मूदी।",
        cookingTipEn = "Curd/yogurt makes a smoothie thicker and tangier than a regular milkshake.",
        cookingTipHi = "मिल्कशेक की जगह दही इस्तेमाल करने से स्मूदी ज़्यादा गाढ़ी और पाचक बनती है।",
        safetyTipEn = "Unplug the mixer after blending before pouring out the smoothie.",
        safetyTipHi = "ब्लेंड करने के बाद मिक्सी का स्विच बंद करके ही जार उतारें।",
        imageRes = R.drawable.img_step_raita,
        ingredients = listOf(
            Ingredient("Ripe Banana", "पका केला", 2.0, "pieces", "नग", true, themealdbIngredientUrl("Banana"), R.drawable.img_step_chop),
            Ingredient("Thick Fresh Curd", "गाढ़ा ताज़ा दही", 1.0, "cup", "कप", true, themealdbIngredientUrl("Yogurt"), R.drawable.img_step_raita),
            Ingredient("Milk or Cold Water", "दूध या ठंडा पानी", 0.5, "cup", "कप", true, themealdbIngredientUrl("Milk"), R.drawable.img_step_raita),
            Ingredient("Honey", "शहद", 1.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Honey"), R.drawable.img_step_spices),
            Ingredient("Cinnamon Pinch", "दालचीनी पाउडर", 0.25, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Cinnamon"), R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Peel and chop ripe bananas", "केले छीलकर टुकड़ों में काटें",
                "Peel ripe sweet bananas and slice them into chunks into the blender jar.",
                "मीठे पके केलों को छीलकर छोटे टुकड़ों में काटकर मिक्सी जार में डालें।",
                "Ripe bananas make the smoothie creamy without sugar.", "पके केलों से बिना चीनी के ही बढ़िया मिठास आती है।",
                1, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min peeling & chopping", timingDetailHi = "1 मिनट में केले काटें"
            ),
            CookingStep(
                2, "Add curd, honey, cinnamon & milk", "दही, शहद, दालचीनी व दूध डालें",
                "Add thick fresh curd, honey, a pinch of cinnamon powder, and chilled milk into the jar.",
                "जार में गाढ़ा ताज़ा दही, शहद, चुटकी दालचीनी और आधा कप ठंडा दूध डालें।",
                "Use less milk if you want a spoonable smoothie bowl.", "गाढ़ा बाउल बनाना हो तो दूध थोड़ा कम डालें।",
                1, PrepStage.MIX, R.drawable.img_step_raita,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min adding ingredients", timingDetailHi = "1 मिनट सभी सामग्री डालें"
            ),
            CookingStep(
                3, "Blend 30–40 sec until velvety smooth", "30-40 सेकंड बिल्कुल चिकना ब्लेंड करें",
                "Lock lid tightly and blend on high speed for 30–40 seconds until completely velvety with zero lumps.",
                "ढक्कन कसकर बंद करें और तेज़ गति पर 30-40 सेकंड तक बिल्कुल मुलायम होने तक ब्लेंड करें।",
                "Check bottom to ensure no banana piece remains.", "एक बार देखकर पक्का करें कि कोई गुठली न बची हो।",
                1, PrepStage.MIX, R.drawable.img_step_blend,
                heatLevelEn = "Mixer (30–40 sec)", heatLevelHi = "मिक्सी (30-40 सेकंड)",
                timingDetailEn = "Blend 30–40 sec smooth", timingDetailHi = "30-40 सेकंड स्मूद ब्लेंड करें"
            ),
            CookingStep(
                4, "Pour & garnish chilled", "गिलास में निकालकर ठंडा परोसें",
                "Turn off mixer, pour smoothie into glasses, top with sliced banana or chia seeds, and serve chilled!",
                "मिक्सी बंद कर गिलासों में निकालें, ऊपर केले के स्लाइस सजाएं और ठंडा परोसें!",
                "Wholesome 4-minute breakfast drink ready!", "4 मिनट में सेहतमंद स्मूदी तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Serve Chilled", heatLevelHi = "ठंडा परोसें",
                timingDetailEn = "Serve cold -> Ready!", timingDetailHi = "तुरंत ठंडा परोसें — तैयार!"
            )
        )
    )
)
