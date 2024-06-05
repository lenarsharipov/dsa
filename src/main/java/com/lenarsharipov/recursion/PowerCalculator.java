package com.lenarsharipov.recursion;


/**
 * How to calculate a power of a number using recursion?
 */
public class PowerCalculator {

    public static int calcPowerOfN(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("exponent must be a positive number");
        }
        if (exponent == 0) {
            return 1;
        } else {
            return base * calcPowerOfN(base, exponent - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(calcPowerOfN(2, 0));
        System.out.println(calcPowerOfN(2, 1));
        System.out.println(calcPowerOfN(2, 2));
        System.out.println(calcPowerOfN(2, 3));
        System.out.println(calcPowerOfN(2, 4));
        System.out.println(calcPowerOfN(2, 5));
        System.out.println(calcPowerOfN(2, 6));
        System.out.println(calcPowerOfN(2, 7));
        System.out.println(calcPowerOfN(2, 8));
        System.out.println(calcPowerOfN(2, 9));
        System.out.println(calcPowerOfN(2, 10));
        System.out.println(calcPowerOfN(2, 11));
        System.out.println(calcPowerOfN(2, -1));

    }
}
