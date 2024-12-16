/*
Problem: Write a function that prints all possible subarrays of a 
given array.
 Input: An array of integers, e.g., [1, 2, 3].
 Output: All subarrays, e.g., for the array [1, 2, 3], the result would 
be:
o [1]
o [1, 2]
o [1, 2, 3]
o [2]
o [2, 3]
o [3]
*/

class PrintAllSubarrays {
    public static void printAllSubarrays(int[] arr) {
               for (int start = 0; start < arr.length; start++) {
                        for (int end = start; end < arr.length; end++) {
                                System.out.print("[");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i]);
                    if (i < end) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("All possible subarrays:");
        printAllSubarrays(arr);
    }
}
