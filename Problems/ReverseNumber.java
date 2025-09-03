package Problems;

/*
 * Problem: Reverse a given integer.
 * Description: Given an integer, reverse its digits.
 */

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        System.out.println("The reversed number is: " + reverse(number));

        in.close();
    }

    static int reverse(int number) {

        if (number >= 0 && number <= 9) {
            return number;
        }

        int reversedNum = 0;
        while (number != 0) {
            reversedNum = reversedNum * 10 + number % 10;

            number /= 10;

        }

        return reversedNum;
    }
}