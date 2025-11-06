public class Main {

    public static void main(String[] args) {
        int num = 19;
        int sum = num;
        boolean isHappy = false;
        while (true) {
            int temp = 0;
            num = sum;
            while (num > 0) {
                temp += Math.pow(num % 10, 2);
                num /= 10;
            }
            sum = temp;

            if (sum == 1) {
                isHappy = true;
                break;
            }
            if (sum == num) {
                break;
            }

        }

        System.out.println(isHappy ? "Happy" : "Sad");
    }
}