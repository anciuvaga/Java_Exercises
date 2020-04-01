package javaExercises.magicSquare;

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

    public static void main(String[] args) {

        int[][] square = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};

        for (int[] value : square) {
            for (int value1 : value) {
                System.out.print(value1 + "\t");
            }
            System.out.println();
        }

        if (checkIfMagicSquare(square) == true) {
            System.out.println("Matrix is a Magic Square");
        } else {
            System.out.println("Matrix is not a Magic Square");
        }

    }
}


