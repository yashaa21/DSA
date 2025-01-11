class Recursion{
	
	static void printNumbers(int num){
		
		//terminating condition
		if(num <= 0)
			return;
		
		//kay karaycha ahe?
		printNumbers(num - 1);
		System.out.println(num);
	}

	public static void main(String[] args){
	
		printNumbers(10);
	
	}

}