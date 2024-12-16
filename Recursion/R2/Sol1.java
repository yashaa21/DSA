//Count number of digits

class Sol1{
static int fun(int num){
num= Math.abs(num);

	if(num==0){
	return 0;	
	}
	return 1 + fun(num/10);
	
		}
public static void main(String[]args){
int num =001 ;
int res = fun(num);

System.out.println(" Number of digits is " + num + " is "+ res);
 
	}
}