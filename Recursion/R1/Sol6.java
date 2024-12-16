//Sum of digits

class Sol6{
static int fun(int num){
num = Math.abs(num);
	if(num<10){
	return num;	
	}
	return (num % 10) + fun(num / 10);
	
		}
public static void main(String[]args){
int num =12345 ;
int res = fun(num);

System.out.println(" Sum for digits " + num + " is "+ res);

	}
}