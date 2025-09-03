package Problems;

/*
 * Problem: Check if a number is a Strong number.
 * Description: A Strong number is a number in which the sum of the factorial of its digits is equal to the number itself.
 */

import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        System.out.println(isStrong(number) ? "True" : "False");
        in.close();
    }

    static boolean isStrong(int number) {
        return number == splitDigits(number);
    }

    static int splitDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += factorial(number % 10);
            number /= 10;

        }

        return sum;
    }

    static int factorial(int digit) {
        int fact = 1;
        for (int i = 2; i <= digit; i++) {
            fact *= i;
        }

        return fact;
    }
}