
class RightMaxElement{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{-2,5,1,3,4,1,7,-8,2,1};
		
		int rightMax[] = new int[arr.length];
		
		rightMax[rightMax.length - 1] = arr[arr.length - 1];
		
		for(int i = rightMax.length - 2 ; i >=0 ; i--){
			
			if(arr[i] > rightMax[i + 1]){
				
				rightMax[i] = arr[i];
			}
			else{
				rightMax[i] = rightMax[i+1];
			}
		}
		
		for(int i = 0; i < rightMax.length; i++){
			
			System.out.print(rightMax[i] + " ");
		}
	}
}