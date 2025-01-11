class Matrix{

	public static void main(String[] args){
	
	
		int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{8,9,10,11}};
		
		int sum = 0;
		
		for(int i = 0; i < arr[0].length ; i++){
			
			for(int j = 0; j < arr.length ; j++){
					
					sum = sum + arr[j][i];
			}	
			
		}
		
		
		System.out.println(sum);

		
	
	}

}