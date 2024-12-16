//Print Sum of N

class Sol3{
static int fun(int num){
	if(num==0){
	return 0;	
	}
	return num + fun(num-1);
	
		}
public static void main(String[]args){
int num =5 ;
int res = fun(5);

System.out.println("Sum for "+num+"is"+res);

	}
}