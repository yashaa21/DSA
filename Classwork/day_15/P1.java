class SlidingWindow{

	public static void main(String[] args){
	
		int[] arr = new int[]{-2,3,5,6,-5,-2,7,8,-4};
		
		int k = 4;
		int end = k-1;
		int count = 0;
		
		while(end < arr.length){
		
			count++;
			end++;
		}
		
		System.out.println(count);
	
	}

}