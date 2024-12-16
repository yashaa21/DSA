/*
Problem: Given an array of integers, find the maximum difference 
arr[j] - arr[i] such that i < j.
 Input: An array of integers, e.g., [7, 1, 5, 3, 6, 4].
 Output: The maximum difference, e.g., for the array [7, 1, 5, 3, 6, 
4], the result would be 5 (difference between 6 and 1).
*/

public class MaxDifference {
    public static int maxDifference(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return -1; // Handle case with insufficient elements
        }

        int minElement = arr[0]; // Initialize the minimum element as the first element
        int maxDiff = arr[1] - arr[0]; // Initialize the maximum difference

        // Iterate through the array starting from the second element
        for (int j = 1; j < arr.length; j++) {
            // Update the maximum difference if the current difference is larger
            if (arr[j] - minElement > maxDiff) {
                maxDiff = arr[j] - minElement;
            }

            // Update the minimum element if the current element is smaller
            if (arr[j] < minElement) {
                minElement = arr[j];
            }
        }

        return maxDiff; // Return the maximum difference
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int result = maxDifference(arr);
        System.out.println("Maximum difference: " + result);
    }
}
