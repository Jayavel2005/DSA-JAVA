// package Problems;
/*
 * Problem: Find the K-th Digit of a Number
Description:

        Given two integers, a number n and an index k, your task is to find the k-th digit of n when counted from right to left. The rightmost digit is considered the 1st digit.

        For example, in the number 12345:

            The 1st digit is 5.
            The 3rd digit is 3.
            The 5th digit is 1.
            If k is greater than the total number of digits in n, you should indicate that the digit does not exist (e.g., by returning 0 or -1).

        Test Cases:

            Input: n = 12345, k = 3
            Output: 3
            Input: n = 987, k = 1
            Output: 7
            Input: n = 654321, k = 6
            Output: 6
            Input: n = 123, k = 5
            Output: 0 (or -1, depending on the chosen return value for non-existent digits)
 */

import java.util.Scanner;

public class KthDigit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = Math.abs(in.nextInt());
        int k = in.nextInt();
        System.out.println(kthDigit(number, k));

    }

    static int kthDigit(int number, int k) {

        if (k > Integer.toString(number).length() || k <= 0) {
            return -1;
        }
        int digit = 0;
        while (k - 1 >= 0 && number != 0) {
            digit = number % 10;
            number = number / 10;
            k--;

        }
        return digit;
    }
}