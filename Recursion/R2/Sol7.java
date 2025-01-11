//reverse an array


import java.util.Arrays;

class Sol7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; 
        System.out.println("Original array: " + Arrays.toString(array));
        reverseArray(array, 0, array.length - 1);
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    
    public static void reverseArray(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        reverseArray(array, start + 1, end - 1);
    }
}
