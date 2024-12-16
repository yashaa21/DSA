/*
Problem: Given a binary array (an array that contains only 0s and 
1s), find the length of the longest subarray with an equal number of 
0s and 1s.
 Input: A binary array, e.g., [0, 1, 0].
 Output: Length of the longest subarray, e.g., for the array [0, 1, 0], 
the result would be 2.
*/

public class LongestEqualSubarray {
    public static int findMaxLength(int[] nums) {
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }

        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == 0) {
                    int length = end - start + 1;
                    maxLength = Math.max(maxLength, length);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0};
        int result = findMaxLength(nums);
        System.out.println("Length of the longest subarray with equal number of 0s and 1s: " + result);
    }
}
