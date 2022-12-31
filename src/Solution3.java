import java.util.Arrays;

public class Solution3 {
    public static void merge(int[] numbs1, int m, int[] numbs2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i < 0 || numbs1[i] < numbs2[j]) {
                numbs1[k--] = numbs2[j--];
            } else {
                numbs1[k--] = numbs1[i--];
            }
        }
        System.out.println("Task3: " + Arrays.toString(numbs1));
    }
}