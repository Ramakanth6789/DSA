package com.ram.algos.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{4, 98,2, 6, 1, 8, 3, 9};
        selectionSort(array);
        for (int num : array) {
            System.out.print(num+" ");
        }
    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;

            }
        }
    }
}
