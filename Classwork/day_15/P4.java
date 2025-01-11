class SlidingWindow{

	public static void main(String[] args){
		
		int[] arr = new int[]{-2,3,5,6,-5,-2,7,8,-4};
			
		int maxSum = Integer.MIN_VALUE;
		
		int sum = 0;
		
		int k = 4;
		
		for(int i = 0; i < k; i++){
		
			sum = sum + arr[i];
		}
		
		int start = 0;
		
		for(int i = k-1; i < arr.length; i++){
			
			if(start != 0){			
				sum = sum - arr[start - 1] + arr[i];
			}
			
			if(sum > maxSum)
				maxSum = sum;
			
			start++;
			
		}
		
		System.out.println(maxSum);
	}	

}