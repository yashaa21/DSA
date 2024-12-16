public class sixth {

    //  find the length of a string
    public static int fun(String str) {
        
        if (str.isEmpty()) {
            return 0;
        }

        return 1 + fun(str.substring(1));
    }

    public static void main(String[] args) {
        String input = "DSA";

        int result = fun(input);
        System.out.println("Length :"+ result);
    }
}
