package javaExercises.primeNumbers;

import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int potentialPrimeNumber) {

        for (int i = 2; i < potentialPrimeNumber; i++) {

            if (potentialPrimeNumber % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimeNumbers(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                System.out.print(i + ", ");
        }

    }

    public static void main(String[] args) throws NotPrimeNumberExeption {
        int potentialPrimeNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter potential prime number: ");
        potentialPrimeNumber = input.nextInt();
        if (potentialPrimeNumber == 0 || potentialPrimeNumber == 1)
            throw new NotPrimeNumberExeption("Sorry, entered number: "
                    + potentialPrimeNumber + " is not a prime number");

        printPrimeNumbers(potentialPrimeNumber);
    }
}

