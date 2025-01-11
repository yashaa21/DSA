//GCD of array 

class Sol8 {
    public static void main(String[] args) {
        int[] array = {36, 60, 84}; 
        System.out.println("GCD of the array: " + findGCD(array, array.length));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int findGCD(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }

        return gcd(array[n - 1], findGCD(array, n - 1));
    }
}
