import java.util.*;

public class Part_2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int count = 0;

            for (int i = 0; i < N; i++) {
                if (X >= arr[i]) {
                    X -= arr[i];
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);
        }
    }
}
