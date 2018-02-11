package com.matskiv;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MassiveHomevork {

    public static void main(String[] args) {
//        findPairedNumbers();
//        findSmallestElelment();
//        findBiggestElement();
//        sortElelments();
          sortString();
    }

    public static void findPairedNumbers() {
        Integer[] numbers = new Integer[]{1, 5, 13, 46, 25, 57, 13, 12, 57, 16, 34, 15, 36, 67, 89};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }

    public static void findSmallestElelment() {
        Integer[] differentnumbers = new Integer[]{98, 9, 34, 57, 14, 46, 15, 2, 6, 35, 56, 89, 90, 46, 57};
        int min = differentnumbers[11];
        for (int i = 0; i < differentnumbers.length; i++) {
            if (differentnumbers[i] < min) {
                min = differentnumbers[i];
            }
        }
        System.out.println(min);
    }

    public static void findBiggestElement() {
        Integer[] differentNumbers = new Integer[]{6, 4, 90, 78, 67, 56, 45, 101, 23, 12, 98, 65, 43, 21, 2};
        int max = differentNumbers[8];
        for (int i = 0; i < differentNumbers.length; i++) {
            if (differentNumbers[i] > max) {
                max = differentNumbers[i];
            }
        }
        System.out.println(max);
    }

    public static void sortElelments() {
        Random random = new Random();
        int count = 0;
        Integer[] integers = new Integer[20];
        System.out.println("Random counts are:");
        for (int i = 0; i < integers.length; i++) {
            count = random.nextInt(200);
            integers[i] = count;
            System.out.println(integers[i]);
        }
        System.out.println("Sorted random counts are:");
        Arrays.sort(integers);
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }

    public static void sortString() {
        String[] strings = new String[]{"Anna", "Baby", "Adventure", "Crazy", "Indigo", "Sumatra", "Football",
                "Argentina", "Stop", "Paradise", "Auto", "Robot", "Kennedy"};
        List<String> stringsCharacterA = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].charAt(0) == 'A') {
                stringsCharacterA.add(strings[i]);
            }

        }
       for (int i=0; i<stringsCharacterA.size();i++) {
           System.out.println(stringsCharacterA.get(i));
           //  System.out.println(stringsCharacterA.toString());
           //for(String s: stringsCharacterA){
           // System.out.println(s);
        }
    }
}