package javaExercises.rotateElements;

import java.util.Arrays;
import java.util.Scanner;

public class RotateElements {

    public static void rotateList(int[] arr, int d, int n) {
        for (int i = 0; i < d; i++)
            rotateByOne(arr, n);
    }

    public static void rotateByOne(int[] arr, int n) {
        int i, temp;
        temp = arr[0];

        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    public static Integer[] rotateListToRight(int numbersOfRotation, Integer[] arr) {
        int j;
        Integer temp;

        System.out.println("Nr of rotation: " + numbersOfRotation);
        for (int i = 0; i < numbersOfRotation; i++) {
            temp = arr[0];
            for (j = 0; j < arr.length - 1; j++)
                arr[j] = arr[j + 1];
            arr[j] = temp;

        }
        return arr;
    }

    public static Integer[] rotatelistToLeft(int numbersOfRotation, Integer[] arr) {

        int j;
        Integer temp;

        System.out.println("Nr of rotation: " + numbersOfRotation);
        for (int i = 0; i < numbersOfRotation; i++) {
            temp = arr[arr.length - 1];
            for (j = arr.length - 1; j > 0; j--)
                arr[j] = arr[j - 1];
            arr[j] = temp;
        }
        return arr;
    }

    public static Integer[] rotationRoute(Integer startElement, Integer endElement, Integer[] arr) {

        int startIndex = Arrays.asList(arr).indexOf(startElement);
        int endIndex = Arrays.asList(arr).indexOf(endElement);
        int rotateForward;
        int rotateBackward;

        if (startIndex > endIndex) {
            rotateForward = startIndex - endIndex;
            rotateBackward = arr.length - startIndex + endIndex;

            if (rotateForward > rotateBackward || rotateForward == rotateBackward)
                arr = rotatelistToLeft(Math.min(rotateForward, rotateBackward), arr);
            else
                arr = rotateListToRight(Math.min(rotateForward, rotateBackward), arr);
        } else {
            rotateForward = endIndex - startIndex;
            rotateBackward = arr.length - endIndex + startIndex;

            if (rotateForward > rotateBackward || rotateForward == rotateBackward)
                arr = rotateListToRight(Math.min(rotateForward, rotateBackward), arr);
            else
                arr = rotatelistToLeft(Math.min(rotateForward, rotateBackward), arr);
        }
        System.out.println("Minimum number of rotation is: " + Math.min(rotateForward, rotateBackward));
        return arr;
    }

    public static void printArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static boolean checkValue(Integer firstNumber, Integer secondNumber, Integer[] arr) {
        return Arrays.asList(arr).contains(firstNumber) && Arrays.asList(arr).contains(secondNumber);
    }

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5, 6};


        //  rotateList(arr, 2, 6);

        printArray(arr);

        Scanner input = new Scanner(System.in);
        System.out.println("Input first number you want to rotate: ");
        Integer firstNumber = input.nextInt();
        System.out.println("Input the number's position you want to rotate with: ");
        Integer secondNumber = input.nextInt();
        if (checkValue(firstNumber, secondNumber, arr)) {
            printArray(rotationRoute(firstNumber, secondNumber, arr));
        } else {
            throw new ArrayIndexOutOfBoundsException("Some elements are not present in the array");
        }

    }
}
