package org.example.multitenetcourse.domain.model.constant;

public enum Term {
    FIRST("First Term", "الفصل الأول"),
    SECOND("Second Term", "الفصل الثاني");

    private final String englishName;
    private final String arabicName;

    Term(String englishName, String arabicName) {
        this.englishName = englishName;
        this.arabicName = arabicName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getArabicName() {
        return arabicName;
    }

    // اختيار اللغة حسب كود اللغة (en أو ar)
    public String getName(String lang) {
        switch (lang.toLowerCase()) {
            case "ar":
                return arabicName;
            case "en":
            default:
                return englishName;
        }
    }
}
