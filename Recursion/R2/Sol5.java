class Sol5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6}; 
        System.out.println("Sum of even numbers: " + sumOfEvens(numbers, 0));
    }

    public static int sumOfEvens(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }

        if (array[index] % 2 == 0) {
            return array[index] + sumOfEvens(array, index + 1);
        } else {
            return sumOfEvens(array, index + 1);
        }
    }
}
