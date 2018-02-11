package com.matskiv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NewImpression {

    public static void main (String[]args){
    int[] numbers = new int[10];
    numbers[0] = 8;
        try {
            Main.callMethod();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
//        System.out.println(numbers[11]);
        System.out.println("Hey Guys");

        try {
            FileInputStream fileInputStream = new FileInputStream("jgjg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Bla");
    }


}
