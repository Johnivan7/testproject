package com.matskiv;

public class Flight {
    public static void main(String[] args) {
        findAllLSymbols();
        findAllLSymbolsAlternative();
    }

    private static void findAllLSymbolsAlternative() {
        String fl = "Hello Flight";
        int result = 0;
        System.out.println(fl);
        char[] flArray = fl.toCharArray();

        //fl.toCharArray();

        for (int i =0; i<flArray.length; i++){
            if (flArray[i] == 'l'){
                result++; // delat podschet
            }
        }
        System.out.println(result);
    }

    private static void findAllLSymbols() {
        String fl = "Hello Flight";
        int result = 0;
        System.out.println(fl);

        //fl.toCharArray();

        for (int i =0; i<fl.length(); i++){
            if (fl.charAt(i) == 'l'){
                result++; // delat podschet
            }
        }
        System.out.println(result);
    }
    /*int count = 0;
    for (int i = 0; i < fl.length(); i++) {
        if (input.charAt('i') == 'l' ;
        i++;
    }
        System.out.print(int i);*/

 /*public static void count (String x)

    {
        char [] ch = x.toCharArray();
        int letter = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) ;
            letter++;
        }
        System.out.print(letter);
    }*/
    }

