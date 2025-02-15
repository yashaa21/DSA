/*
Problem: Given an array of integers, find the maximum product of 
any two distinct elements in the array.
 Input: An array of integers, e.g., [1, 5, 3, 4].
 Output: The maximum product, e.g., for the array [1, 5, 3, 4], the 
result would be 20 (from the pair 5 and 4).
*/

public class MaxProductOfTwoElements {
    public static int maxProduct(int[] arr) {
       
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1; // Update max2 to the old max1
                max1 = arr[i]; // Update max1 to the new maximum
            } else if (arr[i] > max2) {
                max2 = arr[i]; // Update max2 if it's less than max1 but greater than current max2
            }
        }

        return max1 * max2; // Return the maximum product
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4};
        System.out.println("Maximum product of two distinct elements: " + maxProduct(arr));
    }
}
