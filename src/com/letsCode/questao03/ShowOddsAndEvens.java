package com.letsCode.questao03;

import com.letsCode.utils.ManipulateArrays.IntArrays;

public class ShowOddsAndEvens {
    public static void main(String[] args) {

        int[] numbersArray = new int[5];
        IntArrays.setFromInputToIntArray(numbersArray);
        IntArrays.showEvenNumbers(numbersArray);
        IntArrays.showOddNumbers(numbersArray);

    }
}
