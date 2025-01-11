class BinarySearch{
	
	static int arr[];
	static int searchElement;

	static int searchElement(int start,int end){
	
		//base condition
		if(start > end){
			return -1;
		} else{
		
			int mid = (start + end)/2;
			
			if(arr[mid] == searchElement){
				return mid;
			}	
			else if(arr[mid] < searchElement){
				start = mid + 1;
				return searchElement(start,end);
			}
			else if(arr[mid] > searchElement ){
				end = mid - 1;
				return searchElement(start,end);
			}
			
		}
		
		return -1;
	
	}

	public static void main(String[] args){
	
		arr = new int[]{11,14,15,19,26,38,44};
		searchElement = 11;
		int result = searchElement(0,arr.length - 1);
		
		if(result == -1)
			System.out.println("Element not present in the array");
		else
			System.out.println("Element present in the array at index "+result);
	
	}

}