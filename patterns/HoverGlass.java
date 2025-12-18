import java.util.Scanner;

public class HoverGlass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("HoverGlass pattern in Java");
        for (int i = n * 2; i >= 1; i--) {
            int cols = i > n ? i - n : n - i + 1;
            int spaces = i > n ? n * 2 - i : i - 1;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= cols; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}