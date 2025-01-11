
class Recursion{

	static int fun(int num){
		
		// 5 + 4 + 3 + 2 + 1 + 0
		
		if(num == 0)
			return 0;
		
		//logic 
		//pahile vaparli ani mag decrement karun pathavli
		int sum =  num + fun(--num);
		
		return sum;
				
		
	}
	
	public static void main(String[] args){
	
		int result = fun(5);
		System.out.println(result);
	}
	
}

