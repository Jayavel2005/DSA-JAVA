public class LowerBound {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 5, 6, 6 };
        int low = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        int target = 5;

        while (low <= end) {
            int mid = low + (end - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}