package Problems;

import java.util.Scanner;

public class ArmsStrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startRange = in.nextInt();
        int endRange = in.nextInt();

        for (int i = startRange; i <= endRange; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        in.close();

    }

    static boolean isArmstrong(int number) {
        int copyNum = number;
        int len = String.valueOf(copyNum).length();
        int arms = 0;

        while (copyNum != 0) {
            arms += Math.pow(copyNum % 10, len);
            copyNum /= 10;
        }

        return arms == number;

    }
}