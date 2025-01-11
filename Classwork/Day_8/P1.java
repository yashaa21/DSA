
class SumOfElements{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{1,6,7,8,9,10,33,52};
		
		
		int i = 0;
		
		while(i < arr.length){
			int sum = 0;
			sum = sum + arr[i];
			i++;
		}
		
		System.out.println(sum);
	}
}