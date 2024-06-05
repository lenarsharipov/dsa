package com.lenarsharipov.array;

/**
 * Find a nummber in array
 * 
 */
public class FindNumberInArray {

    /*
     * Linear search is implemented.
     * Time complexity = O(n)
     * Space complexity = O(1)
     */
    public static int findNumber(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findNumber(new int[] {20, 10, 30, 50, 40, 60}, 40));        
        System.out.println(findNumber(new int[] {20, 10, 30, 50, 40, 60}, 70));        
    }    
}
