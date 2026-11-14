package com.example.data.catalog

import com.example.R
import com.example.data.model.*

val extraSignatureRecipesB: List<Recipe> = listOf(
    Recipe(
        id = "masala_dosa",
        nameEn = "Crispy Masala Dosa",
        nameHi = "क्रिस्पी मसाला डोसा",
        country = Country.INDIA,
        category = FoodCategory.BREAKFAST_SNACKS,
        mealTimes = listOf(MealTime.BREAKFAST, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 15,
        cookMinutes = 18,
        defaultServings = 3,
        priorPrepNoteEn = "Requires ready fermented dosa batter (store-bought or soaked/fermented beforehand).",
        priorPrepNoteHi = "नोट: डोसा बनाने के लिए तैयार खमीर उठा हुआ डोसा बैटर पास रखें।",
        descriptionEn = "Golden paper-crisp South Indian crepe wrapped around warm turmeric-spiced potato masala.",
        descriptionHi = "सुनहरा कुरकुरा दक्षिण भारतीय डोसा, अंदर मसालेदार आलू की स्वादिष्ट भरावन और नारियल चटनी के साथ।",
        cookingTipEn = "Sprinkle cold water on hot tawa and wipe dry right before pouring batter so tawa cools to spreading temperature!",
        cookingTipHi = "बैटर फैलाने से ठीक पहले गरम तवे पर पानी छिड़ककर कपड़े से पोंछ लें—डोसा बिल्कुल आसानी से गोल फैलेगा।",
        safetyTipEn = "Keep fingers lifted clear of the hot tawa edge while swirling batter with a flat-bottomed ladle.",
        safetyTipHi = "तवे पर कलछी या कटोरी से गोल घुमाते समय किनारों की गरमाहट से हाथ बचाकर रखें।",
        imageRes = R.drawable.img_dish_bread,
        ingredients = listOf(
            Ingredient("Fermented Dosa Batter", "तैयार डोसा बैटर", 2.0, "cups", "कप", true, null, R.drawable.img_step_raita),
            Ingredient("Boiled Potatoes (peeled)", "उबले हुए आलू", 3.0, "medium", "मध्यम", true, themealdbIngredientUrl("Potatoes"), R.drawable.img_step_chop),
            Ingredient("Onion, Curry Leaves & Green Chilli", "प्याज, करी पत्ता व हरी मिर्च", 1.0, "medium", "मध्यम", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_chop),
            Ingredient("Mustard Seeds, Chana Dal, Urad Dal & Turmeric", "राई, चना-उड़द दाल व हल्दी", 1.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Ghee or Oil", "देसी घी या तेल", 3.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_tawa_roast)
        ),
        steps = listOf(
            CookingStep(
                1, "Check batter consistency & adjust water", "डोसा बैटर की सही गाढ़ापन जांचकर मिलाएं",
                "Stir fermented dosa batter gently; add 2–3 tbsp water if too thick so it pours smoothly like flowing ribbon consistency, plus a pinch of salt if unsalted.",
                "तैयार डोसा बैटर को हल्के से चलाएं; अगर बहुत गाढ़ा लगे तो 2-3 चम्मच पानी मिलाकर पोरिंग जैसा चिकना घोल तैयार करें।",
                "Too-thick batter makes doughy dosa; smooth pouring batter spreads razor-thin.", "सही पतला घोल होने पर ही डोसा तवे पर आसानी से पतला और कुरकुरा बनता है।",
                2, PrepStage.MIX, R.drawable.img_step_raita,
                heatLevelEn = "No Flame (Batter Prep)", heatLevelHi = "बिना गैस (बैटर तैयारी)",
                timingDetailEn = "2 min stirring", timingDetailHi = "2 मिनट में बैटर तैयार करें"
            ),
            CookingStep(
                2, "Boil/mash potatoes & chop onion, chilli, herbs", "आलू उबाल/मसल लें व प्याज-हरी मिर्च काटें",
                "If potatoes are raw, boil 3 whistles (12 min), peel and roughly crumble; thinly slice onion, mince green chilli, ginger, and coriander.",
                "उबले आलू छीलकर हल्के टुकड़ों में तोड़ लें (कच्चे हों तो 3 सीटी उबालें)। प्याज पतला व हरी मिर्च, अदरक व धनिया बारीक काट लें।",
                "Slightly chunky mashed potato gives authentic South Indian filling bite.", "आलू के थोड़े मोटे टुकड़े डोसे के मसाले में बढ़िया स्वाद देते हैं।",
                5, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "Prep (No Flame)", heatLevelHi = "तैयारी (बिना गैस)",
                timingDetailEn = "5 min prep (12m if boiling raw potatoes)", timingDetailHi = "5 मिनट में कटिंग (कच्चे आलू हों तो 12m उबालें)"
            ),
            CookingStep(
                3, "Pop mustard seeds, chana dal & curry leaves", "तड़के में राई, चना दाल व करी पत्ता चटकाएं",
                "Heat 1.5 tbsp oil in a pan on medium flame; pop mustard seeds, then toast 1 tsp chana dal and 1 tsp urad dal 30 sec until golden before adding curry leaves & green chilli.",
                "कड़ाही में तेल गरम कर राई चटकाएं, फिर चना दाल व उड़द दाल 30 सेकंड सुनहरी होने तक भूनें और करी पत्ता व हरी मिर्च डालें।",
                "Crunchy toasted lentils inside soft potato masala taste iconic!", "तड़के में क्रंची चना व उड़द दाल का स्वाद बहुत लाजवाब लगता है।",
                2, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Temper 1.5–2 min", timingDetailHi = "1.5-2 मिनट सुनहरा चटकाएं"
            ),
            CookingStep(
                4, "Saute sliced onions & turmeric", "कटे प्याज को हल्दी संग 3 मिनट नरम भूनें",
                "Add thinly sliced onions and a pinch of salt; saute 3 minutes until soft and translucent (not brown), then stir in 1/3 tsp turmeric.",
                "पतला कटा प्याज व चुटकी नमक डालकर 3 मिनट नरम व पारदर्शी होने तक भूनें (लाल न करें), फिर हल्दी मिलाएं।",
                "Sweet translucent onions keep masala soft and bright yellow.", "हल्के नरम प्याज से मसाले का रंग व मिठास दोनों अच्छे रहते हैं।",
                3, PrepStage.SPICE, R.drawable.img_step_fry_onion,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Saute 3 min", timingDetailHi = "3 मिनट नरम होने तक भूनें"
            ),
            CookingStep(
                5, "Fold mashed potatoes, splash water & simmer", "आलू व 2 चम्मच पानी मिलाकर 4 मिनट पकाएं",
                "Add crumbled boiled potatoes, 2 tbsp water, and salt; mix well, cover and simmer 4 minutes on low flame, then fold fresh coriander and set aside warm.",
                "टूटे हुए आलू, 2 चम्मच पानी व नमक मिलाएं; ढककर धीमी आंच पर 4 मिनट पकाएं ताकि सारा मसाला रच जाए, फिर हरा धनिया मिलाकर अलग रखें।",
                "2 tbsp water keeps potato masala moist so it spreads easily on dosa.", "थोड़ा पानी मिलाने से आलू मसाला सूखा नहीं लगता।",
                4, PrepStage.COOK_SIMMER, R.drawable.img_dish_curry_bowl,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Simmer covered 4 min", timingDetailHi = "4 मिनट ढककर धीमी आंच पर पकाएं"
            ),
            CookingStep(
                6, "Preheat tawa & cool with water splash", "तवा गरम कर पानी छिड़ककर कपड़े से पोंछें",
                "Preheat cast-iron or non-stick tawa 2 min on medium heat; sprinkle a few drops of water (it must sizzle cleanly), wipe dry with a cloth, and lower flame immediately.",
                "तवे को मध्यम आंच पर 2 मिनट गरम करें, पानी के कुछ छींटे मारें (छन्न की आवाज़ आए), सूती कपड़े से पोंछ लें और आंच बिल्कुल धीमी कर दें।",
                "Do NOT grease non-stick tawa before spreading or batter slides off!", "नॉन-स्टिक तवे पर बैटर फैलाने से पहले तेल न लगाएं वरना बैटर चिपकेगा नहीं।",
                2, PrepStage.MIX, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "Medium -> Lowest Flame", heatLevelHi = "मध्यम -> बिल्कुल धीमी आंच",
                timingDetailEn = "Preheat 2 min & wipe", timingDetailHi = "2 मिनट गरम कर पोंछ लें"
            ),
            CookingStep(
                7, "Swirl thin batter circle & roast golden crisp", "बैटर गोल फैलाकर घी संग सुनहरा कुरकुरा सेकें",
                "Pour 1 full ladle batter in the center and spiral outward evenly in smooth circles. Raise to medium heat, drizzle 1 tsp ghee/oil on edges & top, and cook 2–3 minutes until crisp golden brown.",
                "बीच में 1 कलछी बैटर डालकर तुरंत बाहर की ओर गोल पतला फैलाएं। आंच मध्यम करें, किनारों पर घी लगाएं और 2-3 मिनट सुनहरा कुरकुरा सेकें।",
                "Spread swiftly in one continuous spiral before bottom sets.", "तवा धीमा रखकर एक ही बार में हल्के हाथ से गोल घुमाकर फैलाएं।",
                4, PrepStage.COOK_SIMMER, R.drawable.img_step_tawa_roast,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Roast 2–3 min per dosa", timingDetailHi = "हर डोसे को 2-3 मिनट सुनहरा सेकें"
            ),
            CookingStep(
                8, "Spread potato masala, fold & serve crispy hot", "आलू मसाला भरकर मोड़ें और चटनी-सांभर संग परोसें",
                "Spoon 2 tbsp warm potato masala down the center, lift edges cleanly with a flat spatula, fold into a crisp cylinder or triangle, and serve immediately with coconut chutney & hot sambar!",
                "तैयार कुरकुरे डोसे के बीच में 2 चम्मच गरम आलू मसाला रखें, तिकोना या गोल मोड़ें और नारियल चटनी व गरम सांभर के साथ तुरंत परोसें!",
                "Serve straight from tawa—hot masala dosa stays crispest right away!", "तवे से उतारते ही परोसें — कुरकुरा मसाला डोसा तैयार है!",
                2, PrepStage.SERVE, R.drawable.img_step_fold_stuff,
                heatLevelEn = "Serve Immediately", heatLevelHi = "तुरंत परोसें",
                timingDetailEn = "Fold & serve hot -> Ready!", timingDetailHi = "मोड़कर तुरंत परोसें!"
            )
        )
    ),
    Recipe(
        id = "chole_masala",
        nameEn = "Punjabi Chole Masala",
        nameHi = "पंजाबी छोले मसाला",
        country = Country.INDIA,
        category = FoodCategory.DAL_CURRY,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 18,
        cookMinutes = 30,
        defaultServings = 4,
        priorPrepNoteEn = "Requires soaking white chickpeas (kabuli chana) overnight for 8 hours.",
        priorPrepNoteHi = "नोट: काबुली चनों को रात भर (8 घंटे) पानी में भिगोना जरूरी है।",
        descriptionEn = "Tangy, deeply spiced Amritsari chickpea curry simmered in tea-infused dark stock, tomato puree, and roasted anardana-amchur.",
        descriptionHi = "चटपटे मसालों, ताज़ी टमाटर प्यूरी, अमचूर और टी-बैग के गहरे रंग वाली लाजवाब पंजाबी छोले मसाला करी।",
        cookingTipEn = "Boil 1 black tea bag (or tea potli) with chickpeas for authentic dark dhaba color and mild earthy depth.",
        cookingTipHi = "छोले उबालते समय 1 टी-बैग डालने से बाज़ार जैसा गहरा भूरा रंग और बेहतरीन स्वाद आता है।",
        safetyTipEn = "Remove and discard the hot tea bag with tongs before mashing or simmering chickpeas.",
        safetyTipHi = "छोले उबलने के बाद गरम टी-बैग को चिमटे से बाहर निकाल कर फेंक दें।",
        imageRes = R.drawable.img_dish_curry_bowl,
        ingredients = listOf(
            Ingredient("Overnight Soaked White Chickpeas", "रात भर भीगे काबुली चने", 1.5, "cups", "कप", true, themealdbIngredientUrl("Chickpeas"), R.drawable.img_step_wash),
            Ingredient("Onions (finely chopped)", "बारीक कटे प्याज", 2.0, "medium", "मध्यम", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_fry_onion),
            Ingredient("Ripe Tomatoes (pureed)", "ताज़ा टमाटर प्यूरी", 3.0, "medium", "मध्यम", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_blend),
            Ingredient("Ginger-Garlic & Green Chilli", "अदरक-लहसुन व हरी मिर्च", 1.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_spices),
            Ingredient("Chole Masala, Amchur & Black Tea Bag", "छोले मसाला, अमचूर व 1 टी-बैग", 2.5, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Ghee or Cooking Oil", "घी या तेल", 3.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Drain soak water & rinse swollen chickpeas", "भीगे छोलों का पुराना पानी बदलकर धो लें",
                "Drain all 8-hour soaking water and rinse the plump chickpeas thoroughly in fresh water.",
                "8 घंटे भीगे काबुली चनों का पुराना पानी फेंक दें और साफ पानी से 2 बार धो लें।",
                "Swollen chickpeas should look double their dry size.", "चने अच्छे फूले हुए होने चाहिए तभी नरम पकते हैं।",
                3, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Wash)", heatLevelHi = "बिना गैस (सफाई)",
                timingDetailEn = "Rinse 3 min", timingDetailHi = "3 मिनट में साफ धोएं"
            ),
            CookingStep(
                2, "Pressure cook chickpeas with tea bag & spices", "टी-बैग व खड़े मसालों संग 5 सीटी उबालें",
                "Put chickpeas in pressure cooker with 3.5 cups water, 1 tsp salt, 1 black tea bag, bay leaf, and 1 black cardamom. Cook 1 whistle high + 4 whistles medium-low (~15 min).",
                "कुकर में छोले, 3.5 कप पानी, नमक, 1 टी-बैग, तेजपत्ता व बड़ी इलायची डालें; तेज़ पर 1 और धीमी-मध्यम पर 4 सीटी (लगभग 15 मिनट) उबालें।",
                "Black cardamom + tea bag give iconic dark Amritsari color and aroma.", "टी-बैग व बड़ी इलायची से बिल्कुल पिंडी छोलों जैसा गहरा रंग आता है।",
                15, PrepStage.COOK_SIMMER, R.drawable.img_step_pressure_cook,
                heatLevelEn = "High (1) -> Medium-Low (4)", heatLevelHi = "तेज़ (1) -> धीमी-मध्यम (4 सीटी)",
                timingDetailEn = "5 whistles (~15 min)", timingDetailHi = "5 सीटी (~15 मिनट) उबालें"
            ),
            CookingStep(
                3, "Release steam naturally, remove tea bag & check", "भाप निकलने दें, टी-बैग हटाएं व छोले जांचें",
                "Let pressure drop naturally (7–8 min), open lid, remove tea bag with tongs, and press a chickpea—it should mash creamy-soft (cook 2 whistles more if firm).",
                "कुकर की भाप अपने आप निकलने दें (7-8 मिनट), टी-बैग बाहर निकालें और एक छोला दबाकर देखें—वह मक्खन जैसा नरम दबना चाहिए।",
                "Save all the dark spiced boiling liquid—that is liquid gold for the gravy!", "काला मसालेदार उबला पानी बिल्कुल न फेंकें, इसी से ग्रेवी बनेगी।",
                7, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "Flame Off (Release)", heatLevelHi = "गैस बंद (रिलीज़)",
                timingDetailEn = "Release 7–8 min & test softness", timingDetailHi = "7-8 मिनट में भाप निकलने दें व जांचें"
            ),
            CookingStep(
                4, "Finely chop onion & blend ripe tomatoes", "प्याज बारीक काटें व टमाटर की प्यूरी पीस लें",
                "Finely chop 2 onions, slice ginger into thin juliennes, chop coriander, and blend 3 tomatoes into a smooth puree.",
                "2 प्याज बारीक काट लें, अदरक के पतले लच्छे व हरा धनिया काटें, और 3 लाल टमाटरों को मिक्सी में पीसकर प्यूरी बना लें।",
                "Keep ginger juliennes aside for final tadka garnish.", "अदरक के पतले लच्छे आखिर में ऊपर से तड़के में सजाएंगे।",
                5, PrepStage.MIX, R.drawable.img_step_blend,
                heatLevelEn = "No Flame (Prep & Blend)", heatLevelHi = "बिना गैस (कटिंग व पीसना)",
                timingDetailEn = "5 min prep", timingDetailHi = "5 मिनट में कटिंग व प्यूरी तैयार करें"
            ),
            CookingStep(
                5, "Crackle cumin & brown onions deeply", "तेल में जीरा चटकाकर प्याज को सुनहरा भूनें",
                "Heat 2.5 tbsp oil in a kadhai, crackle 1 tsp cumin seeds, and fry finely chopped onions on medium heat for 6 minutes until rich golden brown.",
                "कड़ाही में तेल गरम कर जीरा चटकाएं और बारीक कटा प्याज मध्यम आंच पर 6 मिनट गहरा सुनहरा होने तक भूनें।",
                "Golden-brown onions balance the tangy tomato and amchur.", "अच्छे सुनहरे प्याज से छोलों की ग्रेवी गाढ़ी और स्वादिष्ट बनती है।",
                6, PrepStage.SPICE, R.drawable.img_step_fry_onion,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Brown onions 6 min", timingDetailHi = "6 मिनट सुनहरा भूरा भूनें"
            ),
            CookingStep(
                6, "Saute ginger-garlic & green chillies", "अदरक-लहसुन पेस्ट और हरी मिर्च 1.5 मिनट भूनें",
                "Stir in 1.5 tbsp ginger-garlic paste and 1 chopped green chilli; cook 1.5 minutes until fragrant.",
                "अब अदरक-लहसुन पेस्ट और कटी हरी मिर्च डालकर 1.5 मिनट अच्छी खुशबू आने तक भूनें।",
                "Stir continually so paste does not scorch at the bottom.", "लगातार चलाएं ताकि पेस्ट तले में जले नहीं।",
                2, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Medium-Low Flame", heatLevelHi = "मध्यम-धीमी आंच",
                timingDetailEn = "1.5–2 min saute", timingDetailHi = "1.5-2 मिनट अच्छी तरह भूनें"
            ),
            CookingStep(
                7, "Cook tomato puree, chole masala & amchur", "टमाटर प्यूरी व छोले मसाले तेल छूटने तक भूनें",
                "Pour tomato puree, turmeric, Kashmiri chilli, 2 tbsp chole masala, roasted cumin powder, and 1 tsp amchur; cook 6 minutes until thick and oil shines along edges.",
                "टमाटर प्यूरी, हल्दी, कश्मीरी मिर्च, 2 बड़ी चम्मच छोले मसाला, भुना जीरा व अमचूर डालकर 6 मिनट तेल अलग होने तक भूनें।",
                "Amchur or anardana gives authentic North Indian tangy punch.", "अमचूर व छोले मसाले से बिल्कुल अमृतसरी चटपटा स्वाद आता है।",
                6, PrepStage.COOK_SIMMER, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Medium-Low Flame", heatLevelHi = "मध्यम-धीमी आंच",
                timingDetailEn = "Cook masala 6 min till oil separates", timingDetailHi = "6 मिनट तेल छूटने तक भूनें"
            ),
            CookingStep(
                8, "Add boiled chickpeas, stock & lightly mash", "उबले छोले व काला पानी डालकर थोड़े छोले मसलें",
                "Pour boiled chickpeas with their dark stock into the masala. Mash about 1/4 cup chickpeas with the back of your ladle to give thick creamy body.",
                "उबले छोले उनके गहरे भूरे पानी सहित कड़ाही में डालें; लगभग चौथाई कप छोले चमचे से हल्के मसल दें ताकि तरी गाढ़ी हो जाए।",
                "Mashing a few chickpeas creates velvety gravy without cream or flour.", "थोड़े छोले मसल देने से ग्रेवी अपने आप गाढ़ी व चमकदार हो जाती है।",
                2, PrepStage.MIX, R.drawable.img_step_boil_pot,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "2 min folding & mashing", timingDetailHi = "2 मिनट अच्छे से मिलाएं व मसलें"
            ),
            CookingStep(
                9, "Simmer covered 10 minutes on low flame", "ढककर धीमी आंच पर 10 मिनट गाढ़ा होने तक उबालें",
                "Cover and simmer on LOW heat for 10 minutes stirring twice so chickpeas absorb deep masala flavor (simmer 3 min more uncovered if you prefer thick pindi style).",
                "कड़ाही ढककर धीमी आंच पर 10 मिनट पकाएं (बीच में 2 बार चलाएं) ताकि छोलों के अंदर तक मसाला बस जाए।",
                "Gravy thickens further as soon as it cools slightly.", "ठंडा होने पर तरी और गाढ़ी होती है, इसलिए थोड़ी लटपटी रखें।",
                10, PrepStage.COOK_SIMMER, R.drawable.img_dish_curry_bowl,
                heatLevelEn = "Low Flame (Covered)", heatLevelHi = "धीमी आंच (ढककर)",
                timingDetailEn = "Simmer 10 min (+3 min uncovered if thick)", timingDetailHi = "10 मिनट ढककर धीमी आंच पर पकाएं"
            ),
            CookingStep(
                10, "Drizzle ghee-ginger tadka, rest 3 min & serve", "घी-अदरक का तड़का डालें, 3 मिनट बाद परोसें",
                "Warm 1 tbsp ghee in a small spoon/pan, toss ginger juliennes & slit green chillies 15 sec, pour over hot chole with coriander, rest 3 min covered, and serve with bhature or kulche!",
                "1 चम्मच गरम घी में अदरक लच्छे व लंबी कटी हरी मिर्च 15 सेकंड भूनकर छोलों पर डालें, हरा धनिया सजाएं, 3 मिनट ढककर रखें और भटूरे या कुलचे संग परोसें!",
                "Ghee-roasted ginger strips on top smell heavenly!", "घी में हल्की भुनी अदरक का तड़का छोलों में जान डाल देता है!",
                3, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off (Rest 3m)", heatLevelHi = "गैस बंद (3m रेस्ट)",
                timingDetailEn = "Tadka + Rest 3 min -> Ready!", timingDetailHi = "तड़का व 3 मिनट रेस्ट — पंजाबी छोले तैयार!"
            )
        )
    )
)
