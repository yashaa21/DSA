/*
Problem: Given an array of integers, find the contiguous subarray 
with the maximum sum.
 Input: An array of integers, e.g., [-2, 1, -3, 4, -1, 2, 1, -5, 4].
 Output: Maximum sum of a subarray, e.g., for the array [-2, 1, -3, 
4, -1, 2, 1, -5, 4], the result would be 6.
*/

public class MaximumSubarraySum {
    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int num : arr) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubarraySum(arr);
        System.out.println("Maximum sum of a subarray: " + result);
    }
}
