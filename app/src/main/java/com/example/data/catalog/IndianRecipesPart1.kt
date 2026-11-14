package com.example.data.catalog

import com.example.R
import com.example.data.model.*

val indianRecipesPart1: List<Recipe> = listOf(
    Recipe(
        id = "veg_biryani",
        nameEn = "Veg Biryani",
        nameHi = "वेज बिरयानी",
        country = Country.INDIA,
        category = FoodCategory.BIRYANI_PULAO,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 25,
        cookMinutes = 35,
        defaultServings = 4,
        isPopular = true,
        isTrending = true,
        descriptionEn = "Fragrant basmati rice layered with spiced seasonal vegetables, crispy birista onions, mint, and saffron.",
        descriptionHi = "सुगंधित बासमती चावल, मसालेदार सब्ज़ियों, सुनहरे बिरिस्ता प्याज और केसर-पुदीने की परत वाली शाही वेज बिरयानी।",
        cookingTipEn = "Soak basmati rice for 20 minutes and par-boil only 80% before layering so grains grow long and never turn mushy.",
        cookingTipHi = "बासमती चावल को 20 मिनट भिगोकर सिर्फ 80% उबालें ताकि दम लगाने के बाद हर दाना लंबा और खिला-खिला रहे।",
        safetyTipEn = "Release steam away from your face when opening the heavy pot lid after dum cooking.",
        safetyTipHi = "दम लगाने के बाद ढक्कन खोलते समय गरम भाप से हाथ और चेहरा बचाकर रखें।",
        imageRes = R.drawable.img_dish_biryani,
        ingredients = listOf(
            Ingredient("Long-grain Basmati Rice", "लंबा बासमती चावल", 2.0, "cups", "कप", true, themealdbIngredientUrl("Rice"), R.drawable.img_dish_biryani),
            Ingredient("Mixed Vegetables (Carrot, Beans, Peas, Potato)", "मिली-जुली सब्ज़ियाँ (गाजर, बीन्स, मटर, आलू)", 2.0, "cups", "कप", true, themealdbIngredientUrl("Carrots"), R.drawable.img_step_chop),
            Ingredient("Onions (thinly sliced)", "पतले लंबे कटे प्याज", 2.5, "medium", "मध्यम", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_fry_onion),
            Ingredient("Fresh Curd (whisked)", "ताज़ा फेंटा दही", 0.5, "cup", "कप", true, themealdbIngredientUrl("Yogurt"), R.drawable.img_step_raita),
            Ingredient("Ginger-Garlic Paste", "अदरक-लहसुन पेस्ट", 1.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_spices),
            Ingredient("Biryani Masala & Whole Spices", "बिरयानी मसाला व खड़े मसाले", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Saffron in Warm Milk", "गुनगुने दूध में केसर", 3.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Milk"), R.drawable.img_step_syrup_milk),
            Ingredient("Mint, Coriander & Ghee/Oil", "पुदीना, धनिया व घी/तेल", 3.5, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_garnish_serve)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash & soak basmati rice", "बासमती चावल धोकर 20 मिनट भिगोएं",
                "Rinse basmati rice gently 2–3 times in clean water until water turns mostly clear, then soak in fresh water for 20 minutes.",
                "बासमती चावल को हल्के हाथ से 2-3 बार साफ पानी से धोएं और 20 मिनट पानी में भिगोकर रख दें।",
                "Don't rub soaked rice hard or long grains will snap.", "चावल को जोर से न मसलें वरना लंबे दाने टूट सकते हैं।",
                20, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Soak)", heatLevelHi = "बिना गैस (भिगोना)",
                timingDetailEn = "Soak 20 min while prepping vegetables", timingDetailHi = "सब्ज़ी काटते समय 20 मिनट चावल भीगने दें"
            ),
            CookingStep(
                2, "Wash & chop mixed vegetables uniformly", "सब्ज़ियाँ धोकर बराबर टुकड़ों में काटें",
                "Wash carrots, beans, potatoes, and green peas. Cut carrots, beans, and potatoes into neat 1-inch pieces.",
                "गाजर, बीन्स, आलू व मटर धो लें। गाजर, बीन्स व आलू को लगभग 1-1 इंच के बराबर टुकड़ों में काट लें।",
                "Equal sized veggies finish cooking at the exact same time.", "एक जैसे आकार के टुकड़े एक साथ बराबर पकते हैं।",
                5, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "5 min cutting", timingDetailHi = "5 मिनट में सब्ज़ियाँ काटें"
            ),
            CookingStep(
                3, "Thinly slice onions & chop mint-coriander", "प्याज के पतले लच्छे व पुदीना-धनिया काटें",
                "Slice onions into uniform thin rings for crispy birista, and finely chop fresh mint and coriander leaves.",
                "प्याज को बिल्कुल पतले लच्छों में काट लें और ताज़े पुदीने व हरे धनिये के पत्ते अलग काटकर रखें।",
                "Uniform thin onion slices brown evenly instead of burning.", "पतला एक-सा कटा प्याज बराबर सुनहरा कुरकुरा भुनता है।",
                4, PrepStage.CHOP, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (तैयारी)",
                timingDetailEn = "4 min slicing & herb prep", timingDetailHi = "4 मिनट में प्याज व पुदीना काटें"
            ),
            CookingStep(
                4, "Soak saffron in warm milk", "गुनगुने दूध में केसर भिगोकर रखें",
                "Warm 3 tbsp milk slightly, drop a pinch of saffron strands into it, and set aside so golden color and aroma bloom.",
                "3 बड़ी चम्मच गुनगुने दूध में चुटकी भर केसर के धागे डालकर अलग रख दें ताकि सुनहरा रंग और खुशबू निकल आए।",
                "Warm milk extracts twice the color compared to cold milk.", "गुनगुने दूध में केसर का रंग और खुशबू तुरंत उभरती है।",
                2, PrepStage.MIX, R.drawable.img_step_syrup_milk,
                heatLevelEn = "No Flame (Infuse)", heatLevelHi = "बिना गैस (भिगोना)",
                timingDetailEn = "Steep 10+ min while cooking", timingDetailHi = "खाना बनाते समय दूध में भीगने दें"
            ),
            CookingStep(
                5, "Boil spiced water for rice", "चावल के लिए मसालेदार पानी उबालें",
                "Bring 6 cups water with 1.5 tsp salt, bay leaf, 2 cloves, and 1 cardamom to a vigorous rolling boil on high flame.",
                "बड़े भगोने में 6 कप पानी, 1.5 छोटी चम्मच नमक, तेजपत्ता, लौंग व इलायची डालकर तेज़ आंच पर अच्छा उबाल आने दें।",
                "Biryani rice water should taste pleasantly salty like sea water.", "पानी में हल्का तेज़ नमक रखें ताकि चावल फीके न लगें।",
                4, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "High Flame", heatLevelHi = "तेज़ आंच",
                timingDetailEn = "4 min to reach rolling boil", timingDetailHi = "4 मिनट में तेज़ उबाल आने दें"
            ),
            CookingStep(
                6, "Par-boil rice 80% & drain completely", "चावल को 80% उबालकर तुरंत छान लें",
                "Add soaked drained rice into boiling water and cook 6–7 minutes until 80% done (grain breaks with a tiny firm center). Drain into a colander immediately.",
                "उबलते पानी में भीगे चावल डालें और 6-7 मिनट (80% पकने तक) उबालें; दाना दबाने पर बीच में हल्की कसर रहे तभी छलनी में छान लें।",
                "Spread drained rice gently on a wide plate so steam escapes and cooking stops.", "छने चावल को बड़ी थाली में हल्का फैला दें ताकि ज़्यादा न गलें।",
                7, PrepStage.COOK_SIMMER, R.drawable.img_step_drain,
                heatLevelEn = "High Flame", heatLevelHi = "तेज़ आंच",
                timingDetailEn = "Boil 6–7 min (+1 min if hard), drain fast", timingDetailHi = "6-7 मिनट उबालें (कसर रहे तो 1m और) व छानें"
            ),
            CookingStep(
                7, "Fry onions crispy golden (Birista)", "प्याज को सुनहरा कुरकुरा तलें (बिरिस्ता)",
                "Heat 3 tbsp ghee/oil in a heavy pot on medium flame; fry sliced onions 6–7 minutes stirring often until deep golden crispy. Keep half aside for topping.",
                "भारी तले के बर्तन में घी/तेल गरम करें और कटे प्याज को मध्यम आंच पर 6-7 मिनट सुनहरा कुरकुरा भूनें। आधा प्याज सजाने के लिए अलग निकाल लें।",
                "Remove onions one shade lighter than dark brown—they darken as they cool.", "प्याज बहुत काला होने से पहले ही निकाल लें क्योंकि बाहर रखने पर रंग थोड़ा और गहरा होता है।",
                7, PrepStage.SPICE, R.drawable.img_step_fry_onion,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Fry 6–7 min stirring frequently", timingDetailHi = "6-7 मिनट चलाते हुए सुनहरा भूनें"
            ),
            CookingStep(
                8, "Temper spices & saute ginger-garlic", "खड़े मसाले व अदरक-लहसुन पेस्ट भूनें",
                "In the same pot with remaining onions, crackle cumin & cinnamon 20 sec, then stir in ginger-garlic paste and saute 1.5 minutes until raw smell vanishes.",
                "उसी बर्तन में बचे प्याज संग जीरा व दालचीनी 20 सेकंड चटकाएं, फिर अदरक-लहसुन पेस्ट डालकर 1.5 मिनट कच्ची महक जाने तक भूनें।",
                "Keep flame medium-low so ginger-garlic doesn't stick.", "आंच मध्यम-धीमी रखें ताकि अदरक-लहसुन तले में न चिपके।",
                2, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Medium-Low Flame", heatLevelHi = "मध्यम-धीमी आंच",
                timingDetailEn = "Saute 1.5–2 min until fragrant", timingDetailHi = "1.5-2 मिनट खुशबू आने तक भूनें"
            ),
            CookingStep(
                9, "Roast chopped veggies with dry spices", "सब्ज़ियों को मसालों के साथ 4 मिनट भूनें",
                "Toss in chopped vegetables, turmeric, red chilli, biryani masala, and salt; stir-roast on medium heat for 4 minutes so spices coat every piece.",
                "सारी कटी सब्ज़ियाँ, हल्दी, लाल मिर्च, बिरयानी मसाला और नमक डालकर मध्यम आंच पर 4 मिनट भूनें ताकि मसाले लिपट जाएं।",
                "Roasting veggies briefly seals their natural sweetness.", "मसालों संग 4 मिनट भूनने से सब्ज़ियों में स्वाद अंदर तक जाता है।",
                4, PrepStage.COOK_SIMMER, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Roast veggies 4 min", timingDetailHi = "4 मिनट मसाले के साथ भूनें"
            ),
            CookingStep(
                10, "Fold whisked curd & simmer veggies tender", "दही मिलाकर सब्ज़ियाँ नरम होने तक पकाएं",
                "Lower flame completely, stir in whisked curd smoothly for 1 minute, add 1/4 cup water, cover and cook 6 minutes until veggies are 85% tender.",
                "आंच बिल्कुल धीमी कर फेंटा दही 1 मिनट लगातार चलाकर मिलाएं, चौथाई कप पानी डालें और ढककर 6 मिनट सब्ज़ियाँ 85% गलने तक पकाएं।",
                "Whisk curd smooth beforehand and keep flame low so yogurt never splits!", "दही डालने से पहले आंच धीमी रखें वरना दही फट सकता है।",
                7, PrepStage.COOK_SIMMER, R.drawable.img_step_raita,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Cover & simmer 6–7 min", timingDetailHi = "6-7 मिनट ढककर धीमी आंच पर पकाएं"
            ),
            CookingStep(
                11, "Layer rice, birista, mint & saffron milk", "चावल, बिरिस्ता, पुदीना और केसर दूध की परत लगाएं",
                "Spread veggies evenly at the bottom, layer 80%-cooked rice on top, and scatter reserved fried onions, chopped mint, coriander, saffron milk, and 1 tbsp ghee.",
                "नीचे सब्ज़ियों की परत बराबर कर ऊपर से उबले चावल फैलाएं। ऊपर बचा भुना प्याज, पुदीना, धनिया, केसरिया दूध व 1 चम्मच घी डालें।",
                "Sprinkle 2 tbsp hot rice water around edges if gravy looks completely dry.", "मसाला सूखा लगे तो किनारों पर 2 चम्मच गरम पानी छिड़क दें।",
                3, PrepStage.MIX, R.drawable.img_dish_biryani,
                heatLevelEn = "Lowest Flame", heatLevelHi = "बिल्कुल धीमी आंच",
                timingDetailEn = "3 min neat layering", timingDetailHi = "3 मिनट में परत सजाएं"
            ),
            CookingStep(
                12, "Dum steam (8 min), rest 5 min & serve", "8 मिनट दम पकाएं, 5 मिनट बाद गरमागरम परोसें",
                "Seal lid tightly and steam on lowest flame for 8 minutes (place a flat tawa underneath to prevent scorching). Switch off heat, rest covered 5 minutes, fluff gently, and serve with raita!",
                "ढक्कन कसकर बंद कर बिल्कुल धीमी आंच पर 8 मिनट दम लगाएं (नीचे पुराना तवा रख दें)। फिर गैस बंद कर 5 मिनट ढका रखें, हल्के हाथ से मिलाकर रायते संग परोसें!",
                "Do not open lid during dum or the 5-minute rest!", "दम के 8 मिनट व रेस्ट के 5 मिनट तक ढक्कन न खोलें—तभी असली खुशबू बसी रहेगी।",
                13, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Lowest Dum (8m) -> Off (5m)", heatLevelHi = "धीमा दम (8m) -> बंद (5m)",
                timingDetailEn = "Dum 8 min + Rest 5 min -> Ready!", timingDetailHi = "8 मिनट दम + 5 मिनट रेस्ट — शाही बिरयानी तैयार!"
            )
        )
    ),
    Recipe(
        id = "jeera_rice",
        nameEn = "Jeera Rice",
        nameHi = "जीरा राइस",
        country = Country.INDIA,
        category = FoodCategory.BIRYANI_PULAO,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 12,
        cookMinutes = 15,
        defaultServings = 2,
        isPopular = true,
        descriptionEn = "Aromatic fluffy basmati rice tempered with crackling cumin seeds and bay leaf in pure ghee.",
        descriptionHi = "शुद्ध घी में चटकते जीरे और तेजपत्ते के तड़के से बने खिले-खिले और खुशबूदार जीरा राइस।",
        cookingTipEn = "Use a strict 1:2 ratio of rice to water when cooking in a covered pan.",
        cookingTipHi = "भगोने या पैन में पकाते समय 1 कप चावल के लिए ठीक 2 कप पानी डालें।",
        safetyTipEn = "Keep flame low when dropping cumin into hot ghee so it crackles gently without spluttering.",
        safetyTipHi = "गरम घी में जीरा डालते समय आंच धीमी रखें ताकि छींटे न उड़ें।",
        imageRes = R.drawable.img_dish_biryani,
        ingredients = listOf(
            Ingredient("Basmati Rice", "बासमती चावल", 1.0, "cup", "कप", true, themealdbIngredientUrl("Rice"), R.drawable.img_dish_biryani),
            Ingredient("Cumin Seeds (Jeera)", "साबुत जीरा", 1.5, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Cumin"), R.drawable.img_step_spices),
            Ingredient("Bay Leaf & Green Cardamom", "तेजपत्ता व हरी इलायची", 1.0, "each", "नग", true, null, R.drawable.img_step_spices),
            Ingredient("Desi Ghee", "देसी घी", 1.5, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Salt & Coriander", "नमक व हरा धनिया", 0.75, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Salt"), R.drawable.img_step_garnish_serve),
            Ingredient("Water", "पानी", 2.0, "cups", "कप", true, null, R.drawable.img_step_wash)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash basmati rice & soak 10 minutes", "चावल धोकर 10 मिनट भिगो दें",
                "Rinse basmati rice gently 2–3 times until water runs clear, then soak in clean water for 10 minutes.",
                "बासमती चावल को हल्के हाथ से 2-3 बार साफ पानी आने तक धोएं और 10 मिनट के लिए पानी में भिगो दें।",
                "Soaking lets rice cook evenly without breaking.", "10 मिनट भिगोने से चावल लंबा और मुलायम पकता है।",
                10, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Soak)", heatLevelHi = "बिना गैस (भिगोना)",
                timingDetailEn = "Soak 10 min before draining", timingDetailHi = "10 मिनट पानी में भिगोकर रखें"
            ),
            CookingStep(
                2, "Drain rice completely in a strainer", "चावल का सारा पानी छलनी में छान लें",
                "Pour soaked rice into a mesh strainer and let sit 2 minutes so no extra water clings to the grains.",
                "भीगे चावलों को छलनी में पलट दें और 2 मिनट रखें ताकि अतिरिक्त पानी पूरी तरह निकल जाए।",
                "Dry grains toast smoothly in ghee without clumping.", "पानी निथरने से चावल घी में चिपकता नहीं।",
                2, PrepStage.WASH, R.drawable.img_step_drain,
                heatLevelEn = "No Flame (Drain)", heatLevelHi = "बिना गैस (छानना)",
                timingDetailEn = "Drain 2 min cleanly", timingDetailHi = "2 मिनट छलनी में पानी निथरने दें"
            ),
            CookingStep(
                3, "Heat ghee & crackle cumin and bay leaf", "घी में जीरा व तेजपत्ता सुनहरा चटकाएं",
                "Warm ghee in a heavy pot on medium-low heat; add cumin seeds, bay leaf, and crushed cardamom and let sizzle 30–40 seconds until fragrant golden.",
                "पैन में धीमी-मध्यम आंच पर घी गरम करें; जीरा, तेजपत्ता व इलायची डालकर 30-40 सेकंड खुशबू आने तक सुनहरा चटकाएं।",
                "Never burn cumin black or the rice turns bitter.", "जीरा काला न होने दें, हल्का भूरा होते ही अगला कदम करें।",
                1, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Medium-Low Flame", heatLevelHi = "धीमी-मध्यम आंच",
                timingDetailEn = "Temper 30–40 sec", timingDetailHi = "30-40 सेकंड सुनहरा चटकाएं"
            ),
            CookingStep(
                4, "Toast drained rice gently in ghee", "चावल को घी में 2 मिनट हल्के से भूनें",
                "Add drained rice and stir gently from the edges for 2 minutes so every grain shines with ghee.",
                "छने चावल पैन में डालें और किनारों से हल्के हाथ से 2 मिनट चलाएं ताकि हर दाने पर घी की परत चढ़ जाए।",
                "Gentle folding keeps long soaked grains unbroken.", "हल्के हाथ से चलाएं ताकि भीगे हुए चावल टूटे नहीं।",
                2, PrepStage.MIX, R.drawable.img_dish_biryani,
                heatLevelEn = "Low-Medium Flame", heatLevelHi = "धीमी-मध्यम आंच",
                timingDetailEn = "Toast gently 2 min", timingDetailHi = "2 मिनट हल्के हाथ से भूनें"
            ),
            CookingStep(
                5, "Pour water & boil, then simmer covered", "पानी डालकर उबालें, फिर ढककर 8 मिनट पकाएं",
                "Pour 2 cups water and salt, bring to a rolling boil (2 min), then lower flame to minimum, cover tightly, and simmer 8 minutes until water absorbs completely.",
                "2 कप पानी व नमक डालकर तेज़ उबाल (2 मिनट) आने दें, फिर आंच बिल्कुल धीमी कर ढक्कन बंद करें और 8 मिनट पानी सूखने तक पकाएं।",
                "If moisture remains at 8 min, cook 2 more minutes covered.", "अगर पानी बचा दिखे तो ढककर 2 मिनट और पका लें।",
                10, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "High (2m) -> Lowest (8m)", heatLevelHi = "तेज़ (2m) -> बिल्कुल धीमी (8m)",
                timingDetailEn = "Boil 2 min, simmer covered 8 min", timingDetailHi = "2m उबाल + 8m ढककर धीमी आंच पर पकाएं"
            ),
            CookingStep(
                6, "Rest 4 minutes covered, fluff & serve", "गैस बंद कर 4 मिनट रखें, धनिया सजाकर परोसें",
                "Turn off heat and rest covered 4 minutes so top grains steam fully. Fluff gently with a fork, garnish fresh coriander, and serve with dal!",
                "गैस बंद कर बर्तन 4 मिनट ढका रखें। फिर कांटे से हल्के से खोलें, बारीक हरा धनिया सजाएं और दाल तड़का संग परोसें!",
                "Fork fluffing separates grains cleanly without mashing.", "कांटे से खोलने से चावल बिल्कुल खिले-खिले रहते हैं।",
                4, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off (Rest)", heatLevelHi = "गैस बंद (रेस्ट)",
                timingDetailEn = "Rest covered 4 min -> Ready!", timingDetailHi = "4 मिनट ढककर रखें — खुशबूदार जीरा राइस तैयार!"
            )
        )
    ),
    Recipe(
        id = "paneer_butter_masala",
        nameEn = "Paneer Butter Masala",
        nameHi = "पनीर बटर मसाला",
        country = Country.INDIA,
        category = FoodCategory.PANEER_VEG,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 15,
        cookMinutes = 25,
        defaultServings = 3,
        isPopular = true,
        isTrending = true,
        descriptionEn = "Rich, velvety tomato-cashew butter gravy cradling soft paneer cubes finished with cream and kasuri methi.",
        descriptionHi = "मुलायम पनीर के टुकड़ों और मक्खन-टमाटर-काजू की मखमली ग्रेवी वाला रेस्टोरेंट जैसा पनीर बटर मसाला।",
        cookingTipEn = "Soak cashews in warm water for 10 minutes and strain the blended puree for restaurant-silky gravy.",
        cookingTipHi = "काजू को 10 मिनट गुनगुने पानी में भिगोकर पीसने और ग्रेवी छानने से बिल्कुल होटल जैसा मखमली टेक्सचर आता है।",
        safetyTipEn = "Always let cooked tomatoes cool 5 minutes before blending so hot steam does not pop the mixer lid.",
        safetyTipHi = "गरम टमाटर-काजू को मिक्सी में पीसने से पहले 5 मिनट ठंडा जरूर होने दें।",
        imageRes = R.drawable.img_paneer_masala_1794638377530,
        ingredients = listOf(
            Ingredient("Fresh Paneer Cubes", "ताज़ा पनीर (क्यूब्स)", 250.0, "g", "ग्राम", true, null, R.drawable.img_paneer_masala_1794638377530),
            Ingredient("Ripe Red Tomatoes", "पके लाल टमाटर", 4.0, "medium", "मध्यम", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Onion & Garlic-Ginger", "प्याज व अदरक-लहसुन", 1.5, "medium", "मध्यम", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_chop),
            Ingredient("Whole Cashews", "साबुत काजू", 12.0, "pieces", "दाने", true, themealdbIngredientUrl("Cashews"), R.drawable.img_step_blend),
            Ingredient("Butter & Oil", "मक्खन व थोड़ा तेल", 2.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Butter"), R.drawable.img_dish_bread),
            Ingredient("Kashmiri Chilli, Sugar & Garam Masala", "कश्मीरी मिर्च, चुटकी चीनी व गरम मसाला", 1.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Fresh Cream & Kasuri Methi", "फ्रेश क्रीम व कसूरी मेथी", 2.5, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_raita)
        ),
        steps = listOf(
            CookingStep(
                1, "Soak cashews in warm water", "काजू को गुनगुने पानी में 10 मिनट भिगोएं",
                "Put 12 whole cashews in 1/4 cup warm water and soak for 10 minutes so they soften and grind silky smooth.",
                "चौथाई कप गुनगुने पानी में काजू 10 मिनट भिगोकर रखें ताकि वे नरम होकर चिकने पिसें।",
                "Warm water softens cashews twice as fast as cold water.", "गुनगुना पानी काजू को जल्दी मुलायम कर देता है।",
                2, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Soak)", heatLevelHi = "बिना गैस (भिगोना)",
                timingDetailEn = "Soak 10 min while prepping veggies", timingDetailHi = "कटिंग करते समय 10 मिनट भीगने दें"
            ),
            CookingStep(
                2, "Cube paneer & roughly chop onion-tomato", "पनीर काटें व टमाटर-प्याज मोटा काट लें",
                "Wash tomatoes, roughly chop tomatoes, onion, ginger, and garlic, and cut paneer into bite-sized 1-inch cubes.",
                "टमाटर धोकर प्याज, टमाटर, अदरक व लहसुन मोटा-मोटा काट लें और पनीर को 1 इंच के चौकोर टुकड़ों में काटें।",
                "Rough chopping is totally fine since the gravy base will be blended.", "ग्रेवी को आगे पीसना है इसलिए टमाटर-प्याज मोटे काट सकते हैं।",
                5, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "5 min prep", timingDetailHi = "5 मिनट में पनीर व सब्ज़ी काटें"
            ),
            CookingStep(
                3, "Boil tomato, onion, spices & cashews", "टमाटर, प्याज, खड़े मसाले व काजू 8 मिनट पकाएं",
                "Heat 1 tbsp butter in a pan; saute whole cardamom, bay leaf, onion, garlic, ginger, tomatoes, soaked cashews, and 1/2 cup water covered for 8 minutes until tomatoes turn mushy.",
                "पैन में 1 चम्मच मक्खन गरम कर इलायची, तेजपत्ता, प्याज, अदरक-लहसुन, टमाटर, भीगे काजू व आधा कप पानी डालें और ढककर 8 मिनट टमाटर गलने तक पकाएं।",
                "Remove the bay leaf before blending so puree stays bright.", "पीसने से पहले तेजपत्ता बाहर निकाल दें।",
                8, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Simmer covered 8 min until soft", timingDetailHi = "8 मिनट ढककर टमाटर पूरी तरह गलने तक पकाएं"
            ),
            CookingStep(
                4, "Cool mixture 5 minutes before blending", "मिश्रण को 5 मिनट ठंडा होने दें",
                "Turn off stove, spread cooked tomatoes on a plate, and let cool for 5 minutes until no hot steam rises.",
                "गैस बंद कर पके हुए टमाटर-काजू को प्लेट में फैलाकर 5 मिनट ठंडा होने दें ताकि भाप निकल जाए।",
                "Never blend boiling hot mix—pressure can splash hot puree.", "गरम मिश्रण को ठंडा किए बिना मिक्सी कभी न चलाएं।",
                5, PrepStage.MIX, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "Flame Off (Cool)", heatLevelHi = "गैस बंद (ठंडा)",
                timingDetailEn = "Cool 5 min safely", timingDetailHi = "5 मिनट भाप निकलने तक ठंडा करें"
            ),
            CookingStep(
                5, "Blend silky puree & strain through sieve", "चिकना पेस्ट पीसकर छलनी से छान लें",
                "Grind cooled mix into a fine velvety paste (add 2 tbsp water if thick), then press through a wire strainer into a bowl.",
                "ठंडे मिश्रण को मिक्सी में बारीक चिकना पीस लें और फिर छलनी से दबाते हुए छान लें ताकि बीज व छिलके अलग हो जाएं।",
                "Straining guarantees zero seeds or skins—true hotel smoothness!", "छानने से टमाटर के बीज व रेशे निकलकर बिल्कुल मखमली ग्रेवी बनती है।",
                3, PrepStage.MIX, R.drawable.img_step_blend,
                heatLevelEn = "No Flame (Blend & Strain)", heatLevelHi = "बिना गैस (पीसना व छानना)",
                timingDetailEn = "3 min blending & straining", timingDetailHi = "3 मिनट में पीसकर छान लें"
            ),
            CookingStep(
                6, "Melt butter & bloom Kashmiri chilli", "मक्खन में कश्मीरी लाल मिर्च का तड़का लगाएं",
                "In the same pan on LOW heat, melt 1.5 tbsp butter + 1 tsp oil; add Kashmiri chilli powder and coriander powder for 15 seconds for vibrant red color.",
                "धीमी आंच पर पैन में मक्खन व थोड़ा तेल गरम कर कश्मीरी लाल मिर्च और धनिया पाउडर डालें व 15 सेकंड खुशबू आने तक भूनें।",
                "1 tsp oil prevents butter from burning; low heat keeps chilli bright red.", "थोड़ा तेल मिलाने से मक्खन जलता नहीं और रंग सुंदर लाल आता है।",
                1, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Lowest Flame", heatLevelHi = "बिल्कुल धीमी आंच",
                timingDetailEn = "Bloom spices 15–20 sec", timingDetailHi = "15-20 सेकंड धीमी आंच पर भूनें"
            ),
            CookingStep(
                7, "Simmer makhani gravy until oil glistens", "मखनी ग्रेवी को 6 मिनट धीमी आंच पर पकाएं",
                "Pour strained puree, 1/2 cup warm water, salt, and 1/2 tsp sugar; cover partially and simmer on low flame for 6–7 minutes until thick and glossy.",
                "छनी प्यूरी, आधा कप गरम पानी, नमक व आधा चम्मच चीनी डालें; आधा ढक्कन रखकर धीमी आंच पर 6-7 मिनट गाढ़ी व चमकदार होने तक पकाएं।",
                "Partial lid catches gentle tomato splatters cleanly.", "छींटों से बचने के लिए आधा ढक्कन ढककर पकाएं।",
                7, PrepStage.COOK_SIMMER, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Simmer 6–7 min until glossy", timingDetailHi = "6-7 मिनट धीमी आंच पर उबालें"
            ),
            CookingStep(
                8, "Add paneer cubes & simmer 3 minutes", "पनीर के टुकड़े डालकर सिर्फ 3 मिनट पकाएं",
                "Gently slide in paneer cubes and garam masala; simmer on low heat for 3 minutes only so paneer absorbs flavor while staying pillowy soft.",
                "ग्रेवी में पनीर क्यूब्स व गरम मसाला मिलाएं और धीमी आंच पर सिर्फ 3 मिनट पकाएं ताकि पनीर नरम बना रहे।",
                "Overboiling paneer turns it rubbery.", "3 मिनट से ज़्यादा उबालने पर पनीर सख्त हो सकता है।",
                3, PrepStage.COOK_SIMMER, R.drawable.img_paneer_masala_1794638377530,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Simmer paneer 3 min only", timingDetailHi = "सिर्फ 3 मिनट धीमी आंच पर पकाएं"
            ),
            CookingStep(
                9, "Swirl cream & kasuri methi, rest & serve", "क्रीम व कसूरी मेथी मिलाएं, 2 मिनट बाद परोसें",
                "Turn off flame, swirl in fresh cream and palm-crushed kasuri methi, rest covered 2 minutes, garnish with cream swirl and serve hot with naan!",
                "गैस बंद कर फ्रेश क्रीम व हाथ से मसली कसूरी मेथी मिलाएं, 2 मिनट ढका रखें और गरमागरम नान या जीरा राइस संग परोसें!",
                "Crushing kasuri methi between warm palms releases intense aroma.", "हथेली से मसलकर कसूरी मेथी डालने से खुशबू दुगनी हो जाती है।",
                2, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off (Rest)", heatLevelHi = "गैस बंद (रेस्ट)",
                timingDetailEn = "Rest 2 min -> Ready!", timingDetailHi = "2 मिनट ढका रखें — मखमली पनीर बटर मसाला तैयार!"
            )
        )
    ),
    Recipe(
        id = "palak_paneer",
        nameEn = "Palak Paneer",
        nameHi = "पालक पनीर",
        country = Country.INDIA,
        category = FoodCategory.PANEER_VEG,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 14,
        cookMinutes = 18,
        defaultServings = 3,
        isPopular = true,
        descriptionEn = "Vibrant emerald-green spinach puree tempered with garlic, cumin, onions, and pillowy soft paneer cubes.",
        descriptionHi = "ताज़े हरे पालक, लहसुन-जीरे के तड़के और मुलायम पनीर से बनी पौष्टिक व स्वादिष्ट पालक पनीर।",
        cookingTipEn = "Plunge boiled spinach straight into ice-cold water (blanching) and simmer uncovered to keep bright emerald color!",
        cookingTipHi = "उबले पालक को तुरंत बर्फ जैसे ठंडे पानी में डालें और पकाते समय ढक्कन न लगाएं—रंग बिल्कुल हरा रहेगा।",
        safetyTipEn = "Use tongs or a slotted spoon to lift hot spinach out of boiling water safely.",
        safetyTipHi = "उबलते पानी से पालक निकालने के लिए बड़ी छलनी या चिमटे का प्रयोग करें।",
        imageRes = R.drawable.img_dish_curry_bowl,
        ingredients = listOf(
            Ingredient("Fresh Spinach Leaves (Palak)", "ताज़ा पालक", 300.0, "g", "ग्राम", true, themealdbIngredientUrl("Spinach"), R.drawable.img_step_wash),
            Ingredient("Paneer Cubes", "पनीर के टुकड़े", 200.0, "g", "ग्राम", true, null, R.drawable.img_paneer_masala_1794638377530),
            Ingredient("Onion & Tomato", "प्याज व टमाटर", 2.0, "small", "छोटे", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_chop),
            Ingredient("Garlic Cloves & Ginger", "लहसुन व अदरक", 6.0, "cloves", "कलियाँ", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_spices),
            Ingredient("Cumin, Garam Masala & Chilli", "जीरा, गरम मसाला व मिर्च", 1.5, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Cumin"), R.drawable.img_step_spices),
            Ingredient("Ghee, Butter or Cream", "घी, मक्खन या क्रीम", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_raita)
        ),
        steps = listOf(
            CookingStep(
                1, "Trim thick stems & wash spinach 3 times", "पालक के डंठल हटाकर 3 बार साफ धोएं",
                "Trim tough bottom stems, then swish spinach leaves in a deep bowl of fresh water 3 times so every trace of dirt settles.",
                "पालक की मोटी डंडियाँ अलग करें और खुले पानी के कटोरे में 3 बार डुबोकर धोएं ताकि सारी मिट्टी निकल जाए।",
                "Lift leaves out from top of water instead of pouring out, leaving grit behind.", "पत्तों को पानी से ऊपर से उठाएं ताकि मिट्टी नीचे ही रह जाए।",
                4, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Wash)", heatLevelHi = "बिना गैस (सफाई)",
                timingDetailEn = "4 min thorough wash", timingDetailHi = "4 मिनट में 3 बार साफ धोएं"
            ),
            CookingStep(
                2, "Blanch spinach strictly for 2–3 minutes", "उबलते पानी में पालक ठीक 2-3 मिनट उबालें",
                "Drop washed leaves into 4 cups boiling water (with a pinch of sugar) and boil uncovered for 2–3 minutes only until wilted.",
                "4 कप उबलते पानी में पालक डालें और बिना ढके ठीक 2-3 मिनट पत्ते नरम होने तक ही उबालें।",
                "Never boil longer than 3 minutes or spinach loses nutrients and turns dull olive.", "3 मिनट से ज़्यादा उबालने पर पालक का हरा रंग काला पड़ जाता है।",
                3, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "High Flame", heatLevelHi = "तेज़ आंच",
                timingDetailEn = "Boil strictly 2–3 min", timingDetailHi = "सिर्फ 2-3 मिनट ही उबालें"
            ),
            CookingStep(
                3, "Shock in ice-cold water & drain", "तुरंत ठंडे पानी में डालें और छान लें",
                "Lift hot spinach immediately into a bowl of chilled ice water for 2 minutes to halt cooking, then drain gently without squeezing all moisture.",
                "उबला पालक तुरंत ठंडे/बर्फ के पानी में 2 मिनट रखें और फिर छलनी से निकालकर हल्का निचोड़ लें।",
                "This temperature shock locks vibrant restaurant-green color!", "ठंडे पानी के झटके से पालक का गहरा हरा रंग लॉक हो जाता है।",
                2, PrepStage.MIX, R.drawable.img_step_drain,
                heatLevelEn = "No Flame (Shock)", heatLevelHi = "बिना गैस (ब्लांचिंग)",
                timingDetailEn = "Chill 2 min in cold water", timingDetailHi = "2 मिनट ठंडे पानी में रखकर निकालें"
            ),
            CookingStep(
                4, "Blend spinach with green chilli smooth", "हरी मिर्च के साथ चिकनी पालक प्यूरी पीसें",
                "Transfer chilled spinach, 1 green chilli, and a few coriander sprigs to a mixer jar and blend into a silky green puree.",
                "ठंडा पालक, 1 हरी मिर्च व थोड़ा हरा धनिया मिक्सी में डालकर बिल्कुल चिकना हरा पेस्ट पीस लें।",
                "Adding a handful of fresh coriander makes color even brighter.", "थोड़ा हरा धनिया साथ पीसने से रंग व खुशबू दोनों बढ़ते हैं।",
                2, PrepStage.MIX, R.drawable.img_step_blend,
                heatLevelEn = "No Flame (Blend)", heatLevelHi = "बिना गैस (पीसना)",
                timingDetailEn = "2 min smooth blending", timingDetailHi = "2 मिनट में चिकना पेस्ट बनाएं"
            ),
            CookingStep(
                5, "Chop onion, tomato, garlic & cube paneer", "प्याज, टमाटर, लहसुन काटें व पनीर टुकड़े करें",
                "Finely chop onion, tomato, garlic cloves, and ginger; cut paneer into neat cubes.",
                "प्याज, टमाटर, लहसुन व अदरक बारीक काट लें और पनीर के चौकोर टुकड़े काटकर तैयार रखें।",
                "Fine garlic gives strong aromatic punch in the tadka.", "बारीक कटा लहसुन पालक पनीर में जान डाल देता है।",
                4, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "4 min chopping", timingDetailHi = "4 मिनट में सब काट लें"
            ),
            CookingStep(
                6, "Temper cumin & garlic, cook onion-tomato", "जीरा-लहसुन भूनें व प्याज-टमाटर मसाला पकाएं",
                "Heat 1.5 tbsp ghee/oil, crackle cumin and golden-saute garlic 1 min; fry onion 3 min until translucent, then cook chopped tomato, turmeric & coriander powder 3 minutes until soft.",
                "कड़ाही में घी गरम कर जीरा व लहसुन 1 मिनट सुनहरा भूनें; फिर प्याज 3 मिनट और टमाटर, हल्दी व धनिया पाउडर डालकर 3 मिनट गलने तक पकाएं।",
                "Keep turmeric tiny (1/4 tsp) so gravy stays green rather than yellow.", "हल्दी बिल्कुल थोड़ी डालें ताकि पालक का हरा रंग फीका न हो।",
                7, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Saute masala 7 min until soft", timingDetailHi = "7 मिनट मसाला नरम होने तक भूनें"
            ),
            CookingStep(
                7, "Simmer spinach puree & paneer uncovered", "पालक प्यूरी व पनीर डालकर बिना ढके 4 मिनट पकाएं",
                "Pour green spinach puree, salt, and garam masala; stir 1 min, fold in paneer cubes, and simmer UNCOVERED on low flame for 4 minutes.",
                "हरी पालक प्यूरी, नमक व गरम मसाला मिलाएं; फिर पनीर के टुकड़े डालकर बिना ढक्कन लगाए धीमी आंच पर 4 मिनट पकाएं।",
                "Never cover with a lid now—steam traps acid and dulls the green color!", "इस समय ढक्कन न लगाएं वरना हरा रंग फीका पड़ सकता है।",
                5, PrepStage.COOK_SIMMER, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Low Flame (Uncovered)", heatLevelHi = "धीमी आंच (बिना ढके)",
                timingDetailEn = "Simmer uncovered 4–5 min", timingDetailHi = "बिना ढके 4-5 मिनट धीमी आंच पर उबालें"
            ),
            CookingStep(
                8, "Finish with butter/cream & serve hot", "मक्खन/क्रीम सजाएं और गरम रोटी संग परोसें",
                "Turn off heat, swirl in 1 tbsp butter or cream (optional roasted garlic tadka on top), and serve hot with tandoori roti or jeera rice!",
                "गैस बंद कर ऊपर से 1 चम्मच मक्खन या क्रीम मिलाएं और गरमागरम रोटी, नान या जीरा राइस संग परोसें!",
                "Optional: Drizzle 1 tsp ghee with crispy fried garlic right before serving!", "चाहें तो परोसने से पहले ऊपर 1 चम्मच लहसुन का तड़का डालें—स्वाद लाजवाब आएगा!",
                2, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off", heatLevelHi = "गैस बंद",
                timingDetailEn = "Garnish & serve hot -> Ready!", timingDetailHi = "तुरंत गरमागरम परोसें!"
            )
        )
    )
)
