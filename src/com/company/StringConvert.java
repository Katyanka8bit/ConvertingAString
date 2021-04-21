package com.company;

public class StringConvert {
    public static String convert(String s) {
        StringBuilder result = new StringBuilder();
        char letter = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            } else {
                result.append(count);
                result.append(letter);
                letter = s.charAt(i);
                count = 1;
            }
        }
        result.append(count);
        result.append(letter);
        return result.toString();
    }
}





