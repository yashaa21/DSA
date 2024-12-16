//Print N to 1

class Sol2{
static void fun(int num){
	if(num==0){
	return ;	
	}
		System.out.println(num);
         fun(num-1);
		}
public static void main(String[]args){
	fun(10);
	}
}