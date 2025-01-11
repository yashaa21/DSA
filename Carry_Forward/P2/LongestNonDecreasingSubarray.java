/*
Problem: Given an array of integers, find the length of the longest 
contiguous subarray where the elements are non-decreasing.
 Input: An array of integers, e.g., [5, 6, 3, 5, 7, 8].
 Output: The length of the longest non-decreasing subarray, e.g., 
for the array [5, 6, 3, 5, 7, 8], the result would be 4 (subarray [3, 5, 
7, 8]).
*/

public class LongestNonDecreasingSubarray {
    public static int longestNonDecreasingSubarray(int[] arr) {
        if (arr.length == 0) return 0; // Handle empty array case

        int maxLength = 1; // To track the maximum length found
        int currentLength = 1; // To track the current length of the non-decreasing subarray

        for (int i = 1; i < arr.length; i++) {
            // Check if the current element is greater than or equal to the previous element
            if (arr[i] >= arr[i - 1]) {
                currentLength++; // Increment current length
            } else {
                // If the current sequence ends, update maxLength if needed
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1; // Reset current length
            }
        }

        // Final check to account for the last non-decreasing subarray
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }

        return maxLength; // Return the maximum length
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 5, 7, 8};
        int result = longestNonDecreasingSubarray(arr);
        System.out.println("Length of the longest non-decreasing subarray: " + result);
    }
}
