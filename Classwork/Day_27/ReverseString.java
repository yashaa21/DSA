import java.util.*;

class StackDemo{
	
	String reverse(String str){
		
		Stack<Character> s = new Stack<Character>();
		
		for(int i = 0; i < str.length(); i++){
			
			s.push(str.charAt(i));
		}
		
		char[] carr = new char[str.length()];
		int i = 0;
		
		while(!s.isEmpty()){
			
			carr[i] = s.pop();
			i++;
		}
		
		return new String(carr);
	}
}

class Client{

	public static void main(String[] args){
	
		StackDemo s = new StackDemo();
		String str = "Ganesh";
		String revStr = s.reverse(str);
		System.out.println(revStr);
	}

}