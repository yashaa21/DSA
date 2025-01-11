
class StackDemo{

	int[] stackArr;
	int size;
	int top1;
	int top2;
	
	StackDemo(int size){
	
		this.size = size;
		stackArr = new int[size];
		top1 = -1;
		top2 = size;
	}
	
	void push1(int data){
		
		if(top2 - top1 == 1){
			
			System.out.println("Stack Overflow");
			return;
		}
		else{
			
			top1++;
			stackArr[top1] = data;
		}
		
	}
	
	void push2(int data){
		if(top2 - top1 == 1){
			
			System.out.println("Stack Overflow");
			return;
		}
		else{
			
			top2--;
			stackArr[top2] = data;
		}
		
	}
	
	int pop1(){
		
		if(top1 == -1){
			System.out.println("Stack Underflow");
			return -1;
		}
		else{
			
			int poppedData = stackArr[top1];
			top1--;
			return poppedData;
		}
		
	}
	
	int pop2(){
		if(top1 == stackArr.length){
			System.out.println("Stack Underflow");
			return -1;
		}
		else{
			
			int poppedData = stackArr[top2];
			top2++;
			return poppedData;
		}
		
	}
	
	void printStack1(){
		
		for(int i = 0; i <= top1; i++){
			System.out.print(stackArr[i] + " ");
		}
		
		System.out.println();
		
	}
	
	void printStack2(){
		for(int i = stackArr.length - 1; i >= top2; i--){
			System.out.print(stackArr[i] + " ");
		}
		
		System.out.println();
		
	}

}

class Client{
	
	public static void main(String[] args){
		
		
		StackDemo s = new StackDemo(8);
		
		s.push1(1);
		s.push1(2);
		s.push1(3);
		s.push1(4);
		
		s.push2(5);
		s.push2(6);
		s.push2(7);
		s.push2(8);
		s.push2(9);
		
		s.printStack1();
		s.printStack2();
	}
}