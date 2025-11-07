import java.util.*;

class CSE {
    public int fact(int n) {
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        return count;
    }
}

public class Stacks {

    public static void main(String[] args) {
        int arr[] = { 8, 12, 16, 2, 3 };
        CSE cse = new CSE();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int val1 = cse.fact(arr[i]);
                int val2 = cse.fact(arr[j]);
                if (val1 > val2) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}