package com.letsCode.questao06;

import com.letsCode.utils.InputScanner;
import com.letsCode.utils.ManipulateArrays.CharArrays;

public class UppercaseOddCharsOnWord {
    public static void main(String[] args) {
        String word;
        System.out.println("Digite uma palavra");
        word = InputScanner.scan.next();

        char[] lettersOfWord = CharArrays.getCharArrayFromWord(word);
        uppercaseOddLettersOfArray(lettersOfWord);
        CharArrays.showCharArrayAsWord(lettersOfWord);
    }

    public static boolean isOdd(int number){
        return number % 2 != 0;
    }

    public static void uppercaseOddLettersOfArray(char[] array){
        for(int index = 0; index < array.length; index++){
            if(isOdd(index + 1)){
                array[index] = Character.toUpperCase(array[index]);
            }
            else {
                array[index] = Character.toLowerCase(array[index]);
            }
        }
    }

}
