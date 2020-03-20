package com.pkg.pattern.component.type;

public enum PersonType {
    TEACHER, STUDENT, COLLEAGUE;

    public static Enum getPartner(Enum anEnum) {
        if (anEnum.equals(TEACHER)) {
            return STUDENT;
        } else if (anEnum.equals(STUDENT)) {
            return TEACHER;
        } else if (anEnum.equals(COLLEAGUE)) {
            return TEACHER;
        } else {
            return null;
        }
    }
    }
