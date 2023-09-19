import java.util.*;

public class Difference {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 1, 6, 8, 9 };
        int min = 999;
        int max = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = arr[j] - arr[i];
                if (diff < min) {
                    min = diff;
                }
                if (diff > max) {
                    max = diff;
                }
            }
        }
        System.out.println(max + "," + min);
    }
}