package javaExercises.mergeSortedArrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] mergeArrays(int[] x, int[] y) {

        int[] result = new int[x.length + y.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < x.length && j < y.length) {
            if (x[i] <= y[j]) {
                result[k] = x[i];
                i++;
            } else {
                result[k] = y[j];
                j++;
            }
            k++;
        }

        while (i < x.length) {
            result[k] = x[i];
            i++;
            k++;
        }

        while (j < y.length) {
            result[k] = y[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 8, 10};
        int[] b = {4, 5, 9, 10, 15};
        int[] c = {2, 4, 5, 11, 14};

        int[] mergeArrayAB = mergeArrays(a, b);
        int[] finalArray = mergeArrays(mergeArrayAB, c);

        System.out.println(Arrays.toString(finalArray));
    }
}

