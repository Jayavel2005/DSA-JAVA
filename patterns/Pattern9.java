// package patterns;

import java.util.Scanner;

public class Pattern9 {

    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
        
        */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Approach 1

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i < n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        for (int i = 1; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}