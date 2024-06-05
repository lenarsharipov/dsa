package com.lenarsharipov.recursion;

public class FactorialCalculator {
    private static final String ILLEGAL_ARGUMENT_MSG =
            "Input value cannot be less than 0";

    public static int calcFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(ILLEGAL_ARGUMENT_MSG);
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(calcFactorial(0));
    }
}
