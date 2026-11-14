package com.example.data.catalog

import com.example.R
import com.example.data.model.*

val internationalRecipesWest: List<Recipe> = listOf(
    // MEXICO
    Recipe(
        id = "veg_tacos",
        nameEn = "Mexican Veg Tacos",
        nameHi = "मेक्सिकन वेज टैकोस",
        country = Country.MEXICO,
        category = FoodCategory.INTERNATIONAL,
        mealTimes = listOf(MealTime.SNACKS, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 12,
        cookMinutes = 10,
        defaultServings = 3,
        isPopular = true,
        priorPrepNoteEn = "Uses boiled kidney beans (rajma)—if raw, soak 8 hrs & boil 5 whistles beforehand.",
        priorPrepNoteHi = "नोट: उबला हुआ राजमा उपयोग करें (कच्चा हो तो पहले 8 घंटे भिगोकर 5 सीटी उबाल लें)।",
        descriptionEn = "Warm toasted tortillas filled with spiced kidney beans, sweet corn, crisp bell peppers, cheese, and zesty tomato salsa.",
        descriptionHi = "मसालेदार राजमा, स्वीट कॉर्न, शिमला मिर्च, चीज़ और ताज़ा टमाटर साल्सा से भरे स्वादिष्ट मेक्सिकन टैकोस।",
        cookingTipEn = "Warm soft tortillas on a dry tawa for 15 seconds per side and keep wrapped in a cloth so they fold without cracking.",
        cookingTipHi = "टॉर्टिला को सूखे तवे पर 15 सेकंड हल्का सेककर साफ कपड़े में लपेटें—मोड़ने पर वे बिल्कुल नहीं टूटेंगे।",
        safetyTipEn = "Wash hands thoroughly after chopping spicy jalapenos or green chillies.",
        safetyTipHi = "तीखी हरी मिर्च या हलापेनो काटने के बाद हाथ साबुन से अच्छे से धो लें।",
        imageRes = R.drawable.img_dish_tacos,
        ingredients = listOf(
            Ingredient("Taco Shells or Soft Tortillas", "टैको शेल्स या टॉर्टिला", 6.0, "pieces", "नग", true, null, R.drawable.img_dish_tacos),
            Ingredient("Boiled Kidney Beans (Rajma)", "उबला हुआ राजमा", 1.0, "cup", "कप", true, themealdbIngredientUrl("Kidney Beans"), R.drawable.img_step_wash),
            Ingredient("Bell Peppers & Sweet Corn", "शिमला मिर्च व स्वीट कॉर्न", 1.0, "cup", "कप", true, themealdbIngredientUrl("Sweetcorn"), R.drawable.img_step_chop),
            Ingredient("Ripe Tomatoes, Onion, Coriander & Lime", "टमाटर, प्याज, धनिया व नींबू (साल्सा)", 1.0, "cup", "कप", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_salad_mix),
            Ingredient("Cumin, Paprika/Chilli & Oregano", "जीरा, मिर्च व ऑरेगैनो", 1.5, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Cumin"), R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash & chop fresh salsa veggies", "ताज़े साल्सा के लिए टमाटर, प्याज व धनिया काटें",
                "Wash ripe tomatoes, onion, green chilli, and fresh coriander; finely dice into small uniform pieces for bright fresh salsa.",
                "टमाटर, प्याज, हरी मिर्च व हरा धनिया साफ धोकर बिल्कुल बारीक चौकोर टुकड़ों में काट लें।",
                "Remove watery tomato seeds so salsa stays chunky, not soupy.", "टमाटर के बीज निकाल देने से साल्सा ज़्यादा पानी नहीं छोड़ता।",
                4, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Wash & Dice)", heatLevelHi = "बिना गैस (धोना व काटना)",
                timingDetailEn = "4 min chopping salsa", timingDetailHi = "4 मिनट में साल्सा की कटिंग करें"
            ),
            CookingStep(
                2, "Season fresh salsa with lime & let rest", "नींबू व नमक मिलाकर साल्सा को 5 मिनट रखें",
                "Toss diced tomatoes, onion, chilli, coriander, fresh lime juice, and salt in a bowl; set aside 5 minutes so zesty flavors meld.",
                "कटी सब्ज़ियों में नींबू का रस व नमक मिलाकर अलग रख दें ताकि 5 मिनट में खट्टा-तीखा स्वाद अच्छे से बस जाए।",
                "Resting lets salt pull sweet-tangy juice from tomatoes naturally.", "5 मिनट रखने से नींबू व टमाटर का स्वाद बहुत निखरता है।",
                2, PrepStage.MIX, R.drawable.img_step_lemon,
                heatLevelEn = "No Flame (Rest Salsa)", heatLevelHi = "बिना गैस (मिलाना)",
                timingDetailEn = "Mix & rest while cooking filling", timingDetailHi = "मिलाकर भरावन पकने तक रखें"
            ),
            CookingStep(
                3, "Slice peppers & boil sweet corn (if raw)", "शिमला मिर्च काटें (कच्चे कॉर्न हों तो 4 मिनट उबालें)",
                "Slice colored bell peppers and onion into thin strips; if sweet corn kernels are raw/frozen, boil 4 minutes in water and drain.",
                "शिमला मिर्च व प्याज पतले लंबे काटें; यदि स्वीट कॉर्न कच्चे हैं तो पानी में 4 मिनट उबालकर छान लें।",
                "Drained corn chars lightly instead of steaming soggy.", "कॉर्न का पानी छान लेने से पैन में बढ़िया भुनते हैं।",
                4, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "Prep / Optional 4m Boil", heatLevelHi = "कटिंग / 4m उबाल",
                timingDetailEn = "4 min prep", timingDetailHi = "4 मिनट में शिमला मिर्च व कॉर्न तैयार"
            ),
            CookingStep(
                4, "Cook spiced rajma-corn taco filling", "राजमा-कॉर्न और मसालों को 5-6 मिनट पकाएं",
                "Heat 1 tbsp oil on medium flame; saute peppers 2 min, then add boiled rajma, sweet corn, roasted cumin, chilli powder, oregano, salt & 2 tbsp water; simmer 4 minutes while mashing a few beans.",
                "1 चम्मच तेल में शिमला मिर्च 2 मिनट भूनें, फिर उबला राजमा, कॉर्न, जीरा, लाल मिर्च, ऑरेगैनो, नमक व 2 चम्मच पानी डालकर 4 मिनट पकाएं (थोड़े राजमा मसल दें)।",
                "Lightly mashed rajma binds corn and spices so nothing spills out.", "थोड़े राजमा मसल देने से भरावन टैको के अंदर टिका रहता है।",
                6, PrepStage.SPICE, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Simmer 5–6 min until coated", timingDetailHi = "5-6 मिनट मसाले में लटपटा होने तक पकाएं"
            ),
            CookingStep(
                5, "Warm taco shells or tortillas on dry tawa", "सूखे तवे पर टॉर्टिला या टैको शेल्स 1-2 मिनट सेंकें",
                "Heat a dry tawa on medium-low flame; toast soft tortillas 15–20 seconds per side until pliable (or warm crisp taco shells 1 min standing upright).",
                "मध्यम-धीमे तवे पर टॉर्टिला को दोनों तरफ 15-20 सेकंड नरम होने तक सेंकें (या क्रिस्पी टैको शेल 1 मिनट गरम करें)।",
                "Keep warmed soft tortillas tucked inside a clean kitchen towel.", "गरम टॉर्टिला को साफ कपड़े में लपेटकर रखने से वे नरम बने रहते हैं।",
                2, PrepStage.COOK_SIMMER, R.drawable.img_step_tawa_roast,
                heatLevelEn = "Medium-Low Tawa", heatLevelHi = "मध्यम-धीमा तवा",
                timingDetailEn = "Toast 15–20 sec per side", timingDetailHi = "दोनों ओर 15-20 सेकंड सेंकें"
            ),
            CookingStep(
                6, "Assemble bean filling, salsa & serve crisp", "राजमा भरावन, ताज़ा साल्सा व चीज़ भरकर तुरंत परोसें",
                "Spoon warm spiced rajma-corn mix into each shell, top with grated cheese, rested fresh tomato salsa, shredded lettuce, and a lime squeeze; serve right away!",
                "हर टैको में गरम राजमा-कॉर्न भरें, ऊपर कद्दूकस चीज़, ताज़ा साल्सा व नींबू सजाकर तुरंत परोसें!",
                "Always fill shells right before biting so they never turn soggy!", "खाने से ठीक पहले भरने से टैकोस बिल्कुल कुरकुरे रहते हैं!",
                2, PrepStage.SERVE, R.drawable.img_dish_tacos,
                heatLevelEn = "Serve Fresh", heatLevelHi = "ताज़ा परोसें",
                timingDetailEn = "Fill & serve -> Ready!", timingDetailHi = "भरकर तुरंत परोसें — मेक्सिकन टैकोस तैयार!"
            )
        )
    ),
    Recipe(
        id = "quesadillas",
        nameEn = "Cheesy Veg Quesadillas",
        nameHi = "चीज़ी वेज केसाडिया",
        country = Country.MEXICO,
        category = FoodCategory.INTERNATIONAL,
        mealTimes = listOf(MealTime.BREAKFAST, MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 8,
        cookMinutes = 8,
        defaultServings = 2,
        descriptionEn = "Golden butter-toasted tortilla folded over stretchy melted mozzarella cheese, sweet corn, bell peppers, and Mexican herbs.",
        descriptionHi = "मक्खन में सिकी कुरकुरी टॉर्टिला के अंदर पिघला मोज़रेला चीज़, स्वीट कॉर्न और शिमला मिर्च वाला चीज़ी वेज केसाडिया।",
        cookingTipEn = "No tortillas at home? Leftover soft wheat chapatis (रोटी) work amazingly well for an Indian fusion quesadilla!",
        cookingTipHi = "टॉर्टिला न हो तो आप घर की सादी गेहूं की रोटी से भी यह शानदार चीज़ी केसाडिया बना सकते हैं।",
        safetyTipEn = "Toast strictly on low flame so cheese melts gooey inside before the crust browns too fast.",
        safetyTipHi = "धीमी आंच पर ही सेंकें ताकि बाहर से जलने से पहले अंदर का चीज़ पूरी तरह पिघल जाए।",
        imageRes = R.drawable.img_dish_tacos,
        ingredients = listOf(
            Ingredient("Flour Tortillas or Thin Chapatis", "टॉर्टिला या पतली रोटी", 4.0, "pieces", "नग", true, null, R.drawable.img_dish_bread),
            Ingredient("Grated Mozzarella & Cheddar Cheese", "कद्दूकस चीज़", 1.0, "cup", "कप", true, themealdbIngredientUrl("Mozzarella"), R.drawable.img_step_raita),
            Ingredient("Sweet Corn & Bell Pepper", "स्वीट कॉर्न व शिमला मिर्च", 0.75, "cup", "कप", true, themealdbIngredientUrl("Sweetcorn"), R.drawable.img_step_chop),
            Ingredient("Onion, Oregano & Chilli Flakes", "प्याज, ऑरेगैनो व चिली फ्लेक्स", 1.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Butter or Olive Oil", "मक्खन या तेल", 1.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Butter"), R.drawable.img_step_tawa_roast)
        ),
        steps = listOf(
            CookingStep(
                1, "Boil sweet corn (if raw) & finely chop veggies", "सब्ज़ियाँ बारीक काटें (कच्चे कॉर्न 4 मिनट उबालें)",
                "Finely dice colorful bell peppers, onion, and coriander; if corn is raw/frozen, boil 4 minutes in water and drain thoroughly dry.",
                "शिमला मिर्च, प्याज व धनिया बारीक काट लें; यदि स्वीट कॉर्न कच्चे हैं तो 4 मिनट उबालकर सारा पानी छान दें।",
                "Small uniform pieces let tortillas fold flat without tearing.", "बारीक कटे टुकड़ों से केसाडिया आसानी से चिपकता व सिकता है।",
                4, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "Prep / Optional 4m Boil", heatLevelHi = "कटिंग / 4m उबाल",
                timingDetailEn = "4 min prep", timingDetailHi = "4 मिनट में कटिंग व कॉर्न तैयार करें"
            ),
            CookingStep(
                2, "Mix veggie filling with herbs & pepper", "कॉर्न, शिमला मिर्च व हर्ब्स एक बाउल में मिलाएं",
                "Combine drained sweet corn, diced bell pepper, onion, coriander, oregano, chilli flakes, black pepper, and just a tiny pinch of salt.",
                "बाउल में कॉर्न, शिमला मिर्च, प्याज, धनिया, ऑरेगैनो, चिली फ्लेक्स, काली मिर्च व हल्का नमक मिला लें।",
                "Go easy on salt because cheese is already salty!", "चीज़ में पहले से नमक होता है इसलिए भरावन में नमक बहुत कम रखें।",
                2, PrepStage.MIX, R.drawable.img_step_salad_mix,
                heatLevelEn = "No Flame (Mix)", heatLevelHi = "बिना गैस (मिलाना)",
                timingDetailEn = "2 min mixing", timingDetailHi = "2 मिनट में भरावन तैयार"
            ),
            CookingStep(
                3, "Layer cheese + veggies + cheese & fold", "रोटी/टॉर्टिला के आधे हिस्से में चीज़ व भरावन रखकर मोड़ें",
                "Lay tortilla flat, scatter half the grated cheese on one half, spoon veggie filling evenly, top with more cheese, and fold empty half over into a D-shape pressing gently.",
                "टॉर्टिला या रोटी के आधे हिस्से पर चीज़ बिछाएं, ऊपर कॉर्न-शिमला मिर्च भरावन व फिर थोड़ा चीज़ डालकर दूसरा हिस्सा ऊपर से मोड़ कर हल्का दबा दें।",
                "Cheese on BOTH bottom and top acts as melted glue sealing the edges!", "नीचे और ऊपर दोनों तरफ चीज़ डालने से सिकते वक्त केसाडिया अच्छे से चिपक जाता है।",
                2, PrepStage.MIX, R.drawable.img_step_fold_stuff,
                heatLevelEn = "No Flame (Fold)", heatLevelHi = "बिना गैस (भरावन व मोड़ना)",
                timingDetailEn = "2 min layering", timingDetailHi = "2 मिनट में भरकर मोड़ें"
            ),
            CookingStep(
                4, "Toast first side slowly in butter on low heat", "धीमी आंच पर मक्खन वाले तवे पर पहली तरफ सेकें",
                "Melt 1/2 tbsp butter on a flat tawa over LOW flame; place folded quesadilla gently and cook 2.5 minutes until bottom is crisp golden brown.",
                "तवे पर बिल्कुल धीमी आंच में आधा चम्मच मक्खन पिघलाकर केसाडिया रखें और 2.5 मिनट नीचे से सुनहरा कुरकुरा होने तक सेंकें।",
                "Press lightly with spatula so cheese starts melting evenly.", "कड़छी से हल्का दबाकर सेंकने से चीज़ जल्दी पिघलता है।",
                3, PrepStage.COOK_SIMMER, R.drawable.img_step_tawa_roast,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Toast side 1 for 2.5 min", timingDetailHi = "पहली तरफ 2.5 मिनट धीमी आंच पर सेकें"
            ),
            CookingStep(
                5, "Flip carefully & toast second side until gooey", "पलटकर दूसरी तरफ भी 2.5 मिनट चीज़ पिघलने तक सेकें",
                "Brush top with 1/2 tsp butter, flip carefully with a wide spatula, and cook 2.5 minutes more on LOW flame until crisp golden and molten cheese peeks at edges (cover 30 sec if needed).",
                "ऊपर थोड़ा मक्खन लगाकर चौड़े स्पैचुला से पलटें और दूसरी तरफ से भी 2.5 मिनट सुनहरा कुरकुरा व चीज़ पिघलने तक सेकें।",
                "Covering briefly traps heat to melt thick mozzarella cleanly.", "जरूरत लगे तो 30 सेकंड ढक्कन ढक दें ताकि अंदर का चीज़ पूरा पिघल जाए।",
                3, PrepStage.COOK_SIMMER, R.drawable.img_dish_bread,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Toast side 2 for 2.5 min", timingDetailHi = "दूसरी तरफ 2.5 मिनट सुनहरा सेकें"
            ),
            CookingStep(
                6, "Rest 1 min, slice crisp wedges & serve hot", "1 मिनट ठंडा कर तिकोने टुकड़े काटें व साल्सा संग परोसें",
                "Transfer onto a cutting board and wait 1 minute before slicing into 3 triangles so molten cheese sets cleanly inside; serve hot with salsa or mint dip!",
                "तवे से उतारकर 1 मिनट बोर्ड पर रुकें ताकि पिघला चीज़ सैट हो जाए, फिर पिज़्ज़ा कटर/चाकू से 3 तिकोने पीस काटकर साल्सा या चटनी संग परोसें!",
                "Cutting immediately pushes molten cheese out—1 minute patience pays off!", "तुरंत काटने पर चीज़ बाहर निकल आता है, इसलिए 1 मिनट बाद ही काटें!",
                2, PrepStage.SERVE, R.drawable.img_dish_tacos,
                heatLevelEn = "Rest 1m -> Serve", heatLevelHi = "1m रुकें -> परोसें",
                timingDetailEn = "Rest 1 min, slice -> Ready!", timingDetailHi = "1 मिनट रुकें, काटें — चीज़ी केसाडिया तैयार!"
            )
        )
    ),

    // ITALY
    Recipe(
        id = "pizza_margherita",
        nameEn = "Pizza Margherita",
        nameHi = "पिज़्ज़ा मार्गेरीटा",
        country = Country.ITALY,
        category = FoodCategory.INTERNATIONAL,
        mealTimes = listOf(MealTime.SNACKS, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 10,
        cookMinutes = 12,
        defaultServings = 2,
        isPopular = true,
        isTrending = true,
        descriptionEn = "Classic thin-crust Italian pizza topped with vibrant tomato sauce, bubbling melted mozzarella, olive oil, and fresh basil.",
        descriptionHi = "ताज़ा टमाटर पिज़्ज़ा सॉस, पिघले मोज़रेला चीज़ और फ्रेश बेसिल पत्तों वाला घर पर तवे या ओवन में बना पिज़्ज़ा मार्गेरीटा।",
        cookingTipEn = "No oven needed! Cover a heavy tawa with a tight dome lid on lowest flame to melt cheese bubbly and golden.",
        cookingTipHi = "बिना ओवन के भी भारी तवे को कसकर ढककर बिल्कुल धीमी आंच पर बिल्कुल कैफे जैसा चीज़ पिघलाया जा सकता है।",
        safetyTipEn = "Always use a thick kitchen cloth or pot holder when lifting the hot lid off the tawa.",
        safetyTipHi = "तवे का गरम ढक्कन उठाते समय हमेशा सूखे कपड़े या पकड़ का इस्तेमाल करें।",
        imageRes = R.drawable.img_dish_pizza,
        ingredients = listOf(
            Ingredient("Pizza Base", "पिज़्ज़ा बेस", 2.0, "bases", "बेस", true, null, R.drawable.img_dish_pizza),
            Ingredient("Pizza Tomato Sauce", "पिज़्ज़ा टमाटर सॉस", 4.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Tomato Puree"), R.drawable.img_step_spices),
            Ingredient("Shredded Mozzarella Cheese", "कद्दूकस मोज़रेला चीज़", 1.5, "cups", "कप", true, themealdbIngredientUrl("Mozzarella"), R.drawable.img_step_raita),
            Ingredient("Fresh Basil Leaves", "ताज़ा बेसिल/तुलसी पत्ते", 10.0, "leaves", "पत्ते", true, themealdbIngredientUrl("Basil"), R.drawable.img_step_wash),
            Ingredient("Olive Oil, Oregano & Chilli Flakes", "ऑलिव ऑयल, ऑरेगैनो व चिली फ्लेक्स", 1.5, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash & dry basil leaves, grate mozzarella", "बेसिल पत्ते धोकर सुखाएं व मोज़रेला घिसें",
                "Rinse fresh basil leaves and pat bone-dry with paper towel. Grate cold mozzarella evenly and leave out 5 min so it melts rapidly.",
                "ताज़े बेसिल पत्तों को धोकर कपड़े से अच्छे से सुखा लें। ठंडा मोज़रेला चीज़ कद्दूकस कर 5 मिनट बाहर रखें ताकि आसानी से पिघले।",
                "Dry basil leaves stay bright green without steaming soggy spots.", "बेसिल पत्ते सूखे होने पर पकाने के बाद भी हरे रहते हैं।",
                3, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (तैयारी)",
                timingDetailEn = "3 min prep", timingDetailHi = "3 मिनट में पत्ते व चीज़ तैयार करें"
            ),
            CookingStep(
                2, "Preheat heavy tawa or oven first", "भारी तवा (3 मिनट) या ओवन 220°C पर प्रीहीट करें",
                "Preheat a thick cast-iron/non-stick tawa covered on LOW heat for 3 minutes (or preheat oven to 220°C) before assembling pizza.",
                "पिज़्ज़ा सजाते समय ही भारी तवे को ढककर धीमी आंच पर 3 मिनट प्रीहीट होने दें (ओवन हो तो 220°C पर गरम करें)।",
                "Preheating ensures the crust crisps up nicely right away.", "पहले से तवा हल्का गरम होने पर पिज़्ज़ा का बेस कुरकुरा बनता है।",
                3, PrepStage.COOK_SIMMER, R.drawable.img_step_tawa_roast,
                heatLevelEn = "Low Preheat", heatLevelHi = "धीमा प्रीहीट",
                timingDetailEn = "Preheat 3 min", timingDetailHi = "3 मिनट तवा/ओवन गरम होने दें"
            ),
            CookingStep(
                3, "Brush oil & spread pizza sauce evenly", "बेस पर हल्का तेल व पिज़्ज़ा टमाटर सॉस फैलाएं",
                "Brush bottom of pizza base lightly with butter/olive oil (helps crisp on tawa), then spread 2 tbsp tomato pizza sauce cleanly leaving a 1 cm border.",
                "पिज़्ज़ा बेस के नीचे हल्का तेल/मक्खन लगाएं और ऊपर किनारों से 1 सेमी छोड़कर 2 चम्मच पिज़्ज़ा सॉस बराबर फैला दें।",
                "Neat borders bake into airy golden crispy edges.", "किनारे खाली छोड़ने से साइड का क्रस्ट बढ़िया कुरकुरा सिकता है।",
                2, PrepStage.MIX, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "No Flame (Spread)", heatLevelHi = "बिना गैस (सॉस)",
                timingDetailEn = "2 min spreading", timingDetailHi = "2 मिनट में सॉस फैलाएं"
            ),
            CookingStep(
                4, "Top generously with mozzarella & basil", "मोज़रेला चीज़ और बेसिल पत्ते सजाएं",
                "Scatter grated mozzarella evenly over the red sauce (avoid piling huge mounds in the center), arrange half the basil leaves, and drizzle 1 tsp olive oil.",
                "सॉस के ऊपर कद्दूकस मोज़रेला चीज़ बराबर फैलाएं, आधे बेसिल पत्ते रखें और ऊपर से कुछ बूंदें ऑलिव ऑयल छिड़कें।",
                "Save half the fresh basil leaves to scatter AFTER baking for fresh fragrance!", "ताज़गी के लिए आधे बेसिल पत्ते पकने के बाद ऊपर डालेंगे।",
                2, PrepStage.MIX, R.drawable.img_step_fold_stuff,
                heatLevelEn = "No Flame (Topping)", heatLevelHi = "बिना गैस (टॉपिंग)",
                timingDetailEn = "2 min topping", timingDetailHi = "2 मिनट में चीज़ टॉपिंग सजाएं"
            ),
            CookingStep(
                5, "Bake covered on lowest flame until cheese bubbles", "तवे पर ढक्कन बंद कर धीमी आंच पर 8-10 मिनट पकाएं",
                "Set pizza onto the warm tawa, cover tightly with a domed lid, and bake on LOWEST flame for 8–10 minutes until mozzarella melts completely and bubbles (if unmelted, keep 2 min more).",
                "गरम तवे पर पिज़्ज़ा रखकर कसकर ढक्कन बंद करें और बिल्कुल धीमी आंच पर 8-10 मिनट चीज़ पिघलकर बुलबुले आने तक पकाएं।",
                "Check bottom crust at 6 min—slip a second flat tawa below if browning fast!", "6 मिनट बाद नीचे चेक करें; ज्यादा लाल हो रहा हो तो नीचे दूसरा तवा रख दें।",
                9, PrepStage.COOK_SIMMER, R.drawable.img_dish_pizza,
                heatLevelEn = "Lowest Flame (Covered)", heatLevelHi = "बिल्कुल धीमी आंच (ढककर)",
                timingDetailEn = "Bake 8–10 min covered (+2 min if needed)", timingDetailHi = "8-10 मिनट ढककर पकाएं (चीज़ न पिघले तो 2m और)"
            ),
            CookingStep(
                6, "Rest 2 min, scatter oregano & slice hot", "2 मिनट बाद ऑरेगैनो-चिली फ्लेक्स डालकर स्लाइस काटें",
                "Slide onto a board, rest 2 minutes so molten cheese settles cleanly, top with fresh basil leaves, oregano, and chilli flakes, slice into 6 wedges and serve hot!",
                "2 मिनट बोर्ड पर ठंडा होने दें, ऊपर ताज़ा बेसिल, ऑरेगैनो व चिली फ्लेक्स छिड़कें और स्लाइस काटकर गरमागरम परोसें!",
                "Resting 2 minutes stops molten cheese from sliding off the slice!", "2 मिनट बाद काटने पर चीज़ स्लाइस पर बिल्कुल सैट रहता है!",
                2, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Rest 2m -> Serve", heatLevelHi = "2m रुकें -> परोसें",
                timingDetailEn = "Rest 2 min, slice -> Ready!", timingDetailHi = "2 मिनट रुकें, काटें — पिज़्ज़ा तैयार!"
            )
        )
    ),
    Recipe(
        id = "pasta_alfredo",
        nameEn = "Creamy White Sauce Pasta (Alfredo)",
        nameHi = "क्रीमी व्हाइट सॉस पास्ता (अल्फ्रेडो)",
        country = Country.ITALY,
        category = FoodCategory.INTERNATIONAL,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 10,
        cookMinutes = 16,
        defaultServings = 2,
        isPopular = true,
        descriptionEn = "Al-dente penne pasta tossed in silky lump-free garlic-butter white sauce with sweet corn, bell peppers, and Italian herbs.",
        descriptionHi = "मक्खन, लहसुन, दूध और चीज़ के बिना गुठली वाले मखमली व्हाइट सॉस में बना स्वादिष्ट इटैलियन अल्फ्रेडो पास्ता।",
        cookingTipEn = "Pour cold/room-temp milk slowly while whisking constantly into the warm butter-flour paste for 100% lump-free sauce!",
        cookingTipHi = "मक्खन-मैदे में ठंडा दूध धीरे-धीरे डालते हुए लगातार चलाएं ताकि व्हाइट सॉस बिल्कुल मखमली और बिना गुठली का बने।",
        safetyTipEn = "Always save 1/2 cup starchy pasta boiling water before draining—it makes thick sauce creamy again cleanly!",
        safetyTipHi = "पास्ता छानने से पहले आधा कप उबला पानी अलग निकाल लें—सॉस गाढ़ा होने पर यही काम आएगा।",
        imageRes = R.drawable.img_dish_noodles,
        ingredients = listOf(
            Ingredient("Penne or Fettuccine Pasta", "पेन्ने या फेटुचिनी पास्ता", 1.5, "cups", "कप", true, null, R.drawable.img_dish_noodles),
            Ingredient("Sweet Corn & Colored Bell Peppers", "स्वीट कॉर्न व शिमला मिर्च", 0.75, "cup", "कप", true, themealdbIngredientUrl("Sweetcorn"), R.drawable.img_step_chop),
            Ingredient("Butter & All-Purpose Flour (Maida)", "मक्खन व मैदा", 2.0, "tbsp each", "बड़ी चम्मच प्रत्येक", true, themealdbIngredientUrl("Butter"), R.drawable.img_dish_bread),
            Ingredient("Chilled / Room-Temp Milk", "दूध", 1.5, "cups", "कप", true, themealdbIngredientUrl("Milk"), R.drawable.img_step_syrup_milk),
            Ingredient("Minced Garlic, Cheese & Oregano", "लहसुन, चीज़ व ऑरेगैनो", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Boil pasta al dente & reserve pasta water", "पास्ता 9–10 मिनट उबालें व आधा कप पानी बचाएं",
                "Bring 5 cups water + 1 tsp salt to a boil; cook pasta 9–10 minutes until tender with a tiny firm bite (no chalky white center). Scoop out 1/2 cup starchy pasta water first.",
                "5 कप उबलते नमक पानी में पास्ता 9-10 मिनट पकाएं (काटकर देखें—बीच में कच्ची सफेद लाइन न हो)। पहले आधा कप पास्ता पानी अलग कटोरी में बचा लें।",
                "Boiled pasta keeps cooking slightly, so stop right at al dente!", "पास्ता हल्का सा फर्म रहे तभी निकालें वरना सॉस में टूट सकता है।",
                10, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "Medium-High Boil", heatLevelHi = "मध्यम-तेज़ उबाल",
                timingDetailEn = "Boil 9–10 min, save 1/2 cup water", timingDetailHi = "9-10 मिनट उबालें व आधा कप पानी बचाएं"
            ),
            CookingStep(
                2, "Drain pasta & finely chop garlic and veggies", "पास्ता छानें और लहसुन, प्याज-शिमला मिर्च काटें",
                "Drain pasta into a colander (toss with 1/2 tsp olive oil so strands stay loose), and finely chop garlic, diced bell peppers, and onion.",
                "पास्ता छलनी में छानकर आधा चम्मच तेल लगा दें ताकि चिपके नहीं; साथ ही लहसुन बारीक और शिमला मिर्च-प्याज छोटे चौकोर काट लें।",
                "Oiling drained pasta keeps tubes separate while you make the sauce.", "पास्ता पर हल्का तेल लगाने से वह आपस में चिपकता नहीं।",
                3, PrepStage.CHOP, R.drawable.img_step_drain,
                heatLevelEn = "No Flame (Drain & Chop)", heatLevelHi = "बिना गैस (छानना व कटिंग)",
                timingDetailEn = "3 min prep", timingDetailHi = "3 मिनट में छानें व काटें"
            ),
            CookingStep(
                3, "Saute garlic, peppers & sweet corn crisp", "मक्खन में लहसुन, शिमला मिर्च व कॉर्न 2-3 मिनट भूनें",
                "Heat 1 tsp butter in a skillet on medium flame; saute half the garlic 20 sec, add diced bell peppers and sweet corn for 2–3 minutes until crisp-tender, then set aside on a plate.",
                "पैन में 1 चम्मच मक्खन गरम कर थोड़ा लहसुन 20 सेकंड, फिर शिमला मिर्च व स्वीट कॉर्न डालकर 2-3 मिनट भूनें और प्लेट में अलग निकाल लें।",
                "Setting sautéed veggies aside preserves bright colors and crispness.", "अलग भूनकर रखने से सब्ज़ियाँ मखमली सॉस में सुंदर रंगीन दिखती हैं।",
                3, PrepStage.SPICE, R.drawable.img_step_chop,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Saute 2–3 min", timingDetailHi = "2-3 मिनट भूनकर अलग निकालें"
            ),
            CookingStep(
                4, "Make butter-flour roux on low flame (1.5 min)", "धीमी आंच पर मक्खन और मैदा 1.5 मिनट भूनें",
                "Melt 2 tbsp butter in the same pan on LOW flame, add remaining minced garlic 15 sec, then stir in 1.5 tbsp maida continuously for 1.5 minutes until bubbly & nutty (never brown!).",
                "उसी पैन में बिल्कुल धीमी आंच पर 2 चम्मच मक्खन पिघलाएं, लहसुन 15 सेकंड भूनें, फिर डेढ़ चम्मच मैदा डालकर 1.5 मिनट खुशबू आने तक लगातार चलाएं (भूरा न होने दें)।",
                "Cooking flour gently removes all raw dough flavor while keeping sauce snow-white.", "धीमी आंच पर 1.5 मिनट भूनने से मैदे का कच्चापन खत्म हो जाता है।",
                2, PrepStage.MIX, R.drawable.img_step_spices,
                heatLevelEn = "Lowest Flame", heatLevelHi = "बिल्कुल धीमी आंच",
                timingDetailEn = "Roast gently 1.5 min", timingDetailHi = "धीमी आंच पर 1.5 मिनट भूनें"
            ),
            CookingStep(
                5, "Whisk cold milk gradually for silky sauce", "धीरे-धीरे ठंडा दूध डालते हुए लगातार चलाएं (गुठली रहित)",
                "With a wire whisk, pour chilled/room-temp milk in small splashes while whisking nonstop on low heat so roux dissolves 100% lump-free, then simmer 3 minutes until creamy.",
                "एक हाथ से धीरे-धीरे ठंडा दूध डालें और दूसरे हाथ से व्हिस्क से लगातार चलाएं ताकि कोई गुठली न पड़े; फिर धीमी आंच पर 3 मिनट गाढ़ा होने तक पकाएं।",
                "Cold milk + warm roux is the #1 chef secret for zero lumps!", "गुनगुने मैदे में ठंडा दूध डालकर लगातार चलाने से बिल्कुल गुठली नहीं बनती!",
                4, PrepStage.COOK_SIMMER, R.drawable.img_step_syrup_milk,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Whisk & simmer 3–4 min", timingDetailHi = "लगातार चलाते हुए 3-4 मिनट गाढ़ा पकाएं"
            ),
            CookingStep(
                6, "Melt cheese, Italian herbs & fold pasta", "चीज़, ऑरेगैनो, पास्ता और सब्ज़ियाँ सॉस में मिलाएं",
                "Stir in grated cheese, oregano, black pepper, chilli flakes, and salt until sauce coats back of a spoon; fold in boiled pasta, sautéed veggies, and 2–3 tbsp saved pasta water for glossy shine (1–2 min).",
                "सॉस में चीज़, ऑरेगैनो, काली मिर्च, चिली फ्लेक्स व नमक मिलाएं; फिर उबला पास्ता, भुनी सब्ज़ियाँ और 2-3 चम्मच बचा पास्ता पानी डालकर 1-2 मिनट धीमी आंच पर लपेटें।",
                "Saved starchy pasta water helps creamy sauce hug every piece!", "पास्ता का बचा पानी डालने से सॉस पास्ता पर बढ़िया चमकदार चिपकता है।",
                2, PrepStage.COOK_SIMMER, R.drawable.img_dish_noodles,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Coat & simmer 1–2 min", timingDetailHi = "1-2 मिनट धीमी आंच पर मिलाएं"
            ),
            CookingStep(
                7, "Garnish extra cheese & herbs, serve piping hot", "ऊपर थोड़ा चीज़ और चिली फ्लेक्स सजाकर तुरंत परोसें",
                "Switch off flame immediately (sauce thickens fast as it sits), top with extra grated cheese, fresh parsley/coriander, and chilli flakes, and serve steaming hot!",
                "तुरंत गैस बंद करें (रखने पर सॉस जल्दी गाढ़ा होता है), ऊपर थोड़ा चीज़, ऑरेगैनो व चिली फ्लेक्स सजाएं और गरमागरम परोसें!",
                "Serve straight away with toasted garlic bread!", "तुरंत गरमागरम परोसें — क्रीमी व्हाइट सॉस पास्ता तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Serve Immediately", heatLevelHi = "तुरंत परोसें",
                timingDetailEn = "Serve hot right away -> Ready!", timingDetailHi = "तुरंत गरमागरम परोसें!"
            )
        )
    )
)
