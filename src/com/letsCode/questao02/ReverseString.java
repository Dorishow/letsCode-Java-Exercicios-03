package com.letsCode.questao02;

import com.letsCode.utils.InputScanner;
import com.letsCode.utils.ManipulateArrays.CharArrays;

public class ReverseString {

    public static void main(String[] args) {
        String word;
        System.out.println("Digite uma palavra para ser invertida");
        word = InputScanner.scan.next();

        char[] reverseWord;

        //Versão com dois loops(um loop de repetição dentro de outro)
        reverseWord = CharArrays.reverseCharArray(
                CharArrays.getCharArrayFromWord(word)
        );

        //Versão com apenas um loop ⬇
        //reverseWord = CharArrays.reverseWordToCharArray(word);

        CharArrays.showCharArrayAsWord(reverseWord);
    }

}
