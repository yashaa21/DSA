
class Recursion{
	
	static void fun(int[] arr, int index){
		
		
		//base condition
		if(index == arr.length){
			return;
		}
		
		//logic
		System.out.println(arr[index]);
		
		//recursion
		fun(arr, index + 1);
		
	}
	
	public static void main(String[] args){
	
		int[] numbers = {10, 20, 30, 40, 50};
		
		fun(numbers,0);
				
	}
	
}

