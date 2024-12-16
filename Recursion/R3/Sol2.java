public class second {
       // count char

    public static int fun(String str, char chr) {

        int count=0;

        if (str.isEmpty()) {
            return 0;
        }
        char first = str.charAt(0);

        if (first == chr) {
           count++;
        }
        return count + fun(str.substring(1), chr);
        
    }
 

    public static void main(String[] args) {
        String input = "aeroplane";
        char chr = 'e';
        
        int result = fun(input, chr);
        System.out.println("count : " + result);
    }
}
