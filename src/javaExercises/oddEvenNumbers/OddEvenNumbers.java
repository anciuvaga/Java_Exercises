package javaExercises.oddEvenNumbers;

import java.util.Arrays;

public class OddEvenNumbers {
    public static void findNumbers(int[] arr) {
        System.out.println("Elements of the array are: " + Arrays.toString(arr));
        System.out.println("In arrey are: " + Arrays.stream(arr).filter(x -> x % 2 == 0).count()
                + " even numbers\nSum of odd numbers are: " + Arrays.stream(arr).filter(x -> x % 2 != 0).sum());
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 12, 8, 9};
        findNumbers(arr);
    }
}
