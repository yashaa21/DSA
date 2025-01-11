class BinarySearch{

	static int searchElement(int[] arr,int num){
	
		int start = 0;
		int end = arr.length - 1;
	
		while(start <= end){
			
			int mid = (start + end)/2;
			
			if(arr[mid] == num)
				return mid;
			else if(arr[mid] < num)
				start = mid + 1;
			else if(arr[mid] > num )
				end = mid - 1;
			
		}
		
		return -1;
	
	}

	public static void main(String[] args){
	
		int arr[] = new int[]{11,14,15,19,26,38,44};
		int result = searchElement(arr,14);
		
		if(result == -1)
			System.out.println("Element not present in the array");
		else
			System.out.println("Element present in the array at index "+result);
	
	}

}