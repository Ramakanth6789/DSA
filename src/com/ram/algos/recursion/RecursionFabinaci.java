package com.ram.algos.recursion;

public class RecursionFabinaci {
    public static void main(String[] args) {
        System.out.println(fabinaci(3));
    }
    public static int fabinaci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fabinaci(n - 1) + fabinaci(n - 2);
    }
}
