
class PairSumCount{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,5,9,7,-8,6,3,7,2,6};
		
		int k = 7;
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr.length; j++){
				
				if((arr[i] + arr[j]) == k){
					
						count++;
				}
			}
		}
		
		System.out.println(count);
	
	}

}