//Palindrome checking

class Sol8{
public static boolean fun(String s){

	if(s==null || s.length()<=1){
	return true;	
	}
//checking the first and last char

	if(s.charAt(0) !=s.charAt(s.length()-1)){

return false;
}
//recursion on string excluding first and last char
return fun(s.substring(1, s.length() - 1));
	
		}
public static void main(String[]args){
String s =")))(((" ;
Boolean res = fun(s);

//System.out.println(" Reverse of string is " + s + " is "+ res);
 if (res) {
            System.out.println("The string \"" + s + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + s + "\" is not a palindrome.");
        } 
	}
}