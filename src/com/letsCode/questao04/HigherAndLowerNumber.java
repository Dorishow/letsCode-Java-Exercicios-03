package com.letsCode.questao04;

import com.letsCode.utils.ManipulateArrays.FloatArrays;

public class HigherAndLowerNumber {
    public static void main(String[] args) {
        float[] numbers = new float[5];
        numbers = FloatArrays.setFromInputToFloatArray(numbers);

        float higher = FloatArrays.getHigherNumber(numbers);
        float lower = FloatArrays.getLowerNumber(numbers);

        System.out.printf("O maior número do array é %.1f e o menor é %.1f%n", higher, lower);
        showMediaOfTwoNumbers(higher, lower);
    }

    public static void showMediaOfTwoNumbers(float firstNumber, float secondNumber){
        System.out.printf(
            "A média entre %.1f e %.1f é %.1f",
            firstNumber, secondNumber,
            (firstNumber + secondNumber)/2
        );
    }
}
