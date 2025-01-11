//count occurences

class Sol9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 2, 5};
        int target = 2; 
        System.out.println("Occurrences of " + target + ": " + countOccurrences(array, target, 0));
    }

    public static int countOccurrences(int[] array, int target, int index) {
        if (index == array.length) {
            return 0;
        }

        int count = (array[index] == target) ? 1 : 0;

        return count + countOccurrences(array, target, index + 1);
    }
}
