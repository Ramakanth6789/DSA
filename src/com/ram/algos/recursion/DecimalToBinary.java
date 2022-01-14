package com.ram.algos.recursion;

public class DecimalToBinary {
    public static void main(String[] args){
        System.out.println(converter(8));
    }

    public static int converter(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n % 2 + 10 * (converter(n / 2));
    }
}
