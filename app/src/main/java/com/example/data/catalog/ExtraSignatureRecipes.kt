package com.example.data.catalog

import com.example.R
import com.example.data.model.*

val extraSignatureRecipes: List<Recipe> = listOf(
    Recipe(
        id = "chicken_biryani",
        nameEn = "Chicken Biryani",
        nameHi = "चिकन बिरयानी",
        country = Country.INDIA,
        category = FoodCategory.BIRYANI_PULAO,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = false,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 30,
        cookMinutes = 40,
        defaultServings = 4,
        isPopular = true,
        isTrending = true,
        descriptionEn = "Royal Hyderabadi-style layered dum biryani with juicy spiced chicken, saffron basmati rice, crispy birista, and mint.",
        descriptionHi = "केसरिया बासमती चावल, रसीले मसालेदार चिकन, सुनहरे बिरिस्ता प्याज और पुदीने की परत वाली शाही चिकन दम बिरयानी।",
        cookingTipEn = "Soak saffron strands in warm milk and par-boil rice strictly to 75% so final 25% cooks gently in chicken steam!",
        cookingTipHi = "चावल को सिर्फ 75% उबालकर छानें ताकि बाकी 25% चिकन की खुशबूदार भाप (दम) में खिला-खिला पके।",
        safetyTipEn = "Ensure chicken simmers thoroughly before layering and wash hands cleanly after handling raw chicken.",
        safetyTipHi = "कच्चा चिकन छूने के बाद हाथ साबुन से धोएं और चावल की परत लगाने से पहले चिकन अच्छे से पकने दें।",
        imageRes = R.drawable.img_dish_biryani,
        ingredients = listOf(
            Ingredient("Chicken (bone-in curry cut)", "चिकन के टुकड़े", 500.0, "g", "ग्राम", true, themealdbIngredientUrl("Chicken"), R.drawable.img_dish_naan_curry),
            Ingredient("Long-grain Basmati Rice", "लंबा बासमती चावल", 2.0, "cups", "कप", true, themealdbIngredientUrl("Rice"), R.drawable.img_dish_biryani),
            Ingredient("Onions (thinly sliced)", "पतले लंबे कटे प्याज", 3.0, "medium", "मध्यम", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_fry_onion),
            Ingredient("Fresh Curd, Mint & Coriander", "ताज़ा दही, पुदीना व धनिया", 0.5, "cup", "कप", true, themealdbIngredientUrl("Yogurt"), R.drawable.img_step_marinate),
            Ingredient("Ginger-Garlic Paste & Lemon Juice", "अदरक-लहसुन पेस्ट व नींबू रस", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_lemon),
            Ingredient("Biryani Masala & Whole Spices", "बिरयानी मसाला व खड़े मसाले", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Saffron Milk & Desi Ghee", "केसर दूध व देसी घी", 3.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Milk"), R.drawable.img_step_syrup_milk)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash chicken cleanly & drain dry", "चिकन धोकर पानी अच्छी तरह निथारें",
                "Wash curry-cut chicken pieces cleanly twice and let drain in a strainer for 5 minutes so extra water leaves.",
                "चिकन के टुकड़ों को 2 बार साफ धोएं और 5 मिनट छलनी में रखें ताकि सारा अतिरिक्त पानी निकल जाए।",
                "Patting chicken dry helps thick marinade cling tightly.", "चिकन सूखा रहने से मैरिनेशन की परत अच्छे से चिपकती है।",
                5, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Wash)", heatLevelHi = "बिना गैस (सफाई)",
                timingDetailEn = "5 min clean & drain", timingDetailHi = "5 मिनट में धोकर पानी निकालें"
            ),
            CookingStep(
                2, "Marinate chicken with curd, lemon & spices", "दही, नींबू, अदरक-लहसुन व मसालों से चिकन मैरिनेट करें",
                "Rub chicken with whisked curd, ginger-garlic paste, lemon juice, turmeric, chilli, biryani masala, half chopped mint, and salt; rest covered 25–30 minutes.",
                "चिकन में फेंटा दही, अदरक-लहसुन पेस्ट, नींबू रस, हल्दी, मिर्च, बिरयानी मसाला, थोड़ा पुदीना व नमक मिलाकर 25-30 मिनट ढककर मैरिनेट होने रखें।",
                "30-minute marination softens bone-in chicken deep inside.", "आधा घंटा रखने से मसालों का स्वाद चिकन के अंदर तक रच जाता है।",
                25, PrepStage.MIX, R.drawable.img_step_marinate,
                heatLevelEn = "No Flame (Marinate)", heatLevelHi = "बिना गैस (मैरिनेट)",
                timingDetailEn = "Marinate 25–30 min", timingDetailHi = "25-30 मिनट ढककर मैरिनेट रखें"
            ),
            CookingStep(
                3, "Wash & soak basmati rice 20 minutes", "बासमती चावल धोकर 20 मिनट भिगो दें",
                "While chicken marinates, rinse basmati rice gently 2 times and soak in clean water for 20 minutes.",
                "चिकन मैरिनेट होते समय बासमती चावल को हल्के हाथ से 2 बार धोकर 20 मिनट साफ पानी में भिगो दें।",
                "Handle rice gently so soaked long grains never snap.", "भीगे चावल को हल्के से छुएं ताकि दाने टूटें नहीं।",
                20, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Soak)", heatLevelHi = "बिना गैस (भिगोना)",
                timingDetailEn = "Soak 20 min", timingDetailHi = "20 मिनट पानी में भीगने दें"
            ),
            CookingStep(
                4, "Thinly slice onions & chop herbs", "प्याज के पतले लच्छे व पुदीना-धनिया काटें",
                "Slice 3 onions into thin, uniform strips for birista; chop fresh mint, coriander leaves, and slit 2 green chillies.",
                "3 प्याज को बिल्कुल पतले एक-समान लच्छों में काटें और ताज़ा पुदीना, हरा धनिया व हरी मिर्च तैयार कर लें।",
                "Separating onion rings with fingers ensures crisp even browning.", "प्याज के लच्छे हाथ से खोल लेने से वे बराबर कुरकुरे भुनते हैं।",
                5, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "5 min slicing", timingDetailHi = "5 मिनट में प्याज व हर्ब्स काटें"
            ),
            CookingStep(
                5, "Steep saffron strands in warm milk", "गुनगुने दूध में केसर भिगोकर रखें",
                "Warm 3 tbsp milk slightly, drop in a generous pinch of saffron strands, and set aside to turn bright golden.",
                "3 बड़ी चम्मच गुनगुने दूध में चुटकी भर केसर डालकर अलग रख दें ताकि सुनहरा रंग और सुगंध निकल आए।",
                "Saffron gives royal aroma and natural gold-and-white contrast.", "केसरिया दूध चावल पर शाही रंग व खुशबू लाता है।",
                2, PrepStage.MIX, R.drawable.img_step_syrup_milk,
                heatLevelEn = "No Flame (Infuse)", heatLevelHi = "बिना गैस (केसर)",
                timingDetailEn = "Steep while cooking", timingDetailHi = "पकाते समय दूध में भीगने दें"
            ),
            CookingStep(
                6, "Fry crispy golden onions (Birista)", "तेल-घी में प्याज को सुनहरा कुरकुरा तलें",
                "Heat 3 tbsp oil + 1 tbsp ghee in a heavy pot on medium flame; fry sliced onions stirring frequently for 7–8 minutes until crispy golden brown. Set half aside on tissue.",
                "भारी बर्तन में तेल व घी गरम कर मध्यम आंच पर प्याज को 7-8 मिनट चलाते हुए सुनहरा कुरकुरा भूनें; आधा बिरिस्ता प्लेट में निकाल लें।",
                "Crush a small pinch of cooled birista into chicken masala for sweet depth!", "थोड़ा भुना प्याज हाथ से मसलकर ग्रेवी में व बाकी परत में डालें।",
                8, PrepStage.SPICE, R.drawable.img_step_fry_onion,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Fry 7–8 min until crispy golden", timingDetailHi = "7-8 मिनट सुनहरा कुरकुरा भूनें"
            ),
            CookingStep(
                7, "Temper whole spices in same pot", "उसी बर्तन में साबुत गरम मसाले चटकाएं",
                "In the same pot with remaining onions and flavored oil, add bay leaf, shahi jeera, cinnamon, cloves, and green cardamoms for 30 seconds.",
                "बचे प्याज व खुशबूदार तेल में तेजपत्ता, शाही जीरा, दालचीनी, लौंग व इलायची डालकर 30 सेकंड चटकाएं।",
                "Onion-infused oil multiplies whole spice aroma instantly.", "बिरिस्ता वाले तेल में खड़े मसाले बहुत शानदार महक देते हैं।",
                1, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Medium-Low Flame", heatLevelHi = "मध्यम-धीमी आंच",
                timingDetailEn = "Temper 30 sec", timingDetailHi = "30 सेकंड खुशबू आने तक भूनें"
            ),
            CookingStep(
                8, "Sear marinated chicken on medium-high (4 min)", "मैरिनेटेड चिकन को 4 मिनट मध्यम-तेज़ आंच पर भूनें",
                "Slide marinated chicken into the pot, mix with spices, and saute uncovered on medium-high flame for 4 minutes until pieces turn opaque.",
                "मैरिनेटेड चिकन बर्तन में डालें और मध्यम-तेज़ आंच पर 4 मिनट चलाते हुए भूनें ताकि मसाले चिकन पर सैट हो जाएं।",
                "Brief initial sear seals juicy moisture inside each piece.", "शुरू में 4 मिनट भूनने से चिकन अंदर से नरम व रसीला रहता है।",
                4, PrepStage.COOK_SIMMER, R.drawable.img_dish_naan_curry,
                heatLevelEn = "Medium-High Flame", heatLevelHi = "मध्यम-तेज़ आंच",
                timingDetailEn = "Sear 4 min", timingDetailHi = "4 मिनट भूनें"
            ),
            CookingStep(
                9, "Simmer chicken covered until 80% tender", "ढककर चिकन को 10 मिनट (80%) पकाएं",
                "Lower flame, cover tightly, and simmer chicken in its yogurt gravy for 10 minutes (stirring once halfway) until 80% tender with a thick, glossy masala coating.",
                "आंच धीमी कर ढक्कन लगाएं और चिकन को दही के मसाले में 10 मिनट पकाएं जब तक चिकन 80% गल जाए और गाढ़ी ग्रेवी रह जाए।",
                "Keep a little thick masala at bottom—it fuels steam during Dum.", "तले में थोड़ी गाढ़ी ग्रेवी जरूर रहने दें ताकि दम के समय लगे नहीं।",
                10, PrepStage.COOK_SIMMER, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Low Flame (Covered)", heatLevelHi = "धीमी आंच (ढककर)",
                timingDetailEn = "Simmer 10 min (+2 min if thick bone cuts)", timingDetailHi = "10 मिनट ढककर पकाएं (मोटे पीस हों तो 2m और)"
            ),
            CookingStep(
                10, "Boil whole-spiced water for basmati rice", "चावल उबालने के लिए मसालेदार पानी गरम करें",
                "Meanwhile in a big pot, bring 6 cups water with 2 tsp salt, bay leaf, 2 cloves, 1 cardamom, and 1 tsp oil to a vigorous rolling boil.",
                "इस बीच बड़े भगोने में 6 कप पानी, 2 चम्मच नमक, तेजपत्ता, लौंग, इलायची व 1 चम्मच तेल डालकर तेज़ आंच पर उबाल लाएं।",
                "1 tsp oil in boiling water keeps long grains separate and glossy.", "पानी में 1 चम्मच तेल डालने से चावल आपस में बिल्कुल नहीं चिपकते।",
                4, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "High Flame", heatLevelHi = "तेज़ आंच",
                timingDetailEn = "4 min to rolling boil", timingDetailHi = "4 मिनट में तेज़ उबाल आने दें"
            ),
            CookingStep(
                11, "Par-boil rice strictly 75% & drain immediately", "चावल को ठीक 75% (6 मिनट) उबालकर छानें",
                "Drop soaked rice into boiling water and boil 6 minutes until 75% cooked (grain presses soft outside with a firm bite inside). Drain immediately through a colander.",
                "उबलते पानी में भीगे चावल डालें और 6 मिनट (75% पकने तक) उबालें; दाना बाहर से नरम व बीच में हल्का कड़ा रहे तभी छलनी में छान लें।",
                "Reserve 2 tbsp of this spiced boiling water before draining.", "छानते समय 2 चम्मच गरम चावल का पानी अलग कटोरी में बचा लें।",
                6, PrepStage.COOK_SIMMER, R.drawable.img_step_drain,
                heatLevelEn = "High Flame", heatLevelHi = "तेज़ आंच",
                timingDetailEn = "Boil 6 min (+1 min if hard), drain fast", timingDetailHi = "6 मिनट उबालें (+1m कसर हो तो) व तुरंत छानें"
            ),
            CookingStep(
                12, "Layer chicken, rice, birista, mint & saffron", "चिकन, चावल, बिरिस्ता, पुदीना व केसर दूध की परत लगाएं",
                "Spread chicken evenly at pot base, cover gently with steaming drained rice, drizzle saffron milk, 2 tbsp reserved rice water, 1 tbsp ghee, fried onions, mint, and coriander.",
                "नीचे चिकन ग्रेवी बराबर कर ऊपर गरम उबले चावल फैलाएं; ऊपर से केसरिया दूध, 2 चम्मच चावल का पानी, घी, तला प्याज, पुदीना व धनिया सजाएं।",
                "Layer immediately while rice is hot so Dum steam forms fast!", "चावल गरम रहते ही परत लगाएं ताकि तुरंत अंदर भाप बन जाए।",
                3, PrepStage.MIX, R.drawable.img_dish_biryani,
                heatLevelEn = "Lowest Flame", heatLevelHi = "बिल्कुल धीमी आंच",
                timingDetailEn = "3 min layering", timingDetailHi = "3 मिनट में परत सजाकर बंद करें"
            ),
            CookingStep(
                13, "Seal for Dum steam (12 min), rest 5 min & serve", "12 मिनट दम पर पकाएं, 5 मिनट बाद गरम परोसें",
                "Seal pot tightly with heavy lid (place flat tawa below pot to diffuse heat) and cook on LOWEST flame 12 minutes. Switch off stove, rest covered 5 minutes, scoop gently from the side, and serve with cool raita!",
                "ढक्कन कसकर बंद करें (बर्तन के नीचे पुराना तवा रखें) और बिल्कुल धीमी आंच पर 12 मिनट दम दें। फिर गैस बंद कर 5 मिनट ढका रखें, किनारे से निकालकर रायते संग परोसें!",
                "Scooping vertically from the side preserves white, saffron, and masala layers!", "किनारे से नीचे से ऊपर की ओर निकालने पर तीन रंग की बिरयानी सुंदर दिखती है!",
                17, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Lowest Dum (12m) -> Off (5m)", heatLevelHi = "धीमा दम (12m) -> बंद (5m)",
                timingDetailEn = "Dum 12 min + Rest 5 min -> Ready!", timingDetailHi = "12 मिनट दम + 5 मिनट रेस्ट — शाही चिकन बिरयानी तैयार!"
            )
        )
    )
)
