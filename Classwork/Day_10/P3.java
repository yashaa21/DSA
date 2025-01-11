
class SubArray{

	public static void main(String[] args){
		
		int arr[] = new int[]{1,2,3,1,3,4,6,4,6,3};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int minLen = Integer.MAX_VALUE;
		int len = 0;		

		//Scanning and identifying max and min
		for(int i = 0; i < arr.length; i++){
			
			if(max < arr[i])
				max = arr[i];
			
			if(min > arr[i])
				min = arr[i];
		}
		
		// Finding shortest length sub array
		for(int i = 0; i < arr.length; i++){
			
			if(arr[i] == min){
				
				for(int j = i; j < arr.length; j++){
					
					if(arr[j] == max){
						System.out.println("Min and Max are : "+min+" "+max);
						len = j-i+1;
						if(minLen > len){
							minLen = len;
						}
					}
				}
				
				
			}
			else if(arr[i] == max){
				for(int j = i; j < arr.length; j++){
					
					if(arr[j] == min){
						len = j-i+1;
					}
					if(minLen > len){
						minLen = len;
					}
				
				}
				
			
			}
			
			
			
		}
		
		//Print minLen
		System.out.println(minLen);

		
		
	}
}