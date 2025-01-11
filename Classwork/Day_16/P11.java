class DoubleRecursion{

	static int fun(int num){
	
		if(num <= 1)
			return 1;
			
		return fun(num - 2) + fun(num - 1);
	
	}

	public static void main(String[] args){
	
		int result = fun(5);
		System.out.println(result);
	
	}

}