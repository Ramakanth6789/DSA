package com.ram.algos.recursion;

public class PowerRecursion {
    public static void main(String[] args){
        System.out.println(power(2,3));
    }

    public static int power(int n, int pow) {
        if (pow == 0) {
            return 1;
        }
        return n * power(n ,pow-1);
    }
}
