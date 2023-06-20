package in.ineuron.in;
import java.util.Arrays;

public class NearestSmallerNumber {
    public static void main(String[] args) {
        int[] a = {1, 6, 2};
        int[] result = findNearestSmaller(a);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findNearestSmaller(int[] a) {
        int n = a.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize all elements with -1

        for (int i = 1; i < n; i++) {
            int j = i - 1;
            while (j >= 0) {
                if (a[j] < a[i]) {
                    result[i] = a[j];
                    break;
                }
                j--;
            }
        }

        return result;
    }
}
