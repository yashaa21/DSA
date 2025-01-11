
class Recursion{

	static void fun(int num){
		
		//base condition
		if(num == 0)
			return;
		
		//kay karaych ahe?
		
		//recursion
		fun(num-1);
		
		//logic
		System.out.println(num);	
			
		
		
		
	}
	
	public static void main(String[] args){
	
		fun(10);
	}
	
}

