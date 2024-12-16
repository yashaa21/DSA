public class first {
    // replace char

    public static String fun(String input, char old, char newchr) {

        if (input.isEmpty()) {
            return "";
        }
        char first = input.charAt(0);

        if (first == old) {
            first = newchr;
        }
        return first + fun(input.substring(1), old, newchr);

    }

    public static void main(String[] args) {
        String input = "aeroplane";
        char old = 'p';
        char newChr = 'b';

        String result = fun(input, old, newChr);
        System.out.println("New String: " + result);
    }
}
