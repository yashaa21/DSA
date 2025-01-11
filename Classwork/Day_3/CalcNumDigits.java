/*Solve This:

Get two integer inputs from user and tell me number of digits between them.
start < end
1. Input : [1,10]
2. Input : [15,20]*/

class CalcNumDigits{

	public static void main(String[] args){

		int start = 37;
		int end = 15000000;
		int counter = 0;
		for(int i = start ; i <= end; i++){
			counter++;
			System.out.println(counter);
		}

		

	}

}