import java.util.Scanner;

class Rescursion{

	static int fun(int num){
	
		//base condition
		if(num == 0)
			return 1;
			
		return num * fun(--num);
	
	}
	

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = fun(num);
		
		System.out.println(result);
	
	}

}