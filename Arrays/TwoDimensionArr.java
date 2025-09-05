package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionArr {

    public static void main(String[] args) {

        int[][] matix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // System.out.println(Arrays.deepToString(matix));

        for (int[] num : matix) {
            System.out.println(Arrays.toString(num));
        }

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][];

        for (int row = 0; row < arr.length; row++) {

            int column = in.nextInt();

            arr[row] = new int[column];

            for (int col = 0; col < column; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for (int[] num : arr) {
            System.out.println(Arrays.toString(num));
        }
    } 
}