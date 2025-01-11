/*	
	3. Given an array of size N and Q number of queries. 
		Quey contains two parameters s and e
		s: start index
		e: end index
		For every query, print all the sum of all the elements from s to e.
		Arr : [10,20,-10,50,-12,30,11,12,22,-10]
		N : 10
		Q : 3
		
		Queries -
		q1   s:	2	e: 4
		q2	 s:	3	e: 7
		q3	 s:	1	e: 3
	*/
import java.util.Scanner;
	
class PrefixSum{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{10,20,-10,50,-12,30,11,12,22,-10};
		
		int ps[] = new int[arr.length];
		
		Scanner sc = new Scanner(System.in);
		
		ps[0] = arr[0];
		
		for(int i = 1; i < arr.length; i++){
			
			ps[i] = ps[i-1] + arr[i];
		}
		
		for(int i = 0; i < 3; i++){
			
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			if(start == 0 && end == 0)
				sum = arr[0];
			else if(start == 0)
				sum = arr[end];
			else
				int sum = ps[end] - ps[start - 1];
			
			System.out.println("Sum of elements from start:" + start + "to end:" + end + " = " +sum);
			
		}
		
		
		
	}


}
		
