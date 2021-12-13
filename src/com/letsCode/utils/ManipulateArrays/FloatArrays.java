package com.letsCode.utils.ManipulateArrays;

import com.letsCode.utils.InputScanner;

public class FloatArrays {
    public static float[] setFromInputToFloatArray(float[] array){
        for(int i = 0; i<array.length; i++){
            System.out.printf("Digite o %dª número%n", i + 1);
            array[i] = InputScanner.scan.nextInt();
        }
        return array;
    }

    public static float getHigherNumber(float[] array){
        float higher = array[0];
        for(float number: array){
            if(number > higher){
                higher = number;
            }
        }
        return higher;
    }

    public static float getLowerNumber(float[] array){
        float lower = array[0];
        for(float number: array){
            if(number < lower){
                lower = number;
            }
        }
        return lower;
    }
}
