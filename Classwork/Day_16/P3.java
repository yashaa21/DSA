
class Recursion{

	static void fun(int num){
		
		//base condition
		if(num == 0)
			return;
		
		//kay karaych ahe?
		
		//recursion
		fun(--num);
		
		//logic
		System.out.println(num+1);	
			
		
		
		
	}
	
	public static void main(String[] args){
	
		fun(10);
	}
	
}

