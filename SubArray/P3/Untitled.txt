/*
Problem: Given an array of integers and a target sum, count the 
number of subarrays whose sum equals the target.
 Input: An array of integers and a target sum, e.g., [1, 1, 1], target = 
2.
 Output: Number of subarrays with sum equal to the target, e.g., 
for the array [1, 1, 1] and target 2, the result would be 2.
*/

public class SubarraySumEqualsTarget {
    public static int countSubarraysWithTargetSum(int[] arr, int target) {
        int count = 0;
        
       
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            
            // Calculate the sum of subarrays starting from 'start' to each 'end'
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                
                
                if (sum == target) {
                    count++;
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int target = 2;
        int result = countSubarraysWithTargetSum(arr, target);
        System.out.println("Number of subarrays with sum equal to target: " + result);
    }
}
