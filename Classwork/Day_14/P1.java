class Matrix{

	public static void main(String[] args){
	
	
		int arr[][] = new int[][]{
		{1,2,3,4,5,6},
		{7,8,9,10,11,12},
		{13,14,15,16,17,18},
		{19,20,21,22,23,24},
		{25,26,27,28,29,30}
		};
		
		int k = 5;
				
		for(int i = 0; i <= 5; i++){
			
			
			int col = k;
			int row = 0;
			while(row < 5 && col >=0){
				System.out.println(arr[row][col]);
				col--;
				row++;
			}
			
			k--;
		}
	
	}
	

}