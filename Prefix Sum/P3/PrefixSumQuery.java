public class PrefixSumQuery {
    // Function to construct the prefix sum array
    public static int[] constructPrefixSumArray(int[] arr) {
        int[] prefixSum = new int[arr.length];
        
                prefixSum[0] = arr[0];
        
               for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        return prefixSum;
    }

        public static int rangeSum(int[] prefixSum, int L, int R) {
        if (L > 0) {
            return prefixSum[R] - prefixSum[L - 1];
        } else {
            return prefixSum[R]; // If L is 0, return the sum from 0 to R
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
         int[] prefixSum = constructPrefixSumArray(arr);
        int L = 1, R = 3;
        int result = rangeSum(prefixSum, L, R);
        
        System.out.println(result);
    }
}
