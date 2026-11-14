package com.example.data.catalog

import com.example.R
import com.example.data.model.*

val internationalRecipesPakistan: List<Recipe> = listOf(
    // PAKISTAN
    Recipe(
        id = "mutton_karahi",
        nameEn = "Pakistani Mutton Karahi",
        nameHi = "पाकिस्तानी मटन कड़ाही",
        country = Country.PAKISTAN,
        category = FoodCategory.INTERNATIONAL,
        mealTimes = listOf(MealTime.LUNCH, MealTime.DINNER),
        isVeg = false,
        difficulty = Difficulty.MEDIUM,
        prepMinutes = 16,
        cookMinutes = 42,
        defaultServings = 4,
        isPopular = true,
        isTrending = true,
        descriptionEn = "Authentic Peshawari-Lahori wok mutton slow-tenderized simply with ripe tomatoes, ginger-garlic, yogurt, green chillies, and crushed black pepper.",
        descriptionHi = "बिना प्याज के ताज़े लाल टमाटर, अदरक लच्छे, हरी मिर्च, दही और कुटी काली मिर्च के साथ कड़ाही में पका असली पाकिस्तानी मटन कड़ाही।",
        cookingTipEn = "No onions needed! Real Pakistani Karahi gets its rich thick masala purely from generous ripe tomatoes and patient high-heat bhunai.",
        cookingTipHi = "असली मटन कड़ाही में प्याज नहीं पड़ता—खूब सारे पके टमाटर, दही और तेज़ भुनाई से ही शानदार गाढ़ी तरी बनती है।",
        safetyTipEn = "Always use kitchen tongs to peel off softened hot tomato skins before mashing tomatoes into the mutton.",
        safetyTipHi = "गरम टमाटर के छिलके उतारने के लिए हमेशा चिमटे (Tongs) का उपयोग करें, हाथ न लगाएं।",
        imageRes = R.drawable.img_dish_naan_curry,
        ingredients = listOf(
            Ingredient("Mutton (Bone-in Curry Cut)", "मटन के टुकड़े", 500.0, "g", "ग्राम", true, themealdbIngredientUrl("Lamb"), R.drawable.img_dish_naan_curry),
            Ingredient("Ripe Red Tomatoes (halved)", "ताज़े लाल टमाटर", 5.0, "medium", "मध्यम", true, themealdbIngredientUrl("Tomato"), R.drawable.img_step_chop),
            Ingredient("Ginger-Garlic Paste & Julienne Ginger", "अदरक-लहसुन पेस्ट व अदरक लच्छे", 2.0, "tbsp", "बड़ी चम्मच", true, themealdbIngredientUrl("Garlic"), R.drawable.img_step_spices),
            Ingredient("Whisked Yogurt (Curd)", "ताज़ा फेंटा दही", 0.5, "cup", "कप", true, themealdbIngredientUrl("Yogurt"), R.drawable.img_step_raita),
            Ingredient("Crushed Coriander, Cumin & Black Pepper", "कुटा धनिया, जीरा व काली मिर्च", 2.5, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Ghee/Oil, Green Chillies & Coriander", "घी/तेल, हरी मिर्च व धनिया", 4.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_garnish_serve)
        ),
        steps = listOf(
            CookingStep(
                1, "Wash mutton cleanly & drain dry", "मटन को साफ धोकर पानी निथार लें",
                "Rinse bone-in mutton pieces 3 times in cold water and let drain in a strainer for 5 minutes so extra water leaves completely.",
                "मटन के टुकड़ों को साफ पानी से 3 बार धोएं और 5 मिनट छलनी में रखकर पूरा पानी निथरने दें।",
                "Patting meat dry helps it sear golden right away without boiling.", "पानी निथारने से मटन तेल में जाते ही बढ़िया सुनहरा भुनता है।",
                5, PrepStage.WASH, R.drawable.img_step_wash,
                heatLevelEn = "No Flame (Wash)", heatLevelHi = "बिना गैस (सफाई)",
                timingDetailEn = "5 min wash & drain", timingDetailHi = "5 मिनट में धोकर पानी निथारें"
            ),
            CookingStep(
                2, "Halve tomatoes, crush spices & slice ginger", "टमाटर दो हिस्से में काटें व साबुत मसाले दरदरे कूटें",
                "Wash 5 ripe tomatoes and slice strictly in half; coarsely crush coriander seeds, cumin seeds, and black peppercorns; cut ginger into thin strips and slit green chillies.",
                "5 पके टमाटरों को बीच से दो भागों में काटें; साबुत धनिया, जीरा व काली मिर्च दरदरा कूटें और अदरक के पतले लच्छे व हरी मिर्च तैयार करें।",
                "Halved tomatoes steam softly so their skins lift off in one piece!", "आधे कटे टमाटर से छिलके चिमटे से एक ही बार में उतर आते हैं।",
                5, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (तैयारी)",
                timingDetailEn = "5 min prepping & crushing", timingDetailHi = "5 मिनट में टमाटर व मसाले तैयार करें"
            ),
            CookingStep(
                3, "High-heat sear mutton in ghee & ginger-garlic", "घी व अदरक-लहसुन में मटन को 6 मिनट तेज़ भूनें",
                "Heat 4 tbsp ghee/oil in a heavy karahi on medium-high flame; add mutton, 1.5 tbsp ginger-garlic paste, and salt; fry vigorously for 6 minutes until meat turns pale golden.",
                "भारी कड़ाही में घी गरम कर मटन, अदरक-लहसुन पेस्ट व नमक डालें और मध्यम-तेज़ आंच पर 6 मिनट रंग बदलने तक भूनें।",
                "High sear seals natural juices inside and removes raw meat smell.", "तेज़ भूनने से मटन अंदर से रसीला रहता है और कच्चापन दूर होता है।",
                6, PrepStage.SPICE, R.drawable.img_dish_naan_curry,
                heatLevelEn = "Medium-High Flame", heatLevelHi = "मध्यम-तेज़ आंच",
                timingDetailEn = "Sear 6 min until pale golden", timingDetailHi = "6 मिनट रंग बदलने तक भूनें"
            ),
            CookingStep(
                4, "Add hot water, arrange tomato halves & cover", "गरम पानी व कटे टमाटर रखकर 25 मिनट ढककर गलाएं",
                "Pour 1 cup hot water, lay halved tomatoes cut-side DOWN on top of mutton, cover with a tight lid, and simmer on LOW heat for 25 minutes until mutton softens (add 1/2 cup hot water & cook 8 min more if tough).",
                "1 कप गरम पानी डालें, ऊपर टमाटर के टुकड़े कटे हिस्से से नीचे की ओर सजाएं और ढक्कन बंद कर धीमी आंच पर 25 मिनट मटन गलने तक पकाएं।",
                "Adding hot water keeps mutton fibers tender rather than tightening them.", "हमेशा गरम पानी ही डालें ताकि मटन जल्दी व नरम गले।",
                25, PrepStage.COOK_SIMMER, R.drawable.img_step_boil_pot,
                heatLevelEn = "Low Flame (Covered)", heatLevelHi = "धीमी आंच (ढककर)",
                timingDetailEn = "Simmer 25 min (+8 min if still firm)", timingDetailHi = "25 मिनट ढककर गलाएं (कड़ा लगे तो 8m और)"
            ),
            CookingStep(
                5, "Peel loosened tomato skins cleanly with tongs", "चिमटे से टमाटर के ढीले छिलके बाहर निकाल लें",
                "Lift the lid carefully and use kitchen tongs to pull off every curled tomato skin cleanly from the softened tomatoes.",
                "ढक्कन हटाकर चिमटे की मदद से नरम टमाटरों के ऊपर तैरते सारे छिलके एक-एक कर निकाल कर अलग कर दें।",
                "Skinless tomatoes mash into a restaurant-smooth glossy karahi sauce!", "छिलके हटाने से कड़ाही की ग्रेवी बिल्कुल चिकनी और लाजवाब बनती है।",
                2, PrepStage.MIX, R.drawable.img_cooking_prep_1794638377448,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "2 min peeling skins", timingDetailHi = "2 मिनट में सारे छिलके निकालें"
            ),
            CookingStep(
                6, "Mash tomatoes & stir on medium-high flame", "टमाटर मसलकर 4 मिनट पानी कम होने तक भूनें",
                "Raise flame to medium-high and smash the skinless tomatoes smoothly with the back of your spoon, simmering uncovered 4 minutes as excess water evaporates.",
                "आंच मध्यम-तेज़ करें और चमचे से टमाटरों को मसलते हुए 4 मिनट खुला पकाएं ताकि अतिरिक्त पानी सूखने लगे।",
                "Keep scraping bottom gently so thick tomato doesn't catch.", "तले से चलाते रहें ताकि टमाटर चिपके नहीं।",
                4, PrepStage.COOK_SIMMER, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Medium-High (Uncovered)", heatLevelHi = "मध्यम-तेज़ (बिना ढके)",
                timingDetailEn = "Mash & evaporate 4 min", timingDetailHi = "4 मिनट मसलकर भूनें"
            ),
            CookingStep(
                7, "Fold whisked yogurt smoothly on low flame", "आंच धीमी कर फेंटा दही मिलाकर 3 मिनट पकाएं",
                "Lower flame completely, slowly stir in whisked curd so it doesn't curdle, and simmer 3 minutes stirring continuously until yogurt blends smoothly.",
                "आंच बिल्कुल धीमी कर ताज़ा फेंटा दही धीरे-धीरे डालें और 3 मिनट लगातार चलाते हुए पकाएं ताकि दही फटे नहीं।",
                "Always lower heat before adding yogurt!", "दही डालते समय आंच धीमी रखने से ग्रेवी फटती नहीं व मखमली बनती है।",
                3, PrepStage.COOK_SIMMER, R.drawable.img_step_raita,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Stir curd 3 min", timingDetailHi = "3 मिनट लगातार चलाते हुए पकाएं"
            ),
            CookingStep(
                8, "Add crushed coriander, cumin & red chilli", "कुटा धनिया, जीरा, मिर्च व काली मिर्च डालें",
                "Sprinkle freshly crushed coriander, roasted cumin, red chilli flakes/powder, and half the crushed black pepper; mix well on medium flame.",
                "दरदरा कुटा धनिया, जीरा, लाल मिर्च व आधी कुटी काली मिर्च डालकर मध्यम आंच पर अच्छी तरह मिलाएं।",
                "Freshly crushed spices aroma explodes cleanly into the oil!", "ताज़े कुटे मसाले डालने से असली पेशावरी कड़ाही खुशबू आती है।",
                2, PrepStage.SPICE, R.drawable.img_step_spices,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "2 min spice infusion", timingDetailHi = "2 मिनट मसाले भूनें"
            ),
            CookingStep(
                9, "High-heat bhunai until oil shines bright", "5 मिनट तेज़ भुनाई करें जब तक घी ऊपर न आ जाए",
                "Turn flame to medium-high and bhuno (stir-fry) uncovered for 5 minutes until masala turns thick, glossy dark red, and oil separates cleanly around mutton pieces.",
                "मध्यम-तेज़ आंच पर 5 मिनट खुला रखकर लगातार भूनें जब तक ग्रेवी गाढ़ी चमकदार न हो जाए और किनारों पर घी न चमकने लगे।",
                "Patience in this final bhunai delivers true Lahore truck-adda karahi taste!", "इस आखिरी भुनाई से ही कड़ाही में असली ढाबा स्वाद आता है।",
                5, PrepStage.COOK_SIMMER, R.drawable.img_dish_naan_curry,
                heatLevelEn = "Medium-High (Bhunai)", heatLevelHi = "मध्यम-तेज़ (भुनाई)",
                timingDetailEn = "Bhunai 5 min until oil separates", timingDetailHi = "5 मिनट घी छूटने तक भुनाई करें"
            ),
            CookingStep(
                10, "Garnish ginger juliennes, chillies, rest & serve", "अदरक लच्छे व हरी मिर्च सजाकर 3 मिनट बाद परोसें",
                "Switch off flame, scatter remaining black pepper, fresh ginger juliennes, slit green chillies, and coriander; cover 3 minutes to infuse, then serve piping hot straight in the karahi with naan!",
                "गैस बंद कर ऊपर बची काली मिर्च, अदरक लच्छे, कटी हरी मिर्च व धनिया डालें। 3 मिनट ढका रखें और गरमागरम खमीरी रोटी या नान संग परोसें!",
                "Serve straight from the hot karahi for restaurant presentation!", "गरम कड़ाही में नान संग परोसें — लाजवाब पाकिस्तानी मटन कड़ाही तैयार!",
                3, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off (Rest 3m)", heatLevelHi = "गैस बंद (3m रेस्ट)",
                timingDetailEn = "Rest 3 min covered -> Ready!", timingDetailHi = "3 मिनट ढका रखें — गरमागरम तैयार!"
            )
        )
    ),
    Recipe(
        id = "lahori_chana",
        nameEn = "Lahori Chana (Chikar Cholay)",
        nameHi = "लाहोरी चना मसाला (चिकड़ छोले)",
        country = Country.PAKISTAN,
        category = FoodCategory.INTERNATIONAL,
        mealTimes = listOf(MealTime.BREAKFAST, MealTime.LUNCH),
        isVeg = true,
        difficulty = Difficulty.EASY,
        prepMinutes = 12,
        cookMinutes = 22,
        defaultServings = 4,
        priorPrepNoteEn = "Requires soaked & boiled white chickpeas (if raw, soak 8 hrs & boil 5 whistles / 15 min first).",
        priorPrepNoteHi = "नोट: सफेद काबुली चने पहले से भीगे और उबले होने चाहिए (कच्चे हों तो 8 घंटे भिगोकर 5 सीटी उबालें)।",
        descriptionEn = "Velvety, mildly spiced Pakistani breakfast chickpeas naturally thickened with blended chana paste, yogurt, and black pepper.",
        descriptionHi = "सुबह के नाश्ते की मशहूर लाहोरी डिश—उबले चने के पेस्ट, दही और काली मिर्च से बनी मखमली गाढ़ी चना करी।",
        cookingTipEn = "Blend 1/4 cup soft boiled chickpeas with stock into a creamy paste—that creates the authentic velvety Lahori gravy!",
        cookingTipHi = "चौथाई कप उबले चने को थोड़े पानी संग पीसकर डालने से बिना क्रीम के लाहोरी चने जैसा गाढ़ा टेक्सचर आता है।",
        safetyTipEn = "Keep flame low once chickpea paste is added because thick gravy tends to bubble and splatter.",
        safetyTipHi = "पिसा चना पेस्ट डालने के बाद आंच धीमी रखें ताकि छींटे न उड़ें।",
        imageRes = R.drawable.img_dish_curry_bowl,
        ingredients = listOf(
            Ingredient("Soft Boiled White Chickpeas & Stock", "उबले काबुली चने व उबला पानी", 2.0, "cups", "कप", true, themealdbIngredientUrl("Chickpeas"), R.drawable.img_step_wash),
            Ingredient("Onion & Ginger-Garlic Paste", "बारीक प्याज व अदरक-लहसुन पेस्ट", 1.0, "medium", "मध्यम", true, themealdbIngredientUrl("Onion"), R.drawable.img_step_fry_onion),
            Ingredient("Fresh Whisked Yogurt", "ताज़ा फेंटा दही", 0.5, "cup", "कप", true, themealdbIngredientUrl("Yogurt"), R.drawable.img_step_raita),
            Ingredient("Crushed Black Pepper, Cumin & Garam Masala", "काली मिर्च, जीरा व गरम मसाला", 2.0, "tsp", "छोटी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Ghee or Cooking Oil", "घी या तेल", 3.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_spices),
            Ingredient("Green Chillies, Hard-Boiled Egg (optional) & Coriander", "हरी मिर्च, उबला अंडा (वैकल्पिक) व धनिया", 2.0, "tbsp", "बड़ी चम्मच", true, null, R.drawable.img_step_garnish_serve)
        ),
        steps = listOf(
            CookingStep(
                1, "Blend 1/4 cup boiled chickpeas into smooth paste", "चौथाई कप उबले चनों को पीसकर मखमली पेस्ट बनाएं",
                "Check that boiled chickpeas mash creamy between fingers (boil 5 min more if firm). Blend 1/4 cup chickpeas + 1/4 cup boiling stock into a smooth thick paste.",
                "जांच लें कि उबले चने उंगली से मक्खन जैसे दबें; अब चौथाई कप चनों को चौथाई कप पानी संग मिक्सी में बिल्कुल चिकना पीस लें।",
                "This blended chickpea paste creates authentic creamy Chikar Cholay body!", "पिसा चना पेस्ट ही लाहोरी चिकड़ छोलों का असली गाढ़ा स्वाद देता है।",
                3, PrepStage.MIX, R.drawable.img_step_blend,
                heatLevelEn = "No Flame (Blend)", heatLevelHi = "बिना गैस (पीसना)",
                timingDetailEn = "3 min blending", timingDetailHi = "3 मिनट में चिकना पेस्ट पीसें"
            ),
            CookingStep(
                2, "Finely chop onion, green chillies & coriander", "प्याज, हरी मिर्च और हरा धनिया बारीक काटें",
                "Finely dice 1 medium onion so it melts smoothly into the gravy, slit 2 green chillies, and chop fresh coriander.",
                "1 मध्यम प्याज बिल्कुल बारीक काट लें ताकि ग्रेवी में घुल जाए; साथ ही 2 हरी मिर्च व ताज़ा हरा धनिया काटकर रखें।",
                "Fine onion slices caramelize evenly and leave zero chunky bits.", "बारीक कटा प्याज भुनने पर ग्रेवी में पूरी तरह घुल जाता है।",
                3, PrepStage.CHOP, R.drawable.img_step_chop,
                heatLevelEn = "No Flame (Prep)", heatLevelHi = "बिना गैस (कटिंग)",
                timingDetailEn = "3 min chopping", timingDetailHi = "3 मिनट में सब काट लें"
            ),
            CookingStep(
                3, "Fry chopped onion golden & roast ginger-garlic", "प्याज सुनहरा भूनकर अदरक-लहसुन 1 मिनट पकाएं",
                "Heat 3 tbsp oil/ghee in a pot on medium flame; saute chopped onion 5 minutes until light golden, then stir in 1 tbsp ginger-garlic paste for 1 minute.",
                "कड़ाही में तेल/घी गरम कर बारीक प्याज को 5 मिनट हल्का सुनहरा भूनें, फिर अदरक-लहसुन पेस्ट डालकर 1 मिनट अच्छी तरह भूनें।",
                "Keep onions golden, not burnt dark brown, to preserve mild creaminess.", "प्याज को हल्का सुनहरा ही रखें ताकि करी का रंग व स्वाद हल्का मीठा रहे।",
                6, PrepStage.SPICE, R.drawable.img_step_fry_onion,
                heatLevelEn = "Medium Flame", heatLevelHi = "मध्यम आंच",
                timingDetailEn = "Fry onion 5 min + garlic 1 min", timingDetailHi = "प्याज 5m + अदरक-लहसुन 1m भूनें"
            ),
            CookingStep(
                4, "Cook whisked yogurt & spices until oil separates", "धीमी आंच पर दही व मसाले तेल छूटने तक पकाएं",
                "Lower flame completely; stir in 1/2 cup whisked yogurt, turmeric, coriander powder, cumin powder, and red chilli; cook 5 minutes stirring often until oil shines on top.",
                "आंच धीमी कर फेंटा दही, हल्दी, धनिया, जीरा व लाल मिर्च डालें और लगातार चलाते हुए 5 मिनट तेल अलग होने तक पकाएं।",
                "Slow simmering ensures smooth yogurt masala with zero curdling.", "धीमी आंच पर लगातार चलाने से दही बिल्कुल नहीं फटता।",
                5, PrepStage.COOK_SIMMER, R.drawable.img_step_raita,
                heatLevelEn = "Low Flame", heatLevelHi = "धीमी आंच",
                timingDetailEn = "Simmer 5 min until oil separates", timingDetailHi = "5 मिनट धीमी आंच पर तेल छूटने तक पकाएं"
            ),
            CookingStep(
                5, "Fold whole boiled chickpeas & blended paste", "उबले चने व पिसा चना पेस्ट डालकर 2 मिनट मिलाएं",
                "Add remaining whole boiled chickpeas, the blended chickpea paste, and 1 cup chickpea stock/warm water; stir gently so paste blends seamlessly.",
                "बाकी उबले चने, पिसा हुआ चना पेस्ट और 1 कप गरम पानी/स्टॉक डालें और हल्के हाथ से एकसार मिलाएं।",
                "Add 1/4 cup more hot water if it feels thicker than cream.", "बहुत गाढ़ा लगे तो थोड़ा गरम पानी डालकर पतला कर सकते हैं।",
                2, PrepStage.MIX, R.drawable.img_step_simmer_masala,
                heatLevelEn = "Low-Medium Flame", heatLevelHi = "धीमी-मध्यम आंच",
                timingDetailEn = "2 min combining", timingDetailHi = "2 मिनट अच्छे से मिलाएं"
            ),
            CookingStep(
                6, "Simmer gently with crushed black pepper (8–10 min)", "कुटी काली मिर्च डालकर ढककर 8-10 मिनट पकाएं",
                "Sprinkle 1 tsp freshly crushed black pepper and salt; cover and simmer on LOW heat for 8–10 minutes stirring twice from bottom so thick gravy doesn't catch.",
                "1 चम्मच ताज़ी कुटी काली मिर्च व नमक डालें, ढकें और धीमी आंच पर 8-10 मिनट पकाएं (तले में न लगे इसलिए बीच में 2 बार चलाएं)।",
                "Black pepper provides the signature warming Lahori heat!", "ताज़ी कुटी काली मिर्च ही लाहोरी चने का असली स्वाद देती है।",
                9, PrepStage.COOK_SIMMER, R.drawable.img_dish_curry_bowl,
                heatLevelEn = "Low Flame (Covered)", heatLevelHi = "धीमी आंच (ढककर)",
                timingDetailEn = "Simmer 8–10 min (+3 min to thicken)", timingDetailHi = "8-10 मिनट धीमी आंच पर उबालें"
            ),
            CookingStep(
                7, "Finish with garam masala, chillies, rest & serve", "गरम मसाला व हरी मिर्च डालकर 3 मिनट बाद परोसें",
                "Switch off stove, sprinkle 1/2 tsp garam masala, slit green chillies, and fresh coriander; cover 3 minutes for oil to rise glossy, and serve hot with naan, kulcha, or poori!",
                "गैस बंद कर गरम मसाला, हरी मिर्च व हरा धनिया डालें; 3 मिनट ढका रखें ताकि तरी ऊपर चमक उठे, फिर गरमागरम नान या पूरी संग परोसें!",
                "Authentic Lahore Sunday nashta (breakfast) ready!", "लाजवाब मखमली लाहोरी चना मसाला परोसने को तैयार!",
                3, PrepStage.SERVE, R.drawable.img_step_garnish_serve,
                heatLevelEn = "Flame Off (Rest 3m)", heatLevelHi = "गैस बंद (3m रेस्ट)",
                timingDetailEn = "Rest 3 min covered -> Ready!", timingDetailHi = "3 मिनट ढका रखें — गरमागरम चना तैयार!"
            )
        )
    )
)
