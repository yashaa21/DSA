import java.util.Scanner;

class SumOfElements{

	public static void main(String[] args){
	
		int arr[] = new int[]{-8,2,6,4,8,-5,10,23,-3,0,80,33};
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
		
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			int sum = 0;
			
			for(int i = start; i <= end; i++){
			
				sum = sum + arr[i];
			}
			
			System.out.println(sum);
		}
	
	}

}