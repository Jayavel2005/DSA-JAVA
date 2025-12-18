// package patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        /*
         ******
          *****
           ****
            ***
             **
              *
        */

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}