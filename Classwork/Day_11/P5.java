
class SumOfAllSubArrayPS{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{1,2,3,4};
		
		int psArr[] = new int[arr.length];
		
		psArr[0] = arr[0];
		
		for(int i = 1; i < arr.length; i++){
			
			psArr[i] = psArr[i-1] + arr[i];
		}
		
		for(int i = 0; i < psArr.length; i++){
			
			int sum = 0;
			for(int j = i; j < psArr.length; j++){
				if(i == 0){
						System.out.println(psArr[j]);
				}
				else{
					sum = psArr[j] - psArr[i-1];
					System.out.println(sum);
				}				
				
			}
			
			
			
		}
	}
}