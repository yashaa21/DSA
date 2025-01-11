
import java.util.Scanner;

class SqrtDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int ans = findSqrt(num);
		System.out.println(ans);
		
		
	}
	
	static int findSqrt(int num){
	
		int start = 1;
		int end = num;
		
		int sq = 0;
		int mid = 0;
		
		int ans = 0;
		
		while(start <= end){
		
			mid = (start + end)/2;
			sq = mid * mid;
			
			if(sq == num)
				return mid;
				
			if(sq > num)
				end = mid - 1;
			else{
				ans = mid;
				start = mid + 1;
			}
		
		}
		
		return ans;
	}

}