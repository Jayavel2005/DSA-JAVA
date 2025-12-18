import java.util.Scanner;

public class Pattern13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i < n * 2; i++) {

            int col = i <= n ? i : 2 * n - i;
            int spaces = i <= n ? n - i : i - n;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}