package Problems;

import java.util.Scanner;

/*
 * Problem: Find the sum of odd numbers in a given range.
 * Description: Given a starting and ending range, find the sum of all odd numbers within that range.
 */

public class SumOfOdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int startRange = in.nextInt();
        int endRange = in.nextInt();

        System.out.println("Result: " + sumOffOdd(startRange, endRange));

        in.close();

    }

    static int sumOffOdd(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0)
                sum += i;

        }

        return sum;

    }
}