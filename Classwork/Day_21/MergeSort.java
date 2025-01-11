class MergeSort{

	static void merge(int[] arr, int start, int mid, int end){
		
		//creating two new arrays
		//start
		int n = mid - start + 1;
		int m = end - mid;
		
		int arr1[] = new int[n];
		int arr2[] = new int[m];
		
		for(int i = 0; i <n ; i++){
			arr1[i] = arr[start+i];
			
		}
		
		for(int j = 0; j <m ; j++){
			arr2[j] = arr[mid+1+j];
		}
		
		//end
		
		int i = 0;
		int j = 0;
		int k = start;
		
		//Comparison
		while(i < arr1.length && j < arr2.length){
			
			if(arr1[i] < arr2[j]){
				arr[k] = arr1[i];
				i++;
			}
				
			else{
				arr[k] = arr2[j];
				j++;
			}
			
			k++;
		}
		
		
		//Adding leftovers
		//start
		
		while(i < arr1.length){
			
			arr[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j < arr2.length){
			
			arr[k] = arr2[j];
			j++;
			k++;
		}
		
		//end
	
	}

	static void mergeSort(int[] arr, int start, int end){
	
		if(start < end){
		
			int mid = (start + end) / 2;
			
			//left
			mergeSort(arr, start, mid);
			
			//right
			mergeSort(arr, mid+1, end);
			
			//sorting
			merge(arr, start, mid, end);
		
		}
	
	}

	public static void main(String[] args){
	
		int[] arr = new int[]{27,9,1,4,18,16,32,64,99};
		
		mergeSort(arr, 0, arr.length - 1);
		
		for(int i = 0; i < arr.length; i++){
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	
	}

}