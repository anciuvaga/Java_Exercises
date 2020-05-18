package javaExercises.SortMatrix;

import java.util.*;

public class SortMatrix {
    public int[][] populateArrayWithRandomValues(int matrixSize, int matrixBoundary) {
        Random random = new Random();
        int[][] arr = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                arr[i][j] = random.nextInt(matrixBoundary);
            }
        }
        return arr;
    }

    public static void printArray(Map<Integer, Integer[]> map, Integer[] keys) {
        // for (Map.Entry<Integer, Integer[]> entry : map.entrySet())
        for(Integer value : keys){
            System.out.println(Arrays.toString(map.get(value)));
        }
    }

    public static void main(String[] args) {
        SortMatrix sortMatrix = new SortMatrix();
        int[][] arr = sortMatrix.populateArrayWithRandomValues(3, 20);
        Map<Integer, Integer[]> arrMap = new HashMap<Integer, Integer[]>();
        for (int i = 0; i < arr[0].length; i++)
            arrMap.put(Arrays.stream(arr[i]).sum(), Arrays.stream(arr[i]).boxed().toArray(Integer[]::new));
        Integer[] sortkeys = arrMap.keySet().toArray(new Integer[arrMap.keySet().size()]);
        System.out.println("Unsorted Matrix:");
        sortMatrix.printArray(arrMap, sortkeys);

        Integer temp;
        for (int i = 0; i < sortkeys.length; i++)
            for (int j = 1; j < sortkeys.length - i; j++) {
                if (sortkeys[j - 1] > sortkeys[j]) {
                    temp = sortkeys[j];
                    sortkeys[j] = sortkeys[j - 1];
                    sortkeys[j - 1] = temp;
                }
            }
        System.out.println("Sorted Matrix:");
        sortMatrix.printArray(arrMap, sortkeys);
    }
}