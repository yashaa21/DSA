//Reverse a string 

class Sol7{
static String fun(String s){

	if(s==null || s.length()<=1){
	return s;	
	}
	return fun(s.substring(1)) + s.charAt(0);
	
		}
public static void main(String[]args){
String s ="YASH" ;
String res = fun(s);

System.out.println(" Reverse of string is " + s + " is "+ res);
 
	}
}