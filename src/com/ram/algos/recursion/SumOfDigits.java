package com.ram.algos.recursion;

public class SumOfDigits {
    public static void main(String[] args){
        System.out.println(sumOfDigits(912));

    }

    public static int sumOfDigits(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
}
