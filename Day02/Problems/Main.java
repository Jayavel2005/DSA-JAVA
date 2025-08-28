import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Largest of three numbers

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // if (num1 >= num2 && num1 >= num3) {
        // System.out.println("Number one is greater: " + num1);
        // } else if (num2 >= num1 && num2 >= num3) {
        // System.out.println("Number two is greater: " + num2);
        // } else {
        // System.out.println("Number three is greater: " + num3);
        // }

        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("Max value = " + max);

    }
}