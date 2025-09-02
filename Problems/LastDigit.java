package Problems;

import java.util.Scanner;

public class LastDigit {

    public static void main(String[] args) {
        // Extract the last digit from a given integer.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();

        System.out.println("Last digit of the number " + number + " is " + lastDigit(number));

        in.close();

    }

    static int lastDigit(int number) {
        return number % 10;
    }
}