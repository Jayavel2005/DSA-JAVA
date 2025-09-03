package Problems;

/*
 * Problem: Check if a number is a prime number.
 * Description: A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 */

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println(isPrime(number) ? "Prime" : "Not Prime");

        in.close();

    }

    static boolean isPrime(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }
        if (number == 0 || number == 1) {
            return false;
        }

        int limit = (int) Math.sqrt(number);
        for (int i = 2; i <= limit; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}