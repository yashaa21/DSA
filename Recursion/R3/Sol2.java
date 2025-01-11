class Sol2 {

    public static int fun(String str, char ch) {

        int count=0;

        if (str.isEmpty()) {
            return 0;
        }
        char first = str.charAt(0);

        if (first == ch) {
           count++;
        }
        return count + fun(str.substring(1), ch);
        
    }
 

    public static void main(String[] args) {
        String input = "aeroplane";
        char ch = 'e';
        
        int result = fun(input, ch);
        System.out.println("count : " + result);
    }
}
