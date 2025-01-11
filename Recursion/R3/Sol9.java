class Sol9 {

    public static void printSubstrings(String str, String current, int index) {
        if (index == str.length()) {
            return;
        }

        current += str.charAt(index);

        System.out.println(current);

        printSubstrings(str, current, index + 1);
    }

    public static void generateSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            printSubstrings(str, "", i);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("All substrings of " + input + ":");
        generateSubstrings(input);
    }
}
