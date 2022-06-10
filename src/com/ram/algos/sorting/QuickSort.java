package com.ram.algos.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 98,2, 6, 1, 8, 3, 9};
        quickSort(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num+" ");
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = end;
        int i = start-1;
        for (int j = start; j <= end; j++) {
            if (array[j] <= array[pivot]) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return i;
    }
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot -1);
            quickSort(array, pivot + 1, end);
        }
    }

}
