package com.mixco.p2;

public class ObfuscateString {
    public String obfuscate(String aString){
        StringBuilder obfsctdStr = new StringBuilder(aString.length());
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = aString.length()-1; i >= 0; i--){
            // Check even indexes
            if (i%2 == 0){
                even.append(aString.charAt(i));
            }else { // Check odd indixes
                odd.append(aString.charAt(i));
            }
        }
        obfsctdStr.append(even);
        obfsctdStr.append(odd);
        return obfsctdStr.toString();
    }
}
