
class MaxElementTillIndex{

	public static void main(String[] args){
	
		int arr[] = new int[]{-6,5,8,9,4,2,7,1,0};
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < 6; i++){
		
			if(max < arr[i])
				max = arr[i];
		
		}
		
		System.out.println(max);
	}

}