class Sol1 {

    public static String fun(String input, char old, char newchar) {

        if (input.isEmpty()) {
            return "";
        }
        char first = input.charAt(0);

        if (first == old) {
            first = newchar;
        }
        return first + fun(input.substring(1), old, newchar);

    }

    public static void main(String[] args) {
        String input = "HoneyBunny";
        char old = 'y';
        char newChar = 'e';

        String result = fun(input, old, newChar);
        System.out.println("New String: " + result);
    }
}
