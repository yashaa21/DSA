//Find Minimum element in the array

class Sol2{
static int fun(int [] arr,int num){


	if(num == 1){
	return arr[0];	
	}
	return Math.min(arr[num-1], fun(arr,num-1));
	
		}
public static void main(String[]args){
//int num = arr.length ;
int [] arr={12,17,8,34,2,4,16};
int num = arr.length ;

System.out.println(" Minimum element is  "+ fun(arr,num));
 
	}
}