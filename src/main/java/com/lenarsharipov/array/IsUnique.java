package com.lenarsharipov.array;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {

    /**
     * Brute force.
     * Time Complexity = O(n^2)
     * Space Complexity = O(1)
     */
    public static boolean isUniqueBruteForce(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /*
    Time Complexity = O(n)
    Space Complexity = O(n)
     */
    public static boolean isUniqueLinear(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num) && map.get(num) >= 1) {
                return false;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueBruteForce(new int[] {1, 1, 2, 3, 4}));
        System.out.println(isUniqueBruteForce(new int[] {1, 2, 3, 4}));
        System.out.println(isUniqueBruteForce(new int[] {1, 2, 3, 1}));

        System.out.println(isUniqueLinear(new int[] {1, 1, 2, 3, 4}));
        System.out.println(isUniqueLinear(new int[] {1, 2, 3, 4}));
        System.out.println(isUniqueLinear(new int[] {1, 2, 3, 1}));
    }
}
