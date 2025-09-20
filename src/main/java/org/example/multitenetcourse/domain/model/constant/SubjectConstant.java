package org.example.multitenetcourse.domain.model.constant;

public enum SubjectConstant {
    ARABIC("Arabic", "اللغة العربية"),
    ENGLISH("English", "اللغة الإنجليزية"),
    MATHEMATICS("Mathematics", "الرياضيات"),
    SCIENCE("Science", "العلوم"),
    SOCIAL_STUDIES("Social Studies", "الدراسات الاجتماعية"),
    RELIGION("Religion", "التربية الدينية"),
    COMPUTER("Computer", "الحاسب الآلي"),
    FRENCH("French", "اللغة الفرنسية"),
    GERMAN("German", "اللغة الألمانية"),
    HISTORY("History", "التاريخ"),
    GEOGRAPHY("Geography", "الجغرافيا"),
    PHILOSOPHY("Philosophy", "الفلسفة"),
    PSYCHOLOGY("Psychology", "علم النفس"),
    BIOLOGY("Biology", "الأحياء"),
    CHEMISTRY("Chemistry", "الكيمياء"),
    PHYSICS("Physics", "الفيزياء");

    private final String englishName;
    private final String arabicName;

    SubjectConstant(String englishName, String arabicName) {
        this.englishName = englishName;
        this.arabicName = arabicName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getArabicName() {
        return arabicName;
    }

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
