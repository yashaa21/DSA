import java.util.Scanner;

class SumOfElements{

	public static void main(String[] args){
	
		int arr[] = new int[]{10,20,-10,50,-12,30,11,12,22,-10};
		
		Scanner sc = new Scanner(System.in);
		
		int j = 0;
		while(j < 3){
		
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			int sum = 0;
			
			for(int i = start; i <= end; i++){
			
				sum = sum + arr[i];
			}
			
			System.out.println("Sum of elements from start:" + start + "to end:" + end + " = " +sum);
			
			j++;
		}
	}

}