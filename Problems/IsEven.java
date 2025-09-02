package Problems;

import java.util.Scanner;

public class IsEven {

    public static void main(String[] args) {
        // Determine if a given integer is even or odd.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        System.out.println(isEven(number) ? "Even" : "Odd");
        in.close();

    }

    // Odd or Even Function
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

}