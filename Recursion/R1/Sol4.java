//Factorial of Number

class Sol4{
static int fun(int num){
	if(num==0){
	return 1;	
	}
	return num * fun(num-1);
	
		}
public static void main(String[]args){
int num =10 ;
int res = fun(10);

System.out.println(" Factorial for "+num+" is "+res);

	}
}