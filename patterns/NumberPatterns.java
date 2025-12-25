import java.util.Scanner;

public class NumberPatterns {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        // pattern6(n);
        // pattern7(n);
        // pattern8(n);
        // pattern9(n);
        // pattern10(n);
        // pattern11(n);
        // pattern12(n);
        // pattern13(n);
        // pattern14(n);
        // pattern15(n);
        // pattern16(n);
        pattern17(n);

    }

    /*
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */
    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * 1
     * 22
     * 333
     * 4444
     * 55555
     */

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /*
     * 
     * 12345
     * 1234
     * 123
     * 12
     * 1
     */

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * 11111
     * 2222
     * 333
     * 44
     * 5
     */

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /*
     * 1
     * 23
     * 456
     * 78910
     */

    public static void pattern5(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    /*
     * 
     * 1
     * 01
     * 101
     * 0101
     * 10101
     */

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2 == 0 ? "1" : "0");
            }
            System.out.println();
        }
    }

    /*
     * 
     * 1 2 3 4 5
     * 2 3 4 5
     * 3 4 5
     * 4 5
     * 5
     */

    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }

    /*
     * 
     * 5
     * 45
     * 345
     * 2345
     * 12345
     */

    public static void pattern8(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * 
     * 1
     * 121
     * 12321
     */
    public static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }
    }

    /*
     * 123454321
     * 1234321
     * 12321
     * 121
     * 1
     */

    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {

            // int spaces =
            for (int s = 1; s <= n - (n - i + 1); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            for (int k = n - i; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }

    }
    /*
     * 1
     * 21
     * 321
     * 4321
     * 54321
     */

    public static void pattern11(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * 5
     * 54
     * 543
     * 5432
     * 54321
     * 
     */
    public static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /*
     * 1
     * 23
     * 345
     * 4567
     * 56789
     */

    public static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + j - 1);
            }
            System.out.println();
        }
    }

    /*
     * ````1
     * ```22
     * ``333
     * `4444
     * 55555
     */

    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }

    /*
     * 1
     * 2 2
     * 3 3 3
     * 4 4 4 4
     * 5 5 5 5 5
     */
    public static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
     * 12321
     * 12321
     * 12321
     * 12321
     * 12321
     */

    public static void pattern16(int n) {
        int fixed = 3;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= fixed; j++) {
                System.out.print(j);
            }

            for (int k = fixed - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }
    }

    /*
     * 1 2 3 2 1
     * 2 3 2
     * 3
     */

    public static void pattern17(int n) {
        for (int i = 1; i <= n; i++) {

            // spaces (2 spaces per level for alignment)
            for (int s = 1; s <= (i - 1); s++) {
                System.out.print("  ");
            }

            // increasing numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }

            // decreasing numbers
            for (int k = n - 1; k >= i; k--) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }

    /*
     * 1
     * 232
     * 34543
     * 4567654
     */


    

}
