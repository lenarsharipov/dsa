package com.lenarsharipov.recursion;

/**
 * Euclidean algorithm for finding GCD.
 */
public class GCD {
    public static int calcGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }

        return calcGCD(num2, num1 % num2);
    }

    public static void main(String[] args) {
        System.out.println(calcGCD(48, 18));
        System.out.println(calcGCD(18, 48));
    }
}
