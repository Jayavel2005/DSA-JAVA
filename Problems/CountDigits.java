import java.util.Scanner;

/*
 * Problem: Count the number of digits in an integer.
 * Description: Given an integer, count the number of digits it has.
 */

public class CountDigits {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        int digit = countDigitsLogarithimic(Math.abs(number));
        System.out.println(digit);
    }

    static int countDigitsLoop(int number) { // loop method
        int count = 0;

        if (number >= -9 && number <= 9)
            count = 1;

        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Logarithim approach with log10

    /*
     * log10 -> it returns how much power must I have to achieve the number n =
     * log10(number) + 1;
     */

    static int countDigitsLogarithimic(int number) {

        if (number >= 0 && number <= 9)
            return 1;

        return (int) Math.log10(number) + 1;
    }
}