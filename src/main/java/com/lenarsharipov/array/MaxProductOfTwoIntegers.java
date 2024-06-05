package com.lenarsharipov.array;

/**
 * Write a program to find a maximum product
 * of two integers in the array where all
 * elements are positive.
 */
public class MaxProductOfTwoIntegers {

    public static int findMaxProduct(int[] array) {
        int maxValueFirst = 0;
        int maxValueSecond = 0;

        // find first max value and its index
        for (int value : array) {
            if (value > maxValueFirst) {
                maxValueSecond = maxValueFirst;
                maxValueFirst = value;
            } else {
                maxValueSecond = Math.max(maxValueSecond, value);
            }
        }

        return maxValueFirst * maxValueSecond;
    }

    public static void main(String[] args) {
        System.out.println(findMaxProduct(new int[] {20, 10, 30, 50, 40, 60}));
        System.out.println(findMaxProduct(new int[] {20, 10, 30, 50, 40, 60, 60}));
    }

}
