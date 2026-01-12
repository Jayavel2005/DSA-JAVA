import java.util.*;

public class Rod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int max = 0;
            for (int j = 1; j <= i; j++) {
                max = Math.max(max, price[j - 1] + dp[i - j]);
            }
            dp[i] = max;
        }

        System.out.println(dp[n]);
    }
}
