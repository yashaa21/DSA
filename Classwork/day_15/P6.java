class Recursion{
	
	static void printStars(int num){
		
		/*
		for(int i = 1; i <= num; i++){			
			System.out.println("*");
		}
		
		*/
		
		//terminating condition
		if(num <= 0)
			return;
		
		//kay karaycha ahe?
		printStars(num - 1);
		System.out.println("*");
	}

	public static void main(String[] args){
	
		printStars(10);
	
	}

}