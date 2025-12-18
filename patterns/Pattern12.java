// package patterns;

import java.util.Scanner;

public class Pattern12 {

    /*
         *
        ***
       *****
      *******
    
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            int spcaes = n - i;
            for (int s = 1; s <= spcaes; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}