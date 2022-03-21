package com.ram.algos.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,2,4,1,3,9};
        int[] result = bubbleSort(arr);
        for (int n : result) {
            System.out.println(n);
        }

    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i-  1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }



}
