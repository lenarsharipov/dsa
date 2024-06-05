package com.lenarsharipov.recursion;

/**
 * How to find the sum of digits of a positive integer number using recursion?
 * input 10, output 1 + 0 = 1
 *
 */
public class SumOfDigits {
    public static int calcSumOfDigits(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a positive number");
        }

        if (n == 0) {
            return 0;
        } else {
            return n % 10 + calcSumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(calcSumOfDigits(10114)); // 7
        System.out.println(calcSumOfDigits(0)); // 0
        System.out.println(calcSumOfDigits(1)); // 1
        System.out.println(calcSumOfDigits(101)); // 2
        System.out.println(calcSumOfDigits(10000)); // 1
        System.out.println(calcSumOfDigits(00001)); // 1
        System.out.println(calcSumOfDigits(-1)); // IAE
    }
}
