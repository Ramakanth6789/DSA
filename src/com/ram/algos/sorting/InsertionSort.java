package com.ram.algos.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[]{4, 98,2, 6, 1, 8, 3, 9};
        insertionSort(array);
        for (int num : array) {
            System.out.print(num+" ");
        }
    }

    public static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int temp = arr[i], j = i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
