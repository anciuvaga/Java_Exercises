package javaExercises.friendlyNumbers;

import java.util.Scanner;

public class FriendlyNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (checkFriendly(i, j))
                    System.out.println("Friendly Pair: " + i + " and " + j);
    }

    public static int sumOfFactors(int n) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {

            int curr_sum = 1;
            int curr_term = 1;
            while (n % i == 0) {
                n = n / i;

                curr_term *= i;
                curr_sum += curr_term;
            }

            sum *= curr_sum;
        }
        if (n >= 2)
            sum *= (1 + n);

        return sum;
    }

    static int largestCommunDivisor(int a, int b) {
        if (a == 0)
            return b;

        return largestCommunDivisor(b % a, a);
    }

    static boolean checkFriendly(int n, int m) {
        int sumFactors_n = sumOfFactors(n);
        int sumFactors_m = sumOfFactors(m);

        int largestCommunDivisorForN = largestCommunDivisor(n, sumFactors_n);

        int largestCommunDivisorForM = largestCommunDivisor(m, sumFactors_m);

        if (n / largestCommunDivisorForN == m / largestCommunDivisorForM &&
                sumFactors_n / largestCommunDivisorForN == sumFactors_m / largestCommunDivisorForM)
            return true;
        else
            return false;
    }
}
