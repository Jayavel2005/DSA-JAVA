public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 1, 9, 2, 5, 1, 7};
        int n = arr.length;

        int[] nge = new int[n];
        int[] nse = new int[n];
        int[] stack = new int[n];
        int top = -1;

        for (int i = n - 1; i >= 0; i--) {
            while (top != -1 && arr[stack[top]] <= arr[i]) top--;
            nge[i] = top == -1 ? -1 : stack[top];
            stack[++top] = i;
        }

        top = -1;

        for (int i = n - 1; i >= 0; i--) {
            while (top != -1 && arr[stack[top]] >= arr[i]) top--;
            nse[i] = top == -1 ? -1 : arr[stack[top]];
            stack[++top] = i;
        }

        for (int i = 0; i < n; i++) {
            if (nge[i] == -1) System.out.print("-1 ");
            else System.out.print(nse[nge[i]] + " ");
        }
    }
}
