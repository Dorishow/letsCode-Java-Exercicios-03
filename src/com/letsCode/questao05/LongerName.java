package com.letsCode.questao05;

import com.letsCode.utils.ManipulateArrays.StringArrays;

public class LongerName {
    public static void main(String[] args) {
        String[] inviteList = new String[5];
        StringArrays.setFromInputToStringArray(inviteList);
        String longerName = StringArrays.getLongerStringOfArray(inviteList);
        System.out.printf("O maior nome na lista é %s", longerName);
    }
}
