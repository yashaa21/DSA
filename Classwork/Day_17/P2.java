import java.util.Scanner;

class DoubleRescursion{

	static void fun(int num){
	
		//base condition
		if(num <= 1)
			return;
			
		fun(num - 1);
		
		System.out.println(num);
		
		fun(num - 2);
	
	}
	

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		fun(num);
		
	
	}

}