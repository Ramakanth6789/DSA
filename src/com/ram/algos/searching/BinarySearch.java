package com.ram.algos.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(array, 7));
    }

    public static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end) / 2;

        while (arr[mid] != value && start < end) {
            if (value < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid +1;
            }
            mid = (start + end) / 2;
        }

        if (arr[mid] == value) {
            System.out.println("Value " + value + " found in position " + mid);
            return mid;
        }else{
            System.out.println("Value " + value + " not found");
            return -1;
        }


    }
}
