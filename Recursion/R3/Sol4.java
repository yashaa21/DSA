class Sol4 {


    public static boolean fun(String str) {
        if (str.length() <= 1) {
            return true;
        }

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        if (first != last) {
            return false;
        }

        String middle = str.substring(1, str.length() - 1);
        
        return fun(middle);
    }

    public static void main(String[] args) {
        String input = "madam";

        boolean result = fun(input);

        if(result==true){
            System.out.println("its palindrome");
        }
        else{
            System.out.println("its not palindrome");
        }
    }
}
