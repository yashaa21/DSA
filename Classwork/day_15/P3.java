class SlidingWindow{

	public static void main(String[] args){
		
		int[] arr = new int[]{-2,3,5,6,-5,-2,7,8,-4};
			
		int[] psArr = new int[arr.length];
		
		int maxSum = Integer.MIN_VALUE;
		
		int k = 4;
		
		
		psArr[0] = arr[0];
		
		for(int i = 1; i < arr.length; i++){
			
			psArr[i] = psArr[i - 1] + arr[i];
		}
		
		int start = 0;
		
		for(int i = k-1; i < psArr.length; i++){
			int sum = 0;
			
			if(start == 0)
				sum = psArr[i];
			else{
				sum = psArr[i] - psArr[start - 1]; 
			}
			
			if(sum > maxSum)
				maxSum = sum;
			
			start++;
			
		}
		
		System.out.println(maxSum);
	}	

}