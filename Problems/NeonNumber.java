package Problems;

import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int startRange = in.nextInt();
        int endRange = in.nextInt();

        for (int i = startRange; i <= endRange; i++)
            if (neonNumber(i))
                System.out.println("The number " + i + " is a neon number");

        in.close();

    }

    static int sqaure(int num) {
        return num * num;

    }

    static boolean neonNumber(int number) {
        int neon = 0;
        int sqauredValue = sqaure(number);

        while (sqauredValue != 0) {
            neon += sqauredValue % 10;
            sqauredValue /= 10;
        }

        return neon == number;
    }
}