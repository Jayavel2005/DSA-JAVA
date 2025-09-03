import java.util.Scanner;

/*
 * Problem: Check if a number is a Disarium number.
 * Description: A Disarium number is a number in which the sum of its digits powered with their respective positions is equal to the number itself.
 */

public class DisariumNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        System.out.println(
                isDisarium(Math.abs(number)) ? "Number " + number + " is Disarium"
                        : "Number " + number + " is not Disarium");

        in.close();
    }

    static boolean isDisarium(int number) {

        int k = String.valueOf(number).length();
        int copy = number;
        int disarium = 0;
        while (number != 0) {
            disarium += Math.pow(number % 10, k--);
            number /= 10;
        }

        return disarium == copy;

    }
}