package Problems;

/*
 * Problem: Check if a number is a palindrome.
 * Description: A palindrome is a number that reads the same backward as forward.
 */

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(isPalindrome(Math.abs(number)) ? "Palindrome" : "Not Palindrome");
        in.close();
    }

    static boolean isPalindrome(int number) {
        if (number >= 0 && number <= 9)
            return true;

        return number == reverse(number);
    }

    static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;

            number /= 10;
        }

        return reverse;
    }
}