package com.example.data.catalog

import com.example.R
import com.example.data.model.*

val indianRecipesPart2B: List<Recipe> = listOf(
    Recipe(
        id = "poha",
        nameEn = "Kanda Batata Poha",
        nameHi = "कांदा बटाटा पोहा",
        country = Country.INDIA,
        category = FoodCategory.BREAKFAST_SNACKS,
        mealTimes = listOf(MealTime.BREAKFAST, MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 8,
        cookMinutes = 10,
        defaultServings = 2,
        isPopular = true,
        descriptionEn = "Light, fluffy flattened rice tempered with mustard seeds, curry leaves, roasted peanuts, onions, turmeric, and fresh lemon.",
        descriptionHi = "राई, करी पत्ता, भुनी मूंगफली, प्याज और नींबू के ताज़ा स्वाद से बना हल्का और खिला-खिला कांदा पोहा।",
        cookingTipEn = "Always choose thick poha (जाड़ा पोहा) and rinse inside a strainer—never soak in a bowl of water!",
        cookingTipHi = "हमेशा मोटा पोहा लें और छलनी में ही धोएं; कटोरे में भिगोने से पोहा गीला होकर हलवा बन जाता है।",
        safetyTipEn = "Lower gas flame before adding wet poha and turmeric so the spices do not burn.",
        safetyTipHi = "हल्दी व पोहा डालते समय गैस की आंच बिल्कुल धीमी रखें।",
        imageRes = R.drawable.img_dish_biryani,
        ingredients = listOf(
            Ingredient("Thick Flattened Rice (Poha)", "मोटा पोहा", 1.5, "cups", "कप", true, null, R.drawable.img_step_drain),
            Ingredient("Onion & Small Potato (finely diced)", "बारीक कटा प्याज व छोटा आलू", 1.0, "each", "नग", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_chop),
            Ingredient("Raw Peanuts", "कच्ची मूंगफली", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Peanuts"), R.drawable.img_step_spices),
            Ingredient("Mustard Seeds, Curry Leaves & Green Chilli", "राई, करी पत्ता व हरी मिर्च", 1.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Turmeric, Sugar & Salt", "हल्दी, चुटकी चीनी व नमक", 0.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Fresh Lemon, Sev & Coriander", "नींबू, सेव व हरा धनिया", 0.5, "piece", "नग", true, themealdbIngredientUrl("Lemon"), R.drawable.img_step_lemon)
        ),
        steps = listOf(
            CookingStep(
                1, "Rinse thick poha & drain in strainer", "पोहा छलनी में धोकर 3 मिनट पानी निथरने रखें",
                "Put thick poha in a wide wire strainer, run clean tap water over it for 10 seconds tossing lightly, and leave in the strainer for 3–4 minutes to soften evenly.",
                "मोटे पोहे को बड़ी छलनी में रखें, 10 सेकंड साफ पानी चलाकर धोएं और छलनी में ही 3-4 मिनट फूलने व पानी निथरने के लिए छोड़ दें।",
                "Gently fluff washed poha with 1/4 tsp turmeric and salt after 2 minutes.", "2 मिनट बाद पोहे में हल्का नमक व चुटकी चीनी मिला देने से दाने खिले रहते हैं।",
                4, PrepStage.WASH, R.drawable.img_step_drain,
                heatLevelEn = "No Flame (Rinse & Drain)", heatLevelHi = "बिना गैस (धोना व छानना)",
                timingDetailEn = "Rinse 10 sec, drain 3–4 min", timingDetailHi = "10 सेकंड धोकर 3-4 मिनट छलनी में रखें"
            ),
            CookingStep(
                2, "Finely chop onion, potato, chilli & coriander", "प्याज, छोटा आलू, हरी मिर्च व धनिया काटें",
                "Finely chop onion, slit or mince green chilli, dice 1 small peeled potato into tiny 1/4-inch cubes, and chop coriander.",
                "प्याज, हरी मिर्च व हरा धनिया काट लें और 1 छोटे आलू को बिल्कुल छोटे-छोटे टुकड़ों में काटें ताकि जल्दी गल जाए।",
                "Tiny potato cubes cook crisp in just 3 minutes!", "छोटे टुकड़े काटने से आलू 3 मिनट में जल्दी पक जाते हैं।",
                4, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "4 min chopping", timingDetailHi = "4 मिनट में सारी कटिंग तैयार"
            ),
            CookingStep(
                3, "Roast raw peanuts crispy & set aside", "मूंगफली को 3 मिनट कुरकुरी भूनकर निकालें",
                "Heat 1.5 tbsp oil in a kadhai on low-medium heat; fry raw peanuts 3 minutes stirring continuously until crunchy and lightly browned, then scoop onto a plate.",
                "कड़ाही में 1.5 चम्मच तेल गरम कर धीमी-मध्यम आंच पर मूंगफली को 3 मिनट लगातार चलाते हुए कुरकुरा भूनें और प्लेट में निकाल लें।",
                "Setting roasted peanuts aside keeps them crunchy until serving!", "भुनी मूंगफली अलग निकालकर अंत में डालने से वह नरम नहीं पड़ती।",
                3, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Low-Medium Flame", heatLevelHi = "धीमी-मध्यम आंच",
                timingDetailEn = "Roast 3 min until crunchy", timingDetailHi = "3 मिनट कुरकुरी होने तक भूनें"
            ),
            CookingStep(
                4, "Pop mustard seeds, curry leaves & chilli", "तेल में राई, करी पत्ता व हरी मिर्च चटकाएं",
                "In the same pan, add mustard seeds (rai) and cumin; once they crackle, toss in fresh curry leaves and green chillies for 15 seconds.",
                "उसी बचे तेल में राई व जीरा चटकाएं, फिर ताज़ा करी पत्ता और हरी मिर्च डालकर 15 सेकंड भूनें।",
                "Wait till mustard seeds stop popping before adding onions.", "राई अच्छे से चटक जाए तभी प्याज डालें।",
                1, PrepStage.SPICE, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Temper 15–20 sec", timingDetailHi = "15-20 सेकंड चटकाएं"
            ),
            CookingStep(
                5, "Cook diced potatoes & onions soft", "बारीक आलू और प्याज को 4 मिनट नरम पकाएं",
                "Add tiny potato cubes with a pinch of salt and saute 2 minutes, then add chopped onions and cook 2–3 minutes until onions turn translucent and potatoes are tender.",
                "छोटे कटे आलू व चुटकी नमक डालकर 2 मिनट भूनें, फिर प्याज डालकर 2-3 मिनट प्याज गुलाबी व आलू नरम होने तक पकाएं।",
                "Don't brown onions dark—soft sweet onions taste best in poha.", "प्याज को लाल न करें, हल्का नरम व गुलाबी ही रखें।",
                4, PrepStage.COOK_SIMMER, R.drawable.img_step_fry_onion,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Cook 4 min until potatoes soften", timingDetailHi = "4 मिनट आलू नरम होने तक पकाएं"
            ),
            CookingStep(
                6, "Fold turmeric & softened poha, steam 2 min", "हल्दी व पोहा मिलाकर ढककर 2 मिनट भाप दें",
                "Lower flame completely, stir 1/3 tsp turmeric, add drained fluffy poha, 1/2 tsp sugar, and salt; fold gently from bottom, sprinkle 1 tbsp water if dry, cover and steam 2 minutes.",
                "आंच बिल्कुल धीमी कर हल्दी, छना पोहा, आधा चम्मच चीनी व नमक डालें; हल्के हाथ से नीचे से ऊपर मिलाएं और ढककर 2 मिनट भाप पर रखें।",
                "Cover for 2 minutes on lowest heat so every flake warms evenly!", "2 मिनट ढककर रखने से पोहा बिल्कुल नरम व रुई जैसा मुलायम होता है।",
                3, PrepStage.COOK_SIMMER, R.drawable.img_dish_biryani,
                heatLevelEn = "Lowest Flame (Covered)", heatLevelHi = "बिल्कुल धीमी आंच (ढककर)",
                timingDetailEn = "Steam covered 2 min", timingDetailHi = "ढककर 2 मिनट भाप में पकाएं"
            ),
            CookingStep(
                7, "Squeeze lemon, add peanuts & sev, serve hot", "नींबू, मूंगफली, सेव व धनिया सजाकर परोसें",
                "Turn off flame, squeeze fresh lemon juice, toss gently with roasted peanuts and fresh coriander, top with crispy Indore sev, and serve hot with chai!",
                "गैस बंद कर ताज़ा नींबू निचोड़ें, भुनी मूंगफली व हरा धनिया मिलाएं और ऊपर से कुरकुरी सेव सजाकर गरमागरम परोसें!",
                "Always add lemon juice after switching off heat to keep fresh citrus aroma.", "गैस बंद करने के बाद नींबू डालने से कड़वाहट नहीं आती व ताज़ी खुशबू रहती है।",
                2, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off", heatLevelHi = "गैस बंद",
                timingDetailEn = "Toss & serve right away -> Ready!", timingDetailHi = "तुरंत गरमागरम परोसें — खिला-खिला पोहा तैयार!"
            )
        )
    ),
    Recipe(
        id = "aloo_paratha",
        nameEn = "Aloo Paratha",
        nameHi = "आलू पराठा",
        country = Country.INDIA,
        category = FoodCategory.BREAKFAST_SNACKS,
        mealTimes = listOf(MealTime.BREAKFAST, MealTime.LUNCH),
        isVeg = true,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 20,
        cookMinutes = 16,
        defaultServings = 3,
        isPopular = true,
        descriptionEn = "Golden flaky whole-wheat flatbreads generously stuffed with spiced mashed potato, roasted crisp in pure desi ghee.",
        descriptionHi = "नरम गेहूं के आटे में चटपटे मसालेदार आलू भरकर देसी घी में कुरकुरा सेंका हुआ ढाबा-स्टाइल आलू पराठा।",
        cookingTipEn = "Boiled potatoes MUST be completely cold and grated lump-free so stuffing never tears the paratha!",
        cookingTipHi = "उबले आलू बिल्कुल ठंडे होने चाहिए और उन्हें कद्दूकस करें ताकि बेलते समय पराठा बिल्कुल न फटे।",
        safetyTipEn = "Apply ghee with a spoon on the hot tawa and keep fingers away from steam puffs.",
        safetyTipHi = "गरम तवे पर घी लगाते समय चम्मच का उपयोग करें और भाप से हाथ बचाएं।",
        imageRes = R.drawable.img_dish_bread,
        ingredients = listOf(
            Ingredient("Whole Wheat Flour (Atta)", "गेहूं का आटा", 2.0, "cups", "कप", true, null, R.drawable.img_step_knead_roll),
            Ingredient("Cold Boiled Potatoes", "ठंडे उबले आलू", 3.0, "medium", "मध्यम", true, themealdbIngredientUrl("Potatoes"), R.drawable.img_step_chop),
            Ingredient("Onion, Green Chilli & Coriander", "बारीक प्याज, मिर्च व हरा धनिया", 3.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_chop),
            Ingredient("Amchur, Chilli, Roasted Jeera & Ajwain", "अमचूर, मिर्च, भुना जीरा व अजवाइन", 2.0, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Desi Ghee or Butter", "देसी घी या मक्खन", 3.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Butter"), R.drawable.img_step_tawa_roast)
        ),
        steps = listOf(
            CookingStep(
                1, "Knead soft pliable dough & rest 10 min", "मुलायम आटा गूंथकर 10 मिनट ढककर रखें",
                "Mix 2 cups wheat flour, 1/2 tsp salt, and 1 tsp oil; knead with water for 4 minutes into a soft, pliable dough (softer than poori dough), cover, and rest 10 minutes.",
                "आटे में नमक व 1 चम्मच तेल मिलाकर पानी से मुलायम व लचीला आटा गूंथें और ढककर 10 मिनट आराम के लिए रखें।",
                "Soft dough stretches gracefully around stuffing without cracking.", "नरम आटा व 10 मिनट रेस्ट करने से पराठा बेलने पर फटता नहीं।",
                10, PrepStage.MIX, R.drawable.img_step_knead_roll,
                heatLevelEn = "No Flame (Knead & Rest)", heatLevelHi = "बिना गैस (गूंथना व रेस्ट)",
                timingDetailEn = "Knead 4 min + Rest 10 min", timingDetailHi = "गूंथकर 10 मिनट ढककर रखें"
            ),
            CookingStep(
                2, "Grate cold boiled potatoes lump-free", "ठंडे उबले आलू कद्दूकस से घिस लें",
                "Peel thoroughly cooled boiled potatoes and grate them through a fine box grater so zero hard lumps remain.",
                "पूरी तरह ठंडे उबले आलुओं को छीलकर कद्दूकस से घिस लें ताकि एक भी सख्त गुठली न रहे।",
                "Never use warm potatoes—steam makes filling sticky and rips dough!", "गरम आलू बिल्कुल न लें वरना नमी से भरावन गीली हो जाएगी।",
                3, PrepStage.CHOP, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "No Flame (Grate)", heatLevelHi = "बिना गैस (कद्दूकस)",
                timingDetailEn = "3 min grating", timingDetailHi = "3 मिनट में बिना गुठली घिस लें"
            ),
            CookingStep(
                3, "Chop onion-herbs & mix dry potato spices", "प्याज-धनिया काटें व मसालेदार भरावन मिलाएं",
                "Finely chop onion, green chilli, and fresh coriander; fold gently into grated potatoes with amchur, red chilli, roasted cumin powder, crushed ajwain, and salt (at the end).",
                "प्याज, हरी मिर्च व धनिया बिल्कुल बारीक काटकर घिसे आलुओं में अमचूर, लाल मिर्च, भुना जीरा, अजवाइन और अंत में नमक मिलाएं।",
                "Add salt only right before stuffing so onions don't release water.", "नमक बिल्कुल भरने से ठीक पहले डालें वरना प्याज पानी छोड़ देगा।",
                3, PrepStage.SPICE, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Mix)", heatLevelHi = "बिना गैस (मिलाना)",
                timingDetailEn = "3 min chopping & mixing", timingDetailHi = "3 मिनट में मसाला तैयार करें"
            ),
            CookingStep(
                4, "Divide dough & potato filling into equal balls", "आटे व आलू मसाले की बराबर गोल लोइयाँ बनाएं",
                "Divide dough into 6 equal balls and shape potato stuffing into 6 equal round balls slightly smaller than the dough balls.",
                "गूंथे आटे की 6 बराबर लोइयाँ और आलू मसाले के भी 6 गोल लड्डू जैसे हिस्से बना लें।",
                "Pre-portioned balls make stuffing neat and uniform.", "बराबर हिस्से बांट लेने से हर पराठे में बराबर मसाला भरता है।",
                2, PrepStage.MIX, R.drawable.img_step_salad_mix,
                heatLevelEn = "No Flame (Portion)", heatLevelHi = "बिना गैस (लोई बनाना)",
                timingDetailEn = "2 min dividing", timingDetailHi = "2 मिनट में लोइयाँ तैयार करें"
            ),
            CookingStep(
                5, "Cup dough, stuff potato ball & pinch seal", "लोई में आलू भरकर किनारों को सील करें",
                "Flatten a dough ball into a 4-inch disc (thicker in center, thinner edges), place potato ball inside, bring edges up into pleats, pinch shut, and remove extra top dough.",
                "लोई को कटोरी जैसा फैलाएं, बीच में आलू बॉल रखकर किनारों को ऊपर लाकर चुन्नट बंद करें और ऊपर का अतिरिक्त आटा हल्का दबा दें।",
                "Thicker center prevents filling from bursting out the middle.", "बीच का हिस्सा थोड़ा मोटा रखने से मसाला बाहर नहीं निकलता।",
                3, PrepStage.MIX, R.drawable.img_step_fold_stuff,
                heatLevelEn = "No Flame (Stuff)", heatLevelHi = "बिना गैस (भरावन)",
                timingDetailEn = "3 min stuffing", timingDetailHi = "3 मिनट में भरकर बंद करें"
            ),
            CookingStep(
                6, "Dust dry flour & roll gently with belan", "सूखा आटा लगाकर हल्के हाथ से गोल बेलें",
                "Press stuffed ball flat gently with fingers first to spread filling evenly, dust dry atta lightly, and roll smoothly into a medium-thick 7-inch circle.",
                "भरी लोई को पहले उंगलियों से दबाकर चपटा करें ताकि मसाला हर कोने में जाए, फिर सूखा आटा लगाकर हल्के हाथ से गोल बेल लें।",
                "Never press hard in the center—roll with soft, light strokes.", "बेलन हल्के हाथ से किनारों की ओर चलाएं, बीच में ज़्यादा दबाव न डालें।",
                4, PrepStage.CHOP, R.drawable.img_dish_bread,
                heatLevelEn = "No Flame (Roll)", heatLevelHi = "बिना गैस (बेलना)",
                timingDetailEn = "4 min rolling", timingDetailHi = "4 मिनट में हल्के हाथ से बेलें"
            ),
            CookingStep(
                7, "Roast on tawa & crisp both sides in ghee", "तवे पर दोनों तरफ घी लगाकर सुनहरा कुरकुरा सेंकें",
                "Preheat tawa 2 min on medium heat; lay paratha 1 min until small bubbles appear, flip, spread 1 tsp ghee on top, flip again and press edges gently for 2–3 minutes until golden crisp.",
                "तवा 2 मिनट गरम कर पराठा डालें, 1 मिनट छोटे बुलबुले आने पर पलटें, दोनों तरफ देसी घी लगाकर कड़छी से किनारे दबाते हुए 2-3 मिनट सुनहरा सेंकें।",
                "Medium heat cooks the inside stuffing hot while crisping the wheat crust.", "मध्यम आंच पर पराठा अंदर तक पकता है व बाहर से खस्ता रहता है।",
                10, PrepStage.COOK_SIMMER, R.drawable.img_step_tawa_roast,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "2–3 min per paratha until golden crisp", timingDetailHi = "हर पराठे को 2-3 मिनट दोनों तरफ से सेंकें"
            ),
            CookingStep(
                8, "Crown with white butter & serve with curd", "सफेद मक्खन रखकर दही व अचार संग परोसें",
                "Transfer steaming parathas onto a plate, top with a dollop of homemade white butter (makkhan), and serve hot alongside chilled curd and mango pickle!",
                "गरमागरम आलू पराठे के ऊपर ताज़ा सफेद मक्खन रखें और ठंडे दही, हरी चटनी व आम के अचार संग परोसें!",
                "Authentic Punjabi dhaba breakfast ready!", "मज़ेदार ढाबा स्टाइल आलू पराठा परोसने के लिए तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Serve Hot", heatLevelHi = "गरमागरम परोसें",
                timingDetailEn = "Serve immediately -> Ready!", timingDetailHi = "तुरंत गरमागरम परोसें!"
            )
        )
    ),
    Recipe(
        id = "gulab_jamun",
        nameEn = "Gulab Jamun",
        nameHi = "गुलाब जामुन",
        country = Country.INDIA,
        category = FoodCategory.INDIAN_SWEETS,
        mealTimes = listOf(MealTime.DESSERTS),
        isVeg = true,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 18,
        cookMinutes = 28,
        defaultServings = 4,
        isPopular = true,
        isTrending = true,
        descriptionEn = "Soft, spongy golden khoya dumplings simmered patiently on low heat and soaked in fragrant cardamom-saffron-rose syrup.",
        descriptionHi = "इलायची, केसर और गुलाब जल की चाशनी में डूबे रूई जैसे नरम, रसीले हलवाई स्टाइल गुलाब जामुन।",
        cookingTipEn = "Mash khoya completely smooth with your palm heel, never knead hard, and always drop jamuns into barely warm ghee!",
        cookingTipHi = "खोये को हथेली से चिकना मसलें लेकिन सख्त न गूंथें; और हमेशा बिल्कुल हल्के गरम घी में धीमी आंच पर तलें।",
        safetyTipEn = "Oil temperature must be very low—test with 1 tiny ball first and never drop jamuns into boiling syrup.",
        safetyTipHi = "घी बिल्कुल हल्का गरम हो तभी एक छोटी गोली डालकर जांचें; और उबलती चाशनी में गुलाब जामुन न डालें।",
        imageRes = R.drawable.img_step_raita,
        ingredients = listOf(
            Ingredient("Fresh Khoya (Mawa)", "ताज़ा खोया (मावा)", 200.0, "g", "ग्राम", true, null, R.drawable.img_step_raita),
            Ingredient("All-Purpose Flour (Maida) & Baking Powder", "मैदा व चुटकी बेकिंग पाउडर", 3.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_dish_bread),
            Ingredient("Sugar (for Syrup)", "चीनी (चाशनी के लिए)", 1.5, "cups", "कप", true, themealdbIngredientUrl("Sugar"), R.drawable.img_step_syrup_milk),
            Ingredient("Cardamom, Saffron & Rose Water", "इलायची, केसर व गुलाब जल", 0.5, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Cardamom"), R.drawable.img_step_spices),
            Ingredient("Warm Milk (if needed)", "गुनगुना दूध (जरूरत अनुसार)", 1.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Milk"), R.drawable.img_step_raita),
            Ingredient("Desi Ghee or Oil for Frying", "तलने के लिए घी या तेल", 1.5, "cups", "कप", false, null, R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Boil sugar & water into sticky syrup", "चीनी और पानी को 7-8 मिनट चिपचिपा उबालें",
                "Combine 1.5 cups sugar and 1.5 cups water in a wide pot; bring to a boil and simmer 7–8 minutes until sticky like honey between cooled fingers (no 1-string needed!).",
                "चौड़े बर्तन में 1.5 कप चीनी और 1.5 कप पानी डालकर मध्यम आंच पर 7-8 मिनट उबालें जब तक चाशनी शहद जैसी चिपचिपी न हो जाए (तार न बनाएं)।",
                "Thick 1-string syrup stops gulab jamuns from soaking inside!", "चाशनी गाढ़ी 1 तार की न हो, वरना अंदर रस नहीं भरेगा।",
                8, PrepStage.COOK_SIMMER, R.drawable.img_step_syrup_milk,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Boil 7–8 min until sticky", timingDetailHi = "7-8 मिनट चिपचिपी होने तक उबालें"
            ),
            CookingStep(
                2, "Infuse cardamom, saffron & rose water in syrup", "चाशनी में इलायची, केसर व गुलाब जल मिलाएं",
                "Turn off heat, add crushed cardamom pods, pinch of saffron, 1/2 tsp rose water, and 2 drops lemon juice (prevents crystallization); cover to keep lukewarm.",
                "गैस बंद कर कुटी इलायची, केसर, गुलाब जल व 2 बूंद नींबू रस (चाशनी जमने से बचाने के लिए) डालकर ढक दें।",
                "2 drops of lemon juice keeps sugar syrup crystal-free.", "2 बूंद नींबू रस चाशनी में चीनी के दाने जमने नहीं देता।",
                2, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Flame Off (Infuse)", heatLevelHi = "गैस बंद (सुगंध)",
                timingDetailEn = "Infuse & keep covered", timingDetailHi = "ढककर गुनगुनी रहने दें"
            ),
            CookingStep(
                3, "Crumble & mash khoya smooth with palm heel", "खोये को हथेली से बिल्कुल चिकना मसलें",
                "Grate or crumble khoya onto a wide plate, then gently rub it smooth with the heel of your palm for 3–4 minutes until creamy with zero grainy lumps.",
                "बड़ी थाली में खोया कद्दूकस करें और हथेली के निचले हिस्से से 3-4 मिनट हल्के से मसलें ताकि कोई दाना या गांठ न रहे।",
                "Smooth khoya guarantees crack-free, melt-in-mouth gulab jamuns.", "दाने खत्म होने पर ही गोलियाँ तलते समय फटती नहीं।",
                4, PrepStage.MIX, R.drawable.img_step_raita,
                heatLevelEn = "No Flame (Mash)", heatLevelHi = "बिना गैस (मसलना)",
                timingDetailEn = "Mash 3–4 min smooth", timingDetailHi = "3-4 मिनट चिकना होने तक मसलें"
            ),
            CookingStep(
                4, "Gently fold in maida & baking powder", "खोये में मैदा व चुटकी बेकिंग पाउडर मिलाएं",
                "Sprinkle 3 tbsp maida and 1/4 tsp baking powder over mashed khoya and fold gently together with fingertips (do NOT knead hard like roti dough).",
                "मसले खोये में 3 बड़ी चम्मच मैदा और चौथाई चम्मच बेकिंग पाउडर छिड़ककर उंगलियों से हल्के हाथ से मिलाएं (रोटी जैसा न गूंथें)।",
                "If mixture feels dry or crumbly, sprinkle 1 tsp warm milk at a time.", "मिश्रण सूखा लगे तो 1-1 चम्मच गुनगुना दूध मिलाकर नरम करें।",
                2, PrepStage.MIX, R.drawable.img_step_knead_roll,
                heatLevelEn = "No Flame (Fold)", heatLevelHi = "बिना गैस (मिलाना)",
                timingDetailEn = "2 min gentle folding", timingDetailHi = "2 मिनट हल्के हाथ से मिलाएं"
            ),
            CookingStep(
                5, "Rest soft dough covered 5 minutes", "तैयार डो को ढककर 5 मिनट आराम दें",
                "Gather the soft, smooth dough gently into a ball, cover with a damp cloth, and let rest 5 minutes so flour hydrates evenly.",
                "नरम व चिकने डो को हल्के गीले कपड़े से ढककर 5 मिनट रख दें ताकि मैदा अच्छे से फूल जाए।",
                "Dough should feel soft and moist—never dry or stiff.", "डो छूने में बिल्कुल नरम व नम होना चाहिए।",
                5, PrepStage.MIX, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "No Flame (Rest)", heatLevelHi = "बिना गैस (रेस्ट)",
                timingDetailEn = "Rest 5 min covered", timingDetailHi = "5 मिनट ढककर रखें"
            ),
            CookingStep(
                6, "Roll smooth crack-free balls under damp cloth", "बिना दरार वाली चिकनी गोलियाँ बनाएं",
                "Pinch equal marble-sized portions and roll gently between lightly greased palms until glass-smooth with ZERO cracks; keep finished balls covered under damp cloth.",
                "बराबर हिस्से लेकर हथेलियों के बीच बिना दरार वाली बिल्कुल चिकनी गोलियाँ बनाएं और गीले कपड़े से ढककर रखते जाएं।",
                "Even one tiny crack splits wide open during frying—re-roll if needed!", "एक भी दरार रह गई तो तलने पर फट सकती है, इसलिए चिकनी गोलियाँ बनाएं।",
                5, PrepStage.CHOP, R.drawable.img_step_fold_stuff,
                heatLevelEn = "No Flame (Shape)", heatLevelHi = "बिना गैस (गोलियाँ बनाना)",
                timingDetailEn = "5 min rolling smooth balls", timingDetailHi = "5 मिनट में चिकनी गोलियाँ बनाएं"
            ),
            CookingStep(
                7, "Warm ghee on lowest heat & test 1 tiny ball", "धीमी आंच पर घी गुनगुना कर 1 छोटी गोली जांचें",
                "Warm ghee in a deep kadhai on LOWEST flame for 2 min; drop 1 tiny test ball—it should sit for a few seconds and slowly rise in 30 sec without darkening fast.",
                "कड़ाही में बिल्कुल धीमी आंच पर घी हल्का गरम करें; पहले 1 छोटी गोली डालें—वह 30 सेकंड में धीरे-धीरे तैरकर ऊपर आनी चाहिए।",
                "If test ball browns in 10 seconds, switch off stove 2 minutes to cool ghee!", "अगर गोली 10 सेकंड में लाल हो तो गैस बंद कर 2 मिनट घी ठंडा करें।",
                3, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Lowest Flame", heatLevelHi = "बिल्कुल धीमी आंच",
                timingDetailEn = "Test temperature 3 min", timingDetailHi = "3 मिनट घी के तापमान की जांच करें"
            ),
            CookingStep(
                8, "Slow-fry batch while gently swirling ghee", "सारी गोलियाँ डालकर घी घुमाते हुए 8-10 मिनट तलें",
                "Drop balls gently in small batches; wait 30 sec, then continuously swirl the ghee in circles using the back of a slotted spoon for 8–10 minutes until rich golden brown.",
                "धीमी आंच पर गोलियाँ डालें और चम्मच के पिछले हिस्से से सिर्फ घी को गोल घुमाते हुए 8-10 मिनट गहरा सुनहरा भूरा होने तक तलें।",
                "Never poke the soft balls directly in the first 3 minutes—swirl only the oil!", "शुरुआती 3 मिनट गोलियों को चम्मच न छुआएं, सिर्फ घी घुमाएं!",
                10, PrepStage.COOK_SIMMER, R.drawable.img_dish_naan_curry,
                heatLevelEn = "Lowest Flame", heatLevelHi = "बिल्कुल धीमी आंच",
                timingDetailEn = "Slow fry 8–10 min swirling oil", timingDetailHi = "8-10 मिनट घी घुमाते हुए सुनहरा तलें"
            ),
            CookingStep(
                9, "Drain & soak in lukewarm syrup (45 min)", "निकालकर हल्की गुनगुनी चाशनी में 45 मिनट भिगोएं",
                "Lift fried jamuns out onto a skimmer for 10 sec, ensure syrup is lukewarm (not hot or cold), drop jamuns inside, and cover to soak 45–60 minutes until doubled and juicy.",
                "तले गुलाब जामुन निकालें और ध्यान रहे कि चाशनी हल्की गुनगुनी हो; उसमें डालकर ढक दें और 45-60 मिनट रस भरने दें।",
                "Gently shake the pot after 15 minutes so all sides drink syrup evenly.", "15 मिनट बाद बर्तन हल्का हिला दें ताकि सब तरफ बराबर चाशनी लगे।",
                5, PrepStage.COOK_SIMMER, R.drawable.img_step_syrup_milk,
                heatLevelEn = "Flame Off (Soak)", heatLevelHi = "गैस बंद (चाशनी में भिगोना)",
                timingDetailEn = "Soak 45–60 min in lukewarm syrup", timingDetailHi = "45-60 मिनट गुनगुनी चाशनी में भिगोकर रखें"
            ),
            CookingStep(
                10, "Garnish slivered pistachios & serve warm", "कटे पिस्ते सजाकर रसीले गुलाब जामुन परोसें",
                "Spoon plump syrup-soaked gulab jamuns into dessert bowls, garnish with slivered pistachios and saffron strands, and serve warm or chilled!",
                "चाशनी में डूबे फूले-फूले गुलाब जामुन कटोरी में निकालें, ऊपर कटे पिस्ते व केसर सजाकर गरम या ठंडा परोसें!",
                "Pairs divinely with vanilla ice cream too!", "गरमागरम गुलाब जामुन वनीला आइसक्रीम संग भी लाजवाब लगते हैं!",
                1, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Serve Warm", heatLevelHi = "गरमागरम परोसें",
                timingDetailEn = "Garnish & serve -> Ready!", timingDetailHi = "पिस्ते सजाकर परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "gajar_halwa",
        nameEn = "Gajar Ka Halwa",
        nameHi = "गाजर का हलवा",
        country = Country.INDIA,
        category = FoodCategory.INDIAN_SWEETS,
        mealTimes = listOf(MealTime.DESSERTS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 15,
        cookMinutes = 32,
        defaultServings = 4,
        descriptionEn = "Rich winter classic of sweet red carrots slow-simmered in whole milk, pure ghee, cardamom, and toasted nuts.",
        descriptionHi = "लाल मीठी गाजर, फुल क्रीम दूध, शुद्ध देसी घी, इलायची और मेवों से बना दानेदार गाजर का हलवा।",
        cookingTipEn = "Saute grated carrots in ghee for 6 minutes BEFORE pouring milk to unlock rich sweetness and prevent mushiness.",
        cookingTipHi = "दूध डालने से पहले कद्दूकस गाजर को 6 मिनट घी में जरूर भूनें—रंग और स्वाद दोनों निखरते हैं।",
        safetyTipEn = "Stir from the very bottom of the heavy kadhai once milk thickens so milk solids do not scorch.",
        safetyTipHi = "दूध गाढ़ा होने पर कड़ाही के तले को लगातार खुरचकर चलाते रहें ताकि जले नहीं।",
        imageRes = R.drawable.img_paneer_masala_1794638377530,
        ingredients = listOf(
            Ingredient("Tender Red Carrots", "लाल मीठी गाजर", 500.0, "g", "ग्राम", true, themealdbIngredientUrl("Carrots"), R.drawable.img_step_chop),
            Ingredient("Full Cream Milk", "फुल क्रीम दूध", 2.5, "cups", "कप", true, themealdbIngredientUrl("Milk"), R.drawable.img_step_syrup_milk),
            Ingredient("Sugar", "चीनी", 0.5, "cup", "कप", true, themealdbIngredientUrl("Sugar"), R.drawable.img_step_spices),
            Ingredient("Desi Ghee", "देसी घी", 3.5, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Cardamom Powder", "इलायची पाउडर", 0.5, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Cardamom"), R.drawable.img_step_spices),
            Ingredient("Cashews, Almonds & Raisins", "काजू, बादाम व किशमिश", 3.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Almonds"), R.drawable.img_step_garnish_serve)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash, trim & peel sweet red carrots", "लाल गाजर को साफ धोकर छील लें",
                "Scrub carrots under cold running water to remove all soil, trim both ends, and peel outer skin thinly.",
                "ताज़ी लाल गाजर को साफ पानी से धोएं, दोनों सिरे काटें और छिलनी से पतला छिलका उतार लें।",
                "Pick bright red winter carrots with thin pale cores for maximum sweetness.", "पतली गहरी लाल गाजर सबसे ज़्यादा मीठी और स्वादिष्ट होती है।",
                4, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Wash & Peel)", heatLevelHi = "बिना गैस (धोना व छीलना)",
                timingDetailEn = "4 min cleaning", timingDetailHi = "4 मिनट में धोकर छीलें"
            ),
            CookingStep(
                2, "Grate carrots finely & evenly", "गाजर को मध्यम-बारीक कद्दूकस करें",
                "Grate peeled carrots using the medium holes of a box grater into uniform strands.",
                "छिली हुई गाजर को कद्दूकस के मध्यम हिस्से से एक-सा बारीक घिस लें।",
                "Medium-fine shreds cook quickly and keep classic grainy halwa texture.", "मध्यम बारीक घिसने से हलवे का दानेदार टेक्सचर बढ़िया बनता है।",
                8, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Grate)", heatLevelHi = "बिना गैस (कद्दूकस)",
                timingDetailEn = "8 min grating", timingDetailHi = "8 मिनट में गाजर घिसकर तैयार करें"
            ),
            CookingStep(
                3, "Roast grated carrots in ghee (6 min)", "कड़ाही में 2 चम्मच घी डालकर गाजर 6 मिनट भूनें",
                "Melt 2 tbsp ghee in a heavy kadhai on medium flame; add grated carrots and stir-roast 6 minutes until fragrant, softened slightly, and bright orange-red.",
                "भारी कड़ाही में 2 चम्मच घी गरम कर घिसी गाजर डालें और मध्यम आंच पर 6 मिनट खुशबू आने व रंग निखरने तक भूनें।",
                "Sauteing in ghee coats strands and brings out natural carrot sweetness.", "घी में भूनने से गाजर की कच्ची महक खत्म होकर मीठी खुशबू आती है।",
                6, PrepStage.SPICE, R.drawable.img_step_fry_onion,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Roast carrots 6 min", timingDetailHi = "6 मिनट घी में भूनें"
            ),
            CookingStep(
                4, "Pour full cream milk & bring to a boil", "फुल क्रीम दूध डालकर अच्छा उबाल आने दें",
                "Pour 2.5 cups full cream milk over the roasted carrots, stir gently, and heat on medium-high flame for 3 minutes until milk reaches a rolling boil.",
                "भुनी गाजर में ढाई कप फुल क्रीम दूध डालकर चलाएं और मध्यम-तेज़ आंच पर 3 मिनट उबाल आने दें।",
                "Use a wide kadhai so milk boils down and evaporates twice as fast.", "चौड़ी कड़ाही में दूध जल्दी उबलकर सूखता है।",
                3, PrepStage.COOK_SIMMER, R.drawable.img_step_syrup_milk,
                heatLevelEn = "Medium-High Flame", heatLevelHi = "मध्यम-तेज़ आंच",
                timingDetailEn = "3 min to boil", timingDetailHi = "3 मिनट उबाल आने तक पकाएं"
            ),
            CookingStep(
                5, "Simmer & stir until milk reduces into mawa", "दूध पूरा सूखकर दानेदार होने तक 15 मिनट पकाएं",
                "Lower to medium flame and simmer 15 minutes stirring every 2 minutes from the bottom until milk reduces completely into rich white khoya granules.",
                "मध्यम आंच पर 15 मिनट हर 2 मिनट में तले से चलाते हुए पकाएं जब तक सारा दूध सूखकर गाजर में खोये जैसा दानेदार न मिल जाए।",
                "If liquid remains at 15 min, cook 3–4 minutes longer before adding sugar.", "दूध बचा दिखे तो 3-4 मिनट और पकाकर पूरा सुखा लें।",
                15, PrepStage.COOK_SIMMER, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Simmer 15 min (+3–4 min if wet)", timingDetailHi = "15 मिनट दूध पूरा सूखने तक पकाएं"
            ),
            CookingStep(
                6, "Stir in sugar & cook out moisture (6 min)", "चीनी डालकर उसका पानी सूखने तक 6 मिनट भूनें",
                "Add 1/2 cup sugar (halwa turns glossy and wet again); stir regularly on medium flame for 6 minutes until all sugar moisture evaporates and halwa gathers together.",
                "चीनी मिलाएं (पहले पानी छूटेगा); मध्यम आंच पर लगातार चलाते हुए 6 मिनट पकाएं जब तक चीनी का पानी सूखकर हलवा चमकदार न हो जाए।",
                "Sugar only goes in AFTER milk dries—otherwise carrots take much longer to soften.", "दूध सूखने के बाद ही चीनी डालें तभी गाजर पूरी गलती है।",
                6, PrepStage.COOK_SIMMER, R.drawable.img_paneer_masala_1794638377530,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Cook 6 min until glossy", timingDetailHi = "6 मिनट चीनी का पानी सूखने तक पकाएं"
            ),
            CookingStep(
                7, "Toast nuts in remaining ghee & fold cardamom", "बचे घी में मेवे भूनकर इलायची संग मिलाएं",
                "Warm remaining 1.5 tbsp ghee in a small tadka pan; roast chopped cashews, almonds, and raisins 1 min golden, then pour with cardamom powder into the halwa and mix 1 min.",
                "छोटे पैन में बचा 1.5 चम्मच घी गरम कर कटे काजू, बादाम व किशमिश 1 मिनट सुनहरा भूनें, फिर इलायची पाउडर संग हलवे में डालकर 1 मिनट चलाएं।",
                "Final ghee & toasted nuts give restaurant shine and crunch!", "अंत में घी व भुने मेवे डालने से हलवे में शानदार चमक व स्वाद आता है।",
                2, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Toast nuts 1 min + fold 1 min", timingDetailHi = "1m मेवे भूनें + 1m हलवे में मिलाएं"
            ),
            CookingStep(
                8, "Rest 3 min covered & serve warm", "3 मिनट ढककर रखें और पिस्ता सजाकर गरम परोसें",
                "Turn off heat, rest covered 3 minutes so cardamom aroma sets, garnish with chopped pistachios, and serve warm!",
                "गैस बंद कर 3 मिनट ढका रखें ताकि इलायची की खुशबू बस जाए, फिर पिस्ता सजाकर गरमागरम परोसें!",
                "Tastes delicious warm on its own or topped with chilled rabri!", "गरमागरम गाजर का हलवा परोसने के लिए बिल्कुल तैयार है!",
                3, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off (Rest)", heatLevelHi = "गैस बंद (रेस्ट)",
                timingDetailEn = "Rest 3 min -> Serve warm!", timingDetailHi = "3 मिनट बाद गरमागरम परोसें!"
            )
        )
    )
)
