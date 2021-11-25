package com.suitt.gk.assignment6;

public class StringSolver {
    /*У введеному рядку замінити подвійні пробіли знаками підкреслення*/
    public static String replaceAllDoubleWhiteSpacesWithUnderscores(String str) {
        return str.replaceAll(" {2}", "_");
    }

    /*У введеному рядку видалити усі символи, розташовані поміж першою та
останньою крапками*/
    public static String removeAllSymbolsBetweenFirstAndLastDots(String str) {
        return str.replaceAll("\\..*[.*$]", "");
    }
}
