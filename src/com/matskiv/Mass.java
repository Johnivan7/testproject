package com.matskiv;

import java.math.BigDecimal;
import java.util.Random;

public class Mass implements Runnable{

    public static void main (String[]args){
//        BigDecimal result = calculateSmth();
 //       System.out.println(result);
 //       massivePractice();
        arrayInitialization();
    }

    public static BigDecimal calculateSmth(){
        BigDecimal sum = new BigDecimal(1);
//        long sum = 1;
        for(int i=1; i<100; i++){
            sum = sum.multiply(new BigDecimal(i));
        }
        return sum;
    }

    public static void massivePractice(){
        int [] randCount = new int[100];
        Random random = new Random();
        for(int i=0;i<randCount.length;i++){
            randCount[i]=random.nextInt();
        }
//       int i =0;
//        while(i<randCount.length){
//            System.out.println(randCount[i]);
//            i++;
//        }
        for(Integer count : randCount){
            System.out.println(count);
        }
    }

    public static void arrayInitialization(){
        float[]floats = new float[]{11.2f, 22.3f, 76.7f, 45.2f};
        for(int i =0; i<floats.length;i=i+1){
            if(floats[i]>50){
                System.out.println(floats[i]);

            }
        }
    }

    @Override
    public void run() {

    }
}
