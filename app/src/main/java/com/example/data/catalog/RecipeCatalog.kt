package com.example.data.catalog

import com.example.data.model.Country
import com.example.data.model.DirectoryEntry
import com.example.data.model.FoodCategory
import com.example.data.model.Recipe

object RecipeCatalog {

    val allRecipes: List<Recipe> =
        quickFiveMinRecipesPart1 +
            quickFiveMinRecipesPart2 +
            indianRecipesPart1 +
            indianRecipesPart1B +
            indianRecipesPart2 +
            indianRecipesPart2B +
            extraSignatureRecipes +
            extraSignatureRecipesB +
            internationalRecipesEast +
            internationalRecipesEastChina +
            internationalRecipesWest +
            internationalRecipesPakistan

    val fiveMinuteRecipes: List<Recipe>
        get() = allRecipes.filter { it.isFiveMinuteSpecial }

    val popularRecipes: List<Recipe>
        get() = allRecipes.filter { it.isPopular }

    val trendingRecipes: List<Recipe>
        get() = allRecipes.filter { it.isTrending }

    fun getById(id: String): Recipe? = allRecipes.find { it.id == id }

    /**
     * Complete organized directory of all dishes requested across India's 7 culinary categories
     * and the 6 countries, linking directly to fully authored recipes where available and organizing
     * the remaining items cleanly for expansion without placeholder step text.
     */
    val fullDishDirectory: List<DirectoryEntry> by lazy {
        val completeByName = allRecipes.associateBy { it.nameEn.lowercase() }
        fun entry(en: String, hi: String, c: Country, cat: FoodCategory): DirectoryEntry {
            val match = completeByName[en.lowercase()] ?: allRecipes.find {
                it.nameEn.contains(en, ignoreCase = true) || en.contains(it.nameEn, ignoreCase = true)
            }
            return DirectoryEntry(en, hi, c, cat, match?.id)
        }

        listOf(
            // BIRYANI & PULAO
            entry("Veg Biryani", "वेज बिरयानी", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Hyderabadi Veg Biryani", "हैदराबादी वेज बिरयानी", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Paneer Biryani", "पनीर बिरयानी", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Mushroom Biryani", "मशरूम बिरयानी", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Soya Chaap Biryani", "सोया चाप बिरयानी", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Dum Biryani", "दम बिरयानी", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Chicken Biryani", "चिकन बिरयानी", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Mutton Biryani", "मटन बिरयानी", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Egg Biryani", "एग बिरयानी", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Kolkata Biryani", "कोलकाता बिरयानी", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Lucknowi Biryani", "लखनवी बिरयानी", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Veg Pulao", "वेज पुलाव", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Peas Pulao", "मटर पुलाव", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Kashmiri Pulao", "कश्मीरी पुलाव", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Jeera Rice", "जीरा राइस", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Tawa Pulao", "तवा पुलाव", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Masala Rice", "मसाला राइस", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Lemon Rice", "लेमन राइस", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Tomato Rice", "टोमैटो राइस", Country.INDIA, FoodCategory.BIRYANI_PULAO),
            entry("Coconut Rice", "कोकोनट राइस", Country.INDIA, FoodCategory.BIRYANI_PULAO),

            // PANEER & VEG
            entry("Paneer Butter Masala", "पनीर बटर मसाला", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Shahi Paneer", "शाही पनीर", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Kadai Paneer", "कड़ाही पनीर", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Palak Paneer", "पालक पनीर", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Paneer Lababdar", "पनीर लबाबदार", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Paneer Tikka", "पनीर टिक्का", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Chilli Paneer", "चिली पनीर", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Malai Kofta", "मलाई कोफ्ता", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Veg Korma", "वेज कोरमा", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Mix Veg", "मिक्स वेज", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Dum Aloo", "दम आलू", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Aloo Gobi", "आलू गोभी", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Bhindi Masala", "भिंडी मसाला", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Baingan Bharta", "बैंगन भर्ता", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Mushroom Masala", "मशरूम मसाला", Country.INDIA, FoodCategory.PANEER_VEG),
            entry("Matar Paneer", "मटर पनीर", Country.INDIA, FoodCategory.PANEER_VEG),

            // CHICKEN SPECIAL
            entry("Butter Chicken", "बटर चिकन", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Chicken Curry", "चिकन करी", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Chicken Kadai", "चिकन कड़ाही", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Chicken Tikka Masala", "चिकन टिक्का मसाला", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Chicken Handi", "चिकन हांडी", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Chicken Do Pyaza", "चिकन दो प्याज़ा", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Chicken Korma", "चिकन कोरमा", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Chicken Changezi", "चिकन चंगेज़ी", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Chicken Lababdar", "चिकन लबाबदार", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Chicken Kolhapuri", "चिकन कोल्हापुरी", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Chicken Chettinad", "चिकन चेट्टीनाड", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Chicken 65", "चिकन 65", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Chicken Lollipop", "चिकन लॉलीपॉप", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Tandoori Chicken", "तंदूरी चिकन", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),
            entry("Afghani Chicken", "अफगानी चिकन", Country.INDIA, FoodCategory.CHICKEN_SPECIAL),

            // DAL & CURRY
            entry("Dal Makhani", "दाल मखनी", Country.INDIA, FoodCategory.DAL_CURRY),
            entry("Dal Tadka", "दाल तड़का", Country.INDIA, FoodCategory.DAL_CURRY),
            entry("Dal Fry", "दाल फ्राई", Country.INDIA, FoodCategory.DAL_CURRY),
            entry("Punjabi Kadhi Pakora", "पंजाबी कढ़ी पकौड़ा", Country.INDIA, FoodCategory.DAL_CURRY),
            entry("Gujarati Kadhi", "गुजराती कढ़ी", Country.INDIA, FoodCategory.DAL_CURRY),
            entry("Rajma Masala", "राजमा मसाला", Country.INDIA, FoodCategory.DAL_CURRY),
            entry("Chole Masala", "छोले मसाला", Country.INDIA, FoodCategory.DAL_CURRY),
            entry("Chana Dal", "चना दाल", Country.INDIA, FoodCategory.DAL_CURRY),
            entry("Sambar", "सांभर", Country.INDIA, FoodCategory.DAL_CURRY),
            entry("Dal Palak", "दाल पालक", Country.INDIA, FoodCategory.DAL_CURRY),
            entry("Black Chana Curry", "काला चना करी", Country.INDIA, FoodCategory.DAL_CURRY),
            entry("Aloo Tamatar Curry", "आलू टमाटर करी", Country.INDIA, FoodCategory.DAL_CURRY),

            // INDIAN STREET FOOD
            entry("Pav Bhaji", "पाव भाजी", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Vada Pav", "वड़ा पाव", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Chole Bhature", "छोले भटूरे", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Pani Puri", "पानी पूरी", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Dahi Puri", "दही पूरी", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Sev Puri", "सेव पूरी", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Bhel Puri", "भेल पूरी", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Aloo Tikki", "आलू टिक्की", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Samosa", "समोसा", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Kachori", "कचौड़ी", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Dhokla", "ढोकला", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Momos", "मोमोज़", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Spring Rolls", "स्प्रिंग रोल्स", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Paneer Roll", "पनीर रोल", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Frankie", "फ्रैंकी", Country.INDIA, FoodCategory.STREET_FOOD),
            entry("Veg Burger", "वेज बर्गर", Country.INDIA, FoodCategory.STREET_FOOD),

            // BREAKFAST & SNACKS
            entry("Masala Dosa", "मसाला डोसा", Country.INDIA, FoodCategory.BREAKFAST_SNACKS),
            entry("Mysore Dosa", "मैसूर डोसा", Country.INDIA, FoodCategory.BREAKFAST_SNACKS),
            entry("Idli Sambar", "इडली सांभर", Country.INDIA, FoodCategory.BREAKFAST_SNACKS),
            entry("Medu Vada", "मेदू वड़ा", Country.INDIA, FoodCategory.BREAKFAST_SNACKS),
            entry("Poha", "पोहा", Country.INDIA, FoodCategory.BREAKFAST_SNACKS),
            entry("Upma", "उपमा", Country.INDIA, FoodCategory.BREAKFAST_SNACKS),
            entry("Aloo Paratha", "आलू पराठा", Country.INDIA, FoodCategory.BREAKFAST_SNACKS),
            entry("Paneer Paratha", "पनीर पराठा", Country.INDIA, FoodCategory.BREAKFAST_SNACKS),
            entry("Gobi Paratha", "गोभी पराठा", Country.INDIA, FoodCategory.BREAKFAST_SNACKS),
            entry("Methi Thepla", "मेथी थेपला", Country.INDIA, FoodCategory.BREAKFAST_SNACKS),
            entry("Besan Chilla", "बेसन चीला", Country.INDIA, FoodCategory.BREAKFAST_SNACKS),
            entry("Bread Pakora", "ब्रेड पकौड़ा", Country.INDIA, FoodCategory.BREAKFAST_SNACKS),
            entry("Onion Uttapam", "प्याज उत्तपम", Country.INDIA, FoodCategory.BREAKFAST_SNACKS),

            // INDIAN SWEETS
            entry("Gulab Jamun", "गुलाब जामुन", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Rasmalai", "रसमलाई", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Jalebi", "जलेबी", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Kaju Katli", "काजू कतली", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Gajar Ka Halwa", "गाजर का हलवा", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Moong Dal Halwa", "मूंग दाल हलवा", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Kheer", "खीर", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Phirni", "फिरनी", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Rabri", "रबड़ी", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Malpua", "मालपुआ", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Ghewar", "घेवर", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Rasgulla", "रसगुल्ला", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Sandesh", "संदेश", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Soan Papdi", "सोन पापड़ी", Country.INDIA, FoodCategory.INDIAN_SWEETS),
            entry("Mysore Pak", "मैसूर पाक", Country.INDIA, FoodCategory.INDIAN_SWEETS),

            // JAPAN
            entry("Sushi", "सुशी", Country.JAPAN, FoodCategory.INTERNATIONAL),
            entry("Ramen", "रामेन", Country.JAPAN, FoodCategory.INTERNATIONAL),
            entry("Tempura", "टेम्पुरा", Country.JAPAN, FoodCategory.INTERNATIONAL),
            entry("Takoyaki", "ताकोयाकी", Country.JAPAN, FoodCategory.INTERNATIONAL),
            entry("Udon", "उडोन", Country.JAPAN, FoodCategory.INTERNATIONAL),
            entry("Mochi", "मोची", Country.JAPAN, FoodCategory.INTERNATIONAL),
            entry("Gyoza", "ग्योज़ा", Country.JAPAN, FoodCategory.INTERNATIONAL),
            entry("Japanese Curry", "जापानी करी", Country.JAPAN, FoodCategory.INTERNATIONAL),

            // CHINA
            entry("Fried Rice", "फ्राइड राइस", Country.CHINA, FoodCategory.INTERNATIONAL),
            entry("Hakka Noodles", "हक्का नूडल्स", Country.CHINA, FoodCategory.INTERNATIONAL),
            entry("Chow Mein", "चाउमीन", Country.CHINA, FoodCategory.INTERNATIONAL),
            entry("Manchurian", "मंचूरियन", Country.CHINA, FoodCategory.INTERNATIONAL),
            entry("Spring Rolls", "स्प्रिंग रोल्स", Country.CHINA, FoodCategory.INTERNATIONAL),
            entry("Dim Sum", "डिम सम", Country.CHINA, FoodCategory.INTERNATIONAL),
            entry("Kung Pao Chicken", "कुंग पाओ चिकन", Country.CHINA, FoodCategory.INTERNATIONAL),
            entry("Dumplings", "डंपलिंग्स", Country.CHINA, FoodCategory.INTERNATIONAL),

            // MEXICO
            entry("Tacos", "टैकोस", Country.MEXICO, FoodCategory.INTERNATIONAL),
            entry("Burritos", "बरिटोस", Country.MEXICO, FoodCategory.INTERNATIONAL),
            entry("Nachos", "नाचोज़", Country.MEXICO, FoodCategory.INTERNATIONAL),
            entry("Quesadillas", "केसाडिया", Country.MEXICO, FoodCategory.INTERNATIONAL),
            entry("Enchiladas", "एंचिलाडास", Country.MEXICO, FoodCategory.INTERNATIONAL),
            entry("Fajitas", "फजीतास", Country.MEXICO, FoodCategory.INTERNATIONAL),

            // ITALY
            entry("Pizza Margherita", "पिज़्ज़ा मार्गेरीटा", Country.ITALY, FoodCategory.INTERNATIONAL),
            entry("Pasta Alfredo", "पास्ता अल्फ्रेडो", Country.ITALY, FoodCategory.INTERNATIONAL),
            entry("Spaghetti Bolognese", "स्पैगेटी बोलोग्नीज़", Country.ITALY, FoodCategory.INTERNATIONAL),
            entry("Lasagna", "लज़ान्या", Country.ITALY, FoodCategory.INTERNATIONAL),
            entry("Ravioli", "रैविओली", Country.ITALY, FoodCategory.INTERNATIONAL),
            entry("Risotto", "रिसोट्टो", Country.ITALY, FoodCategory.INTERNATIONAL),
            entry("Tiramisu", "तिरामिसु", Country.ITALY, FoodCategory.INTERNATIONAL),

            // PAKISTAN
            entry("Chicken Biryani", "चिकन बिरयानी", Country.PAKISTAN, FoodCategory.INTERNATIONAL),
            entry("Mutton Karahi", "मटन कड़ाही", Country.PAKISTAN, FoodCategory.INTERNATIONAL),
            entry("Nihari", "निहारी", Country.PAKISTAN, FoodCategory.INTERNATIONAL),
            entry("Chapli Kebab", "चपली कबाब", Country.PAKISTAN, FoodCategory.INTERNATIONAL),
            entry("Haleem", "हलीम", Country.PAKISTAN, FoodCategory.INTERNATIONAL),
            entry("Chicken Tikka", "चिकन टिक्का", Country.PAKISTAN, FoodCategory.INTERNATIONAL),
            entry("Sajji", "सज्जी", Country.PAKISTAN, FoodCategory.INTERNATIONAL),
            entry("Lahori Chana", "लाहोरी चना", Country.PAKISTAN, FoodCategory.INTERNATIONAL)
        )
    }
}
