package me.day06.arrays2d;

import java.util.Arrays;

public class Array2dEqualsExample {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));

        System.out.println(isEquals2dArray(arr1, arr2));
        System.out.println(Arrays.deepEquals(arr1, arr2));

        int[][] copy = deepCopy(arr1);
        System.out.println(Arrays.deepToString(copy));

        int[][] copy2 = new int[3][3];
        copy2[0] = arr1[0];
        copy2[1][1] = 10;

        System.out.println(arr1[1][1]);
    }

    public static boolean isEquals2dArray(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length) return false;
        if (arr1[0].length != arr2[0].length) return false;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                if (arr1[i][j] != arr2[i][j]) return false;
            }
        }
        return true;
    }

    public static int[][] deepCopy(int[][] arr) {
        int[][] copy = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                copy[i][j] = arr[i][j];
            }
        }
        return copy;
    }
}
