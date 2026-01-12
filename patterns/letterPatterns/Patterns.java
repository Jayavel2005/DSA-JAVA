// package letterPatterns;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // pattern1(n);
        // System.out.println();
        // pattern2(n);
        // System.out.println();
        pattern3(n);
    }

    /*
     * A
     * AB
     * ABC
     * ABCD
     * ABCDE
     */
    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    /*
     * ABCDE
     * ABCD
     * ABC
     * AB
     * A
     */
    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    /*
     * A
     * A B
     * A B C
     * A B C D
     * A B C D E
     * 
     */
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // reverse alphabets
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j) + " ");
            }

            System.out.println();
        }
    }

}