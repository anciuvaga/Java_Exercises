package javaExercises.oddEvenNumbers;

import java.util.Arrays;

public class OddEvenNumbers {

    public static int calcEvenNumbers(int[] arr){
       int amountEvenNumbers = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0)
                amountEvenNumbers++;
        }
        return amountEvenNumbers;
    }

    public static int calcOddNumbers(int[] arr){
        int sumOfOddNumbers = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0)
                sumOfOddNumbers += arr[i];
        }
        return sumOfOddNumbers;
    }

    public static void findNumbers(int[] arr) {

        System.out.println("Elements of the array are: " + Arrays.toString(arr));
        System.out.println("In arrey are: " + calcEvenNumbers(arr) + " even numbers\nSum of odd numbers are: " + calcOddNumbers(arr));
    }

    public static void main(String[] args) {

        int[] arr = {1, 6, 12, 8, 9};

        findNumbers(arr);
    }
}
