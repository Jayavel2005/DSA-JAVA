import java.util.Scanner;

public class Pattern16 {

    public static void main(String[] args) {
        /*
        *********
         *******
          *****
           ***
            *
         */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}