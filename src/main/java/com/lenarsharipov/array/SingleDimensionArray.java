package com.lenarsharipov.array;

public class SingleDimensionArray {
    private int[] arr = null;

    public SingleDimensionArray(int arrayLength) {
        arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int value) {
        try {
            if (arr[index] == Integer.MIN_VALUE) {
                arr[index] = value;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("The cell is occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }

    public void traverseArray() {
        for (int i : this.arr) {
            System.out.println(i);
        }
    }

    public void searchInArray(int valueToSearch) {
        for (int index = 0; index < this.arr.length; index++) {
            if (this.arr[index] == valueToSearch) {
                System.out.println("Value found. The index = " + index);
                return;
            }
        }
        System.out.println("Value not found");
    }

    public void deleteValue(int valueToDelete) {
        try {
            this.arr[valueToDelete] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Value is out of array range");
        }
    }

    public static void main(String[] args) {
        var array = new SingleDimensionArray(10);
        array.insert(0, 0);
        array.insert(1, 1);
        array.traverseArray();
        array.searchInArray(0);
        array.searchInArray(1);
        array.deleteValue(1);
        array.deleteValue(11);
    }
}
