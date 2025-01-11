class Demo{

	static int fun(int num){
	
		if(num <= 0)
			return 1;
			
		int n1 = fun(num - 2);
		
		System.out.println(n1);
		
		int n2 = fun(num - 1);
		
		System.out.println(n2);
		
		return n1+n2;
	
	}

	public static void main(String[] args){
	
		int result = fun(3);
		
		System.out.println(result);
	
	}

}