package com.example.data.catalog

import com.example.R
import com.example.data.model.*

val quickFiveMinRecipesPart1: List<Recipe> = listOf(
    Recipe(
        id = "cucumber_salad",
        nameEn = "Cucumber Salad",
        nameHi = "ककड़ी सलाद",
        country = Country.INDIA,
        category = FoodCategory.BREAKFAST_SNACKS,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER, MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 5,
        cookMinutes = 0,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        isPopular = true,
        isTrending = true,
        descriptionEn = "Crisp, refreshing Indian cucumber, tomato and onion salad tossed with fresh lemon juice and spices.",
        descriptionHi = "ताज़ा खीरे, टमाटर, प्याज और नींबू के रस से बना झटपट और सेहतमंद सलाद।",
        cookingTipEn = "Chill the cucumber for 10 minutes beforehand for extra crunch.",
        cookingTipHi = "सलाद को ज़्यादा कुरकुरा रखने के लिए नमक परोसने से ठीक पहले डालें।",
        safetyTipEn = "Always place the cucumber flat on the cutting board and curl your fingers inward while slicing.",
        safetyTipHi = "खीरा काटते समय चाकू को धीरे चलाएं और उंगलियों को अंदर की तरफ मोड़ कर रखें।",
        imageRes = R.drawable.img_salad_bowl_1794638376646,
        ingredients = listOf(
            Ingredient("Cucumber", "खीरा", 1.0, "piece", "नग", true, themealdbIngredientUrl("Cucumber"), R.drawable.img_step_wash),
            Ingredient("Tomato", "टमाटर", 1.0, "piece", "नग", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Onion", "प्याज", 1.0, "small", "छोटा", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_chop),
            Ingredient("Lemon", "नींबू", 0.5, "piece", "नग", true, themealdbIngredientUrl("Lemon"), R.drawable.img_step_lemon),
            Ingredient("Black Salt / Salt", "काला या सादा नमक", 0.5, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Salt"), R.drawable.img_step_spices),
            Ingredient("Chaat Masala", "चाट मसाला", 0.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash the cucumber and tomato", "खीरे और टमाटर को अच्छे से धो लें",
                "Rinse the cucumber and tomato thoroughly under clean running tap water for 20–30 seconds and pat dry.",
                "खीरे और टमाटर को साफ बहते पानी में अच्छी तरह रगड़कर धो लें और कपड़े से पोंछ लें।",
                "Wash before cutting so vitamins stay inside.", "सब्ज़ी को हमेशा काटने से पहले धोएं ताकि स्वाद और पोषण बना रहे।",
                1, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min washing", timingDetailHi = "1 मिनट साफ धोएं"
            ),
            CookingStep(
                2, "Slice the cucumber", "खीरे के गोल या छोटे टुकड़े काटें",
                "Trim both ends of the cucumber and slice into thin, even rounds on a cutting board.",
                "खीरे के दोनों सिरे काटकर हटा दें और चॉपिंग बोर्ड पर पतले गोल टुकड़ों में काट लें।",
                "Rubbing the cut tip gently removes bitterness if any.", "कटा सिरा हल्का घिसने से खीरे की कड़वाहट निकल जाती है।",
                1, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min slicing", timingDetailHi = "1 मिनट में खीरा काटें"
            ),
            CookingStep(
                3, "Chop onion and tomato", "प्याज और टमाटर काटें",
                "Peel the onion and chop both onion and tomato into neat bite-sized pieces.",
                "प्याज का छिलका उतारकर प्याज और टमाटर को छोटे-छोटे एक जैसे टुकड़ों में काट लें।",
                "Keep pieces similar in size so every bite has balanced flavor.", "टुकड़े बराबर आकार के रखें ताकि हर कौर में स्वाद बराबर आए।",
                1, PrepStage.CHOP, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min chopping", timingDetailHi = "1 मिनट में प्याज-टमाटर काटें"
            ),
            CookingStep(
                4, "Mix with lemon juice and spices", "बाउल में नींबू और मसाले मिलाएं",
                "Add cucumber, tomato, and onion to a mixing bowl. Squeeze fresh lemon juice, sprinkle salt and chaat masala, and toss gently.",
                "एक बड़े बाउल में कटी सब्ज़ियाँ डालें। ऊपर से आधा नींबू निचोड़ें, नमक और चाट मसाला छिड़ककर हल्के हाथ से मिलाएं।",
                "Add salt right before eating so veggies stay crisp.", "नमक बिल्कुल परोसने से पहले डालें ताकि सलाद पानी न छोड़े।",
                1, PrepStage.MIX, R.drawable.img_step_salad_mix,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min tossing", timingDetailHi = "1 मिनट हल्के हाथ से मिलाएं"
            ),
            CookingStep(
                5, "Garnish and serve fresh", "ताज़ा ककड़ी सलाद परोसें",
                "Transfer to a serving bowl, garnish with coriander or black pepper, and serve immediately.",
                "सलाद को सर्विंग बाउल में निकालें, ऊपर से हरा धनिया व काली मिर्च सजाएं और तुरंत ताज़ा परोसें।",
                "Serve right away while crunchy!", "बनाते ही तुरंत परोसें — ताज़ा सलाद तैयार है!",
                1, PrepStage.SERVE, R.drawable.img_salad_bowl_1794638376646,
                heatLevelEn = "Serve Fresh", heatLevelHi = "ताज़ा परोसें",
                timingDetailEn = "Serve immediately -> Ready!", timingDetailHi = "तुरंत परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "fruit_chaat",
        nameEn = "Fruit Chaat",
        nameHi = "फ्रूट चाट",
        country = Country.INDIA,
        category = FoodCategory.STREET_FOOD,
        mealTimes = listOf(MealTime.BREAKFAST, MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 5,
        cookMinutes = 0,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        isPopular = true,
        descriptionEn = "Sweet, tangy Indian street-style mixed fruit bowl seasoned with chaat masala and lemon.",
        descriptionHi = "ताज़े फलों में नींबू और चाट मसाला मिलाकर बनाई जाने वाली स्वादिष्ट फ्रूट चाट।",
        cookingTipEn = "Add banana just before serving so it stays fresh and bright.",
        cookingTipHi = "केला सबसे आखिरी में मिलाएं ताकि वह काला न पड़े।",
        safetyTipEn = "Dry wet fruit skins with a clean cloth before peeling so they don't slip.",
        safetyTipHi = "फल धोने के बाद साफ कपड़े से पोंछ लें ताकि काटते समय हाथ न फिसले।",
        imageRes = R.drawable.img_step_salad_mix,
        ingredients = listOf(
            Ingredient("Apple", "सेब", 1.0, "medium", "मध्यम", true, themealdbIngredientUrl("Apple"), R.drawable.img_step_wash),
            Ingredient("Banana", "केला", 1.0, "piece", "नग", true, themealdbIngredientUrl("Banana"), R.drawable.img_step_chop),
            Ingredient("Pomegranate Seeds", "अनार दाने", 0.5, "cup", "कप", true, null, R.drawable.img_step_salad_mix),
            Ingredient("Lemon", "नींबू", 0.5, "piece", "नग", true, themealdbIngredientUrl("Lemon"), R.drawable.img_step_lemon),
            Ingredient("Chaat Masala", "चाट मसाला", 0.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Roasted Cumin Powder", "भुना जीरा पाउडर", 0.25, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Cumin"), R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash firm fruits", "फलों को साफ धो लें",
                "Wash apple and pomegranate under clean running water and wipe dry with a clean towel.",
                "सेब व अन्य फलों को साफ पानी से धोकर सूखे कपड़े से पोंछ लें।",
                "Drying prevents slipping while slicing.", "पोंछ लेने से काटते समय फल हाथ से नहीं फिसलते।",
                1, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min washing", timingDetailHi = "1 मिनट धोकर पोंछ लें"
            ),
            CookingStep(
                2, "Core and dice the apple", "सेब के छोटे टुकड़े काटें",
                "Cut apple around the core, discard seeds, and dice into neat bite-sized cubes.",
                "सेब के बीच के बीज हटाकर एक जैसे छोटे चौकोर टुकड़े काट लें।",
                "Lemon juice keeps apple white and fresh.", "नींबू डालने से सेब काला नहीं पड़ता।",
                1, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min dicing", timingDetailHi = "1 मिनट में सेब काटें"
            ),
            CookingStep(
                3, "Slice banana & add pomegranate", "केला काटें और अनार दाने मिलाएं",
                "Peel banana and slice into thick rounds; place in a bowl with apple and pomegranate seeds.",
                "केला छीलकर गोल टुकड़ों में काटें और बाउल में सेब व अनार दानों के साथ डालें।",
                "Pick ripe yet firm bananas.", "बहुत ज़्यादा पका या गला हुआ केला न लें।",
                1, PrepStage.CHOP, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min slicing", timingDetailHi = "1 मिनट में केला व अनार मिलाएं"
            ),
            CookingStep(
                4, "Season with chaat masala & lemon", "चाट मसाला, जीरा और नींबू मिलाएं",
                "Sprinkle chaat masala and roasted cumin powder, squeeze half a lemon, and toss gently.",
                "ऊपर से चाट मसाला, भुना जीरा पाउडर और आधा नींबू निचोड़कर हल्के हाथ से मिलाएं।",
                "Don't over-mix so bananas don't mash.", "बहुत तेज़ी से न चलाएं वरना केला मसल जाएगा।",
                1, PrepStage.MIX, R.drawable.img_step_lemon,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min mixing", timingDetailHi = "1 मिनट हल्के से मिक्स करें"
            ),
            CookingStep(
                5, "Serve chilled or fresh immediately", "तुरंत कटोरियों में परोसें",
                "Spoon into serving bowls, top with mint leaf, and enjoy right away.",
                "कटोरियों में निकालकर ऊपर पुदीना पत्ती सजाएं और तुरंत ताज़ा परोसें।",
                "Fresh fruit chaat tastes best immediately!", "ताज़ा फ्रूट चाट तुरंत खाने में सबसे स्वादिष्ट लगता है।",
                1, PrepStage.SERVE, R.drawable.img_step_salad_mix,
                heatLevelEn = "Serve Fresh", heatLevelHi = "ताज़ा परोसें",
                timingDetailEn = "Serve immediately -> Ready!", timingDetailHi = "तुरंत परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "lemon_water",
        nameEn = "Lemon Water (Shikanji)",
        nameHi = "नींबू पानी (शिकंजी)",
        country = Country.INDIA,
        category = FoodCategory.BREAKFAST_SNACKS,
        mealTimes = listOf(MealTime.BREAKFAST, MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 4,
        cookMinutes = 0,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        descriptionEn = "Classic refreshing Indian nimbu pani sweetened lightly with black salt and cumin.",
        descriptionHi = "गर्मी और थकान दूर करने वाला झटपट और ताज़गी भरा देसी नींबू पानी।",
        cookingTipEn = "Dissolve sugar in a little room-temperature water before adding ice.",
        cookingTipHi = "बर्फ डालने से पहले चीनी को सामान्य पानी में घोल लें, इससे वह जल्दी घुलती है।",
        safetyTipEn = "Roll the lemon firmly on the table before cutting so the knife cuts easily.",
        safetyTipHi = "नींबू काटने से पहले हथेली से हल्का दबाकर घुमाएं, इससे रस ज़्यादा निकलता है।",
        imageRes = R.drawable.img_step_lemon,
        ingredients = listOf(
            Ingredient("Chilled Water", "ठंडा पानी", 2.0, "glasses", "गिलास", true, null, R.drawable.img_step_wash),
            Ingredient("Lemon", "नींबू", 1.0, "piece", "नग", true, themealdbIngredientUrl("Lemon"), R.drawable.img_step_lemon),
            Ingredient("Sugar", "चीनी", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Sugar"), R.drawable.img_step_spices),
            Ingredient("Black Salt", "काला नमक", 0.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Roasted Cumin Powder", "भुना जीरा पाउडर", 0.25, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Cumin"), R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash & roll lemon, cut & strain juice", "नींबू धोकर काटें और रस छान लें",
                "Rinse lemon and mint leaves. Roll lemon gently with palm, cut in half, and squeeze juice through a strainer into a jug.",
                "नींबू व पुदीना धो लें। नींबू को हथेली से हल्का घुमाकर काटें और छलनी से बीज रोकते हुए रस जग में निचोड़ें।",
                "Rolling softens pulp so you get maximum juice.", "काटने से पहले घुमाने से नींबू का सारा रस आसानी से निकलता है।",
                1, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min squeezing", timingDetailHi = "1 मिनट में नींबू का रस निकालें"
            ),
            CookingStep(
                2, "Dissolve sugar, black salt & cumin", "चीनी, काला नमक और भुना जीरा घोलें",
                "Add sugar, black salt, roasted cumin powder, and 1/2 glass room-temperature water; stir briskly 30–40 seconds until sugar dissolves completely.",
                "जग में चीनी, काला नमक, भुना जीरा पाउडर और आधा गिलास सामान्य पानी डालकर 30-40 सेकंड तक चीनी घुलने तक चलाएं।",
                "Sugar dissolves twice as fast before adding ice!", "बर्फ डालने से पहले चीनी घोलने पर वह तुरंत घुल जाती है।",
                1, PrepStage.MIX, R.drawable.img_step_spices,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "Stir 1 min until dissolved", timingDetailHi = "1 मिनट चीनी घुलने तक मिलाएं"
            ),
            CookingStep(
                3, "Add chilled water, ice & taste-adjust", "ठंडा पानी व बर्फ मिलाकर स्वाद जांचें",
                "Pour in remaining chilled water and ice cubes, stir well, and lightly crush 2 mint leaves inside.",
                "बाकी ठंडा पानी, बर्फ के टुकड़े और हल्के मसलकर 2 पुदीने के पत्ते डालें व अच्छे से चलाएं।",
                "Sip a spoonful to balance sweet and tangy.", "एक चम्मच चखकर मिठास या नमक अपनी पसंद अनुसार सही करें।",
                1, PrepStage.MIX, R.drawable.img_step_lemon,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min chilling", timingDetailHi = "1 मिनट बर्फ संग मिलाएं"
            ),
            CookingStep(
                4, "Pour into glasses & serve cold", "गिलासों में डालकर ठंडा परोसें",
                "Pour into tall glasses, garnish with a thin lemon slice and fresh mint, and serve immediately!",
                "लंबे गिलासों में निकालें, ऊपर नींबू का स्लाइस व पुदीना सजाकर ठंडा-ठंडा परोसें!",
                "Instant energy in 4 minutes!", "सिर्फ 4 मिनट में ताज़गी भरी शिकंजी तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Serve Chilled", heatLevelHi = "ठंडा परोसें",
                timingDetailEn = "Serve cold -> Ready!", timingDetailHi = "तुरंत ठंडा परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "banana_milkshake",
        nameEn = "Banana Milkshake",
        nameHi = "केला मिल्कशेक",
        country = Country.INDIA,
        category = FoodCategory.BREAKFAST_SNACKS,
        mealTimes = listOf(MealTime.BREAKFAST, MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 4,
        cookMinutes = 0,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        descriptionEn = "Creamy, energizing banana milkshake blended with chilled milk and aromatic cardamom.",
        descriptionHi = "सुबह की ताज़गी और ताकत के लिए झटपट तैयार गाढ़ा और क्रीमी केला मिल्कशेक।",
        cookingTipEn = "Use ripe spotted bananas—they are naturally sweeter so you need less sugar.",
        cookingTipHi = "पके हुए मीठे केले चुनें, इससे कम चीनी में भी बेहतरीन मिठास आती है।",
        safetyTipEn = "Make sure the blender jar lid is pressed down tightly before turning on the mixer.",
        safetyTipHi = "मिक्सी चलाने से पहले जार का ढक्कन हाथ से अच्छे से दबाकर रखें।",
        imageRes = R.drawable.img_step_raita,
        ingredients = listOf(
            Ingredient("Ripe Banana", "पका केला", 2.0, "pieces", "नग", true, themealdbIngredientUrl("Banana"), R.drawable.img_step_chop),
            Ingredient("Chilled Milk", "ठंडा दूध", 2.0, "cups", "कप", true, themealdbIngredientUrl("Milk"), R.drawable.img_step_raita),
            Ingredient("Honey or Sugar", "शहद या चीनी", 1.5, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Honey"), R.drawable.img_step_spices),
            Ingredient("Cardamom Powder", "इलायची पाउडर", 0.25, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Cardamom"), R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Peel and slice ripe bananas", "केले छीलकर टुकड़ों में काटें",
                "Peel ripe bananas and slice them into even thick coins directly onto a plate or jar.",
                "पके केलों का छिलका उतारकर छोटे गोल टुकड़ों में काट लें।",
                "Small coins blend cleanly without chunks.", "छोटे टुकड़े मिक्सी में बिना गुठली के जल्दी पिसते हैं।",
                1, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min slicing", timingDetailHi = "1 मिनट में केले काटें"
            ),
            CookingStep(
                2, "Blend banana, cardamom & 1/2 milk", "केले, इलायची और आधा दूध मिक्सी में पीसें",
                "Put banana slices, honey/sugar, cardamom powder, and half the chilled milk into mixer jar; blend 20 seconds until smooth puree.",
                "मिक्सी जार में केले, शहद/चीनी, इलायची पाउडर व आधा ठंडा दूध डालकर 20 सेकंड चिकना पीस लें।",
                "Using half milk first prevents lid splash.", "कम दूध में पहले पीसने से मिक्सी छलकती नहीं है।",
                1, PrepStage.MIX, R.drawable.img_step_blend,
                heatLevelEn = "Mixer (20 sec)", heatLevelHi = "मिक्सी (20 सेकंड)",
                timingDetailEn = "Blend 20–30 sec smooth", timingDetailHi = "20-30 सेकंड चिकना पेस्ट पीसें"
            ),
            CookingStep(
                3, "Add remaining chilled milk & froth", "बाकी ठंडा दूध डालकर झागदार ब्लेंड करें",
                "Pour remaining chilled milk (plus 2 ice cubes if desired) and blend 15 seconds more until creamy and frothy.",
                "बाकी ठंडा दूध (चाहें तो 2 बर्फ के टुकड़े) डालकर 15 सेकंड और चलाएं ताकि शेक क्रीमी व झागदार बने।",
                "Do not over-blend once frothy.", "हल्का झाग बनते ही मिक्सी बंद कर दें।",
                1, PrepStage.MIX, R.drawable.img_step_raita,
                heatLevelEn = "Mixer (15 sec)", heatLevelHi = "मिक्सी (15 सेकंड)",
                timingDetailEn = "Blend 15 sec frothy", timingDetailHi = "15 सेकंड झाग आने तक चलाएं"
            ),
            CookingStep(
                4, "Pour into glasses & serve chilled", "गिलासों में डालकर ठंडा परोसें",
                "Pour into tall glasses, sprinkle chopped almonds/pistachios on top, and drink fresh!",
                "गिलासों में निकालें, ऊपर से कटे बादाम-पिस्ता सजाएं और तुरंत ठंडा परोसें!",
                "Drink immediately before banana darkens.", "तुरंत पीने से रंग और स्वाद बिल्कुल ताज़ा रहता है।",
                1, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Serve Chilled", heatLevelHi = "ठंडा परोसें",
                timingDetailEn = "Serve fresh -> Ready!", timingDetailHi = "तुरंत परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "masala_papad",
        nameEn = "Masala Papad",
        nameHi = "मसाला पापड़",
        country = Country.INDIA,
        category = FoodCategory.STREET_FOOD,
        mealTimes = listOf(MealTime.SNACKS, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 4,
        cookMinutes = 1,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        descriptionEn = "Crispy roasted urad papad topped with finely chopped onion, tomato, coriander, and chaat masala.",
        descriptionHi = "भूने हुए कुरकुरे पापड़ पर बारीक कटे प्याज, टमाटर और चटपटे मसालों की टॉपिंग।",
        cookingTipEn = "Put the vegetable topping on the papad only right before eating so it stays crispy!",
        cookingTipHi = "सब्ज़ी की टॉपिंग परोसने से ठीक 1 मिनट पहले डालें वरना पापड़ नरम हो जाएगा।",
        safetyTipEn = "Use tongs (चिमटा) when roasting papad over a gas flame so your fingers stay safe.",
        safetyTipHi = "गैस पर पापड़ सेंकते समय हमेशा चिमटे (Tongs) का उपयोग करें।",
        imageRes = R.drawable.img_step_chutney_dip,
        ingredients = listOf(
            Ingredient("Urad Dal Papad", "उड़द दाल पापड़", 2.0, "pieces", "नग", true, null, R.drawable.img_dish_bread),
            Ingredient("Onion (finely chopped)", "बारीक कटा प्याज", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_chop),
            Ingredient("Tomato (finely chopped)", "बारीक कटा टमाटर", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Chaat Masala", "चाट मसाला", 0.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Red Chilli Powder", "लाल मिर्च पाउडर", 0.25, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Nylon Sev", "बारीक सेव", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_chutney_dip)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash tomato & coriander", "टमाटर और धनिया धोकर पोंछ लें",
                "Rinse firm tomato and fresh coriander leaves under clean water and pat completely dry.",
                "सख्त टमाटर व हरा धनिया साफ पानी से धोकर सूखे कपड़े से अच्छी तरह पोंछ लें।",
                "Dry veggies keep papad crunchy longer.", "सब्ज़ियाँ सूखी रखने से पापड़ गीला नहीं होता।",
                1, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min washing", timingDetailHi = "1 मिनट धोकर पोंछें"
            ),
            CookingStep(
                2, "Finely chop onion & deseeded tomato", "प्याज, बीज हटा टमाटर और धनिया बारीक काटें",
                "Scoop watery seeds out of tomato, then finely dice onion, tomato, and coriander.",
                "टमाटर के गीले बीज हटाकर प्याज, टमाटर और हरा धनिया बिल्कुल बारीक काट लें।",
                "Deseeding prevents wet soggy papad.", "टमाटर का पानी वाला बीच का हिस्सा हटाना ज़रूरी है।",
                1, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min fine chopping", timingDetailHi = "1 मिनट में बारीक काटें"
            ),
            CookingStep(
                3, "Toss topping with spices", "कटी सब्ज़ियों में मसाले मिलाएं",
                "Mix chopped onion, tomato, coriander, chaat masala, and chilli powder in a small bowl.",
                "कटोरी में प्याज, टमाटर, धनिया, चाट मसाला और लाल मिर्च पाउडर मिलाकर रख लें।",
                "Keep bowl aside until papad is roasted.", "पापड़ सेंकने के बाद ही इसे ऊपर डालें।",
                1, PrepStage.MIX, R.drawable.img_step_salad_mix,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min mixing", timingDetailHi = "1 मिनट मसाला मिलाएं"
            ),
            CookingStep(
                4, "Roast papad crisp on low tawa", "तवे पर धीमी आंच में पापड़ कुरकुरा सेंकें",
                "Roast each papad on a dry tawa pressing evenly with a clean folded cloth for 45–60 seconds until crisp without burning.",
                "सूखे तवे पर धीमी आंच में साफ कपड़े से हल्का दबाते हुए पापड़ को दोनों ओर 45-60 सेकंड कुरकुरा सेंकें।",
                "Low flame keeps papad flat and golden.", "धीमी आंच पर सेंकने से पापड़ जलता नहीं व सीधा रहता है।",
                1, PrepStage.COOK_SIMMER, R.drawable.img_step_tawa_roast,
                heatLevelEn = "Low Tawa", heatLevelHi = "धीमा तवा",
                timingDetailEn = "Roast 45–60 sec per papad", timingDetailHi = "45-60 सेकंड कुरकुरा होने तक सेंकें"
            ),
            CookingStep(
                5, "Top with veggies & sev, serve right away", "टॉपिंग व सेव सजाकर तुरंत परोसें",
                "Spread veggie masala evenly over crisp papad, top with crunchy nylon sev and a drop of lemon, and eat right away!",
                "सिके पापड़ पर तैयार सब्ज़ी फैलाएं, ऊपर बारीक सेव व नींबू की बूंदें डालकर तुरंत परोसें!",
                "Serve within 1 minute for maximum crunch!", "1 मिनट के अंदर खाएं — कुरकुरा स्टार्टर तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_chutney_dip,
                heatLevelEn = "Serve Immediately", heatLevelHi = "तुरंत परोसें",
                timingDetailEn = "Serve immediately -> Ready!", timingDetailHi = "तुरंत परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "bhel_puri",
        nameEn = "Bhel Puri",
        nameHi = "भेल पूरी",
        country = Country.INDIA,
        category = FoodCategory.STREET_FOOD,
        mealTimes = listOf(MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 5,
        cookMinutes = 0,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        isPopular = true,
        priorPrepNoteEn = "Requires ready-made puffed rice (murmura), sev, and chutneys on hand.",
        priorPrepNoteHi = "नोट: मुरमुरा, सेव और चटनी पहले से तैयार रखें।",
        descriptionEn = "Mumbai-style crunchy puffed rice chaat tossed with veggies, tangy chutneys, and crispy sev.",
        descriptionHi = "मुंबई स्टाइल कुरमुरा, प्याज-टमाटर, खट्टी-मीठी चटनी और सेव से बनी चटपटी भेल पूरी।",
        cookingTipEn = "Mix dry ingredients first, add wet chutneys last, and serve immediately.",
        cookingTipHi = "पहले सूखी चीज़ें मिलाएं और चटनी सबसे अंत में डालकर तुरंत परोसें।",
        safetyTipEn = "Keep wet bowls away from puffed rice until you are ready to eat.",
        safetyTipHi = "परोसने से पहले गीली चटनी को मुरमुरे से अलग रखें।",
        imageRes = R.drawable.img_step_chutney_dip,
        ingredients = listOf(
            Ingredient("Puffed Rice (Murmura)", "मुरमुरा", 2.0, "cups", "कप", true, null, R.drawable.img_step_spices),
            Ingredient("Onion (chopped)", "कटा प्याज", 0.5, "small", "छोटा", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_chop),
            Ingredient("Tomato (chopped)", "कटा टमाटर", 0.5, "medium", "मध्यम", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Tamarind Sweet Chutney", "इमली की मीठी चटनी", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_chutney_dip),
            Ingredient("Green Mint Chutney", "हरी चटनी", 1.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_chutney_dip),
            Ingredient("Fine Sev & Peanuts", "सेव और भुनी मूंगफली", 0.5, "cup", "कप", true, themealdbIngredientUrl("Peanuts"), R.drawable.img_step_spices)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash tomato & coriander", "टमाटर और हरा धनिया धो लें",
                "Wash tomato and fresh coriander leaves cleanly and pat dry.",
                "टमाटर व हरा धनिया साफ पानी से धोकर पोंछ लें।",
                "Patting dry helps keep murmura crunchy.", "सूखी सब्ज़ियों से मुरमुरा मुलायम नहीं होता।",
                1, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min washing", timingDetailHi = "1 मिनट धोकर पोंछें"
            ),
            CookingStep(
                2, "Finely chop onion, tomato & coriander", "प्याज, टमाटर और धनिया बारीक काटें",
                "Finely chop onion, deseeded tomato, and green coriander leaves.",
                "प्याज, बीज हटा टमाटर और हरे धनिये को बारीक काट लें।",
                "Tiny pieces mix evenly into puffed rice.", "बारीक टुकड़े हर चम्मच में बराबर स्वाद देते हैं।",
                1, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min chopping", timingDetailHi = "1 मिनट में बारीक काटें"
            ),
            CookingStep(
                3, "Combine dry murmura, peanuts & spices", "मुरमुरा, मूंगफली और मसाले मिलाएं",
                "In a wide bowl mix crisp murmura, chopped onion, tomato, roasted peanuts, and chaat masala.",
                "बड़े बाउल में कुरकुरा मुरमुरा, कटा प्याज, टमाटर, भुनी मूंगफली और चाट मसाला मिलाएं।",
                "Wide bowl lets you toss effortlessly.", "चौड़े बर्तन में भेल अच्छे से मिक्स होती है।",
                1, PrepStage.MIX, R.drawable.img_step_salad_mix,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min dry toss", timingDetailHi = "1 मिनट सूखी सामग्री मिलाएं"
            ),
            CookingStep(
                4, "Add wet chutneys & lemon juice", "मीठी-तीखी चटनी व नींबू डालकर झटपट मिलाएं",
                "Pour tamarind chutney, green mint chutney, and a squeeze of lemon; toss briskly for 15 seconds.",
                "इमली की मीठी चटनी, हरी चटनी और नींबू निचोड़कर 15 सेकंड तेज़ी से मिलाएं।",
                "Toss fast so murmura stays crispy!", "तेज़ी से मिलाकर तुरंत परोसें ताकि मुरमुरा कुरकुरा रहे।",
                1, PrepStage.MIX, R.drawable.img_step_chutney_dip,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "Toss fast 15–20 sec", timingDetailHi = "15-20 सेकंड में झटपट मिलाएं"
            ),
            CookingStep(
                5, "Top with crunchy sev & serve", "ऊपर सेव व धनिया सजाकर तुरंत परोसें",
                "Spoon into bowls, scatter generous crispy sev and coriander, and enjoy right away!",
                "कटोरियों में निकालकर ऊपर ढेर सारा बारीक सेव व हरा धनिया डालें और तुरंत खाएं!",
                "Eat right away for Mumbai chaat crunch!", "मुंबई स्ट्रीट जैसी चटपटी भेल पूरी तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Serve Immediately", heatLevelHi = "तुरंत परोसें",
                timingDetailEn = "Serve immediately -> Ready!", timingDetailHi = "तुरंत परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "peanut_chaat",
        nameEn = "Peanut Chaat",
        nameHi = "मूंगफली चाट",
        country = Country.INDIA,
        category = FoodCategory.STREET_FOOD,
        mealTimes = listOf(MealTime.SNACKS),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 4,
        cookMinutes = 0,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        priorPrepNoteEn = "Uses already roasted or pre-boiled peanuts.",
        priorPrepNoteHi = "नोट: पहले से भुनी हुई या उबली हुई मूंगफली का उपयोग करें।",
        descriptionEn = "Protein-rich crunchy roasted peanut chaat with onion, tomato, lemon, and chaat masala.",
        descriptionHi = "प्रोटीन से भरपूर, कुरकुरी भुनी मूंगफली और चटपटी सब्ज़ियों की झटपट चाट।",
        cookingTipEn = "If peanuts have skin on, rub them gently between your palms to peel easily.",
        cookingTipHi = "भुनी मूंगफली को हथेलियों के बीच रगड़ने से छिलका आसानी से निकल जाता है।",
        safetyTipEn = "Chop green chillies carefully and wash hands before touching your eyes.",
        safetyTipHi = "हरी मिर्च काटने के बाद हाथ साबुन से धो लें, आंखों को न छुएं।",
        imageRes = R.drawable.img_step_salad_mix,
        ingredients = listOf(
            Ingredient("Roasted Peanuts", "भुनी मूंगफली", 1.0, "cup", "कप", true, themealdbIngredientUrl("Peanuts"), R.drawable.img_step_spices),
            Ingredient("Onion (finely chopped)", "बारीक कटा प्याज", 1.0, "small", "छोटा", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_chop),
            Ingredient("Tomato (finely chopped)", "बारीक कटा टमाटर", 1.0, "small", "छोटा", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Lemon", "नींबू", 0.5, "piece", "नग", true, themealdbIngredientUrl("Lemon"), R.drawable.img_step_lemon),
            Ingredient("Chaat Masala", "चाट मसाला", 0.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Fresh Coriander", "ताज़ा हरा धनिया", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Coriander"), R.drawable.img_step_wash)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash & finely chop veggies", "टमाटर, प्याज व धनिया धोकर बारीक काटें",
                "Wash tomato and coriander, pat dry, and finely dice onion, deseeded tomato, and coriander.",
                "टमाटर व धनिया धोकर पोंछ लें, फिर प्याज, बीज हटा टमाटर और धनिया बारीक काट लें।",
                "Removing tomato seeds keeps peanuts extra crunchy.", "टमाटर के बीज हटाने से मूंगफली कुरकुरी रहती है।",
                2, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "2 min washing & chopping", timingDetailHi = "2 मिनट धोकर बारीक काटें"
            ),
            CookingStep(
                2, "Mix roasted peanuts with veggies", "बाउल में भुनी मूंगफली व सब्ज़ियाँ मिलाएं",
                "Combine roasted peanuts and chopped onion-tomato in a clean mixing bowl.",
                "एक बाउल में भुनी मूंगफली के साथ कटे प्याज-टमाटर डालकर मिलाएं।",
                "If peanuts are salted, reduce extra salt.", "नमकीन मूंगफली लें तो अलग से नमक कम डालें।",
                1, PrepStage.MIX, R.drawable.img_step_salad_mix,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min combining", timingDetailHi = "1 मिनट मिलाएं"
            ),
            CookingStep(
                3, "Season with chaat masala & lemon", "चाट मसाला और नींबू का रस मिलाएं",
                "Sprinkle chaat masala, chilli powder, and pinch of salt; squeeze half a fresh lemon and toss well.",
                "चाट मसाला, थोड़ी मिर्च व चुटकी नमक छिड़कें और आधा नींबू निचोड़कर अच्छे से मिक्स करें।",
                "Fresh lemon lifts all the nutty flavors.", "ताज़ा नींबू मूंगफली के स्वाद को और चटपटा बनाता है।",
                1, PrepStage.MIX, R.drawable.img_step_lemon,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min seasoning", timingDetailHi = "1 मिनट मसाले मिलाएं"
            ),
            CookingStep(
                4, "Garnish & serve crisp immediately", "धनिया सजाकर तुरंत परोसें",
                "Scoop into bowls, garnish with fresh coriander leaves, and serve right away!",
                "कटोरियों में निकालें, ऊपर हरा धनिया सजाएं और तुरंत कुरकुरी चाट का मज़ा लें!",
                "High-protein tea-time snack ready!", "प्रोटीन से भरपूर 4-मिनट चाट तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Serve Fresh", heatLevelHi = "ताज़ा परोसें",
                timingDetailEn = "Serve immediately -> Ready!", timingDetailHi = "तुरंत परोसें — तैयार!"
            )
        )
    ),
    Recipe(
        id = "cucumber_raita",
        nameEn = "Cucumber Raita",
        nameHi = "खीरे का रायता",
        country = Country.INDIA,
        category = FoodCategory.DAL_CURRY,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 5,
        cookMinutes = 0,
        defaultServings = 2,
        isFiveMinuteSpecial = true,
        descriptionEn = "Cooling whipped yogurt dip with grated cucumber, roasted cumin, and mint.",
        descriptionHi = "कद्दूकस किए खीरे, ताज़ी दही और भुने जीरे से बना ठंडा और स्वादिष्ट रायता।",
        cookingTipEn = "Whisk the curd smooth before adding cucumber so the raita looks creamy.",
        cookingTipHi = "खीरा मिलाने से पहले दही को अच्छे से फेंट लें ताकि रायता मलाईदार बने।",
        safetyTipEn = "Watch your knuckles carefully when using a box grater (कद्दूकस).",
        safetyTipHi = "कद्दूकस करते समय आखिरी हिस्से पर उंगलियों का ध्यान रखें।",
        imageRes = R.drawable.img_step_raita,
        ingredients = listOf(
            Ingredient("Fresh Curd (Yogurt)", "ताज़ा दही", 1.0, "cup", "कप", true, themealdbIngredientUrl("Yogurt"), R.drawable.img_step_raita),
            Ingredient("Cucumber", "खीरा", 0.5, "medium", "मध्यम", true, themealdbIngredientUrl("Cucumber"), R.drawable.img_step_wash),
            Ingredient("Roasted Cumin Powder", "भुना जीरा पाउडर", 0.5, "tsp", "छोटी चम्मच", true, themealdbIngredientUrl("Cumin"), R.drawable.img_step_spices),
            Ingredient("Black Salt", "काला नमक", 0.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Fresh Coriander", "हरा धनिया", 1.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Coriander"), R.drawable.img_step_wash)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash cucumber & coriander", "खीरा और धनिया धो लें",
                "Rinse cucumber and fresh coriander under running water and taste a thin slice to ensure cucumber isn't bitter.",
                "खीरे व धनिये को साफ पानी से धोएं और एक छोटा टुकड़ा चखकर देख लें कि खीरा कड़वा न हो।",
                "Checking bitterness saves the whole dish!", "खीरा कड़वा न हो इसकी जांच पहले ही कर लें।",
                1, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min washing", timingDetailHi = "1 मिनट साफ धोएं"
            ),
            CookingStep(
                2, "Peel & finely grate cucumber", "खीरा छीलकर कद्दूकस करें",
                "Peel cucumber, grate finely with a grater, and squeeze gently if you prefer thicker raita.",
                "खीरा छीलकर कद्दूकस से बारीक घिस लें; गाढ़ा रायता पसंद हो तो हल्का पानी निचोड़ लें।",
                "Watch your fingers near the grater blades.", "कद्दूकस करते समय उंगलियों का ध्यान रखें।",
                1, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min grating", timingDetailHi = "1 मिनट में कद्दूकस करें"
            ),
            CookingStep(
                3, "Whisk fresh curd creamy smooth", "दही को चिकना फेंट लें",
                "Beat fresh chilled curd in a bowl with a spoon or whisk until completely smooth with zero lumps.",
                "कटोरे में ठंडा दही लेकर चम्मच या व्हिस्क से गुठलियाँ खत्म होने तक बिल्कुल चिकना फेंट लें।",
                "Add 2 tbsp water only if curd is very thick.", "दही बहुत गाढ़ा लगे तो 2 चम्मच पानी मिलाएं।",
                1, PrepStage.MIX, R.drawable.img_step_raita,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min whisking", timingDetailHi = "1 मिनट स्मूद फेंटें"
            ),
            CookingStep(
                4, "Fold grated cucumber & spices", "घिसा खीरा, काला नमक और भुना जीरा मिलाएं",
                "Stir grated cucumber, black salt, roasted cumin powder, and chopped coriander smoothly into the curd.",
                "फेंटी दही में कद्दूकस खीरा, काला नमक, भुना जीरा पाउडर और कटा धनिया मिलाकर चलाएं।",
                "Roasted cumin gives classic cooling aroma.", "भुना जीरा रायते में खुशबू और स्वाद भर देता है।",
                1, PrepStage.MIX, R.drawable.img_step_spices,
                heatLevelEn = "No Flame", heatLevelHi = "बिना गैस",
                timingDetailEn = "1 min mixing", timingDetailHi = "1 मिनट अच्छे से मिलाएं"
            ),
            CookingStep(
                5, "Garnish & serve cool", "जीरे से सजाकर ठंडा परोसें",
                "Sprinkle a pinch of roasted cumin and red chilli powder on top and serve with biryani or paratha!",
                "ऊपर से थोड़ा भुना जीरा व चुटकी लाल मिर्च सजाएं और बिरयानी या पराठे संग ठंडा परोसें!",
                "Soothing digestive side ready in 5 min!", "5 मिनट में ठंडा-ठंडा रायता तैयार!",
                1, PrepStage.SERVE, R.drawable.img_step_raita,
                heatLevelEn = "Serve Cool", heatLevelHi = "ठंडा परोसें",
                timingDetailEn = "Serve cool -> Ready!", timingDetailHi = "तुरंत ठंडा परोसें — तैयार!"
            )
        )
    )
)
