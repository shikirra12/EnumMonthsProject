package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose One of the Months");

        for (Month month : Month.values()) {

            System.out.println(month.getEnglishName());
        }

        String userInput = scanner.nextLine();

        ArrayList<String> descendingMonths = new ArrayList<>();

        switch (userInput){
            case "January": descendingMonths.add("January");
            case "February": descendingMonths.add("February");
            case "March": descendingMonths.add("March");
            case "April": descendingMonths.add("April");
            case "May": descendingMonths.add("May");
            case "June": descendingMonths.add("June");
            case "July": descendingMonths.add("July");
            case "August": descendingMonths.add("August");
            case "September": descendingMonths.add("September");
            case "October": descendingMonths.add("October");
            case "November": descendingMonths.add("November");
            case "December": descendingMonths.add("December");

                    break;
        }
        System.out.println(descendingMonths);

    }
}
