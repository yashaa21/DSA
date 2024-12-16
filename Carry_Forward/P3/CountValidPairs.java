/*
Problem: Given an array of integers, count the number of pairs (i, 
j) such that i < j and arr[i] < arr[j].
 Input: An array of integers, e.g., [1, 4, 2, 5].
 Output: The count of valid pairs, e.g., for the array [1, 4, 2, 5], the 
result would be 4 (pairs: (1, 4), (1, 5), (2, 5), and (4, 5)).

*/

public class CountValidPairs {
    public static int countPairs(int[] arr) {
        int count = 0; // Initialize the count of valid pairs

        // Iterate over all possible pairs (i, j)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Check if arr[i] is less than arr[j]
                if (arr[i] < arr[j]) {
                    count++; // Increment the count if valid
                }
            }
        }

        return count; // Return the total count of valid pairs
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5};
        int result = countPairs(arr);
        System.out.println("Count of valid pairs: " + result);
    }
}
