class SlidingWindow{

	public static void main(String[] args){
		
		int[] arr = new int[]{-2,3,5,6,-5,-2,7,8,-4};
		
		int k = 4;
		int end = k-1;
		int start = 0;
		int maxSum = Integer.MIN_VALUE;
		
		while(end < arr.length){
		
			int sum = 0;
		
			for(int i = start; i <= end; i++){
			
				sum = sum + arr[i];
			}
			
			if(sum > maxSum)
				maxSum = sum;
			
			end++;
			start++;
		
		}
		
		System.out.println(maxSum);
			
	
	}

}