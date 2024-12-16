//Find Sum of array elements

class Sol3{
static int fun(int [] arr,int num){


	if(num == 0){
	return 0;	
	}
	return arr[num-1]+fun(arr,num-1);
	
		}
public static void main(String[]args){
//int num = arr.length ;
int [] arr={12,17,8,34,2,4,16};
int num = arr.length ;

System.out.println(" Sum of array elemts is  "+ fun(arr,num));
 
	}
}