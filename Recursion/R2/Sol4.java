//DEcimal to binaery

class Sol4 {
    public static void main(String[] args) {
        int decimal = 25; 
        System.out.println("Binary representation of " + decimal + " is: " + convertToBinary(decimal));
    }

    public static String convertToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        }
        return convertToBinary(decimal / 2) + (decimal % 2);
    }
}
