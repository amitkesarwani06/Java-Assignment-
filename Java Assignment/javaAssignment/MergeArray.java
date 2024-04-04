import java.util.Arrays;

public class MergeArray {

    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        // Move all non-zero elements of X to the beginning
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }

        // Merge Y[] into X[]
        int i = k + 1;
        int j = 0;
        int l = 0;

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[l++] = X[i++];
            } else {
                X[l++] = Y[j++];
            }
        }

        // Copy remaining elements of Y[] if any
        while (j < n) {
            X[l++] = Y[j++];
        }

        // Copy remaining elements of X[] if any
        while (i < m) {
            X[l++] = X[i++];
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        mergeArrays(X, Y);

        System.out.println("Merged array: " + Arrays.toString(X));
    }
}
