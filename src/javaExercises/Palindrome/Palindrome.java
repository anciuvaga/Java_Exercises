package javaExercises.Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static boolean checkIfPalindrome(String text) {
        String cleanString = text.replaceAll("\\s+", "");
        int length = cleanString.length();

        int forward = 0;
        int backward = length - 1;

        while (backward > forward) {

            char charForward = cleanString.charAt(forward++);
            char charBackward = cleanString.charAt(backward--);

            if (charBackward != charForward)
                return false;
        }
        return true;
    }

    public static boolean verifyIfPalindrome(String text) {

        StringBuilder reversedString = new StringBuilder();
        String cleanString = text.replaceAll("\\s+", "");

        char[] charsArray = cleanString.toCharArray();

        for (int i = charsArray.length - 1; i >= 0; i--) {
            reversedString.append(charsArray[i]);
        }
        return reversedString.toString().equals(cleanString);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the desired word:");
        boolean palindromeCheck = verifyIfPalindrome(sc.nextLine());
        if (palindromeCheck == true) {
            System.out.println("Word inputed is a palindrome");
        } else {
            System.out.println("Word inputed is not a palindrome");
        }
    }
}

