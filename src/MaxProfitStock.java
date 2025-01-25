public class MaxProfitStock {
    public static void main(String args[]) {
        int k = 3;
         int a[] = {2,4,7,9,1};
        System.out.println(findTarget(a,k));
    }
    public static int findTarget(int[] a, int k) {
        if (a == null || a.length < 2) {
            return 0; // No days required for invalid or too-small input
        }

        int start = 0;
        int end = 1;
        int days = 0;
        int n = a.length;

        while (end < n) {
            // Check if the difference is within the allowed range
            if (Math.abs(a[start] - a[end]) <= k) {
                end++; // Move end pointer
            } else {
                days++; // Increment days when the condition is not met
                start = end; // Reset start to the current end
                end = start + 1; // Move end pointer ahead of start
            }
        }

        // Increment days for the last group if required
        if (start < n - 1) {
            days++;
        }

        return days;
    }
}