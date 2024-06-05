package com.lenarsharipov.array;

import java.util.Arrays;

/**
 * You are given two integer arrays.
 * Write a program to check if they
 * are permutation of each other.
 */
public class Permutation {

    /*
    Time Complexity = O(n * log(n))
    Space Complexity = O(1)
     */
    public static boolean isPermutation(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    /*
    Time Complexity = O(n)
    Space Complexity = O(1)
     */
    public static boolean isPermutationLinear(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        int product1 = 1;
        int product2 = 1;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            int value1 = arr1[i];
            int value2 = arr2[i];
            product1 *= value1;
            product2 *= value2;
            sum1 += value1;
            sum2 += value2;
        }

        return product1 == product2 && sum1 == sum2;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 5, 4, 6};
        int[] arr2 = {1, 3, 2, 4, 6, 5};

        System.out.println(isPermutationLinear(arr1, arr2));
    }

}