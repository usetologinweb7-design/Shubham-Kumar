package com.example.data.catalog

import com.example.R
import com.example.data.model.*

val internationalRecipesEast: List<Recipe> = listOf(
    // JAPAN
    Recipe(
        id = "veg_sushi",
        nameEn = "Japanese Veg Sushi Roll",
        nameHi = "जापानी वेज सुशी रोल",
        country = Country.JAPAN,
        category = FoodCategory.INTERNATIONAL,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 25,
        cookMinutes = 16,
        defaultServings = 2,
        isPopular = true,
        isTrending = true,
        descriptionEn = "Seasoned sushi rice rolled cleanly in toasted nori seaweed with crisp cucumber, carrot, and creamy avocado.",
        descriptionHi = "सुशी चावल, नोरी शीट, ताज़ा खीरा, गाजर और एवोकाडो से बने स्वादिष्ट और फ्रेश जापानी वेज सुशी रोल्स।",
        cookingTipEn = "Keep a small bowl of water beside you to wet your fingertips—it prevents sticky sushi rice from clinging!",
        cookingTipHi = "हाथों पर हल्का पानी लगाकर चावल फैलाने से चिपचिपे सुशी राइस उंगलियों में नहीं चिपकते।",
        safetyTipEn = "Wipe and lightly wet your sharp knife blade between every slice for clean, neat sushi rounds.",
        safetyTipHi = "हर रोल काटने से पहले चाकू की धार को हल्का गीला कर लें ताकि सुशी साफ और बिना टूटे कटे।",
        imageRes = R.drawable.img_dish_sushi,
        ingredients = listOf(
            Ingredient("Short-grain Sushi Rice", "सुशी चावल (छोटे दाने)", 1.0, "cup", "कप", true, themealdbIngredientUrl("Rice"), R.drawable.img_dish_biryani),
            Ingredient("Toasted Nori Seaweed Sheets", "नोरी शीट", 4.0, "sheets", "शीट", true, null, R.drawable.img_dish_sushi),
            Ingredient("Cucumber, Carrot & Avocado Strips", "खीरा, गाजर व एवोकाडो स्ट्रिप्स", 1.25, "cups", "कप", true, themealdbIngredientUrl("Cucumber"), R.drawable.img_step_chop),
            Ingredient("Rice Vinegar, Sugar & Salt", "राइस विनेगर, चीनी व नमक", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Soy Sauce & Pickled Ginger", "सोया सॉस व अदरक", 2.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Soy Sauce"), R.drawable.img_step_chutney_dip)
        ),
        steps = listOf(
            CookingStep(
                1, "Rinse sushi rice until clear & soak 15 min", "सुशी चावल को साफ पानी आने तक धोकर 15 मिनट भिगोएं",
                "Swirl short-grain sushi rice gently in cold water and drain 3–4 times until water turns clear, then soak in 1.25 cups fresh water for 15 minutes.",
                "सुशी चावल को ठंडे पानी में 3-4 बार साफ पानी आने तक धोएं और फिर सवा कप ताज़ा पानी में 15 मिनट भिगोकर रखें।",
                "Removing surface starch keeps rice glossy and tender, not gluey.", "ऊपरी स्टार्च धोने से चावल चिपचिपा पेस्ट नहीं बनता।",
                15, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Wash & Soak)", heatLevelHi = "बिना गैस (धोना व भिगोना)",
                timingDetailEn = "Wash 4x + Soak 15 min", timingDetailHi = "3-4 बार धोकर 15 मिनट भिगोएं"
            ),
            CookingStep(
                2, "Boil & steam sushi rice covered (12 min)", "चावल उबालकर धीमी आंच पर 12 मिनट पकाएं",
                "Bring rice and soaking water to a boil on high flame (2 min), lower to MINIMUM heat, cover tightly, and simmer 12 minutes without lifting the lid until water absorbs.",
                "चावल को तेज़ आंच पर उबाल लाएं (2 मिनट), फिर आंच बिल्कुल धीमी कर ढक्कन बंद करें और 12 मिनट बिना ढक्कन खोले पानी सूखने तक पकाएं।",
                "Do not peek—steam trapped inside finishes cooking the top grains.", "12 मिनट तक ढक्कन बिल्कुल न खोलें वरना भाप निकल जाएगी।",
                14, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "High (2m) -> Lowest (12m)", heatLevelHi = "तेज़ (2m) -> बिल्कुल धीमी (12m)",
                timingDetailEn = "Boil 2 min + Simmer 12 min covered", timingDetailHi = "2m उबाल + 12m ढककर धीमी आंच पर पकाएं"
            ),
            CookingStep(
                3, "Rest rice 10 minutes off heat", "गैस बंद कर चावल को 10 मिनट ढका छोड़ दें",
                "Switch off the stove and leave the pot covered undisturbed for 10 minutes so grains firm up and moisture balances evenly.",
                "गैस बंद कर बर्तन को 10 मिनट ऐसे ही ढका रहने दें ताकि चावल अंदर तक मुलायम और चमकदार सैट हो जाएं।",
                "Warm rested rice absorbs vinegar seasoning smoothly.", "10 मिनट आराम देने से चावल विनेगर अच्छे से सोखता है।",
                10, PrepStage.COOK_SIMMER, R.drawable.img_dish_biryani,
                heatLevelEn = "Flame Off (Rest 10m)", heatLevelHi = "गैस बंद (10m रेस्ट)",
                timingDetailEn = "Rest covered 10 min", timingDetailHi = "10 मिनट ढककर रखें"
            ),
            CookingStep(
                4, "Season warm rice with rice vinegar & cool", "चावल में राइस विनेगर-चीनी मिलाकर ठंडा करें",
                "Mix 2 tbsp rice vinegar, 1 tbsp sugar, and 1/2 tsp salt until dissolved; spread warm rice onto a wide wooden/ceramic tray, fold seasoning gently, and cool 5 minutes to room temp.",
                "2 चम्मच राइस विनेगर, 1 चम्मच चीनी व आधा चम्मच नमक घोलें; चावल को चौड़ी थाली में फैलाकर हल्के से मिलाएं और 5 मिनट सामान्य तापमान तक ठंडा होने दें।",
                "Hot rice wilts nori seaweed—cool until barely lukewarm first!", "गरम चावल से नोरी शीट नरम पड़ सकती है, इसलिए पहले ठंडा कर लें।",
                5, PrepStage.MIX, R.drawable.img_step_salad_mix,
                heatLevelEn = "No Flame (Season & Cool)", heatLevelHi = "बिना गैस (सीज़निंग व ठंडा)",
                timingDetailEn = "Season & cool 5 min", timingDetailHi = "विनेगर मिलाकर 5 मिनट ठंडा करें"
            ),
            CookingStep(
                5, "Slice cucumber, carrot & avocado into strips", "खीरा, गाजर और एवोकाडो की पतली लंबी पट्टियाँ काटें",
                "Wash and peel carrot & cucumber; slice cucumber (seeds removed), carrot, and avocado into long thin matchstick strips.",
                "खीरा (बीज हटाकर), गाजर और एवोकाडो को लंबी, पतली और एक-समान पट्टियों में काटकर तैयार करें।",
                "Removing watery cucumber seeds prevents soggy sushi rolls.", "खीरे के गीले बीज हटाने से सुशी रोल ढीला नहीं होता।",
                5, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "5 min slicing", timingDetailHi = "5 मिनट में पट्टियाँ काट लें"
            ),
            CookingStep(
                6, "Spread seasoned rice evenly on nori sheet", "नोरी शीट पर गीली उंगलियों से चावल फैलाएं",
                "Lay 1 nori sheet shiny-side down on a bamboo mat (or parchment paper); dip fingers in water and gently press a thin, even rice layer leaving 1 inch bare along top edge.",
                "मैट पर नोरी शीट रखें (चमकदार हिस्सा नीचे); उंगलियों को पानी से गीला कर चावल की पतली परत फैलाएं और ऊपर 1 इंच किनारा खाली छोड़ें।",
                "Don't mash rice flat—press lightly so grains stay airy.", "चावल को जोर से न दबाएं, हल्के हाथ से एकसार फैलाएं।",
                4, PrepStage.MIX, R.drawable.img_dish_sushi,
                heatLevelEn = "No Flame (Spread)", heatLevelHi = "बिना गैस (असेंबली)",
                timingDetailEn = "4 min spreading", timingDetailHi = "4 मिनट में चावल फैलाएं"
            ),
            CookingStep(
                7, "Arrange fillings, roll tightly & seal seam", "सब्ज़ियाँ रखकर टाइट रोल मोड़ें और किनारा चिपकाएं",
                "Arrange cucumber, carrot, and avocado strips horizontally near bottom; lift mat to roll forward firmly squeezing gently; dab bare top edge with water and seal shut.",
                "निचले हिस्से में खीरा, गाजर व एवोकाडो रखें, फिर दबाते हुए टाइट गोल रोल मोड़ें और ऊपरी खाली किनारे पर पानी लगाकर कसकर बंद करें।",
                "Rest rolled cylinder seam-side down 1 minute so seal sets cleanly.", "रोल को जोड़ नीचे रखकर 1 मिनट छोड़ दें ताकि वह खुले नहीं।",
                4, PrepStage.MIX, R.drawable.img_step_fold_stuff,
                heatLevelEn = "No Flame (Roll & Seal)", heatLevelHi = "बिना गैस (रोल मोड़ना)",
                timingDetailEn = "Roll & rest seam 1 min", timingDetailHi = "टाइट रोल मोड़ें व 1m रखें"
            ),
            CookingStep(
                8, "Slice with wet blade & serve with soy sauce", "गीले चाकू से गोल टुकड़े काटें और सोया सॉस संग परोसें",
                "Dip a sharp knife blade in water, wipe lightly, and saw gently into 6–8 neat rounds per roll; plate and serve fresh with soy sauce and sesame seeds!",
                "तेज़ चाकू को पानी से हल्का गीला कर हर रोल के 6-8 बराबर गोल टुकड़े काटें; ऊपर तिल छिड़कें और सोया सॉस संग ताज़ा परोसें!",
                "Wipe & re-wet knife blade after every 2 cuts for crisp edges!", "हर 2 टुकड़े काटने के बाद चाकू पोंछकर गीला करें—टुकड़े बिल्कुल साफ कटेंगे!",
                3, PrepStage.SERVE, R.drawable.img_dish_sushi,
                heatLevelEn = "Serve Fresh", heatLevelHi = "ताज़ा परोसें",
                timingDetailEn = "Slice & serve -> Ready!", timingDetailHi = "काटकर तुरंत परोसें — जापानी सुशी तैयार!"
            )
        )
    ),
    Recipe(
        id = "japanese_ramen",
        nameEn = "Japanese Ramen Bowl",
        nameHi = "जापानी रामेन बाउल",
        country = Country.JAPAN,
        category = FoodCategory.INTERNATIONAL,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = false,
        difficulty = Difficulty.EASY,
        prepMinutes = 12,
        cookMinutes = 18,
        defaultServings = 2,
        isPopular = true,
        isTrending = true,
        descriptionEn = "Steaming aromatic soy-ginger-garlic broth packed with springy ramen noodles, jammy soft-boiled egg, corn, and sesame.",
        descriptionHi = "गरमागरम अदरक-लहसुन-सोया शोरबा, रामेन नूडल्स, सॉफ्ट-बॉइल्ड अंडा और हरी प्याज वाला जापानी रामेन बाउल।",
        cookingTipEn = "Boil eggs for exactly 6.5 minutes and plunge straight into ice water for a golden, jammy yolk!",
        cookingTipHi = "अंडे को ठीक 6.5 मिनट उबालकर तुरंत बर्फ वाले पानी में डालने से अंदर की जर्दी मुलायम और चमकदार बनती है।",
        safetyTipEn = "Use a deep ladle to pour piping-hot broth cleanly into ramen bowls without splashing.",
        safetyTipHi = "गरम सूप को बाउल में हमेशा गहरी करछी से सावधानीपूर्वक डालें।",
        imageRes = R.drawable.img_dish_ramen,
        ingredients = listOf(
            Ingredient("Ramen Noodles", "रामेन नूडल्स", 2.0, "packs", "पैकेट", true, null, R.drawable.img_dish_ramen),
            Ingredient("Large Eggs", "अंडे", 2.0, "pieces", "नग", true, themealdbIngredientUrl("Eggs"), R.drawable.img_dish_ramen),
            Ingredient("Vegetable or Chicken Stock", "वेज या चिकन स्टॉक", 3.5, "cups", "कप", true, null, R.drawable.img_step_boil_pot),
            Ingredient("Garlic, Ginger & Sesame Oil", "लहसुन, अदरक व तिल/कुकिंग तेल", 1.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_spices),
            Ingredient("Soy Sauce, Sweet Corn & Chilli Oil", "सोया सॉस, स्वीट कॉर्न व चिली ऑयल", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Soy Sauce"), R.drawable.img_step_spices),
            Ingredient("Spring Onion & Toasted Sesame", "हरी प्याज व भुने तिल", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_garnish_serve)
        ),
        steps = listOf(
            CookingStep(
                1, "Boil eggs 6.5 minutes for jammy yolk", "अंडे को ठीक 6.5 मिनट सॉफ्ट उबालें",
                "Bring water to a gentle boil, lower room-temp eggs in carefully with a spoon, and boil 6.5 minutes for soft jammy center (or 9 min for firm yolk).",
                "उबलते पानी में चम्मच से सावधानी से अंडे डालें और ठीक 6.5 मिनट उबालें (पूरी तरह सख्त चाहिए तो 9 मिनट उबालें)।",
                "Using room-temp eggs stops shells from cracking in hot water.", "फ्रिज के ठंडे अंडे सीधे न डालें, सामान्य तापमान के अंडे नहीं चटकते।",
                7, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "Medium-High Boil", heatLevelHi = "मध्यम-तेज़ आंच",
                timingDetailEn = "Boil strictly 6.5 min (9 min hard)", timingDetailHi = "ठीक 6.5 मिनट (सख्त के लिए 9m) उबालें"
            ),
            CookingStep(
                2, "Ice-bath shock & peel eggs cleanly", "अंडों को 3 मिनट ठंडे पानी में रखकर छीलें",
                "Transfer hot eggs immediately into a bowl of ice-cold water for 3 minutes, then tap lightly all over and peel cleanly; slice in half right before plating.",
                "उबले अंडे तुरंत बर्फ/ठंडे पानी में 3 मिनट डालें, फिर चारों ओर हल्का थपथपाकर आसानी से छील लें।",
                "Peeling underwater helps membrane slip right off smooth.", "ठंडे पानी के नीचे छीलने से अंडे का सफेद भाग टूटता नहीं।",
                3, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Chill & Peel)", heatLevelHi = "बिना गैस (ठंडा व छीलना)",
                timingDetailEn = "Chill 3 min & peel", timingDetailHi = "3 मिनट ठंडे पानी में रखकर छीलें"
            ),
            CookingStep(
                3, "Chop garlic, ginger, scallions & prep toppings", "लहसुन, अदरक व हरी प्याज काटकर टॉपिंग्स तैयार करें",
                "Wash and thinly slice green spring onions (separate white bulbs from green tops), mince garlic and grate fresh ginger, and keep boiled sweet corn ready.",
                "हरी प्याज धोकर सफेद और हरा हिस्सा अलग-अलग काटें; लहसुन-अदरक बारीक काट लें और उबले स्वीट कॉर्न तैयार रखें।",
                "White scallion bulbs go into broth; crisp green tops garnish the bowl!", "हरी प्याज का सफेद भाग सूप में भुनेंगे और हरा भाग ऊपर सजाएंगे।",
                4, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "4 min chopping", timingDetailHi = "4 मिनट में टॉपिंग्स तैयार करें"
            ),
            CookingStep(
                4, "Saute garlic, ginger & scallion whites (1 min)", "लहसुन, अदरक व प्याज के सफेद हिस्से को 1 मिनट भूनें",
                "Heat 1 tbsp oil in a pot on medium flame; saute minced garlic, grated ginger, and white scallions for 1 minute until aromatic without browning.",
                "बर्तन में 1 चम्मच तेल गरम कर बारीक लहसुन, अदरक व प्याज का सफेद हिस्सा 1 मिनट खुशबू आने तक भूनें (जलने न दें)।",
                "Fragrant sautéed aromatics give instant homemade depth vs packet soup.", "ताज़ा अदरक-लहसुन भूनने से सूप में असली जापानी स्वाद आता है।",
                1, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Saute 1 min", timingDetailHi = "1 मिनट खुशबू आने तक भूनें"
            ),
            CookingStep(
                5, "Simmer umami soy-broth for 6 minutes", "स्टॉक व सोया सॉस डालकर सूप 6 मिनट पकाएं",
                "Pour 3.5 cups broth/stock, 2 tbsp soy sauce, pinch of sugar, and black pepper; bring to a boil and simmer gently covered 6 minutes.",
                "साढ़े तीन कप वेज/चिकन स्टॉक, 2 चम्मच सोया सॉस, चुटकी चीनी व काली मिर्च डालकर उबालें और ढककर धीमी आंच पर 6 मिनट सिमर होने दें।",
                "Taste broth at 6 min—add a touch of soy or salt if needed.", "6 मिनट बाद सूप चखकर नमक या सोया सॉस की जांच कर लें।",
                6, PrepStage.COOK_SIMMER, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Medium -> Low Simmer", heatLevelHi = "मध्यम -> धीमा उबाल",
                timingDetailEn = "Simmer covered 6 min", timingDetailHi = "6 मिनट ढककर धीमी आंच पर पकाएं"
            ),
            CookingStep(
                6, "Boil ramen noodles separately & drain", "नूडल्स को अलग पानी में 3 मिनट उबालकर छानें",
                "In another pot of boiling water, boil ramen noodles for 3 minutes until springy al dente (4 min if thick wheat noodles), then drain immediately into serving bowls.",
                "दूसरे पैन में उबलते पानी में रामेन नूडल्स ठीक 3 मिनट उबालें (मोटे नूडल्स तो 4 मिनट) और तुरंत छलनी से छानकर गरम बाउल में रखें।",
                "Boiling separately keeps your ramen soup crystal-clear and light!", "अलग उबालने से नूडल्स का स्टार्च सूप को गाढ़ा नहीं करता।",
                4, PrepStage.COOK_SIMMER, R.drawable.img_step_drain,
                heatLevelEn = "High Boil", heatLevelHi = "तेज़ आंच",
                timingDetailEn = "Boil 3 min & drain fast", timingDetailHi = "3 मिनट उबालकर तुरंत छानें"
            ),
            CookingStep(
                7, "Ladle steaming broth, arrange toppings & serve", "गरम सूप, अंडा, कॉर्न व हरी प्याज सजाकर परोसें",
                "Ladle piping-hot aromatic broth over noodles; neatly top with halved jammy eggs, sweet corn, green scallions, toasted sesame seeds, and a drizzle of chilli oil!",
                "बाउल में नूडल्स पर गरमागरम सूप डालें; ऊपर से आधा कटा सॉफ्ट अंडा, स्वीट कॉर्न, हरी प्याज, भुने तिल व चिली ऑयल सजाकर तुरंत परोसें!",
                "Serve steaming hot right away so noodles stay springy!", "गरमागरम परोसें — रेस्टोरेंट जैसा जापानी रामेन बाउल तैयार!",
                2, PrepStage.SERVE, R.drawable.img_dish_ramen,
                heatLevelEn = "Serve Hot", heatLevelHi = "गरमागरम परोसें",
                timingDetailEn = "Assemble & serve hot -> Ready!", timingDetailHi = "सजाकर तुरंत परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "gyoza",
        nameEn = "Pan-Fried Gyoza",
        nameHi = "जापानी ग्योज़ा (पैन डंपलिंग्स)",
        country = Country.JAPAN,
        category = FoodCategory.INTERNATIONAL,
        mealTimes = listOf(MealTime.SNACKS, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 22,
        cookMinutes = 10,
        defaultServings = 3,
        descriptionEn = "Crispy golden-bottomed, steamed tender Japanese dumplings packed with garlicky cabbage, carrot, and ginger.",
        descriptionHi = "नीचे से कुरकुरे और ऊपर से भाप में पके नरम जापानी डंपलिंग्स, पत्तागोभी और अदरक की स्वादिष्ट भरावन संग।",
        cookingTipEn = "Salt shredded cabbage first and squeeze out water completely so dumpling wrappers never go soggy!",
        cookingTipHi = "कटी पत्तागोभी में नमक लगाकर 5 मिनट बाद पानी निचोड़ लेने से डंपलिंग फटते या गीले नहीं होते।",
        safetyTipEn = "Hold the pan lid as a splash shield when pouring water into the oiled hot skillet.",
        safetyTipHi = "गरम तेल वाले पैन में पानी डालते समय ढक्कन से तुरंत ढक दें ताकि छींटे न उड़ें।",
        imageRes = R.drawable.img_dish_sushi,
        ingredients = listOf(
            Ingredient("Round Gyoza Wrappers", "गोल डंपलिंग शीट्स", 16.0, "pieces", "नग", true, null, R.drawable.img_step_knead_roll),
            Ingredient("Finely Shredded Cabbage", "बारीक कटी पत्तागोभी", 1.5, "cups", "कप", true, themealdbIngredientUrl("Cabbage"), R.drawable.img_step_chop),
            Ingredient("Grated Carrot & Spring Onion", "कद्दूकस गाजर व हरी प्याज", 0.5, "cup", "कप", true, themealdbIngredientUrl("Carrots"), R.drawable.img_step_chop),
            Ingredient("Soy Sauce, Garlic & Grated Ginger", "सोया सॉस, लहसुन व अदरक", 1.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Soy Sauce"), R.drawable.img_step_spices),
            Ingredient("Sesame or Cooking Oil & Water", "तेल व भाप के लिए पानी", 1.5, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Shred veggies finely & salt for 5 minutes", "पत्तागोभी-गाजर बारीक काटें व नमक लगाकर 5 मिनट रखें",
                "Shred cabbage super finely, grate carrot, sprinkle 1/2 tsp salt in a bowl, mix, and let sit 5 minutes so moisture draws out.",
                "पत्तागोभी बिल्कुल बारीक काटें व गाजर घिस लें; आधा चम्मच नमक मिलाकर 5 मिनट रख दें ताकि सब्ज़ी पानी छोड़ दे।",
                "Salting draws out hidden water that would otherwise split wrappers.", "नमक लगाने से अतिरिक्त पानी निकल जाता है और शीट गीली नहीं पड़ती।",
                6, PrepStage.WASH, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep & Salt)", heatLevelHi = "बिना गैस (तैयारी)",
                timingDetailEn = "Rest salted veggies 5 min", timingDetailHi = "नमक लगाकर 5 मिनट रखें"
            ),
            CookingStep(
                2, "Squeeze excess water dry firmly", "सब्ज़ियों का सारा पानी कसकर निचोड़ लें",
                "Grab handfuls of salted cabbage-carrot mix (or wrap in a clean cloth) and squeeze firmly over sink until completely dry.",
                "नमक लगी सब्ज़ी को दोनों हाथों या साफ कपड़े में दबाकर सारा पानी पूरी तरह निचोड़ कर अलग कर लें।",
                "Dry crisp filling means crunchy bottom + light tender gyoza!", "पानी निचुड़ने पर ही भरावन स्वादिष्ट व बिखरी-बिखरी रहती है।",
                2, PrepStage.WASH, R.drawable.img_step_drain,
                heatLevelEn = "No Flame (Squeeze)", heatLevelHi = "बिना गैस (निचोड़ना)",
                timingDetailEn = "2 min firm squeezing", timingDetailHi = "2 मिनट में सारा पानी निचोड़ लें"
            ),
            CookingStep(
                3, "Mix ginger, garlic, scallions & soy sauce", "अदरक, लहसुन, हरी प्याज व सोया सॉस मिलाएं",
                "Toss dry squeezed veggies with finely chopped spring onions, fresh grated ginger, minced garlic, soy sauce, 1/2 tsp sesame oil, and black pepper.",
                "निचोड़ी सब्ज़ियों में बारीक हरी प्याज, कद्दूकस अदरक, लहसुन, सोया सॉस, तिल का तेल व काली मिर्च अच्छे से मिला लें।",
                "Smelling fresh ginger-soy filling means seasoning is balanced.", "ताज़े अदरक व सोया सॉस की महक भरावन को लाजवाब बनाती है।",
                2, PrepStage.MIX, R.drawable.img_step_salad_mix,
                heatLevelEn = "No Flame (Mix)", heatLevelHi = "बिना गैस (मिलाना)",
                timingDetailEn = "2 min mixing", timingDetailHi = "2 मिनट में भरावन तैयार"
            ),
            CookingStep(
                4, "Fill dumpling wrappers & pleat half-moons", "शीट में भरावन रखकर चुन्नट मोड़ते हुए सील करें",
                "Place 1 tsp filling in wrapper center, brush water along top half of rim, fold over, and pinch 4–5 small pleats along one side pressing tightly shut; tap flat bottom gently.",
                "गोल शीट के बीच 1 चम्मच भरावन रखें, किनारे पर हल्का पानी लगाकर आधा मोड़ें और 4-5 चुन्नट बनाते हुए कसकर चिपकाएं; नीचे से हल्का चपटा करें।",
                "Keep unused wrappers covered with a damp cloth so edges don't dry.", "बाकी शीट्स को सूखने से बचाने के लिए हल्के कपड़े से ढककर रखें।",
                10, PrepStage.CHOP, R.drawable.img_step_fold_stuff,
                heatLevelEn = "No Flame (Pleat & Seal)", heatLevelHi = "बिना गैस (चुन्नट मोड़ना)",
                timingDetailEn = "10 min folding all dumplings", timingDetailHi = "10 मिनट में सभी ग्योज़ा तैयार करें"
            ),
            CookingStep(
                5, "Arrange in oiled skillet & sear bottoms golden", "पैन में नीचे से 2–3 मिनट सुनहरा कुरकुरा सेकें",
                "Warm 1 tbsp oil in a flat non-stick pan on medium flame, arrange gyoza flat-bottoms down neatly with slight space, and sear 2–3 minutes undisturbed until bottoms turn crisp golden.",
                "चौड़े पैन में 1 चम्मच तेल गरम कर ग्योज़ा को चपटे हिस्से से नीचे की ओर बिछाएं और बिना हिलाए मध्यम आंच पर 2-3 मिनट नीचे से सुनहरा सेकें।",
                "Peek under 1 piece with tongs—only add water once bottom is golden!", "एक को उठाकर देखें—नीचे सुनहरा क्रस्ट बनने पर ही पानी डालें।",
                3, PrepStage.COOK_SIMMER, R.drawable.img_step_tawa_roast,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Sear 2–3 min undisturbed", timingDetailHi = "बिना हिलाए 2-3 मिनट नीचे से सुनहरा सेकें"
            ),
            CookingStep(
                6, "Pour water & steam covered 4 minutes", "पानी डालकर तुरंत ढक्कन बंद कर 4 मिनट भाप दें",
                "Pour 1/4 cup water around gyoza, clap a tight lid on immediately, reduce to medium-low heat, and steam 4 minutes until tops turn translucent and tender.",
                "पैन में चौथाई कप पानी डालकर तुरंत ढक्कन कसकर बंद कर दें; मध्यम-धीमी आंच पर 4 मिनट भाप में पकाएं जब तक ऊपर की परत नरम न हो जाए।",
                "Steam cooks the cabbage filling juicy and tender inside!", "भाप से अंदर की सब्ज़ी पूरी तरह नरम और रसीली पक जाती है।",
                4, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "Medium-Low (Covered)", heatLevelHi = "मध्यम-धीमी (ढककर)",
                timingDetailEn = "Steam covered 4 min (+1 min if doughy)", timingDetailHi = "4 मिनट ढककर भाप दें (कच्चा लगे तो 1m और)"
            ),
            CookingStep(
                7, "Uncover 1 minute to evaporate & re-crisp base", "ढक्कन हटाकर 1 मिनट पानी सुखाएं व फिर क्रिस्प करें",
                "Lift lid carefully and let sizzle uncovered for 1 minute until remaining droplets vanish and the bottoms crisp back up cleanly.",
                "ढक्कन हटाकर 1 मिनट खुला पकने दें ताकि बचा पानी पूरी तरह सूख जाए और नीचे की परत फिर से करारी हो जाए।",
                "Drizzle 1/2 tsp sesame oil at the edges during final 30 sec for extra crunch!", "अंत में किनारे थोड़ा तेल लगाने से नीचे का क्रस्ट और कुरकुरा बनता है।",
                1, PrepStage.COOK_SIMMER, R.drawable.img_dish_noodles,
                heatLevelEn = "Medium (Uncovered)", heatLevelHi = "मध्यम (बिना ढके)",
                timingDetailEn = "Dry uncovered 1 min", timingDetailHi = "1 मिनट पानी सूखने तक सेंकें"
            ),
            CookingStep(
                8, "Flip crisp-side up & serve with soy-chilli dip", "सोया-चिली डिप संग गरमागरम परोसें",
                "Slide spatula gently beneath gyoza, transfer crispy golden-side up onto a serving plate, scatter spring onions, and serve hot with soy-vinegar-chilli dipping sauce!",
                "कड़छी से आराम से निकालकर सुनहरी कुरकुरी परत ऊपर रखते हुए प्लेट में सजाएं और सोया-विनेगर-चिली डिप संग गरमागरम परोसें!",
                "Crispy lace bottom + juicy tender bite inside!", "बाहर से क्रिस्पी व अंदर से रसीले जापानी ग्योज़ा तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_chutney_dip,
                heatLevelEn = "Serve Hot", heatLevelHi = "गरमागरम परोसें",
                timingDetailEn = "Plate & serve -> Ready!", timingDetailHi = "सजाकर परोसें — गरमागरम तैयार!"
            )
        )
    )
)
