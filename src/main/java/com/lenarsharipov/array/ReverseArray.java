package com.lenarsharipov.array;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArrayInPlace(int[] array) {
        int length = array.length;
        for (int leftIdx = 0; leftIdx < length / 2; leftIdx++) {
            int temp = array[leftIdx];
            int rightIdx = length - leftIdx - 1;
            array[leftIdx] = array[rightIdx];
            array[rightIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr3 = {2, 4};
        int[] arr4 = {2, 4, 6};
        int[] arr5 = {2};
        int[] arr6 = {1, 2, 3, 4, 5};
        reverseArrayInPlace(arr);
        reverseArrayInPlace(arr2);
        reverseArrayInPlace(arr3);
        reverseArrayInPlace(arr4);
        reverseArrayInPlace(arr5);
        reverseArrayInPlace(arr6);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));
    }
}