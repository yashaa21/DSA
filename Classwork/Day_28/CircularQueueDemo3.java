import java.util.*;

class CircularQueueArrayImpl{

	int[] queueArr;
	int size;
	int front;
	int rear;
	
	CircularQueueArrayImpl(int size){
		
		this.size = size;
		this.queueArr = new int[size];
		front = -1;
		rear = -1;
	}
	
	void enque(int data){
		
		if((rear == size - 1 && front == 0) || ((rear + 1) % size == front)){
			System.out.println("Queue is full");
			return;
		}
		
		else if((front != 0) && (rear == size - 1)){			
			rear = 0;
		}
		else if(front == -1){			
			front = rear = 0;							
		}	
		else{
			rear++;
		}			
		queueArr[rear] = data;
			
	}
	
	int dequeue(){
		
		if(front == -1){
			System.out.println("Queue is Empty");
			return -1;
		}
		
		else{
		
			int dData = queueArr[front];
			if(front == rear){
				front = rear = -1;
			}
			else if(front == size - 1 ){
				front = 0;
			}
			else{		
				front++;
			}
			return dData;
		}
	
		
	}
	
	int front(){
		if(front == -1){
			System.out.println("Queue is Empty");
			return -1;
		}
		return queueArr[front];
	}
	
	int rear(){
		if(front == -1){
			System.out.println("Queue is Empty");
			return -1;
		}
		return queueArr[rear];
	}
	
	void printQueue(){
		
		if(front == -1)
			System.out.println("Queue is Empty");
		else{
			if(front <= rear){
				
				for(int i = front ; i <= rear; i++){
						
						System.out.print(queueArr[i] + " ");
				}
				System.out.println();
			}
			else{
				
				for(int i = front ; i <= size - 1; i++){
						
						System.out.print(queueArr[i] + " ");
				}
				
				for(int i = 0 ; i <= rear; i++){
						
						System.out.print(queueArr[i] + " ");
				}
				
				System.out.println();
			}
		}
	
	}
	
	boolean isEmpty(){
		if(front == -1)
			return true;
		return false;
	}
	

}

class Client{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Queue");
		int size = sc.nextInt();
		
		CircularQueueArrayImpl q = new CircularQueueArrayImpl(size);
		
		char cont = 'y';
		
		do{
			
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Front");
			System.out.println("4. Rear");
			System.out.println("5. Is Empty");
			System.out.println("6. Print Queue");
			System.out.println("7. Exit");
			
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("Enter Data");
					q.enque(sc.nextInt());
					break;
				case 2:
					int dData = q.dequeue();
					System.out.println("Dequeued data is : " + dData);
					break;
				case 3:
					System.out.println(q.front());
					break;
				case 4:
					System.out.println(q.rear());
					break;
				case 5:
					boolean isEmpty = q.isEmpty();
					if(isEmpty == true)
						System.out.println("Queue is Empty");
					else
						System.out.println("Queue is not Empty");
					break;
				case 6:
					q.printQueue();
					break;
				case 7:
					cont = 'N';
					break;
				default:
					System.out.println("Wrong choice");
					break;
					
			}
			
		}while(cont == 'y' || cont == 'Y');
	
	}

}