package com.mixco.p5;

public class ShiftArray {
    public int[] shift(int[] anArray, int shiftAmnt){
        int[] newArr = new int[anArray.length];
        if (shiftAmnt <= 0){
            System.out.println("ERROR: Please give a positive shift value.");
            return newArr;
        }
        int partition = anArray.length-shiftAmnt;
        for (int i=0; i <= shiftAmnt-1; i++){
            newArr[i] = anArray[partition+i];
        }
        for (int i=shiftAmnt; i < anArray.length; i++){
            newArr[i] = anArray[i - shiftAmnt];
        }
        return newArr;
    }
}
