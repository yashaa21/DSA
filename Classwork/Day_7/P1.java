
class  CountAtLeast{

	public static void main(String[] args){
	
		int arr[] = new int[]{2,5,6,3,7,8,9,1,0,8,4};
		
		int count = 0;
		for(int i = 0; i < arr.length; i++){
		
			for(int j = 0; j < arr.length; j++){
			
				if(arr[i] < arr[j]){
				
					count++;
					break;
				
				}
			
			}
		
		}
		
		System.out.println(count);
	
	}
}