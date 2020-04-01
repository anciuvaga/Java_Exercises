package javaExercises.leapYears;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class LeapYears {

    public static void checkLeapYears(int year, int k) {
        int count = 0;

        for (int i = year; i < Integer.MAX_VALUE; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.println(i + ";");
                count++;
            }
            if (count == k)
                break;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the year you would like to start counting leap years:");
        int year = parseInt(br.readLine());

        System.out.println("Enter the next number of leap years:");
        int k = parseInt(br.readLine());

        checkLeapYears(year, k);

    }
}