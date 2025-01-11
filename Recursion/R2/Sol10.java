//Binary Searcch Recursive

public class Sol10 {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13}; 
        int target = 7; 
        int result = binarySearch(sortedArray, target, 0, sortedArray.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; 
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid;
        }

        if (target < array[mid]) {
            return binarySearch(array, target, left, mid - 1);
        }

        return binarySearch(array, target, mid + 1, right);
    }
}
