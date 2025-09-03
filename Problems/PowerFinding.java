package Problems;

/*
 * Problem: Calculate the power of a number.
 * Description: Given a base and an exponent, calculate the power.
 */

import java.util.Scanner;

public class PowerFinding {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int power = in.nextInt();
        System.out.println(getPower(number, power));
        in.close();

    }

    static double getPower(int number, int power) {
        if (power == 0 && number == 0) {
            throw new ArithmeticException("0^0 is undefined!");
        }
        if (power == 0) {
            return 1;
        }

        if (power < 0)
            return 1.0 / getPower(number, -power);

        double result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;

        }

        return result;
    }
}