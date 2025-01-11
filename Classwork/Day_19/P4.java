class BubbleSort{

	static void doSorting(int[] arr){
		
		int itrCount = 0;
		
		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr.length - 1 - i; j++){
				
				itrCount++;
				if(arr[j] > arr[j + 1]){
					
					//swap
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
		
		System.out.println(itrCount);
	
	}

	public static void main(String[] args){
	
		int[] arr = new int[]{10,5,3,1,4,6};
		
		doSorting(arr);
		
		for(int i =0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		
	}

}