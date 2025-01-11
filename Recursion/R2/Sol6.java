//Check prime
class Sol6 {
    public static void main(String[] args) {
        int number = 29; 
        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    
    public static boolean isPrime(int number, int divisor) {
        if (number < 2) {
            return false;
        }
        if (divisor > Math.sqrt(number)) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor + 1);
    }
}
