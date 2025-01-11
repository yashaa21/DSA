class Border{

	public static void main(String[] args){

		int[][] arr = new int[][]{
		{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,14,15,16}
		};

		int N = 4;
		int i = 0;
		int j = 0;

		for(int k = 0; k < N - 1 ; k++){

			System.out.println(arr[i][j]);
			j++;
		}
		
		for(int k = 0; k < N - 1 ; k++){

			System.out.println(arr[i][j]);
			i++;
		}
		
		for(int k = 0; k < N - 1 ; k++){

			System.out.println(arr[i][j]);
			j--;
		}
		
		for(int k = 0; k < N - 1 ; k++){

			System.out.println(arr[i][j]);
			i--;
		}
	}
}
 