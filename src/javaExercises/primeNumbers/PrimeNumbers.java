package javaExercises.primeNumbers;

import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimeNumbers(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                System.out.print(+i + ", ");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = sc.nextInt();

        printPrimeNumbers(n);

    }
}

