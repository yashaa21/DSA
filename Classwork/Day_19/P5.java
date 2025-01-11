class BubbleSort{

	static void doSorting(int[] arr){
		
		int itrCount = 0;
		
		for(int i = 0; i < arr.length; i++){
			
			int flag = 0;
			
			for(int j = 0; j < arr.length - 1 - i; j++){
				
				itrCount++;
				if(arr[j] > arr[j + 1]){
					
					//swap
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
					
					flag = 1;
				}
			}
			
			if(flag == 0)
				break;
		}
		
		System.out.println(itrCount);
	
	}

	public static void main(String[] args){
	
		int[] arr = new int[]{1,2,3,4,5,6};
		
		doSorting(arr);
		
		for(int i =0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		
	}

}