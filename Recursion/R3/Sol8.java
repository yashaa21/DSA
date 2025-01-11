class Sol8 {

    public static String fun(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char firstChar = Character.toUpperCase(str.charAt(0));

        String remainingString = fun(str.substring(1));

        return firstChar + remainingString;
    }

    public static void main(String[] args) {
        String input = "hello";

        String result =fun(input);
        System.out.println("Uppercase String: " + result);
    }
}
