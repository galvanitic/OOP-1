package com.mixco.p1;

public class ReverseString {
    public String reverse(String aString){
        StringBuilder reversedStr = new StringBuilder(aString.length());
        for (int i = aString.length()-1; i >= 0; i--){
            reversedStr.append(aString.charAt(i));
        }
        return reversedStr.toString();
    }
}
