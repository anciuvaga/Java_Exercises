package javaExercises.rotateElements;

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

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        rotateList(arr, 2, 6);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}


