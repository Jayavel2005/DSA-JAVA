package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = in.nextInt();
        }

        int[] pre = new int[4];
        pre[0] = 1;
        for (int i = 1; i < 4; i++) {
            pre[i] = pre[i - 1] * arr[i - 1];
        }

        int[] suf = new int[4];
        suf[arr.length - 1] = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] * arr[i + 1];
        }

        System.out.println(Arrays.toString(suf));

        System.out.println(Arrays.toString(pre));

        for(int i = 0;i<4;i++){
            System.out.println(pre[i] * suf[i]);
        }
    }
}