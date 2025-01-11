import java.util.*;

class StackDemo{

	int top = -1;
	int size;
	int[] stackArr;
	
	StackDemo(int size){
		this.stackArr = new int[size];
		this.size = size;		
	}
	
	void push(int data){
		
		if(top == size - 1){
			System.out.println("Stack is full..");
			return;
		}
		else{
			
			top++;
			stackArr[top] = data;
		}
	}
	
	int pop(){
		
		if(isEmpty()){
			System.out.println("Stack is Empty...");
			return -1;
		}
		else{
			int poppedData = stackArr[top];
			top--;
			return poppedData;
			
		}
		
	}
	
	boolean isEmpty(){
		
		if(top == -1)
			return true;
		else
			return false;
	}
	
	int peek(){
		
		if(isEmpty()){
			System.out.println("Stack is Empty...");
			return -1;
		}
		else{
			
			return stackArr[top];
		}
		
	}
	
	int size(){
		if(isEmpty()){
			System.out.println("Stack is Empty...");
			return -1;
		}
		else{
			return top + 1;
		}
		
	}
	
	void print(){
		
		for(int i = 0; i <= top; i++){
			System.out.print(stackArr[i] + " ");
		}
		System.out.println();
	}

}

class Client{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Stack");
		int size = sc.nextInt();
		
		StackDemo s = new StackDemo(size);
		int choice;
		
		do{
			
			System.out.println("Do you wish to continue : Press 1");
			choice = sc.nextInt();
			
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Size");
			System.out.println("4. Is empty");
			System.out.println("5. Peek");
			System.out.println("6. Print");
			
			switch(sc.nextInt()){
				
				case 1:
					System.out.println("Enter Data");
					s.push(sc.nextInt());
					break;
				case 2:
					int poppedData = s.pop();
					System.out.println(poppedData + " is popped");
					break;
				case 3:
					System.out.println(s.size() + " is Stack's size");
					break;
				case 4:
					boolean res = s.isEmpty();
					if(res == true)
						System.out.println("Stack is empty");
					else
						System.out.println("Stack is not empty");
					break;
				case 5:
					System.out.println(s.peek());
					break;
				case 6:
					s.print();
					break;
				default:
					System.out.println("Wrong input");
					break;				
				
			}
			
		}while(choice == 1);
		
	
	}

}