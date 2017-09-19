package com.example.common;

import java.util.ArrayList;

public enum Month {
    JANUARY("January", 0),
    FEBRUARY("February", 1),
    MARCH("March", 2),
    APRIL("April", 3),
    MAY("May", 4),
    JUNE("June", 5),
    JULY("July", 6),
    AUGUST("August", 7),
    SEPTEMBER("September", 8),
    OCTOBER("October", 9),
    NOVEMBER("November", 10),
    DECEMBER("December", 11);

    private String englishName;
    private int monthNumber;

    Month(String englishName, int monthNumber) {
        this.englishName = englishName;
        this.monthNumber = monthNumber;
    }

    public String getEnglishName() {
        return englishName;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

//    public static ArrayList<String> descendingMonths(String monthChosen){
//
//    }
}
