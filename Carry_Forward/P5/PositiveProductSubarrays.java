/*
Problem: Given an array of integers (which may include negative 
values), find the total number of contiguous subarrays whose 
product is positive.
 Input: An array of integers, e.g., [1, -2, -3, 4].
 Output: The total count of subarrays with a positive product, e.g., 
for the array [1, -2, -3, 4], the result would be 6
*/

public class PositiveProductSubarrays {
    public static int countPositiveProductSubarrays(int[] arr) {
        int totalCount = 0; // Total count of positive product subarrays
        int positiveCount = 0; // Count of positive product subarrays ending at current index
        int negativeCount = 0; // Count of negative product subarrays ending at current index

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++; // Increment positive count
                totalCount += positiveCount; // Add to total count
            } else if (arr[i] < 0) {
                // Swap counts if the current number is negative
                int temp = positiveCount; // Store current positive count
                positiveCount = negativeCount > 0 ? negativeCount + 1 : 0; // Update positive count
                negativeCount = temp + 1; // Update negative count
                totalCount += positiveCount; // Add to total count
            } else {
                // Reset counts if the current number is zero
                positiveCount = 0;
                negativeCount = 0;
            }
        }

        return totalCount; // Return total count of positive product subarrays
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, -3, 4};
        int result = countPositiveProductSubarrays(arr);
        System.out.println("Total count of contiguous subarrays with positive product: " + result);
    }
}
