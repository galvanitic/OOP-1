package com.mixco.p3;

import java.util.Arrays;

public class FindX {
    private int[] sort(int[] arrToSort){
        int[] sortedArr = new int[arrToSort.length];
        System.arraycopy(arrToSort, 0, sortedArr, 0, arrToSort.length);
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < sortedArr.length - 1; i++) {
                if (sortedArr[i] > sortedArr[i+1]) {
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return  sortedArr;
    }
    public int find(int[] arr){
        int[] sortedArr = this.sort(arr);
        if (sortedArr[0] != -1)
            return -1;
        if (sortedArr[1] != 1)
            return 1;
        for (int i = 1; i < sortedArr.length - 1; i++){
            if (sortedArr[i]+1 != sortedArr[i+1]){
              return i+1;
            }
        }
        return -1;
    }
}
