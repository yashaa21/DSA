class Matrix{

	public static void main(String[] args){
	
	
		int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{8,9,10,11}};
		
		for(int i = 0; i < arr.length ; i++){
			
			int sum = 0;
			
			for(int j = 0; j < arr[i].length ; j++){
				
				sum = sum + arr[i][j];
			}
			
			System.out.println(sum);
		}
		
	
	}

}