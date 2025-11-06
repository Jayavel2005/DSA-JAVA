package Arrays.ArrayProblems;

public class KthLargestElement {

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 4, 5, 6 };
        int k = 2;

        int kth = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {

            int max = Integer.MIN_VALUE;
            int index = -1;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] > max) {
                    max = nums[j];
                    index = j;
                }
            }

            kth = max;
            nums[index] = Integer.MIN_VALUE;
        }

        System.out.println(kth);

    }
}