package com.mixco.p3;

public class FindX {
    private void sort(int[] arrToSort){
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arrToSort.length - 1; i++) {
                if (arrToSort[i] > arrToSort[i+1]) {
                    temp = arrToSort[i];
                    arrToSort[i] = arrToSort[i+1];
                    arrToSort[i+1] = temp;
                    sorted = false;
                }
            }
        }

    }
    public int find(int[] arr){
        this.sort(arr);
        int x=-1;
        for (int i = 1; i < arr.length - 1; i++){
            if (arr[i] != 1){
                x = 1;
            }
            else if (arr[i]+1 != arr[i+1]){
              x = i+1;
            }
        }
        return x;
    }
}
