package com.ram.algos.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[]{4,5,1,5,3,7,8};
        System.out.println(searching(array, 7));
        System.out.println(searching(array, 71));
    }

    public static int searching(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("Value " + value + " found in the array at " + i + "th position");
                return i;
            }

        }
        System.out.println("Value " + value + " not found in the array");
        return -1;
    }
}
