/*
Problem: Given an array of integers and an integer K, find the 
total number of subarrays whose sum equals K using the prefix 
sum technique.
 Input: An array of integers, e.g., [1, 1, 1] and K = 2.
 Output: Number of subarrays that sum to K, e.g., for the input [1, 
1, 1] and K = 2, the output would be 2 (subarrays [1, 1] appear 
twice).
*/

public class SubarraySumEqualsK {
    public static int countSubarraysWithSumK(int[] arr, int K) {
        int count = 0;
        
        // Loop through each starting index of the subarray
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            
            // Calculate the sum of subarrays starting at 'start' index
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                
                // If sum equals K, increment the count
                if (sum == K) {
                    count++;
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int K = 2;
        int result = countSubarraysWithSumK(arr, K);
        System.out.println("Number of subarrays with sum " + K + ": " + result);
    }
}



//Time Complexity: O(n^2)
//Space Complexity: O(1)