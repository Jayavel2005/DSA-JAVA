import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShiftLetter {

    public static void main(String[] args) {
        // String s = "abc";
        // int[] shifts = { 3, 5, 9 };

        // char[] arr = s.toCharArray();

        // for (int i = 0; i < shifts.length; i++) {
        // int shift = shifts[i] % 26;

        // for (int j = 0; j <= i; j++) {
        // int value = arr[j] - 'a';
        // value = (value + shift) % 26;
        // arr[j] = (char) ('a' + value);
        // }
        // }

        // System.out.println(Arrays.toString(arr));

        // int T1 = 5;
        // int[] E1 = { 7, 0, 5, 1, 3 };
        // int[] L1 = { 1, 2, 1, 3, 4 };
        // System.out.println(maxGuests(E1, L1, T1));

        // int T2 = 4;
        // int[] E2 = { 3, 5, 2, 0 };
        // int[] L2 = { 0, 2, 4, 4 };
        // System.out.println(maxGuests(E2, L2, T2));

        char[] ballons = { 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'a', 'f', 'c' };
        System.out.println(firstOddBallon(ballons));

    }

    // public static int maxGuests(int[] E, int[] L, int T) {
    // int current = 0;
    // int max = 0;

    // for (int i = 0; i < T; i++) {
    // current = current + E[i] - L[i];
    // max = Math.max(max, current);
    // }

    // return max;
    // }

    public static char firstOddBallon(char[] ballons) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ballons.length; i++) {
            map.put(ballons[i], map.getOrDefault(ballons[i], 0) + 1);
        }

        System.out.println(map);
        for (char c : ballons) {
            if (map.get(c) % 2 != 0) {
                return c;
            }
        }
        return '\0';
    }
}
