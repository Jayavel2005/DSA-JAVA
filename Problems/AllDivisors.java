package Problems;

/*
 * Problem: Find all divisors of a number.
 * Description: Given an integer, find all of its divisors.
 */

import java.util.Scanner;

public class AllDivisors {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        for (int i = 1; i <= number; i++) {
            if (isDivisor(number, i)) {
                System.out.print(i + " ");
            }
        }

        in.close();

    }

    static boolean isDivisor(int number, int i) {
        return number % i == 0;

    }
}