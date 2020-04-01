package javaExercises.inverseArrayElements;

import java.util.Arrays;

public class InverseArrayElements {
    public static void main(String[] args) {
        float[] arr = {1.5f, 2.4f, 5.6f, 7.5f, 9.2f};
        int length = arr.length;

        for (int i = 0; i < arr.length / 2; i++) {
            float temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

