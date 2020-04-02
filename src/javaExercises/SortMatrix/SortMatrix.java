package javaExercises.SortMatrix;

import java.util.Arrays;
import java.util.Random;

public class SortMatrix {
    public int[][] populateArrayWithRandomValues(int n, int max, int min) {

        Random r = new Random();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = r.nextInt(max - min) - min + 1;
            }
        }
        return arr;
    }

    public void printArray(int[][] arr) {

        for (int[] value : arr) {
            for (int value1 : value) {
                System.out.print(value1 + "\t");
            }
            System.out.println();
        }
    }

    public int[] sortLines(int[][] arr) {
        int n = arr[0].length;
        int[] arrOfSum = new int[n];
        int[] arrOfIndexes = new int[n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {

                arrOfSum[i] += arr[i][j];
                arrOfIndexes[i] = i;
            }
        int temp;
        int tempIndex;

        for (int i = 0; i < arrOfSum.length; i++)
            for (int j = 1; j < arrOfSum.length; j++) {
                if (arrOfSum[j - 1] > arrOfSum[j]) {
                    temp = arrOfSum[j - 1];
                    tempIndex = arrOfIndexes[j - 1];
                    arrOfSum[j - 1] = arrOfSum[j];
                    arrOfIndexes[j - 1] = arrOfIndexes[j];
                    arrOfSum[j] = temp;
                    arrOfIndexes[j] = tempIndex;
                }
            }
        return arrOfIndexes;
    }

    public int[][] sortMatrixByLinesSum(int[][] arr) {
        int[] arrOfSortedIndexes = sortLines(arr);
        int n = arrOfSortedIndexes.length;

        int[][] arrSortByLinesSum = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {

                arrSortByLinesSum[i][j] = arr[arrOfSortedIndexes[i]][j];
            }
        return arrSortByLinesSum;
    }

    public static void main(String[] args) {

        SortMatrix sm = new SortMatrix();

        int[][] arr = sm.populateArrayWithRandomValues(3, 20, 1);
        System.out.println("Unsorted Matrix:");
        sm.printArray(arr);
        int[] arrOfSortedIndexes = sm.sortLines(arr);
        System.out.println(Arrays.toString(arrOfSortedIndexes));

        arr = sm.sortMatrixByLinesSum(arr);
        System.out.println("Sorted Matrix:");
        sm.printArray(arr);
    }
}
