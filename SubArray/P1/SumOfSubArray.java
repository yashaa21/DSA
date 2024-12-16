public class SumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Example array
        int totalSum = SumOfAllSubarrays(arr);
        System.out.println("Sum of all subarrays: " + totalSum);
    }

    public static int SumOfAllSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            int contribution = arr[i] * (i + 1) * (n - i);
            totalSum += contribution;
        }

        return totalSum;
    }
}
