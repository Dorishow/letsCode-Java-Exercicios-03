package com.letsCode.questao01;

import com.letsCode.utils.ManipulateArrays.StringArrays;

public class FruitCart {
    public static void main(String[] args) {

        String[] fruits = new String[5];

        fruits = StringArrays.setFromInputToStringArray(fruits);
        System.out.println("Frutas no carrinho:");
        StringArrays.showElementsOfStringArray(fruits);

    }
}
