import java.util.*;

class Parenthesis{

	boolean validParenthesis(String str){
		
		Stack s = new Stack();
		
		for(int i = 0; i < str.length(); i++){
			
			char chStr = str.charAt(i);
			
			if( chStr == '{' ||  chStr == '(' || chStr == '['){
				
				s.push(chStr);
			} else{
				
				char chStack = (char)s.peek();
				if(
					(chStr == '}' && chStack == '{') ||
					(chStr == ')' && chStack == '(') ||
					(chStr == ']' && chStack == '[' )				
				){
					
					s.pop();
				}else{
					
					return false;
				}
				
			}
			
		}
		
		if(s.isEmpty())
			return true;
		else
			return false;
		
	}

}

class Client{

	public static void main(String[] args){
	
		String str1 = "{[()]}";
		String str2 = "{[()}";
		Parenthesis obj = new Parenthesis();
		boolean result = obj.validParenthesis(str2);
		if(result == true)
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}

}