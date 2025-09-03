package Problems;

/*
 * Problem: Check if a number is a perfect number.
 * Description: A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself).
 */

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(isPerfect(number) ? "Perfect" : "Not Perfect");
        in.close();

    }

    static boolean isPerfect(int number) {
        return number == sumOfDivisors(number);
    }

    static int sumOfDivisors(int number) {
        int perfect = 0;
        for (int i = 1; i < number; i++) {
            if (isDivisor(number, i))
                perfect += i;
        }

        return perfect;

    }

    static boolean isDivisor(int number, int divisor) {
        return number % divisor == 0;
    }
}