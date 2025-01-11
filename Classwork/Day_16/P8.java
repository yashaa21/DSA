
class Recursion{
	

	static void fun(String str){
		
		//['H','e','l','l','o',',',' ','w','o','r','l','d','!']
		
		//base condition
		if(str.length() == 0)
			return;
		
		//logic
		System.out.println(str.charAt(0));
		
		//recursion
		fun(str.substring(1,str.length()));
		
	}
	
	public static void main(String[] args){
	
		fun("Hello, world!");
				
	}
	
}

