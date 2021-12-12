package com.letsCode.utils.ManipulateArrays;

import com.letsCode.utils.InputScanner;

public class IntArrays {

    public static int[] setFromInputToIntArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.printf("Digite o %dª número%n", i + 1);
            array[i] = InputScanner.scan.nextInt();
        }
        return array;
    }

    public static void showEvenNumbers(int[] array){
        System.out.printf("%nNúmeros pares: ");
        for (int number: array){
            if (number % 2 == 0){
                System.out.printf("%d, ",number);
            }
        }
    }

    public static void showOddNumbers(int[] array){
        System.out.printf("%nNúmeros ímpares: ");
        for (int number: array){
            if (number % 2 != 0){
                System.out.printf("%d, ",number);
            }
        }
    }
}
