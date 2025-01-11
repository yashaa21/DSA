
class ReverseArray{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,2,3,4,5};
		
		int arr1[] = new int[arr.length];
		
		int i = 0;
		int j = arr.length - 1;
		
		while(i < arr.length && j >=0){
			
			arr1[i] = arr[j];
			i++;
			j--;
		}
		
		for(int k = 0; k < arr.length; k++){
				
				System.out.println(arr1[k]);
		}
	
	}

}