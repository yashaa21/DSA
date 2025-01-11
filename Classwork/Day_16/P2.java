
class Recursion{

	static void fun(int num){
		
		System.out.println(num);
		//base condition
		if(num == 0)
			return;
		
		//kay karaych ahe?
		
		//recursion
		fun(num--);
		
		//logic
		System.out.println(num);	
			
		
		
		
	}
	
	public static void main(String[] args){
	
		fun(10);
	}
	
}

