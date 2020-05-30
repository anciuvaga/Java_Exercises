package javaExercises.magicSquare;

import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class MagicSquare {
    static int N = 3;

    public static boolean checkIfMagicSquare(int[][] square) {

        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;

        for (int i = 0; i < N; i++)
            sumFirstDiagonal += square[i][i];

        for (int i = 0; i < N; i++)
            sumSecondDiagonal += square[i][N - i - 1];

        if (sumFirstDiagonal != sumSecondDiagonal)
            return false;

        for (int i = 0; i < N; i++) {
            int sumRow = 0;
            for (int j = 0; j < N; j++)
                sumRow += square[i][j];

            if (sumRow != sumFirstDiagonal)
                return false;
        }
        for (int i = 0; i < N; i++) {
            int sumColumn = 0;

            for (int j = 0; j < N; j++)
                sumColumn += square[j][i];

            if (sumColumn != sumFirstDiagonal)
                return false;
        }

        return true;
    }

    public static boolean checkAllNumbersArePositive(int[][] arr) {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                if (arr[i][j] <= 0) {
                    return false;
                }
            }
        return true;
    }

    public static boolean checkAllNumbersInRange(int[][] arr) {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                if (arr[i][j] < 1 || arr[i][j] > N * N) {
                    return false;
                }
            }
        return true;
    }

    public static boolean checkAllNumbersAreUnique(int[][] arr) {
        Integer[][] integerArray = new Integer[N][N];
        int integerArraySize = 0;

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                integerArray[i][j] = Integer.valueOf(arr[i][j]);
            }
        Set<Integer> arraySet = new HashSet<>();

        for (Integer[] elements : integerArray) {
            List<Integer> arrList = Arrays.asList(elements);
            arraySet.addAll(arrList);
            integerArraySize += arrList.size();
        }

        if (integerArraySize == arraySet.size()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int[][] square = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};

        for (int[] value : square) {
            for (int value1 : value) {
                System.out.print(value1 + "\t");
            }
            System.out.println();
        }

        System.out.println("Check that potential magic squre has only positive numbers: " + checkAllNumbersArePositive(square));
        System.out.println("Check that potential magic square numbers are between range 1 and N^2: " + checkAllNumbersInRange(square));
        System.out.println("Check that potential magic square has unique elements: " + checkAllNumbersAreUnique(square));

        if (checkIfMagicSquare(square)) {
            System.out.println("Matrix is a Magic Square");
        } else {
            System.out.println("Matrix is not a Magic Square");
        }

    }
}


