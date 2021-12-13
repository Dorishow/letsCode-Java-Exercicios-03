package com.letsCode.utils.ManipulateArrays;

import com.letsCode.utils.InputScanner;

public class StringArrays {
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

    public static String getLongerStringOfArray(String[] array){
        String longer = array[0];
        for(String word: array){
            if(word.length() > longer.length()){
                longer = word;
            }
        }
        return longer;
    }
}
