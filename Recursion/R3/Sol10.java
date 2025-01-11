class Sol10 {

    public static int countConsonants(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        char firstChar = str.charAt(0);
        if (isConsonant(firstChar)) {
            return 1 + countConsonants(str.substring(1));
        } else {
            return countConsonants(str.substring(1));
        }
    }

    private static boolean isConsonant(char c) {
        c = Character.toLowerCase(c); 
        return (c >= 'a' && c <= 'z') && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static void main(String[] args) {
        String input = "DSA in Java";
        int consonantCount = countConsonants(input);
        System.out.println("The number of consonants in \"" + input + "\" is: " + consonantCount);
    }
}
