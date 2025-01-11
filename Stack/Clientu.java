import java.io.*;

class Node{

	int data;
	Node next;
	Node prev;

	Node(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

class StackUsingArray{
	int[] stackArr;
	int size;
	int top;

	StackUsingArray(int size){
		
		this.size = size;
		this.stackArr = new int[size];
		this.top = -1;
	}

	void push(int data){
		
		if(top == size-1){
			System.out.println("Stack is Full");
			return;
		}

	top++;
	stackArr[top] = data;
	}

	int pop(){
		
		if(top == -1){
			System.out.println("Empty Stack");
			return -1;
		}

		int poppedData = stackArr[top];
		top--;
		return poppedData;
	}

	void printStack(){
	
		if(top == -1){
			System.out.println("Empty Stack");
			return;
		}
		System.out.println("Stack : ");
		for(int i = 0; i <=top; i++){
			
			System.out.print(stackArr[i]);

			if(i < top)
				System.out.print(" ->");
		}

		System.out.println("\n\n");

	}
}

class StackUsingSinglyLinkedList{

	Node head = null;
	Node top = null;

	void push(int data){

		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
			top = head;
		}
		else{
			newNode.next = head;
			head = newNode;
		}
		top = head;
	}

	int pop(){
		if(head == null){
			System.out.println("Empty Stack");
			return -1;
		}

		int poppedData = head.data;	
		head = head.next;
		top = head;

		return poppedData;	
	}

	void printStack(){
		
		if(head == null){
			
			System.out.println("Empty Stack");
			return;
		}

		Node temp = head;
		System.out.println("Stack : ");
		while(temp.next != null){
			
			System.out.print(temp.data + " <- ");
			temp = temp.next;
		}
		System.out.print(temp.data);
		System.out.println("\n\n");

	}
}

class StackUsingDoublyinkedList{

	Node head = null;
	Node top = null;
	
	void push(int data){

		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
		}
		else{
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}

		top = head;
	}

	int pop(){
		if(head == null){
			System.out.println("Empty Stack");
			return -1;
		}

		int poppedData = head.data;
		head = head.next;
		if(head != null)
			head.prev = null;

		top = head;
		return poppedData;
	}

	void printStack(){

		if(head == null){
			System.out.println("Empty Stack");
			return;
		}

		Node temp = head;
		System.out.println("Stack : ");
		while(temp.next != null){
	
			System.out.print(temp.data + "<->");
			temp = temp.next;
			
		}
		System.out.print(temp.data);
		System.out.println("\n\n");

	}
}

class StackUsingCircularSinglyLinkedList{

	Node head = null;
	Node top = null;

	void push (int data){
	
		Node newNode = new Node(data);

		if(head == null){

			head = newNode;
			head.next = head;
		}
		else{
		
			newNode.next = head;

			Node temp = head;

			while(temp.next != head){
		
				temp = temp.next;
			}

			temp.next = newNode;
			head = newNode;
		}

		top = head;
	}

	int pop(){
	
		if(head == null){
			System.out.println("Empty Stack");
			return -1;
		}

		int poppedData = head.data;
		if(head.next == head){
			head = null;
		}
		else{
			Node temp = head;
		
			while(temp.next != head){
			
				temp = temp.next;
			}

			temp.next = head.next;
			head = head.next;
			top = head;
		}

		return poppedData;
	}

	void printStack(){
	
		if(head == null){
			
			System.out.println("Empty Stack");
			return;
		}

		Node temp = head;
		System.out.println("Stack :");
		while(temp != null){
		
			System.out.print(temp.data + " <- ");

			if(temp.next == head)
				break;

			temp = temp.next;
		}
		System.out.println("\n\n");

	}
}

class StackUsingCircularDoublyLinkedList{

	Node head = null;
	Node top = null;

	void push(int data){
		
		Node newNode = new Node(data);

		if(head == null){
	
			head = newNode;
			head.next = head;
			head.prev = head;
		}
		else{
		
			Node lastNode = head.prev;

			newNode.next = head;
			newNode.prev = lastNode;
			head.prev = newNode;
			lastNode.next = newNode;

			head = newNode;

		}

		top = head;
	}

	int pop(){
		
		if(head == null){
			System.out.println("Empty Stack");
			return -1;
		}

		int poppedData = head.data;
		if(head.next == head){
			head = null;
		}
		else{
			Node lastNode = head.prev;

			lastNode.next = head.next;
			head.next.prev = lastNode;

			head = head.next;
		}

		top = head;

		return poppedData;

	}

	void printStack(){
	
		if(head == null){
			System.out.println("Stackis Empty");
			return;
		}

		Node temp = head;

		System.out.println("Stack : ");
		while(temp.next != head){
			System.out.print(temp.data + "<->");
			temp = temp.next;
		}

		System.out.print(temp.data);
		System.out.println("\n\n");

	}
}

class Clientu{
	public static void main(String[] args)throws IOException{
		
		//Object of BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//variable declarations
		boolean exit = true;

		System.out.println("\n\n");
		System.out.println("Stack Implementations");


		do{
			System.out.println("Menu : ");
			System.out.println("1. Implement Stack Using Array");
			System.out.println("2. Implement Stack Using Singly LinkedList");
			System.out.println("3. Implement Stack Using Doubly LinkedList");
			System.out.println("4. Implement Stack Using Circular Singly LinkedList");
			System.out.println("5. Implement Stack Using Circular Doubly LinkedList");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			int choice = Integer.parseInt(br.readLine());
			System.out.println("\n");

			switch(choice){

			case 1 : 
				System.out.println("Enter the Array Size");
				int size = Integer.parseInt(br.readLine());
				StackUsingArray stackUsingArray = new StackUsingArray(size);
				boolean exitCase1 = true;
				System.out.println("\n");
				do{
					System.out.println("Menu:");
					System.out.println("1. Push");
					System.out.println("2. Pop");
					System.out.println("3. Print");
					System.out.println("4. Exit");
					System.out.println("\n");
					System.out.println("Enter your choice: ");
					int choiceCase1 = Integer.parseInt(br.readLine());
					System.out.println("\n");

					switch(choiceCase1){

						case 1 :
							System.out.println("Enter Data : ");
							int data = Integer.parseInt(br.readLine());
							stackUsingArray.push(data); 
							System.out.println("\n");
							break;

						case 2 : 		
							int poppedData = stackUsingArray.pop();
							System.out.println("Popped Data: "+ poppedData);
							System.out.println("\n");
							break;

						case 3 :
							stackUsingArray.printStack();
							System.out.println("\n");
							break;

						case 4 :
							System.out.println("Exiting Stack Implementations Using Array.");
							System.out.println("\n");
							exitCase1 = false;
							break;

						default :
							System.out.println("Invalid input for stack implementation using Array");
							System.out.println("\n");
							break;
					}

				}while(exitCase1);

				break;

				case 2 : 
				
				StackUsingSinglyLinkedList stackUsingSLL = new StackUsingSinglyLinkedList();
				boolean exitCase2 = true;
				System.out.println("\n");
				do{
					System.out.println("Menu:");
					System.out.println("1. Push");
					System.out.println("2. Pop");
					System.out.println("3. Print");
					System.out.println("4. Exit");
					System.out.println("\n");
					System.out.println("Enter your choice: ");
					int choiceCase2 = Integer.parseInt(br.readLine());
					System.out.println("\n");

					switch(choiceCase2){

						case 1 :
							System.out.println("Enter Data : ");
							int data = Integer.parseInt(br.readLine());
							stackUsingSLL.push(data); 
							System.out.println("\n");
							break;

						case 2 : 		
							int poppedData = stackUsingSLL.pop();
							System.out.println("Popped Data: "+ poppedData);
							System.out.println("\n");
							break;

						case 3 :
							stackUsingSLL.printStack();
							System.out.println("\n");
							break;

						case 4 :
							System.out.println("Exiting Stack Implementations Using Singly LinkedList.");
							System.out.println("\n");
							exitCase2 = false;
							break;

						default :
							System.out.println("Invalid input for stack implementation using Singly LinkedList");
							System.out.println("\n");
							break;
					}

				}while(exitCase2);

				break;

				case 3 : 
				
				StackUsingDoublyinkedList stackUsingDLL = new StackUsingDoublyinkedList();
				boolean exitCase3 = true;
				System.out.println("\n");
				do{
					System.out.println("Menu:");
					System.out.println("1. Push");
					System.out.println("2. Pop");
					System.out.println("3. Print");
					System.out.println("4. Exit");
					System.out.println("\n");
					System.out.println("Enter your choice: ");
					int choiceCase3 = Integer.parseInt(br.readLine());
					System.out.println("\n");

					switch(choiceCase3){

						case 1 :
							System.out.println("Enter Data : ");
							int data = Integer.parseInt(br.readLine());
							stackUsingDLL.push(data); 
							System.out.println("\n");
							break;

						case 2 : 		
							int poppedData = stackUsingDLL.pop();
							System.out.println("Popped Data: "+ poppedData);
							System.out.println("\n");
							break;

						case 3 :
							stackUsingDLL.printStack();
							System.out.println("\n");
							break;

						case 4 :
							System.out.println("Exiting Stack Implementations Using Doubly LinkedList.");
							System.out.println("\n");
							exitCase3 = false;
							break;

						default :
							System.out.println("Invalid input for stack implementation using Doubly LinkedList");
							System.out.println("\n");
							break;
					}

				}while(exitCase3);

				break;

				case 4 : 
				
				StackUsingCircularSinglyLinkedList stackUsingCSLL = new StackUsingCircularSinglyLinkedList();
				boolean exitCase4 = true;
				System.out.println("\n");
				do{
					System.out.println("Menu:");
					System.out.println("1. Push");
					System.out.println("2. Pop");
					System.out.println("3. Print");
					System.out.println("4. Exit");
					System.out.println("\n");
					System.out.println("Enter your choice:");
					int choiceCase4 = Integer.parseInt(br.readLine());
					System.out.println("\n");

					switch(choiceCase4){

						case 1 :
							System.out.println("Enter Data : ");
							int data = Integer.parseInt(br.readLine());
							stackUsingCSLL.push(data); 
							System.out.println("\n");
							break;

						case 2 : 		
							int poppedData = stackUsingCSLL.pop();
							System.out.println("Popped Data: "+ poppedData);
							System.out.println("\n");
							break;

						case 3 :
							stackUsingCSLL.printStack();
							System.out.println("\n");
							break;

						case 4 :
							System.out.println("Exiting Stack Implementations Using Singly Circular LinkedList.");
							System.out.println("\n");
							exitCase4 = false;
							break;

						default :
							System.out.println("Invalid input for stack implementation using Singly Circular LinkedList");
							System.out.println("\n");
							break;
					}

				}while(exitCase4);

				break;


				case 5 : 
				
				StackUsingCircularDoublyLinkedList stackUsingCDLL = new StackUsingCircularDoublyLinkedList();
				boolean exitCase5 = true;
				System.out.println("\n");
				do{
					System.out.println("Menu:");
					System.out.println("1. Push");
					System.out.println("2. Pop");
					System.out.println("3. Print");
					System.out.println("4. Exit");
					System.out.println("\n");
					System.out.println("Enter your choice: ");
					int choiceCase5 = Integer.parseInt(br.readLine());
					System.out.println("\n");

					switch(choiceCase5){

						case 1 :
							System.out.println("Enter Data : ");
							int data = Integer.parseInt(br.readLine());
							stackUsingCDLL.push(data); 
							System.out.println("\n");
							break;

						case 2 : 		
							int poppedData = stackUsingCDLL.pop();
							System.out.println("Popped Data: "+ poppedData);
							System.out.println("\n");
							break;

						case 3 :
							stackUsingCDLL.printStack();
							System.out.println("\n");
							break;

						case 4 :
							System.out.println("Exiting Stack Implementations Using Doubly Circular LinkedList.");
							System.out.println("\n");
							exitCase4 = false;
							break;

						default :
							System.out.println("Invalid input for stack implementation using Doubly Circular LinkedList");
							System.out.println("\n");
							break;
					}

				}while(exitCase5);

				break;

				case 6 :
					System.out.println("Exiting implementation");
					System.out.println("\n");
					exit = false;
					break;

				default :
					System.out.println("Invalid input for Stack implementations");
					System.out.println("\n");
					break;

			}
			
		}while(exit);
	}
}