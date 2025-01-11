
class  CountAtLeast{

	public static void main(String[] args){
	
		int arr[] = new int[]{-2,5,6,3,7,-8,9,9,9,1,0,5};		

		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){		
				if(arr[i] > max){			
					max = arr[i];
				}		
		}
				
		int count = 0;
		for(int i = 0; i < arr.length; i++){		
				if(arr[i] == max){			
					count++;
				}		
		}
		
		System.out.println(arr.length - count);
	
	}
}

/*
	TC: O(N)
	SC: O(1)
*/