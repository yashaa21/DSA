
class Recursion{
	

	static void fun(int num){
		
		//base condition
		if(num == 0)
			return;
		
		//recursion call
		fun(num - 2);
		
		//logic 
		System.out.println(num);
		
		
	}
	
	public static void main(String[] args){
	
		fun(20);
				
	}
	
}

