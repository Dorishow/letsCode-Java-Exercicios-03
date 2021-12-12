package com.letsCode.utils;

public class ManipulateArrays {

    public static void showElementsOfStringArray(String[] array){
        for ( String element: array ) {
            System.out.println(element);
        }
    }
    public static String[] setFromInputToStringArray(String[] array){
        for(int i = 0; i<array.length; i++){
            System.out.printf("Digite o %dª item%n", i + 1);
            array[i] = InputScanner.scan.next();
        }
        return array;
    }

    public static void showElementsOfIntArray(int[] array){
        for ( int element: array ) {
            System.out.println(element);
        }
    }
    public static int[] setFromInputTointArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.printf("Digite o %dª item%n", i + 1);
            array[i] = InputScanner.scan.nextInt();
        }
        return array;
    }
}
