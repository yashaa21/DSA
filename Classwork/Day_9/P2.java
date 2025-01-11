
class LeftMaxArray{

	public static void main(String[] args){
	
		int arr[] = new int[]{-2,5,1,3,4,1,7,-8,2,1};
		
		int leftmax[] = new int[arr.length];
		
		leftmax[0] = arr[0];
		
		for(int i = 1; i < arr.length; i++){
		
			if(arr[i] > leftmax[i-1]){
			
				leftmax[i] = arr[i];
				
			}
			else		
				leftmax[i] = leftmax[i-1];
		}
		
		for(int i = 0; i < leftmax.length; i++){
			
			System.out.print(leftmax[i] + " ");
		}
	
	}

}

// TC : O()
// SC : O()