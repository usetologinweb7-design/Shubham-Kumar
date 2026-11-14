package com.example.data.catalog

import com.example.R
import com.example.data.model.*

val indianRecipesPart1B: List<Recipe> = listOf(
    Recipe(
        id = "aloo_gobi",
        nameEn = "Aloo Gobi",
        nameHi = "आलू गोभी",
        country = Country.INDIA,
        category = FoodCategory.PANEER_VEG,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 14,
        cookMinutes = 20,
        defaultServings = 3,
        descriptionEn = "Comforting homestyle dry curry of golden cauliflower florets and tender potatoes tossed with cumin, turmeric, and ginger.",
        descriptionHi = "हल्दी, जीरा, हींग और अदरक के स्वाद में लिपटी घर जैसी खिली-खिली सूखी आलू गोभी की सब्ज़ी।",
        cookingTipEn = "Do not add water! Cooking covered on low flame lets cauliflower and potatoes steam in their own moisture.",
        cookingTipHi = "सब्ज़ी में ऊपर से पानी न डालें; ढककर धीमी आंच पर भाप में पकाने से आलू-गोभी का स्वाद दोगुना आता है।",
        safetyTipEn = "Always inspect cauliflower florets closely and soak in warm salted water for 5 minutes before cooking.",
        safetyTipHi = "गोभी के फूलों को नमक मिले गुनगुने पानी में 5 मिनट भिगोकर साफ जरूर करें।",
        imageRes = R.drawable.img_dish_curry_bowl,
        ingredients = listOf(
            Ingredient("Cauliflower Florets", "फूलगोभी के टुकड़े", 300.0, "g", "ग्राम", true, themealdbIngredientUrl("Cauliflower"), R.drawable.img_step_wash),
            Ingredient("Potatoes (cubed)", "कटे आलू", 2.0, "medium", "मध्यम", true, themealdbIngredientUrl("Potatoes"), R.drawable.img_step_chop),
            Ingredient("Onion & Tomato", "प्याज व टमाटर", 2.0, "small", "छोटे", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Ginger & Green Chilli", "अदरक व हरी मिर्च", 1.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Turmeric, Coriander, Chilli & Garam Masala", "हल्दी, धनिया, मिर्च व गरम मसाला", 2.0, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Mustard or Cooking Oil", "सरसों या रिफाइंड तेल", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Soak cauliflower florets in warm salted water", "गोभी को गुनगुने नमक पानी में 5 मिनट रखें",
                "Break cauliflower into medium florets and soak in warm water with 1/2 tsp salt for 5 minutes, then drain thoroughly in a colander.",
                "गोभी के मध्यम टुकड़े तोड़कर आधा चम्मच नमक मिले गुनगुने पानी में 5 मिनट रखें, फिर छलनी में निकालकर पूरा पानी निथार लें।",
                "Dry drained florets roast crisp instead of turning soggy.", "पानी अच्छे से निथारने पर गोभी मसाले में बढ़िया भुनती है।",
                5, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Soak)", heatLevelHi = "बिना गैस (सफाई)",
                timingDetailEn = "Soak 5 min & drain dry", timingDetailHi = "5 मिनट भिगोकर पानी छान लें"
            ),
            CookingStep(
                2, "Peel potatoes & chop onion, tomato, ginger", "आलू, प्याज, टमाटर और अदरक काट लें",
                "Peel potatoes and cut slightly smaller than cauliflower; finely chop onion, tomato, ginger, and green chilli.",
                "आलू छीलकर गोभी से थोड़े छोटे टुकड़ों में काटें; प्याज, टमाटर, अदरक व हरी मिर्च बारीक काट लें।",
                "Smaller potato cubes soften at the exact same speed as florets.", "आलू थोड़े छोटे काटने से गोभी के साथ बराबर गल जाते हैं।",
                5, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "5 min chopping", timingDetailHi = "5 मिनट में सब काटकर रखें"
            ),
            CookingStep(
                3, "Heat oil & crackle cumin and hing", "तेल में जीरा और चुटकी भर हींग चटकाएं",
                "Warm 2 tbsp oil in a wide kadhai on medium heat; add 1 tsp cumin seeds and a pinch of hing and let crackle 20 seconds.",
                "चौड़ी कड़ाही में 2 चम्मच तेल गरम कर जीरा व चुटकी भर हींग डालें और 20 सेकंड चटकने दें।",
                "Hing aids digestion and gives classic homestyle aroma.", "हींग डालने से सब्ज़ी सुपाच्य व खुशबूदार बनती है।",
                1, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Crackle 20–30 sec", timingDetailHi = "20-30 सेकंड चटकाएं"
            ),
            CookingStep(
                4, "Saute onion-ginger & cook tomato masala", "प्याज-अदरक भूनें और टमाटर-मसाले पकाएं",
                "Fry chopped onion, ginger, and chilli 3 minutes until soft; stir in tomato, turmeric, coriander, and chilli powder and cook 3 minutes until mushy.",
                "प्याज, अदरक व हरी मिर्च 3 मिनट नरम होने तक भूनें, फिर टमाटर व हल्दी-धनिया-मिर्च डालकर 3 मिनट गलने तक पकाएं।",
                "Cook tomatoes soft before adding potatoes so potatoes don't harden.", "टमाटर पहले गलाने से आलू-गोभी जल्दी व नरम पकते हैं।",
                6, PrepStage.COOK_SIMMER, R.drawable.img_step_fry_onion,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Cook masala 6 min", timingDetailHi = "6 मिनट मसाला अच्छे से भूनें"
            ),
            CookingStep(
                5, "Coat potatoes first & sear 3 minutes", "पहले आलू डालकर मसाले में 3 मिनट भूनें",
                "Toss cubed potatoes and salt into the masala and saute uncovered for 3 minutes so potatoes get a golden head start.",
                "कटे आलू व नमक डालकर बिना ढके 3 मिनट मसाले में भूनें ताकि आलू पहले थोड़े पकना शुरू हो जाएं।",
                "Starting potatoes 3 minutes ahead prevents mushy overcooked cauliflower.", "आलू 3 मिनट पहले डालने से गोभी टूटती नहीं और आलू कच्चे नहीं रहते।",
                3, PrepStage.MIX, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Roast potatoes 3 min", timingDetailHi = "3 मिनट आलू भूनें"
            ),
            CookingStep(
                6, "Fold cauliflower & steam covered 10–12 min", "गोभी मिलाएं और ढककर धीमी आंच पर 10-12 मिनट पकाएं",
                "Add drained cauliflower florets, toss gently to coat in yellow masala, cover with a snug lid, and cook on LOW flame 10–12 minutes stirring twice from the bottom.",
                "गोभी के फूल डालकर हल्के हाथ से मिलाएं, ढक्कन बंद करें और बिल्कुल धीमी आंच पर 10-12 मिनट पकाएं (बीच में 2 बार चलाएं)।",
                "Test one thick potato cube with a fork—if firm, steam 3 minutes more.", "कांटे से आलू दबाकर देखें; कसर लगे तो 3 मिनट और ढककर पकाएं।",
                12, PrepStage.COOK_SIMMER, R.drawable.img_dish_curry_bowl,
                heatLevelEn = "Lowest Flame (Covered)", heatLevelHi = "बिल्कुल धीमी आंच (ढककर)",
                timingDetailEn = "Steam 10–12 min (+3 min if potato firm)", timingDetailHi = "10-12 मिनट भाप में पकाएं (कसर हो तो 3m और)"
            ),
            CookingStep(
                7, "Add garam masala, rest 2 min & serve", "गरम मसाला-धनिया डालकर 2 मिनट रखें व परोसें",
                "Sprinkle garam masala, amchur (optional), and chopped coriander; switch off flame, rest covered 2 minutes, and serve hot with phulka roti or dal-chawal!",
                "गरम मसाला, थोड़ा अमचूर व बारीक हरा धनिया छिड़कें, गैस बंद कर 2 मिनट ढककर रखें और गरमागरम रोटी या दाल-चावल संग परोसें!",
                "Dry homestyle perfection with intact florets!", "खिली-खिली घर जैसी आलू गोभी तैयार है!",
                2, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off (Rest)", heatLevelHi = "गैस बंद (रेस्ट)",
                timingDetailEn = "Rest 2 min -> Ready!", timingDetailHi = "2 मिनट ढका रखें — गरमागरम तैयार!"
            )
        )
    ),
    Recipe(
        id = "butter_chicken",
        nameEn = "Butter Chicken",
        nameHi = "बटर चिकन",
        country = Country.INDIA,
        category = FoodCategory.CHICKEN_SPECIAL,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = false,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 25,
        cookMinutes = 30,
        defaultServings = 3,
        isPopular = true,
        isTrending = true,
        descriptionEn = "Succulent pan-seared tandoori chicken pieces simmered in velvety tomato-cashew-butter makhani gravy.",
        descriptionHi = "मक्खन में सिके रसीले चिकन टिक्का और टमाटर-काजू की मखमली ग्रेवी वाला वर्ल्ड-फेमस बटर चिकन।",
        cookingTipEn = "Double marination (lemon-chilli first, then thick curd) keeps boneless chicken ultra-juicy.",
        cookingTipHi = "दो बार मैरिनेशन (पहले नींबू-मिर्च, फिर गाढ़ा दही) करने से चिकन बिल्कुल रूई जैसा मुलायम बनता है।",
        safetyTipEn = "Wash hands, knife, and cutting board thoroughly with soap right after handling raw chicken.",
        safetyTipHi = "कच्चा चिकन काटने के बाद हाथ, चाकू और चॉपिंग बोर्ड को साबुन से अच्छी तरह धोएं।",
        imageRes = R.drawable.img_dish_naan_curry,
        ingredients = listOf(
            Ingredient("Boneless Chicken Thighs (cubed)", "बोनलेस चिकन टुकड़े", 450.0, "g", "ग्राम", true, themealdbIngredientUrl("Chicken"), R.drawable.img_dish_naan_curry),
            Ingredient("Thick Curd & Lemon Juice", "गाढ़ा दही व नींबू रस", 4.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Yogurt"), R.drawable.img_step_marinate),
            Ingredient("Ripe Red Tomatoes", "पके लाल टमाटर", 5.0, "medium", "मध्यम", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Onion & Soaked Cashews", "प्याज व भिगोए काजू", 12.0, "cashews + 1 onion", "काजू + 1 प्याज", true, themealdbIngredientUrl("Cashews"), R.drawable.img_step_blend),
            Ingredient("Butter & Oil", "मक्खन व तेल", 3.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Butter"), R.drawable.img_dish_bread),
            Ingredient("Ginger-Garlic Paste & Spices", "अदरक-लहसुन पेस्ट व मसाले", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Fresh Cream & Kasuri Methi", "फ्रेश क्रीम व कसूरी मेथी", 3.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_raita)
        ),
        steps = listOf(
            CookingStep(
                1, "Clean chicken & soak cashews", "चिकन साफ कर काटें व काजू भिगोएं",
                "Rinse boneless chicken pieces cleanly, pat dry on paper towel, and cut into 1.5-inch cubes. Put 12 cashews in warm water to soak.",
                "बोनलेस चिकन को साफ धोकर पानी सुखा लें व 1.5 इंच के टुकड़ों में काटें। साथ ही 12 काजू गुनगुने पानी में भिगो दें।",
                "Dry chicken absorbs marinade instead of watering it down.", "चिकन का पानी पोंछने से मैरिनेशन अच्छे से चिपकता है।",
                5, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (सफाई)",
                timingDetailEn = "5 min prep", timingDetailHi = "5 मिनट में चिकन व काजू तैयार करें"
            ),
            CookingStep(
                2, "First marination with lemon, chilli & salt", "नींबू, कश्मीरी मिर्च व नमक से पहला मैरिनेशन",
                "Rub chicken cubes with 1 tbsp lemon juice, 1 tsp Kashmiri chilli, and 1/2 tsp salt; set aside for 10 minutes.",
                "चिकन में नींबू का रस, कश्मीरी लाल मिर्च व नमक मिलाकर 10 मिनट के लिए रख दें।",
                "Lemon juice tenderizes meat fibers before yogurt goes on.", "नींबू व नमक चिकन को अंदर तक नरम कर देता है।",
                10, PrepStage.MIX, R.drawable.img_step_lemon,
                heatLevelEn = "No Flame (1st Marinate)", heatLevelHi = "बिना गैस (पहला मैरिनेट)",
                timingDetailEn = "Rest 10 min", timingDetailHi = "10 मिनट ढककर रखें"
            ),
            CookingStep(
                3, "Second marination with curd & spices", "दही, अदरक-लहसुन व मसालों से दूसरा मैरिनेशन",
                "Coat chicken with thick curd, 1 tbsp ginger-garlic paste, garam masala, and 1 tsp oil; marinate covered 15 minutes (or longer in fridge).",
                "अब गाढ़ा दही, अदरक-लहसुन पेस्ट, गरम मसाला व 1 चम्मच तेल मिलाएं और ढककर कम से कम 15 मिनट मैरिनेट होने दें।",
                "Thick curd clings to chicken without dripping in the pan.", "गाढ़ा दही पैन में चिकन पर सुनहरी परत बनाता है।",
                15, PrepStage.MIX, R.drawable.img_step_marinate,
                heatLevelEn = "No Flame (2nd Marinate)", heatLevelHi = "बिना गैस (दूसरा मैरिनेट)",
                timingDetailEn = "Marinate 15+ min", timingDetailHi = "15 मिनट (या अधिक) मैरिनेट होने रखें"
            ),
            CookingStep(
                4, "Pan-sear marinated chicken golden charred", "पैन में चिकन को सुनहरा चार-रोस्ट करें",
                "Heat 1 tbsp butter + 1 tsp oil in a wide pan on medium-high flame; lay chicken pieces in a single layer and sear 3–4 minutes per side until lightly charred, then set aside.",
                "चौड़े पैन में मक्खन व तेल गरम कर चिकन के टुकड़ों को अलग-अलग बिछाएं और दोनों तरफ 3-4 मिनट हल्का भुना निशान आने तक सेंक कर प्लेट में निकाल लें।",
                "Do not crowd the pan—cook in 2 batches if needed so chicken sears, not boils.", "पैन में जगह छोड़ें ताकि चिकन पानी न छोड़े बल्कि सुनहरा सिके।",
                7, PrepStage.COOK_SIMMER, R.drawable.img_dish_naan_curry,
                heatLevelEn = "Medium-High Flame", heatLevelHi = "मध्यम-तेज़ आंच",
                timingDetailEn = "Sear 3–4 min each side", timingDetailHi = "दोनों ओर से 3-4 मिनट सुनहरा सेंकें"
            ),
            CookingStep(
                5, "Roughly chop tomatoes & onion for gravy", "ग्रेवी के लिए टमाटर व प्याज काटें",
                "Wash ripe red tomatoes and roughly chop them along with 1 medium onion, ginger, and 3 garlic cloves.",
                "पके लाल टमाटर, 1 प्याज, थोड़ा अदरक व लहसुन मोटा-मोटा काट लें।",
                "Deep red sweet tomatoes give the signature tangy-sweet makhani balance.", "अच्छे लाल मीठे टमाटर से बटर चिकन का स्वाद खिलता है।",
                3, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "3 min chopping", timingDetailHi = "3 मिनट में काटें"
            ),
            CookingStep(
                6, "Boil tomatoes, onion, cashews & whole spices", "टमाटर, प्याज व काजू को 8 मिनट उबालें",
                "In a deep pot, simmer onion, tomatoes, soaked cashews, cardamom, bay leaf, 1 tbsp butter, and 1/2 cup water covered for 8 minutes until tomatoes collapse.",
                "कड़ाही में 1 चम्मच मक्खन, प्याज, टमाटर, भीगे काजू, इलायची, तेजपत्ता व आधा कप पानी डालकर ढकें और 8 मिनट टमाटर गलने तक उबालें।",
                "Discard the bay leaf once boiled so puree blends smooth.", "उबलने के बाद तेजपत्ता बाहर निकाल दें।",
                8, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Boil covered 8 min", timingDetailHi = "8 मिनट ढककर नरम होने तक उबालें"
            ),
            CookingStep(
                7, "Cool 5 min, blend silky smooth & strain", "5 मिनट ठंडा कर पीसें और छलनी से छानें",
                "Let tomato mix cool 5 minutes until steam stops, blend into a fine puree, and press through a wire strainer to remove skins and seeds.",
                "मिश्रण को 5 मिनट ठंडा कर मिक्सी में बारीक पीस लें और छलनी से दबाकर छान लें ताकि बिल्कुल चिकनी ग्रेवी मिले।",
                "Straining turns homemade gravy as velvety as a 5-star kitchen.", "छानने से बीज व छिलके निकलकर रेस्टोरेंट जैसी मखमली ग्रेवी बनती है।",
                7, PrepStage.MIX, R.drawable.img_step_blend,
                heatLevelEn = "No Flame (Cool & Strain)", heatLevelHi = "बिना गैस (ठंडा कर छानें)",
                timingDetailEn = "Cool 5 min + blend & strain 2 min", timingDetailHi = "5 मिनट ठंडा करें + 2 मिनट पीसकर छानें"
            ),
            CookingStep(
                8, "Melt butter & bloom Kashmiri chilli", "मक्खन में कश्मीरी लाल मिर्च का तड़का दें",
                "Melt 1.5 tbsp butter on LOW heat, stir in 1 tsp Kashmiri chilli powder and 1 tbsp ginger-garlic paste for 30 seconds without burning.",
                "कड़ाही में धीमी आंच पर 1.5 चम्मच मक्खन पिघलाकर कश्मीरी लाल मिर्च और थोड़ा अदरक-लहसुन 30 सेकंड भूनें।",
                "Low heat releases vibrant orange-red butter color immediately.", "धीमी आंच से मिर्च जलती नहीं और ग्रेवी पर सुंदर रंग आता है।",
                1, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Lowest Flame", heatLevelHi = "बिल्कुल धीमी आंच",
                timingDetailEn = "30 sec gentle bloom", timingDetailHi = "30 सेकंड धीमी आंच पर भूनें"
            ),
            CookingStep(
                9, "Simmer makhani gravy until glossy", "छनी ग्रेवी को 5 मिनट धीमी आंच पर पकाएं",
                "Pour strained tomato-cashew puree, 1/2 cup warm water, salt, and 1 tsp honey/sugar; simmer partially covered 5 minutes until thick and bubbling.",
                "छनी प्यूरी, आधा कप गरम पानी, नमक व 1 चम्मच चीनी/शहद डालें; आधा ढककर धीमी आंच पर 5 मिनट गाढ़ा होने तक उबालें।",
                "A touch of sugar balances tomato acidity without making it sweet.", "थोड़ी चीनी टमाटर की खटास को संतुलित करती है।",
                5, PrepStage.COOK_SIMMER, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Simmer 5 min", timingDetailHi = "5 मिनट धीमी आंच पर पकाएं"
            ),
            CookingStep(
                10, "Simmer seared chicken in gravy (7–8 min)", "सिके चिकन को ग्रेवी में 7-8 मिनट पकाएं",
                "Fold seared chicken cubes and pan juices into gravy; cover and simmer 7–8 minutes until chicken is tender and cooked completely inside.",
                "ग्रेवी में सिके चिकन के टुकड़े मिलाएं, ढकें और धीमी आंच पर 7-8 मिनट चिकन के पूरी तरह पकने तक उबालें।",
                "Slice one thick cube—zero pink inside means safely cooked!", "एक बड़ा टुकड़ा काटकर जांचें; अंदर से सफेद व नरम हो तो पक गया है।",
                8, PrepStage.COOK_SIMMER, R.drawable.img_paneer_masala_1794638377530,
                heatLevelEn = "Low Flame (Covered)", heatLevelHi = "धीमी आंच (ढककर)",
                timingDetailEn = "Simmer 7–8 min (+2 min if thick cuts)", timingDetailHi = "7-8 मिनट पकाएं (मोटे टुकड़े हों तो 2m और)"
            ),
            CookingStep(
                11, "Swirl cream & kasuri methi, rest & serve", "क्रीम व कसूरी मेथी मिलाएं, 3 मिनट बाद परोसें",
                "Switch off flame, swirl in fresh cream and roasted crushed kasuri methi, rest covered 3 minutes, and serve hot with butter naan!",
                "गैस बंद कर फ्रेश क्रीम व भुनी कसूरी मेथी मिलाएं, 3 मिनट ढककर रखें और गरमागरम बटर नान संग परोसें!",
                "Drizzle extra cream swirl on top for plating flair.", "परोसते समय ऊपर थोड़ी ताज़ा क्रीम की धार सजाएं!",
                3, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off (Rest)", heatLevelHi = "गैस बंद (रेस्ट)",
                timingDetailEn = "Rest 3 min -> Ready!", timingDetailHi = "3 मिनट ढका रखें — लाजवाब बटर चिकन तैयार!"
            )
        )
    ),
    Recipe(
        id = "chicken_curry",
        nameEn = "Homestyle Chicken Curry",
        nameHi = "देसी चिकन करी",
        country = Country.INDIA,
        category = FoodCategory.CHICKEN_SPECIAL,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = false,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 15,
        cookMinutes = 35,
        defaultServings = 4,
        descriptionEn = "Classic Indian homestyle bone-in chicken slow-cooked in deeply browned onion-tomato masala.",
        descriptionHi = "सुनहरे भुने प्याज, टमाटर और गरम मसालों की खुशबूदार तरी वाली घर जैसी देसी चिकन करी।",
        cookingTipEn = "Patiently browning onions for 8 minutes is the real secret to rich dark tari and natural thickness.",
        cookingTipHi = "प्याज को धैर्य से 8 मिनट गहरा सुनहरा भूनना ही स्वादिष्ट और गाढ़ी तरी का असली राज़ है।",
        safetyTipEn = "Ensure chicken simmers thoroughly until meat near the bone pulls cleanly with zero pink juices.",
        safetyTipHi = "चिकन को पूरा पकने दें ताकि हड्डी के पास कोई कच्चापन या लाल रस न रहे।",
        imageRes = R.drawable.img_dish_curry_bowl,
        ingredients = listOf(
            Ingredient("Chicken (bone-in curry cut)", "चिकन करी कट", 500.0, "g", "ग्राम", true, themealdbIngredientUrl("Chicken"), R.drawable.img_dish_naan_curry),
            Ingredient("Onions (thinly sliced/chopped)", "बारीक प्याज", 3.0, "medium", "मध्यम", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_fry_onion),
            Ingredient("Ripe Tomatoes (finely chopped)", "बारीक कटे टमाटर", 2.0, "medium", "मध्यम", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Ginger-Garlic Paste", "अदरक-लहसुन पेस्ट", 1.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_spices),
            Ingredient("Turmeric, Chilli, Coriander & Chicken Masala", "हल्दी, मिर्च, धनिया व चिकन मसाला", 2.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Mustard or Cooking Oil", "तेल", 3.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash chicken cleanly & drain dry", "चिकन को साफ धोकर पानी निथार लें",
                "Rinse curry-cut chicken pieces in clean water 2–3 times, then keep in a strainer for 5 minutes so excess water drains off.",
                "चिकन के टुकड़ों को 2-3 बार साफ धो लें और छलनी में 5 मिनट रखें ताकि सारा अतिरिक्त पानी निकल जाए।",
                "Well-drained chicken browns cleanly in masala instead of turning watery.", "पानी निकलने से चिकन भुनते समय कड़ाही में पानी नहीं छोड़ता।",
                5, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Wash)", heatLevelHi = "बिना गैस (सफाई)",
                timingDetailEn = "5 min wash & drain", timingDetailHi = "5 मिनट में धोकर पानी निथारें"
            ),
            CookingStep(
                2, "Finely chop onions, tomatoes & coriander", "प्याज, टमाटर, हरी मिर्च व धनिया काटें",
                "Finely slice/chop onions, finely dice tomatoes, slit 2 green chillies, and chop fresh coriander.",
                "प्याज को पतला/बारीक काटें, टमाटर बारीक काट लें और हरी मिर्च व हरा धनिया तैयार रखें।",
                "Finer onions melt smoothly into the curry gravy.", "बारीक कटे प्याज पकने पर तरी को बढ़िया गाढ़ा करते हैं।",
                5, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "5 min chopping", timingDetailHi = "5 मिनट में कटिंग पूरी करें"
            ),
            CookingStep(
                3, "Heat oil & crackle whole spices", "तेल गरम कर साबुत खड़े मसाले चटकाएं",
                "Heat oil in a heavy kadhai/pot on medium flame; add bay leaf, 1 cinnamon stick, 2 green cardamoms, 3 cloves, and 1/2 tsp cumin for 20 seconds.",
                "भारी कड़ाही में तेल गरम कर तेजपत्ता, दालचीनी, इलायची, लौंग व जीरा डालकर 20 सेकंड खुशबू आने तक चटकाएं।",
                "If using mustard oil, let it smoke faintly first then cool slightly before spices.", "सरसों का तेल इस्तेमाल करें तो पहले हल्का धुआं आने तक गरम कर लें।",
                1, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Crackle 20–30 sec", timingDetailHi = "20-30 सेकंड चटकाएं"
            ),
            CookingStep(
                4, "Slow-brown onions for 8 minutes", "प्याज को 8 मिनट गहरा सुनहरा भूरा भूनें",
                "Add chopped onions with a pinch of salt and fry on medium heat stirring regularly for 8 minutes until rich golden brown.",
                "कटा प्याज व चुटकी नमक डालकर मध्यम आंच पर लगातार चलाते हुए 8 मिनट तक गहरा सुनहरा भूरा होने तक भूनें।",
                "Pinch of salt draws out moisture so onions brown faster and evenly.", "थोड़ा नमक डालने से प्याज जल्दी व बराबर सुनहरा भुनता है।",
                8, PrepStage.SPICE, R.drawable.img_step_fry_onion,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Brown onions 8 min patiently", timingDetailHi = "8 मिनट सुनहरा भूरा होने तक भूनें"
            ),
            CookingStep(
                5, "Roast ginger-garlic paste 1.5 minutes", "अदरक-लहसुन पेस्ट को 1.5 मिनट भूनें",
                "Stir in ginger-garlic paste and saute for 1.5 minutes until raw pungent aroma completely turns nutty and fragrant.",
                "अदरक-लहसुन पेस्ट डालकर 1.5 मिनट चलाते हुए भूनें जब तक कच्ची महक खत्म न हो जाए।",
                "Splash 1 tbsp water if paste tries to stick to the pan.", "चिपकने लगे तो 1 चम्मच पानी छिड़ककर भूनें।",
                2, PrepStage.SPICE, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "Medium-Low Flame", heatLevelHi = "मध्यम-धीमी आंच",
                timingDetailEn = "Roast 1.5–2 min", timingDetailHi = "1.5-2 मिनट अच्छी तरह भूनें"
            ),
            CookingStep(
                6, "Cook tomato & powdered spices until oil shines", "टमाटर व सूखे मसाले तेल छूटने तक भूनें",
                "Add tomatoes, turmeric, red chilli, coriander powder, and salt; cook 6–7 minutes mashing soft tomatoes until oil visibly separates around edges.",
                "टमाटर, हल्दी, लाल मिर्च, धनिया पाउडर व नमक डालें; टमाटर मसलते हुए 6-7 मिनट किनारों पर तेल अलग होने तक भूनें।",
                "Never rush this bhunai—oil separation shows masala is fully cooked!", "मसाला तेल छोड़े तभी चिकन डालें, इससे तरी में कच्चा स्वाद नहीं आता।",
                7, PrepStage.COOK_SIMMER, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Medium-Low Flame", heatLevelHi = "मध्यम-धीमी आंच",
                timingDetailEn = "Cook masala 6–7 min until oil shines", timingDetailHi = "6-7 मिनट तेल छूटने तक भूनें"
            ),
            CookingStep(
                7, "High-heat sear chicken in masala (5 min)", "चिकन डालकर 5 मिनट तेज़ आंच पर भूनें",
                "Raise flame to medium-high, add chicken pieces, and stir-sear vigorously for 5 minutes until outside turns opaque white and coated in masala.",
                "आंच मध्यम-तेज़ करें, चिकन के टुकड़े डालें और 5 मिनट लगातार चलाते हुए भूनें जब तक चिकन का रंग सफेद न हो जाए।",
                "Searing chicken directly in roasted spice masala locks in juice.", "मसाले के साथ भूनने से चिकन अंदर तक रसदार व स्वादिष्ट बनता है।",
                5, PrepStage.COOK_SIMMER, R.drawable.img_dish_naan_curry,
                heatLevelEn = "Medium-High Flame", heatLevelHi = "मध्यम-तेज़ आंच",
                timingDetailEn = "Bhunai 5 min", timingDetailHi = "5 मिनट तेज़ भुनाई करें"
            ),
            CookingStep(
                8, "Pour warm water & simmer covered (15 min)", "गरम पानी डालकर ढककर 15 मिनट पकाएं",
                "Pour 1.5 cups warm water, scrape bottom gently, bring to a boil, then cover tightly and simmer on LOW flame for 15 minutes.",
                "डेढ़ कप गरम पानी डालकर उबाल आने दें, फिर ढक्कन बंद कर बिल्कुल धीमी आंच पर 15 मिनट पकाएं।",
                "Warm water preserves cooking temperature and prevents tough meat.", "हमेशा गरम पानी ही डालें ताकि चिकन सख्त न पड़े।",
                15, PrepStage.COOK_SIMMER, R.drawable.img_dish_curry_bowl,
                heatLevelEn = "Low Flame (Covered)", heatLevelHi = "धीमी आंच (ढककर)",
                timingDetailEn = "Simmer covered 15 min (+3–4 min if bone-thick)", timingDetailHi = "15 मिनट ढककर पकाएं (कसर लगे तो 3-4m और)"
            ),
            CookingStep(
                9, "Add chicken masala & boil uncovered 2 min", "चिकन/गरम मसाला डालकर 2 मिनट और उबालें",
                "Check tenderness near bone; sprinkle chicken masala / garam masala and slit green chillies, then simmer uncovered 2 minutes to finish.",
                "हड्डी के पास का मांस नरम होने की जांच करें; फिर चिकन मसाला/गरम मसाला व हरी मिर्च डालकर 2 मिनट खुला उबालें।",
                "Finishing spices added at the end stay wonderfully aromatic.", "अंत में गरम मसाला डालने से करी में ताज़ी खुशबू आती है।",
                2, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Simmer 2 min", timingDetailHi = "2 मिनट और उबालें"
            ),
            CookingStep(
                10, "Rest 5 minutes covered, garnish & serve", "गैस बंद कर 5 मिनट रखें, धनिया सजाकर परोसें",
                "Turn off flame, sprinkle generous fresh coriander, rest covered 5 minutes so rich tari floats to top, and serve hot with rice or chapati!",
                "गैस बंद कर खूब सारा हरा धनिया डालें, 5 मिनट ढका रखें ताकि तरी ऊपर निखर आए, और चावल या रोटी संग परोसें!",
                "5-minute rest transforms broth into glossy homestyle tari!", "5 मिनट रखने से तरी ऊपर चमकदार आती है और स्वाद बढ़ जाता है।",
                5, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off (Rest)", heatLevelHi = "गैस बंद (रेस्ट)",
                timingDetailEn = "Rest 5 min -> Ready!", timingDetailHi = "5 मिनट ढका रखें — गरमागरम देसी चिकन करी तैयार!"
            )
        )
    )
)
