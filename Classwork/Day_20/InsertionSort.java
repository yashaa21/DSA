class InsertionSort{

	public static void main(String[] args){
	
		int[] arr = new int[]{9,5,7,13,11,1,3,2,4,6,8,10,12};
		
		//5 7 9 11 1 3 2 4 6 8 10 12
		
		for(int i = 1; i < arr.length; i++){
			
			int currElemet = arr[i];
			
			int j = i - 1;
			
			while(j >= 0 && arr[j] > currElemet){
				
				arr[j+1] = arr[j];	

				j--;
			}
			
			arr[j+1] = currElemet;
			
			
			
		}
		
		for(int i = 0; i < arr.length; i++){
			
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println();
	
	}

}