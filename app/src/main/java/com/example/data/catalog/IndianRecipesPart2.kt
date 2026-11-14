package com.example.data.catalog

import com.example.R
import com.example.data.model.*

val indianRecipesPart2: List<Recipe> = listOf(
    Recipe(
        id = "dal_tadka",
        nameEn = "Dal Tadka",
        nameHi = "दाल तड़का",
        country = Country.INDIA,
        category = FoodCategory.DAL_CURRY,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 15,
        cookMinutes = 20,
        defaultServings = 3,
        isPopular = true,
        isTrending = true,
        descriptionEn = "Comforting yellow toor lentils finished with a sizzling ghee, cumin, garlic, hing, and Kashmiri chilli tadka.",
        descriptionHi = "पीली अरहर दाल पर शुद्ध देसी घी, जीरा, लहसुन, हींग और कश्मीरी मिर्च का खुशबूदार ढाबा-स्टाइल तड़का।",
        cookingTipEn = "Add a pinch of hing (asafoetida) and always thin boiled dal with warm water, never cold water.",
        cookingTipHi = "तड़के में चुटकी भर हींग डालें और दाल पतली करने के लिए हमेशा गरम पानी ही मिलाएं।",
        safetyTipEn = "Let pressure cooker steam drop naturally for 5 minutes before unlocking the lid.",
        safetyTipHi = "कुकर की भाप अपने आप निकलने के बाद ही ढक्कन खोलें, सीटी जबरन न उठाएं।",
        imageRes = R.drawable.img_dish_curry_bowl,
        ingredients = listOf(
            Ingredient("Yellow Toor Dal (Arhar)", "पीली अरहर (तुअर) दाल", 1.0, "cup", "कप", true, themealdbIngredientUrl("Toor Dal"), R.drawable.img_step_wash),
            Ingredient("Onion & Ripe Tomato", "प्याज व पका टमाटर", 2.0, "medium", "मध्यम", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Garlic Cloves & Green Chilli", "लहसुन व हरी मिर्च", 5.0, "cloves", "कलियाँ", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_spices),
            Ingredient("Desi Ghee", "देसी घी", 2.5, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Turmeric, Cumin, Hing & Kashmiri Chilli", "हल्दी, जीरा, हींग व कश्मीरी मिर्च", 2.0, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Fresh Coriander", "ताज़ा हरा धनिया", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_garnish_serve)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash & soak yellow toor dal", "दाल को 3 बार धोकर 12 मिनट भिगोएं",
                "Rinse yellow toor dal 3 times rubbing gently until cloudy starch turns clear, then soak in clean water for 12–15 minutes and drain.",
                "अरहर दाल को 3 बार साफ पानी आने तक धोएं और 12-15 मिनट पानी में भिगोकर रखें, फिर छान लें।",
                "Soaking cuts boiling time in half and makes dal creamy.", "भिगोने से दाल जल्दी और बिल्कुल बराबर गलती है।",
                12, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Soak)", heatLevelHi = "बिना गैस (भिगोना)",
                timingDetailEn = "Soak 12–15 min before boiling", timingDetailHi = "उबालने से पहले 12-15 मिनट भिगोकर रखें"
            ),
            CookingStep(
                2, "Pressure cook dal (3 whistles)", "कुकर में 3 सीटी (10 मिनट) उबालें",
                "Add drained dal, 2.5 cups water, 1/2 tsp turmeric, salt, and 1 tsp ghee in a pressure cooker; cook 3 whistles on medium flame and let pressure release naturally (~5 min).",
                "कुकर में दाल, ढाई कप पानी, हल्दी, नमक व 1 चम्मच घी डालकर मध्यम आंच पर 3 सीटी (~10 मिनट) पकाएं और प्रेशर अपने आप निकलने दें।",
                "1 tsp ghee in the cooker prevents frothy dal from spurting through the whistle.", "1 चम्मच घी डालने से सीटी से पानी बाहर नहीं उफनता।",
                10, PrepStage.COOK_SIMMER, R.drawable.img_step_pressure_cook,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "3 whistles (~10 min) + 5 min steam release", timingDetailHi = "3 सीटी (10m) पकाएं व 5m भाप निकलने दें"
            ),
            CookingStep(
                3, "Mash dal & simmer to smooth consistency", "दाल मथकर गरम पानी संग 3 मिनट उबालें",
                "Open cooker, gently whisk or mash dal with the back of a ladle, add 1/2 cup warm water if too thick, and simmer 3 minutes on low flame.",
                "कुकर खोलकर चमचे से हल्का मथ लें। गाढ़ी दिखे तो आधा कप गरम पानी मिलाकर धीमी आंच पर 3 मिनट उबालें।",
                "Warm water blends smoothly without separating from dal.", "गरम पानी डालने से दाल व पानी अलग नहीं तैरते।",
                3, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Simmer 3 min", timingDetailHi = "3 मिनट धीमी आंच पर उबालें"
            ),
            CookingStep(
                4, "Finely chop onion, tomato, garlic & chillies", "प्याज, टमाटर, लहसुन, हरी मिर्च व धनिया काटें",
                "Finely chop onion, tomato, garlic cloves, slit green chilli, and fresh coriander leaves ready beside the stove.",
                "प्याज, टमाटर, लहसुन की कलियाँ, हरी मिर्च और ताज़ा हरा धनिया बारीक काटकर प्लेट में रखें।",
                "Finely minced garlic crisps golden in ghee in just 30 seconds.", "बारीक कटा लहसुन घी में बहुत बढ़िया सुगंध देता है।",
                4, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "4 min chopping", timingDetailHi = "4 मिनट में सब काट लें"
            ),
            CookingStep(
                5, "Fry ghee-jeera-garlic-hing tadka", "घी में जीरा, हींग, लहसुन व प्याज-टमाटर भूनें",
                "Heat 2 tbsp ghee in a small pan; crackle cumin seeds, pinch of hing, garlic, and dried red chilli 45 sec; add onion 2 min, then tomato until soft.",
                "छोटे पैन में 2 चम्मच घी गरम कर जीरा, चुटकी हींग, लहसुन व साबुत लाल मिर्च 45 सेकंड भूनें; फिर प्याज 2 मिनट और टमाटर नरम होने तक पकाएं।",
                "Keep flame low-medium so garlic turns golden, never burnt black.", "आंच धीमी-मध्यम रखें ताकि लहसुन सुनहरा रहे, जले नहीं।",
                4, PrepStage.SPICE, R.drawable.img_step_fry_onion,
                heatLevelEn = "Low-Medium Flame", heatLevelHi = "धीमी-मध्यम आंच",
                timingDetailEn = "Cook tadka 4 min", timingDetailHi = "4 मिनट में तड़का भूनें"
            ),
            CookingStep(
                6, "Fold tadka into simmering dal (2 min)", "तड़का दाल में मिलाकर 2 मिनट ढककर उबालें",
                "Pour sizzling tadka into the dal pot, stir gently, and simmer 2 minutes so flavors marry completely.",
                "गरम तड़का दाल में डालकर चलाएं और ढककर धीमी आंच पर 2 मिनट उबलने दें ताकि स्वाद पूरी दाल में समा जाए।",
                "Covering while simmering keeps garlic-hing aroma locked inside.", "ढककर 2 मिनट पकाने से तड़के की खुशबू उड़ती नहीं।",
                2, PrepStage.COOK_SIMMER, R.drawable.img_dish_curry_bowl,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Simmer 2 min", timingDetailHi = "2 मिनट ढककर उबालें"
            ),
            CookingStep(
                7, "Second Kashmiri chilli drizzle, rest & serve", "ऊपर कश्मीरी मिर्च का तड़का सजाकर परोसें",
                "Optional restaurant touch: warm 1 tsp ghee off-flame, stir 1/2 tsp Kashmiri chilli, drizzle over dal with coriander, rest 2 min, and serve hot with jeera rice!",
                "ऊपर से 1 चम्मच गुनगुने घी में कश्मीरी लाल मिर्च व हरा धनिया सजाएं, 2 मिनट ढककर रखें और जीरा राइस संग परोसें!",
                "Stir Kashmiri chilli off the flame so it stays bright crimson!", "गैस बंद कर कश्मीरी मिर्च डालने से रंग चमकदार लाल रहता है।",
                2, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off (Rest)", heatLevelHi = "गैस बंद (रेस्ट)",
                timingDetailEn = "Rest 2 min -> Ready!", timingDetailHi = "2 मिनट बाद ढाबा दाल तड़का तैयार!"
            )
        )
    ),
    Recipe(
        id = "rajma_masala",
        nameEn = "Rajma Masala",
        nameHi = "राजमा मसाला",
        country = Country.INDIA,
        category = FoodCategory.DAL_CURRY,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 15,
        cookMinutes = 40,
        defaultServings = 4,
        priorPrepNoteEn = "Requires soaking dried rajma overnight (8 hours) before cooking.",
        priorPrepNoteHi = "नोट: राजमा को बनाने से पहले रात भर (8 घंटे) पानी में भिगोना जरूरी है।",
        descriptionEn = "North Indian comfort classic of melt-in-mouth red kidney beans slow-simmered in thick onion-tomato masala.",
        descriptionHi = "उत्तर भारत का लोकप्रिय व्यंजन—गाढ़ी प्याज-टमाटर ग्रेवी में पका मक्खन जैसा नरम राजमा मसाला।",
        cookingTipEn = "Mash 1 tbsp of boiled rajma directly into the masala to create thick natural restaurant gravy.",
        cookingTipHi = "एक बड़ा चम्मच उबले राजमा को ग्रेवी में मसल देने से तरी गाढ़ी और स्वादिष्ट बनती है।",
        safetyTipEn = "Discard the overnight soaking water and rinse rajma fresh before boiling.",
        safetyTipHi = "राजमा भिगोने वाला पुराना पानी फेंक दें और साफ पानी से धोकर ही उबालें।",
        imageRes = R.drawable.img_dish_curry_bowl,
        ingredients = listOf(
            Ingredient("Overnight Soaked Red Rajma", "रात भर भीगा लाल राजमा", 1.0, "cup", "कप", true, themealdbIngredientUrl("Kidney Beans"), R.drawable.img_step_wash),
            Ingredient("Onions (finely chopped)", "बारीक कटे प्याज", 2.0, "medium", "मध्यम", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_fry_onion),
            Ingredient("Ripe Tomatoes (pureed)", "ताज़ा टमाटर प्यूरी", 3.0, "medium", "मध्यम", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_blend),
            Ingredient("Ginger-Garlic Paste", "अदरक-लहसुन पेस्ट", 1.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_spices),
            Ingredient("Rajma Masala, Cumin & Whole Spices", "राजमा मसाला, जीरा व खड़े मसाले", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Butter & Oil", "मक्खन व तेल", 2.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Butter"), R.drawable.img_dish_bread)
        ),
        steps = listOf(
            CookingStep(
                1, "Discard soak water & rinse swollen rajma", "भीगे राजमा का पुराना पानी फेंककर साफ धोएं",
                "Drain all overnight soaking water completely and rinse the plump soaked kidney beans twice in fresh running water.",
                "रात भर भीगे राजमा का पुराना पानी पूरी तरह फेंक दें और फूले हुए राजमा को साफ पानी से 2 बार धो लें।",
                "Discarding soak water improves digestion and taste.", "भीगा पानी फेंककर नया पानी लेने से राजमा हल्का व सुपाच्य रहता है।",
                3, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Wash)", heatLevelHi = "बिना गैस (सफाई)",
                timingDetailEn = "Rinse 3 min", timingDetailHi = "3 मिनट में साफ धो लें"
            ),
            CookingStep(
                2, "Pressure cook rajma with whole spices", "कुकर में खड़े मसालों संग 5-6 सीटी उबालें",
                "Place rajma in pressure cooker with 3 cups water, 1 tsp salt, bay leaf, and 1 black cardamom; cook 1 whistle high then 5 whistles on medium-low (~18 min).",
                "कुकर में राजमा, 3 कप पानी, नमक, तेजपत्ता व बड़ी इलायची डालें; तेज़ पर 1 फिर धीमी-मध्यम आंच पर 5 सीटी (लगभग 18 मिनट) उबालें।",
                "Black cardamom infuses smoky North Indian dhaba aroma while boiling.", "उबालते समय बड़ी इलायची डालने से बहुत बढ़िया खुशबू आती है।",
                18, PrepStage.COOK_SIMMER, R.drawable.img_step_pressure_cook,
                heatLevelEn = "High (1) -> Medium-Low (5 whistles)", heatLevelHi = "तेज़ (1) -> धीमी-मध्यम (5 सीटी)",
                timingDetailEn = "Cook ~18 min", timingDetailHi = "5-6 सीटी (लगभग 18 मिनट) पकाएं"
            ),
            CookingStep(
                3, "Natural steam release & softness check", "भाप अपने आप निकलने दें और दाना दबाकर जांचें",
                "Let cooker depressurize naturally (5–7 min), open lid, and press a bean between two fingers—it must mash smoothly. If firm, cook 2 more whistles.",
                "प्रेशर अपने आप निकलने दें (5-7 मिनट), फिर एक दाना उंगली से दबाकर जांचें—वह मक्खन जैसा दबना चाहिए वरना 2 सीटी और लगाएं।",
                "Keep the flavorful dark rajma boiling stock—never drain it!", "राजमा का उबला हुआ पानी फेंकें नहीं, यही ग्रेवी में स्वाद देगा।",
                6, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "Flame Off (Release)", heatLevelHi = "गैस बंद (प्रेशर रिलीज़)",
                timingDetailEn = "Release 5–7 min & test bean", timingDetailHi = "5-7 मिनट भाप निकलने दें व जांचें"
            ),
            CookingStep(
                4, "Finely chop onion & blend tomato puree", "प्याज बारीक काटें और टमाटर की प्यूरी पीसें",
                "Finely chop 2 onions and fresh coriander; blend 3 ripe tomatoes with 1 green chilli into a smooth puree.",
                "2 प्याज व हरा धनिया बारीक काट लें और 3 पके टमाटरों को 1 हरी मिर्च संग मिक्सी में पीसकर प्यूरी बना लें।",
                "Fresh tomato puree gives much deeper richness than watery chopped tomatoes.", "ताज़ी टमाटर प्यूरी से राजमा की तरी एकसार व गाढ़ी बनती है।",
                5, PrepStage.MIX, R.drawable.img_step_blend,
                heatLevelEn = "No Flame (Prep & Blend)", heatLevelHi = "बिना गैस (कटिंग व पीसना)",
                timingDetailEn = "5 min prep", timingDetailHi = "5 मिनट में प्याज-टमाटर तैयार करें"
            ),
            CookingStep(
                5, "Crackle cumin & slow-brown chopped onions", "तेल-घी में जीरा चटकाकर प्याज 7 मिनट सुनहरा भूनें",
                "Heat 2 tbsp oil/ghee in a kadhai, crackle 1 tsp cumin seeds, then saute chopped onions on medium flame for 7 minutes until deep golden brown.",
                "कड़ाही में तेल/घी गरम कर जीरा चटकाएं और बारीक कटा प्याज मध्यम आंच पर 7 मिनट गहरा सुनहरा भूरा होने तक भूनें।",
                "Golden onions make the curry glossy and sweet-savory.", "प्याज अच्छा सुनहरा भुनने पर ही राजमा का रंग व स्वाद खिलता है।",
                7, PrepStage.SPICE, R.drawable.img_step_fry_onion,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Brown onions 7 min", timingDetailHi = "7 मिनट सुनहरा भूरा भूनें"
            ),
            CookingStep(
                6, "Roast ginger-garlic paste 1.5 minutes", "अदरक-लहसुन पेस्ट को 1.5 मिनट भूनें",
                "Add ginger-garlic paste and stir continuously for 1.5 minutes until raw smell disappears completely.",
                "अदरक-लहसुन पेस्ट डालकर लगातार चलाते हुए 1.5 मिनट कच्ची महक जाने तक भूनें।",
                "Stir continuously so garlic doesn't stick to the pan base.", "लगातार चलाते रहें ताकि पेस्ट तले में न चिपके।",
                2, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Medium-Low Flame", heatLevelHi = "मध्यम-धीमी आंच",
                timingDetailEn = "Roast 1.5–2 min", timingDetailHi = "1.5-2 मिनट अच्छी तरह भूनें"
            ),
            CookingStep(
                7, "Cook tomato puree & spices till oil shines", "टमाटर प्यूरी और राजमा मसाला तेल छूटने तक भूनें",
                "Pour tomato puree, turmeric, Kashmiri chilli, coriander powder, and 1.5 tbsp rajma masala; cook 6–7 minutes stirring often until thick and oil glisten on edges.",
                "टमाटर प्यूरी, हल्दी, कश्मीरी मिर्च, धनिया व राजमा मसाला डालें; बीच में चलाते हुए 6-7 मिनट किनारों पर तेल चमकने तक भूनें।",
                "Well-roasted tomato puree never tastes tangy or raw.", "तेल अलग होने तक भूनने से ग्रेवी में कच्चा स्वाद नहीं रहता।",
                7, PrepStage.COOK_SIMMER, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Medium-Low Flame", heatLevelHi = "मध्यम-धीमी आंच",
                timingDetailEn = "Roast masala 6–7 min", timingDetailHi = "6-7 मिनट तेल छूटने तक पकाएं"
            ),
            CookingStep(
                8, "Add boiled rajma with stock & mash 1 tbsp", "उबला राजमा व पानी डालें और थोड़ा मसल दें",
                "Pour boiled rajma along with its cooking stock into the masala; mash about 1 tbsp of beans against the kadhai wall to thicken the gravy naturally.",
                "उबला राजमा उसके पानी सहित कड़ाही में पलट दें; 1 बड़ा चम्मच राजमा चमचे से किनारे पर मसल दें ताकि ग्रेवी गाढ़ी हो जाए।",
                "Add 1/2 cup extra hot water if gravy looks too thick before simmering.", "अगर ग्रेवी बहुत गाढ़ी दिखे तो आधा कप गरम पानी मिला लें।",
                2, PrepStage.MIX, R.drawable.img_step_boil_pot,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Combine & mash 2 min", timingDetailHi = "2 मिनट अच्छे से मिलाएं व मसलें"
            ),
            CookingStep(
                9, "Simmer covered 10–12 minutes on low flame", "ढककर धीमी आंच पर 10-12 मिनट गाढ़ा पकाएं",
                "Cover kadhai and simmer on LOW heat for 10–12 minutes stirring twice so beans soak up spices completely and gravy turns rich velvety.",
                "कड़ाही ढक दें और धीमी आंच पर 10-12 मिनट पकाएं (बीच में 2 बार चलाएं) ताकि राजमा मसाले सोख ले और तरी गाढ़ी हो जाए।",
                "Slow simmering binds kidney beans and gravy as one cohesive curry.", "धीमी आंच पर उबालने से राजमा और तरी अलग-अलग नहीं रहते।",
                11, PrepStage.COOK_SIMMER, R.drawable.img_dish_curry_bowl,
                heatLevelEn = "Low Flame (Covered)", heatLevelHi = "धीमी आंच (ढककर)",
                timingDetailEn = "Simmer 10–12 min", timingDetailHi = "10-12 मिनट ढककर धीमी आंच पर पकाएं"
            ),
            CookingStep(
                10, "Swirl butter & garam masala, rest & serve", "मक्खन व गरम मसाला मिलाएं, 5 मिनट बाद परोसें",
                "Turn off heat, swirl in 1 tbsp butter, 1/2 tsp garam masala, and fresh coriander; rest covered 5 minutes and serve steaming hot over jeera or plain basmati rice!",
                "गैस बंद कर 1 चम्मच मक्खन, गरम मसाला व ताज़ा धनिया डालें। 5 मिनट ढका रखें और गरमागरम चावल संग परोसें!",
                "Gravy thickens even more during the 5-minute rest!", "5 मिनट रखने से तरी और गाढ़ी व मखमली हो जाती है!",
                5, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off (Rest)", heatLevelHi = "गैस बंद (रेस्ट)",
                timingDetailEn = "Rest 5 min -> Ready!", timingDetailHi = "5 मिनट ढककर रखें — पंजाबी राजमा-चावल तैयार!"
            )
        )
    ),
    Recipe(
        id = "pav_bhaji",
        nameEn = "Pav Bhaji",
        nameHi = "पाव भाजी",
        country = Country.INDIA,
        category = FoodCategory.STREET_FOOD,
        mealTimes = listOf(MealTime.SNACKS, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 16,
        cookMinutes = 26,
        defaultServings = 3,
        isPopular = true,
        isTrending = true,
        descriptionEn = "Mumbai street-style buttery spiced vegetable mash served sizzling hot with toasted masala pav, onion, and lemon.",
        descriptionHi = "मुंबई की मशहूर चटपटी मक्खन वाली भाजी और तवे पर मसालेदार सिके मुलायम पाव।",
        cookingTipEn = "Boil 2 small slices of beetroot along with the veggies for vibrant red street color without artificial food dye!",
        cookingTipHi = "सब्ज़ियों के साथ थोड़ा चुकंदर उबालने से बिना किसी नकली रंग के बाज़ार जैसा सुंदर लाल रंग आता है।",
        safetyTipEn = "Lower flame completely before mashing hot bhaji so splatters don't touch your hands.",
        safetyTipHi = "भाजी मैश करते समय गैस धीमी रखें ताकि गरम छींटे हाथ पर न पड़ें।",
        imageRes = R.drawable.img_dish_naan_curry,
        ingredients = listOf(
            Ingredient("Soft Pav Buns", "पाव बन्स", 6.0, "pieces", "नग", true, themealdbIngredientUrl("Bread"), R.drawable.img_dish_bread),
            Ingredient("Potatoes, Peas, Cauliflower & Beetroot", "आलू, मटर, गोभी व थोड़ा चुकंदर", 2.5, "cups", "कप", true, themealdbIngredientUrl("Potatoes"), R.drawable.img_step_chop),
            Ingredient("Ripe Tomatoes, Onion & Capsicum", "टमाटर, प्याज व शिमला मिर्च", 2.5, "cups", "कप", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Ginger-Garlic Paste", "अदरक-लहसुन पेस्ट", 1.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_spices),
            Ingredient("Pav Bhaji Masala & Kashmiri Chilli", "पाव भाजी मसाला व कश्मीरी मिर्च", 2.5, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Amul Butter, Lemon & Coriander", "मक्खन, नींबू व धनिया", 4.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Butter"), R.drawable.img_step_lemon)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash, peel & chop veggies for boiling", "आलू, गोभी, मटर व चुकंदर धोकर काटें",
                "Peel potatoes and beetroot; wash potatoes, cauliflower florets, green peas, and 2 slices of beetroot, then chop roughly.",
                "आलू व चुकंदर छीलें; आलू, फूलगोभी, हरी मटर व चुकंदर के 2 टुकड़े धोकर मोटा-मोटा काट लें।",
                "Beetroot gives rich restaurant red hue naturally!", "थोड़ा चुकंदर डालने से भाजी का रंग बिल्कुल बाज़ार जैसा लाल होता है।",
                5, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (सफाई)",
                timingDetailEn = "5 min washing & peeling", timingDetailHi = "5 मिनट में सब्ज़ियाँ तैयार करें"
            ),
            CookingStep(
                2, "Pressure cook veggies soft (3 whistles)", "कुकर में 3 सीटी (10 मिनट) नरम उबालें",
                "Boil cut veggies in cooker with 1.5 cups water and 1/2 tsp salt for 3 whistles (10 min) until super soft; let pressure release naturally.",
                "कुकर में कटी सब्ज़ियाँ, डेढ़ कप पानी व आधा चम्मच नमक डालकर 3 सीटी (10 मिनट) बिल्कुल नरम उबालें और भाप निकलने दें।",
                "Keep any leftover beetroot-pink stock for thinning the bhaji later!", "कुकर का रंगीन पानी फेंकें नहीं, भाजी में यही उपयोग होगा।",
                10, PrepStage.COOK_SIMMER, R.drawable.img_step_pressure_cook,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "3 whistles (~10 min)", timingDetailHi = "3 सीटी (10 मिनट) नरम उबालें"
            ),
            CookingStep(
                3, "Finely dice onion, capsicum, tomato & coriander", "प्याज, शिमला मिर्च, टमाटर व धनिया बारीक काटें",
                "While veggies boil, finely dice onions (reserve 1/4 for garnish), green capsicum, tomatoes, and fresh coriander.",
                "सब्ज़ियाँ उबलने के दौरान प्याज, शिमला मिर्च, टमाटर व हरा धनिया बिल्कुल बारीक काट लें (थोड़ा प्याज परोसने के लिए अलग रखें)।",
                "Fine capsicum melts smoothly into the tawa masala.", "बारीक कटी शिमला मिर्च जल्दी पककर भाजी में घुल जाती है।",
                5, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "5 min fine dicing", timingDetailHi = "5 मिनट में बारीक कटिंग करें"
            ),
            CookingStep(
                4, "Saute onion & capsicum in butter", "मक्खन में प्याज और शिमला मिर्च 4 मिनट भूनें",
                "Melt 2 tbsp butter + 1 tsp oil on a wide pan/tawa; saute chopped onions 2 min until translucent, then add capsicum and cook 2 minutes until soft.",
                "चौड़े पैन या तवे पर 2 चम्मच मक्खन व 1 चम्मच तेल गरम करें; प्याज 2 मिनट भूनें, फिर शिमला मिर्च डालकर 2 मिनट नरम होने तक पकाएं।",
                "Adding 1 tsp oil keeps butter from smoking.", "थोड़ा तेल डालने से मक्खन जलता नहीं है।",
                4, PrepStage.SPICE, R.drawable.img_step_fry_onion,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Saute 4 min", timingDetailHi = "4 मिनट नरम होने तक भूनें"
            ),
            CookingStep(
                5, "Cook ginger-garlic paste 1 minute", "अदरक-लहसुन पेस्ट डालकर 1 मिनट भूनें",
                "Stir in 1 tbsp ginger-garlic paste and saute 1 minute until pungent raw aroma vanishes.",
                "अदरक-लहसुन पेस्ट डालें और 1 मिनट लगातार चलाते हुए कच्ची महक जाने तक भूनें।",
                "Garlic flavor is a huge hallmark of authentic Mumbai bhaji.", "लहसुन की खुशबू से भाजी में असली स्ट्रीट-स्टाइल टेस्ट आता है।",
                1, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "1 min saute", timingDetailHi = "1 मिनट अच्छी तरह भूनें"
            ),
            CookingStep(
                6, "Cook tomatoes, pav bhaji masala & chilli", "टमाटर व पाव भाजी मसाला गलने तक पकाएं",
                "Add tomatoes, 2 tbsp pav bhaji masala, 1 tsp Kashmiri chilli, and salt; mash and cook 4–5 minutes until tomatoes melt and butter separates.",
                "टमाटर, पाव भाजी मसाला, कश्मीरी लाल मिर्च व नमक डालें; चमचे से दबाते हुए 4-5 मिनट टमाटर गलने व मक्खन छूटने तक भूनें।",
                "Roasting pav bhaji masala directly with tomatoes deepens flavor.", "टमाटर संग मसाला भूनने से कच्चापन पूरी तरह हट जाता है।",
                5, PrepStage.COOK_SIMMER, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Medium-Low Flame", heatLevelHi = "मध्यम-धीमी आंच",
                timingDetailEn = "Cook 4–5 min until soft", timingDetailHi = "4-5 मिनट टमाटर गलने तक पकाएं"
            ),
            CookingStep(
                7, "Mash boiled veggies completely smooth", "उबली सब्ज़ियों को मैशर से बिल्कुल चिकना मसलें",
                "Lower flame, add boiled veggies into the pan, and mash thoroughly with a potato masher for 3 minutes until zero chunky pieces remain.",
                "आंच धीमी कर उबली सब्ज़ियाँ पैन में डालें और मैशर से 3 मिनट लगातार मसलें ताकि सब एकसार मखमली बन जाए।",
                "Remove any beetroot skin if visible before mashing completely.", "चुकंदर व सारी सब्ज़ियाँ एक साथ चिकनी मैश हो जानी चाहिए।",
                3, PrepStage.MIX, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Mash smooth for 3 min", timingDetailHi = "3 मिनट अच्छे से मैश करें"
            ),
            CookingStep(
                8, "Simmer bhaji with warm water & butter (5 min)", "गरम पानी व मक्खन डालकर भाजी 5 मिनट पकाएं",
                "Pour 1/2 to 3/4 cup warm water/cooker stock to reach creamy scoopable consistency, add 1 tbsp butter, and simmer 5 minutes stirring often.",
                "आधा से पौना कप गरम पानी डालकर मनपसंद गाढ़ापन रखें, 1 चम्मच मक्खन मिलाएं और धीमी आंच पर 5 मिनट उबालें।",
                "Finish bhaji with half a squeezed lemon and fresh coriander!", "अंत में आधा नींबू व हरा धनिया मिलाने से भाजी चटपटी खिलती है।",
                5, PrepStage.COOK_SIMMER, R.drawable.img_dish_curry_bowl,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Simmer 5 min", timingDetailHi = "5 मिनट धीमी आंच पर पकाएं"
            ),
            CookingStep(
                9, "Slit & toast butter-masala pav on tawa", "तवे पर मक्खन-मसाले संग पाव कुरकुरे सेंकें",
                "Slit pav buns horizontally like a book; melt 1 tbsp butter + pinch of pav bhaji masala & coriander on tawa, and press pav open-side down 2 min per side until toasted golden.",
                "पाव को बीच से काटें; तवे पर 1 चम्मच मक्खन, चुटकी पाव भाजी मसाला व धनिया डालकर पाव को दोनों तरफ से 2-2 मिनट सुनहरा सेंकें।",
                "Press lightly with a spatula so pav soaks up spicy butter.", "कड़छी से हल्का दबाकर सेंकने से पाव नरम व मसालेदार बनते हैं।",
                3, PrepStage.COOK_SIMMER, R.drawable.img_step_tawa_roast,
                heatLevelEn = "Medium-Low Tawa", heatLevelHi = "मध्यम-धीमा तवा",
                timingDetailEn = "Toast 2–3 min per batch", timingDetailHi = "हर बैच 2-3 मिनट सेंकें"
            ),
            CookingStep(
                10, "Top butter pat, onion, lemon & serve hot", "मक्खन, कटा प्याज व नींबू सजाकर तुरंत परोसें",
                "Ladle piping hot bhaji into plates, crown with a generous butter cube, and serve alongside buttered masala pav, raw onion, and lemon wedges!",
                "गरमागरम भाजी पर मक्खन का टुकड़ा रखें और मसालेदार पाव, बारीक कटे प्याज व नींबू की फांक संग तुरंत परोसें!",
                "One final squeeze of fresh lemon on hot bhaji brings everything alive!", "खाने से ठीक पहले ऊपर ताज़ा नींबू निचोड़ें — लाजवाब स्वाद!",
                2, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Serve Hot", heatLevelHi = "गरमागरम परोसें",
                timingDetailEn = "Serve immediately -> Ready!", timingDetailHi = "तुरंत गरमागरम परोसें!"
            )
        )
    ),
    Recipe(
        id = "samosa",
        nameEn = "Crispy Punjabi Samosa",
        nameHi = "खस्ता पंजाबी समोसा",
        country = Country.INDIA,
        category = FoodCategory.STREET_FOOD,
        mealTimes = listOf(MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 30,
        cookMinutes = 20,
        defaultServings = 4,
        descriptionEn = "Flaky blister-free golden pastry triangles stuffed with spiced mashed potatoes, peas, and crushed coriander.",
        descriptionHi = "हलवाई जैसी खस्ता मैदे की परत और चटपटे आलू-मटर-धनिया की भरावन से बने गरमागरम पंजाबी समोसे।",
        cookingTipEn = "Rub melted ghee thoroughly into flour (Moyyan) and fry ONLY in warm low-heat oil for crisp blister-free crust!",
        cookingTipHi = "मैदे में घी का मोयन अच्छे से मसलें और हमेशा हल्के गरम तेल में धीमी आंच पर तलें—समोसे बिल्कुल खस्ता बनेंगे।",
        safetyTipEn = "Lower shaped samosas gently from the edge of the kadhai so warm oil does not splash.",
        safetyTipHi = "कड़ाही के किनारे से धीरे-धीरे समोसे डालें ताकि गरम तेल के छींटे न उड़ें।",
        imageRes = R.drawable.img_step_chutney_dip,
        ingredients = listOf(
            Ingredient("All-Purpose Flour (Maida)", "मैदा", 2.0, "cups", "कप", true, themealdbIngredientUrl("Plain Flour"), R.drawable.img_step_knead_roll),
            Ingredient("Boiled Potatoes (cooled)", "ठंडे उबले आलू", 4.0, "medium", "मध्यम", true, themealdbIngredientUrl("Potatoes"), R.drawable.img_step_chop),
            Ingredient("Green Peas", "हरी मटर", 0.5, "cup", "कप", true, themealdbIngredientUrl("Peas"), R.drawable.img_step_wash),
            Ingredient("Ajwain, Crushed Coriander & Fennel", "अजवाइन, कुटा साबुत धनिया व सौंफ", 2.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Amchur, Ginger, Chilli & Garam Masala", "अमचूर, अदरक, मिर्च व गरम मसाला", 2.0, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Ghee (for Moyyan) & Oil (for frying)", "घी (मोयन) व तलने का तेल", 4.0, "tbsp", "बड़ी चम्मच", false, null, R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Rub ghee & ajwain into flour (Moyyan)", "मैदे में घी, नमक व अजवाइन का मोयन लगाएं",
                "Mix 2 cups maida, 1/2 tsp salt, and 1/2 tsp crushed ajwain; rub 4 tbsp melted ghee into flour with fingertips for 2 min until it holds shape when pressed in a fist.",
                "2 कप मैदे में नमक व हाथ से मसली अजवाइन डालें; 4 बड़ी चम्मच पिघला घी डालकर 2 मिनट अच्छे से रगड़ें जब तक मुट्ठी बांधने पर आटा बंधने न लगे।",
                "This crumbly 'Moyyan' test guarantees flaky, crisp pastry.", "मुट्ठी बंधने का मतलब मोयन बिल्कुल सही है—समोसे खस्ता बनेंगे।",
                3, PrepStage.MIX, R.drawable.img_step_spices,
                heatLevelEn = "No Flame (Moyyan)", heatLevelHi = "बिना गैस (मोयन)",
                timingDetailEn = "Rub 2–3 min until crumbly", timingDetailHi = "2-3 मिनट अच्छे से मोयन मसलें"
            ),
            CookingStep(
                2, "Knead stiff tight dough & rest 20 min", "थोड़े पानी से सख्त आटा गूंथकर 20 मिनट रखें",
                "Sprinkle cold water 1 tbsp at a time and knead a very STIFF, tight dough (not soft like roti!). Cover with a damp cloth and rest 20 minutes.",
                "थोड़ा-थोड़ा पानी छिड़ककर रोटी से काफी सख्त (कड़ा) आटा गूंथें और हल्के गीले कपड़े से ढककर 20 मिनट आराम के लिए रखें।",
                "Tight dough + 20 min rest prevents oil blisters and shrinking when rolling.", "सख्त आटा व 20 मिनट रेस्ट से बेलते समय मैदा सिकुड़ता नहीं।",
                20, PrepStage.MIX, R.drawable.img_step_knead_roll,
                heatLevelEn = "No Flame (Rest)", heatLevelHi = "बिना गैस (रेस्ट)",
                timingDetailEn = "Knead 4 min + Rest 20 min", timingDetailHi = "गूंथकर 20 मिनट ढककर रखें"
            ),
            CookingStep(
                3, "Coarsely crush coriander, fennel & cumin", "साबुत धनिया, सौंफ व जीरा दरदरा कूटें",
                "In a mortar-pestle, coarsely crush 1 tbsp coriander seeds, 1 tsp fennel (saunf), and 1/2 tsp cumin seeds.",
                "खल-बत्ते में 1 बड़ी चम्मच साबुत धनिया, 1 छोटी चम्मच सौंफ और आधा चम्मच जीरा दरदरा कूट लें।",
                "Coarsely crushed whole spices give authentic halwai aroma!", "दरदरे कुटे खड़े मसाले समोसे की स्टफिंग में असली हलवाई स्वाद लाते हैं।",
                2, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "No Flame (Crush)", heatLevelHi = "बिना गैस (कूटना)",
                timingDetailEn = "2 min crushing", timingDetailHi = "2 मिनट में दरदरा कूटें"
            ),
            CookingStep(
                4, "Peel & crumble cooled boiled potatoes", "ठंडे उबले आलू छीलकर मोटे टुकड़ों में तोड़ें",
                "Peel cooled boiled potatoes and break roughly with fingers into chunky pieces (never mash into smooth paste).",
                "ठंडे उबले आलू छीलकर हाथ से दरदरे मोटे टुकड़ों में तोड़ लें (चिकना भरता न बनाएं)।",
                "Chunky pieces keep samosa filling tasty instead of gummy.", "थोड़े दरदरे टुकड़े भरावन को स्वादिष्ट और खिला रखते हैं।",
                3, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (तैयारी)",
                timingDetailEn = "3 min breaking potatoes", timingDetailHi = "3 मिनट में आलू तोड़ लें"
            ),
            CookingStep(
                5, "Saute crushed spices, ginger & green peas", "कुटे मसाले, अदरक, हरी मिर्च व मटर भूनें",
                "Heat 1.5 tbsp oil on medium heat; sizzle crushed coriander-fennel, grated ginger, and green chilli 30 sec, then add peas and cook 2 minutes until tender.",
                "कड़ाही में तेल गरम कर कुटा धनिया-सौंफ, अदरक व हरी मिर्च 30 सेकंड भूनें, फिर हरी मटर डालकर 2 मिनट नरम होने तक पकाएं।",
                "Add a pinch of hing for wonderful digestive flavor.", "चुटकी हींग डालने से स्वाद व सुपाच्यता दोनों बढ़ते हैं।",
                3, PrepStage.SPICE, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Saute 3 min", timingDetailHi = "3 मिनट मसाले व मटर भूनें"
            ),
            CookingStep(
                6, "Roast potato masala & cool completely", "आलू मसाला 3 मिनट भूनकर पूरी तरह ठंडा करें",
                "Toss in crumbled potatoes, turmeric, red chilli, amchur, garam masala, and salt; roast 3 minutes, fold coriander, and spread on a plate to cool completely.",
                "आलू, हल्दी, लाल मिर्च, अमचूर, गरम मसाला व नमक डालकर 3 मिनट भूनें; हरा धनिया मिलाकर प्लेट में पूरी तरह ठंडा होने के लिए फैलाएं।",
                "Hot filling creates steam that tears the pastry cone!", "भरावन पूरी तरह ठंडा होने पर ही समोसे भरें वरना पपड़ी फट सकती है।",
                5, PrepStage.COOK_SIMMER, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "Medium -> Cool", heatLevelHi = "मध्यम -> ठंडा",
                timingDetailEn = "Roast 3 min + Cool completely", timingDetailHi = "3m भूनें और पूरा ठंडा होने दें"
            ),
            CookingStep(
                7, "Divide dough & roll evenly into ovals", "आटे की लोई बनाकर पतली अंडाकार रोटी बेलें",
                "Knead rested dough 1 min smooth, divide into equal balls, and roll each into a thin oval (not too thick!) without dry flour.",
                "आटे को 1 मिनट चिकना मसलें, बराबर लोइयाँ तोड़ें और बिना सूखे आटे के पतली अंडाकार पूरी बेल लें।",
                "Keeping thickness even prevents raw spots inside pastry folds.", "बराबर पतला बेलने से समोसा चारों ओर से एक-सा सिकता है।",
                5, PrepStage.CHOP, R.drawable.img_step_knead_roll,
                heatLevelEn = "No Flame (Roll)", heatLevelHi = "बिना गैस (बेलना)",
                timingDetailEn = "5 min rolling", timingDetailHi = "5 मिनट में अंडाकार बेलें"
            ),
            CookingStep(
                8, "Cut ovals in half & seal cone seams", "बीच से काटकर पानी से कोन का जोड़ चिपकाएं",
                "Slice each oval across the center into 2 semi-circles; brush water along the straight edge and overlap into a tight cone, pressing the seam and tip firmly.",
                "हर अंडाकार रोटी को बीच से काटकर 2 हिस्से करें; सीधी किनारी पर पानी लगाकर तिकोना कोन बनाएं और जोड़ व नोक कसकर दबाकर चिपकाएं।",
                "A tiny gap at the tip leaks oil inside—pinch seam securely.", "कोन की नोक व जोड़ अच्छे से दबाएं ताकि तलते समय न खुले।",
                4, PrepStage.MIX, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "No Flame (Shape Cone)", heatLevelHi = "बिना गैस (कोन बनाएं)",
                timingDetailEn = "4 min shaping cones", timingDetailHi = "4 मिनट में कोन तैयार करें"
            ),
            CookingStep(
                9, "Stuff cooled potato filling & pleat-seal top", "ठंडा मसाला भरें व ऊपरी किनारा बंद करें",
                "Fill cone 3/4 full with cooled potato masala (leave top margin), wet inside rim with water, make one small pleat on back edge, and pinch top shut cleanly.",
                "कोन में तीन-चौथाई ठंडा आलू मसाला भरें, ऊपरी किनारे पर पानी लगाएं, पीछे हल्की चुन्नट देकर सामने का किनारा कसकर बंद करें।",
                "Flatten base slightly so each samosa sits upright nicely.", "नीचे से हल्का बैठने लायक सीधा करें ताकि पट्टी संतुलित दिखे।",
                5, PrepStage.MIX, R.drawable.img_step_fold_stuff,
                heatLevelEn = "No Flame (Stuff & Seal)", heatLevelHi = "बिना गैस (भरावन)",
                timingDetailEn = "5 min stuffing all samosas", timingDetailHi = "5 मिनट में सभी समोसे भरकर तैयार करें"
            ),
            CookingStep(
                10, "Air-rest shaped samosas 5 min while warming oil", "तेल हल्का गरम होने तक समोसे 5 मिनट हवा में रखें",
                "Let stuffed samosas rest uncovered on a tray for 5 minutes while gently warming oil on LOW flame (a dough speck dropped in should rise very slowly).",
                "भरे समोसों को प्लेट में 5 मिनट हवा में रखें और धीमी आंच पर तेल हल्का गरम करें (आटे का टुकड़ा डालने पर वह धीरे-धीरे ऊपर आना चाहिए)।",
                "Air-drying outer skin guarantees crisp, blister-free golden pastry.", "5 मिनट हवा लगने से ऊपरी परत पर तेल के फफोले नहीं आते।",
                5, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Lowest Flame (Warm Oil)", heatLevelHi = "बिल्कुल धीमी आंच (तेल गरम)",
                timingDetailEn = "5 min rest + gentle warm oil", timingDetailHi = "5 मिनट रखें व हल्का तेल गरम करें"
            ),
            CookingStep(
                11, "Slow-fry 10–12 min, drain & serve hot", "धीमी आंच पर 10-12 मिनट खस्ता तलें व चटनी संग परोसें",
                "Slide samosas gently into warm oil, fry untouched 3 min then turn often on low flame for 10–12 minutes until rich golden crisp; drain on tissue and serve with tamarind & mint chutneys!",
                "हल्के गरम तेल में समोसे डालें, 3 मिनट न छेड़ें फिर धीमी आंच पर पलटते हुए 10-12 मिनट सुनहरा खस्ता तलें; टिश्यू पर निकालकर हरी व मीठी चटनी संग परोसें!",
                "Only raise flame slightly for the last 60 seconds for final golden crunch.", "केवल आखिरी 1 मिनट आंच हल्की मध्यम कर सुनहरा रंग दें।",
                12, PrepStage.SERVE, R.drawable.img_step_chutney_dip,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Slow fry 10–12 min -> Drain & serve!", timingDetailHi = "10-12 मिनट धीमी आंच पर तलें — खस्ता समोसे तैयार!"
            )
        )
    )
)
