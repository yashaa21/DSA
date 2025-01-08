//Print 1 to N

class Sol1{
static void fun(int num){
	if(num==0){
	return ;	
	}
	fun(num-1);
	System.out.println(num);
         
		}
public static void main(String[]args){
	fun(10);
	}
}