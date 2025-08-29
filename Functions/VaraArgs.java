package Functions;

import java.util.Scanner;

public class VaraArgs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n <= 1) {
            System.out.println("not prime");
        } else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    System.out.println("not prime");
                    break;
                } else {
                    System.out.println("prime");
                    break;
                }
            }
        }
    }
}