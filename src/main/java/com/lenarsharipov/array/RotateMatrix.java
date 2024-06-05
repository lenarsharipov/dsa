package com.lenarsharipov.array;

import java.util.Arrays;

public class RotateMatrix {

    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int temp;
        int temp2;
        for (int i = 0; i < matrix.length - 1; i++) {

            // right
            // копируем right во временную переменную
            // вставляем значение из top в right
            temp = matrix[i][length - 1];
            matrix[i][length - 1] = matrix[0][i];
            matrix[i][matrix.length - 1 - i] = matrix[i][i];

            // bottom
            temp2 = matrix[length - 1][length - 1 - i];
            matrix[length - 1][length - 1 - i] = temp;

            //left
            temp = matrix[length - i - 1][0];
            matrix[length - i - 1][0] = temp2;

            // top
            matrix[0][i] = temp;

        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int[][] matrix = {
//                {1, 2},
//                {3, 4}
//        };

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        printMatrix(matrix);
        System.out.println();
        var matrixRotater = new RotateMatrix();
        matrixRotater.rotate(matrix);
        printMatrix(matrix);
    }
}
