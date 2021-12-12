package com.letsCode.questao01;

import com.letsCode.utils.ManipulateArrays;

public class FruitCart {
    public static void main(String[] args) {

        String[] fruits = new String[10];

        fruits = ManipulateArrays.setFromInputToStringArray(fruits);
        ManipulateArrays.showElementsOfStringArray(fruits);

    }
}
