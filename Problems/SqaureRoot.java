package Problems;

/*
 * Problem: Find the square root of a number.
 * Description: Given a non-negative integer, find its integer square root.
 */

import java.util.Scanner;

public class SqaureRoot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(sqaureRootBinarySearch(number));
        in.close();
    }

    static int sqaureRoot(int number) {
        int res = 0;
        for (int i = 1; i <= number; i++) {
            if (i * i <= number) {
                res = i;
            }
        }

        return res;
    }

    static int sqaureRootBinarySearch(int number) {
        int start = 1, end = number;
        int result = 0;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid * mid <= number) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return result;
    }
}