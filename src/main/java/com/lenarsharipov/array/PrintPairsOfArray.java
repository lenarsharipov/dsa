package com.lenarsharipov.array;

public class PrintPairsOfArray {

    public static void printPairs(int[] array) {
        for (int k : array) {
            for (int i : array) {
                System.out.print(k + "" + i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPairs(new int[] {1, 3, 4, 5});
    }
}
