
class SumOfSumOfAllSubArrayCF{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{1,2,3,4};
		
		int overallSubArraySum = 0;
		
		for(int i = 0; i < arr.length; i++){
			
			int sum = 0;
			for(int j = i; j < arr.length; j++){
							
				sum = sum + arr[j];
				overallSubArraySum = overallSubArraySum + sum;
			}		
						
		}
		
		System.out.println(overallSubArraySum);
	}
}