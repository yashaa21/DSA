
class CountOfSubArray{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,2,3};
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++){
		
			for(int j = i; j < arr.length; j++){
			
				count++;
			}
		
		}
		
		System.out.println(count);
	
	}

}