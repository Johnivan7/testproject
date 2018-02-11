package com.matskiv;

import java.util.Scanner;

public class IntercactiveFamily {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        FamilyManager manager = new FamilyManager();

        while (true){
            System.out.println("Enter family member or command:");
            String temp = scanner.nextLine();
            manager.handleInput(temp);
            System.out.println(temp);

        }
    }

    /*private static void handleInputs(String temp) {

    }*/
}
