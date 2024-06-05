package com.lenarsharipov.array;

/**
 * Find the missing number in an array of 1 to n
 */
public class MissingNumber {
    private final int arraySize;

    public MissingNumber(int arraySize) {
        this.arraySize = arraySize;
    }

    /**
     * n * (n + 1) / 2
     * Time Complexity = O(1) + O(n) => O(n)
     * Space Complexity = O(1)
     */
    public int findMissingNumber(int[] array) {
        if (array.length != this.arraySize) {
            throw new IllegalArgumentException("Array length must be " + this.arraySize + "elements length");
        }
        int expectedSum = this.arraySize * (this.arraySize + 1) / 2;

        int actualSum = 0;
        for (int value : array) {
            actualSum += value;
        }

        return expectedSum - actualSum;
    }

}
