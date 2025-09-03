package Problems;

/*
 * Problem: Find the Greatest Common Divisor (GCD) of two numbers.
 * Description: The GCD of two integers is the largest positive integer that divides both of them without leaving a remainder.
 */

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(euclidAlgo(n1, n2));

        in.close();
    }

    static int gcd(int n1, int n2) {
        int min = Math.min(n1, n2);
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    static int euclidAlgo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}