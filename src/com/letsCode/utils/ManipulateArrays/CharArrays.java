package com.letsCode.utils.ManipulateArrays;

public class CharArrays {

    public static char[] getCharArrayFromWord(String word){
        char[] array = new char[word.length()];
        for ( int i = 0; i< array.length; i++ ) {
            array[i] = word.charAt(i);
        }
        return array;
    }

    public static char[] reverseCharArray(char[] originalArray){
        char[] array = new char[originalArray.length];
        for ( int i = 0; i< array.length; ) {
            array[i] = originalArray[originalArray.length - (++i)];
        }
        return array;
    }

    public static char[] reverseWordToCharArray(String word){
        char[] array = new char[word.length()];
        for ( int i = 0; i< array.length; i++ ) {
            array[i] = word.charAt(array.length - (i + 1));
        }
        return array;
    }

    public static void showCharArrayAsWord(char[] array){
        for ( char element: array ) {
            System.out.printf("%c",element);
        }
    }
}
