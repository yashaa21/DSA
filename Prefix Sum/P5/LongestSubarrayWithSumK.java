/*
Problem: Given an array of integers and a target sum K, find the 
length of the longest subarray whose sum is less than or equal to K
using the prefix sum technique.
 Input: An array of integers, e.g., [4, 3, 1, 2, 5] and K = 7.
 Output: Length of the longest subarray, e.g., for the input [4, 3, 1, 
2, 5] and K = 7, the output would be 3 (subarray [3, 1, 2] has sum 
6)
*/

public class LongestSubarrayWithSumK {
    public static int longestSubarrayWithSumAtMostK(int[] arr, int K) {
        int maxLength = 0;
        int start = 0;
        int currentSum = 0;
        
        for (int end = 0; end < arr.length; end++) {
            // Add the current element to the current sum
            currentSum += arr[end];
            
            // Shrink the window from the left if the current sum exceeds K
            while (currentSum > K && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            
            // Update the maximum length if the current window is valid
            if (currentSum <= K) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5};
        int K = 7;
        int result = longestSubarrayWithSumAtMostK(arr, K);
        System.out.println("Length of the longest subarray with sum at most " + K + ": " + result);
    }
}
