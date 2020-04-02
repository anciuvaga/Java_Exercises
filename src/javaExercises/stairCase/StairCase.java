package javaExercises.stairCase;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StairCase {


    public static void main(String[] args) throws InvalidInputException {
        int numberOfStairs;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Input desired staircase height:");
            numberOfStairs = input.nextInt();
        } catch(InputMismatchException e){
            throw new InvalidInputException ("Wrong input");
        }

        System.out.print(returnStairCase(numberOfStairs));
    }

    private static StringBuilder returnStairCase(int numberOfStairs) {
        StringBuilder stairs = new StringBuilder("");
        for (int i = 1; i <= numberOfStairs; i++) {
            int j = 1;
            while (j <= numberOfStairs) {
                if (i + j > numberOfStairs)
                    stairs.append("#");j++;
            }
           stairs.append("\n");
        }
        return stairs;
    }

}
