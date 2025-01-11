class Transpose{

	public static void main(String[] args){
	
		int[][] arr = new int[][]{
		{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,14,15,16}
		};
		
		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr[i].length; j++){
			
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr[i].length; j++){
				
				//swap
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr[i].length; j++){
			
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}