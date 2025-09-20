package org.example.multitenetcourse.domain.model.constant;

public enum AcademicYear {
    GRADE1("Grade 1", "الصف الأول الابتدائي"),
    GRADE2("Grade 2", "الصف الثاني الابتدائي"),
    GRADE3("Grade 3", "الصف الثالث الابتدائي"),
    GRADE4("Grade 4", "الصف الرابع الابتدائي"),
    GRADE5("Grade 5", "الصف الخامس الابتدائي"),
    GRADE6("Grade 6", "الصف السادس الابتدائي"),

    PREP1("Prep 1", "الصف الأول الإعدادي"),
    PREP2("Prep 2", "الصف الثاني الإعدادي"),
    PREP3("Prep 3", "الصف الثالث الإعدادي"),

    SEC1("Secondary 1", "الصف الأول الثانوي"),
    SEC2("Secondary 2", "الصف الثاني الثانوي"),
    SEC3("Secondary 3", "الصف الثالث الثانوي");

    private final String englishName;
    private final String arabicName;

    AcademicYear(String englishName, String arabicName) {
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
