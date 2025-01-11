
class EquilibriumArray{
	
	static int calculateEquilibrium(int[] arr){
		int leftSum = 0;
		
		
		for(int i = 1; i < arr.length - 1; i++){
			
			leftSum = leftSum + arr[i-1];
					
			int rightSum = 0;
			
			//Calculating the sum on right side of i
			for(int j = i+1; j <arr.length; j++){
				System.out.print(arr[j] + "  ");
				rightSum = rightSum + arr[j];
			}
			
			System.out.println("RightSum is :" + rightSum);
			
			
			if(leftSum == rightSum){
				System.out.println("Comparing "+leftSum+" And "+rightSum);
				return i;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		
		int arr[] = new int[]{-7,1,5,2,-4,3,0};
	
		int equiIndex = calculateEquilibrium(arr);
		
		System.out.println(equiIndex);
		
	}
}