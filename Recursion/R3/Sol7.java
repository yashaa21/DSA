public class seventh {

    //  string to uppercase
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

        // Call the method and print the result
        String result =fun(input);
        System.out.println("Uppercase String: " + result);
    }
}
