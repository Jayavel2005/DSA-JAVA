import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        /*
         * Syntax of for loops
         * 
         * for (initialisation; condition; increment) {
         * 
         * // body
         * 
         * }
         * 
         * 
         */

        // for (int i = 1; i <= 5; i += 1) {
        // System.out.println(i);
        // }

        // Print number from 1 to n

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        // for (int i = 1; i <= n; i++) {
        // System.out.print(i + " ");
        // }

        int i = 1;
        while (i <= n) {
            System.out.println(i + " ");
            i += 1;
        }
    }
}