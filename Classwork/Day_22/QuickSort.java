import java.util.*;

class QuickSort{

	static int partition(int[] arr, int start, int end){
	
		int pivot = arr[end];
		int i = start - 1;
		
		for(int k = start; k <= end; k++){
				System.out.print(arr[k] + " ");
		}
		System.out.println();
		
		for(int j = start; j <= end; j++){
	
			if(arr[j] <= pivot){
				
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		
		
		System.out.println("Pivot index for above array is "+i);
		return i;		
	}
	
	static void quickSort(int[] arr, int start, int end){
	
		if(start < end){
			
			int pivotIndex = partition(arr, start, end);
			
			System.out.println("Pivot Index = "+pivotIndex);
			
			quickSort(arr, start, pivotIndex-1);
			
			quickSort(arr, pivotIndex+1, end);
		}
	
	}

	public static void main(String[] args){
		
		int[] arr = new int[]{9,7,33,2,15,-2};
		quickSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	
	}

}