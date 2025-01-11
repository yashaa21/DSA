class LinearSearch{
	
	static int findElement(int[] arr, int searchElement){
	
		for(int i = 0; i < arr.length; i++){
		
			if(arr[i] == searchElement){
			
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args){
	
		int arr[] = new int[]{10,20,55,21,36,95,111,125,0,1};
		int result = findElement(arr,22);
		
		//int result = findElement(arr,222);
		
		if(result == -1)
			System.out.println("Element not found at any index :-(");
		else
			System.out.println("Element found at index "+result);
	
	}

}