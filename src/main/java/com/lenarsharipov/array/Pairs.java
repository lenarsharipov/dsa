package com.lenarsharipov.array;

import java.util.Arrays;

/**
 * Write a program to find all pairs
 * of integers whose sum is equal to
 * a given number
 *
 * [2,6,3,9,11] and 9 -> [6, 3]
 */
public class Pairs {

    /**
     * Time Complexity: O(n2)
     * Space Complexity: O(1)
     */
    public static int[] findPairsBrute(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[] {array[i], array[j]};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPairsBrute(new int[]{2, 6, 3, 9, 11}, 9)));
    }
}
