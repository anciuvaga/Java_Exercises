package javaExercises.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 10;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Sorted array after implementing BubbleSort Algorithm:");

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}


