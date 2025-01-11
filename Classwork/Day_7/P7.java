
class ReverseArray{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,2,3,11,4,5};
				
		int i = 0;
		int j = arr.length - 1;
		
		while(i<j){			
			int temp;
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
			
		}
		
		for(int k = 0; k < arr.length; k++){
				
				System.out.println(arr[k]);
		}
	
	}

}