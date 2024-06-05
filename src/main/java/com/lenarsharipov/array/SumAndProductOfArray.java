package com.lenarsharipov.array;

public class SumAndProductOfArray {

    public static void printSumAndProduct(int[] array) {
        int sum = 0;
        int product = 1;
        for (var elem : array) {
            sum += elem;
            product *= elem;
        }
        System.out.printf("Sum: %d, Product: %d", sum, product);
    }

    public static void main(String[] args) {
        printSumAndProduct(new int[] {1, 2, 3, 4});
    }
}