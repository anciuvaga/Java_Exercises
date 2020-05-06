package javaExercises.SortMatrix;

import java.util.*;
import java.util.stream.Collectors;

public class SortMatrix {
    public int[][] populateArrayWithRandomValues(int matrixSize, int matrixBoundary ) {
        Random random = new Random();
        int[][] arr = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                arr[i][j] = random.nextInt(matrixBoundary);
            }
        }
        return arr;
    }

    public static void printArray(Map<Integer, Integer[]> map) {
        for (Map.Entry<Integer, Integer[]> entry : map.entrySet())
            System.out.println(Arrays.toString(map.get(entry.getKey())));
    }

    public static void main(String[] args) {
        SortMatrix sortMatrix = new SortMatrix();
        int[][] arr = sortMatrix.populateArrayWithRandomValues(3, 20);
        Map<Integer, Integer[]> arrMap = new HashMap<Integer, Integer[]>();
        for (int i = 0; i < arr[0].length; i++)
            arrMap.put(Arrays.stream(arr[i]).sum(),Arrays.stream(arr[i]).boxed().toArray(Integer[]::new));

        System.out.println("Unsorted Matrix:");
        sortMatrix.printArray(arrMap);
        System.out.println("Sorted Matrix:");
        sortMatrix.printArray(arrMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new)));
    }
}