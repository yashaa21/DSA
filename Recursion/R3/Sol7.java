class Sol7 {

    public static int findLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        return 1 + findLength(str.substring(1));
    }

    public static void main(String[] args) {
        String input = "Serendipity";
        int length = findLength(input);
        System.out.println("The length of the string " + input + " is: " + length);
    }
}
