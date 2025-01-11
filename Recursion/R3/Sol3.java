class Sol3 {

    public static String removeVowels(String str) {
        if (str.isEmpty()) {
            return str;
        }

        char firstChar = str.charAt(0);
        if (isVowel(firstChar)) {
            return removeVowels(str.substring(1));
        } else {
            return firstChar + removeVowels(str.substring(1));
        }
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c); 
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String input = "Serene and Divine!";
        String result = removeVowels(input);
        System.out.println("Original String: " + input);
        System.out.println("String without vowels: " + result);
    }
}
