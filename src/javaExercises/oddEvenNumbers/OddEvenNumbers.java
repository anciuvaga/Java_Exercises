package javaExercises.oddEvenNumbers;

import java.util.Arrays;

public class OddEvenNumbers {

    public static int calcEvenNumbers(int[] arr) {
        return (int) Arrays.stream(arr).filter(x -> x % 2 == 0).count();
    }

    public static int calcOldNumbers(int[] arr) {
        return Arrays.stream(arr).filter(x -> x % 2 != 0).sum();
    }

    public static void printArray(int[] arr) {
        System.out.println("Array elements are:");
        Arrays.stream(arr)
                .forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 12, 8, 9};

        printArray(arr);
        System.out.println("Counted even numbers:");
        System.out.println(calcEvenNumbers(arr));
        System.out.println("Sum of odd numbers:");
        System.out.println(calcOldNumbers(arr));
    }
}
