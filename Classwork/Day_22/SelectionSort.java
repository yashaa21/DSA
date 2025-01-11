import java.util.*;

class SelectionSort{
	
	static void selectionSort(int[] arr){
		
		for(int i = 0; i < arr.length; i++){
			
			int minIndex = i;
		
			for(int j = i+1; j < arr.length; j++){
				
				if(arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
								
			}
						
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		
			
		}
	}

	public static void main(String[] args){
	
		int[] arr = new int[]{9,7,33,2,9,15,-2,7};
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
			
	}

}