
 class Node{
 
	int data;
	Node next = null;
	
	Node(int data){
		
		this.data = data;
	}
 }
 
 class LinkedList{
	 
	void addFirst(int data){
		
		Node newNode = new Node(data);
		
		if(head == null)
			head = newNode;
		
		newNode.next = head;
		
		head = newNode;
		
	}
	
	void printLinkedList(){
		
		if(head == null){
			
			System.out.println("Linked List is empty");
		}
		
		Node temp = head;
		
		while(temp.next != null){
			
			System.out.print(temp.data + "->");	
			temp = temp.next;
		}
		
		System.out.print(temp.data);
		System.out.println();
		
	}
	
	void reverse(){
	
		// Initialize three pointers: curr, prev and next

		 // Traverse all the nodes of Linked List
					
		 // Store next
					
		 // Reverse current node's next pointer
					
		 // Move pointers one position ahead
	
	}
	
	public static void main(String[] args){
		
		LinkedList ll = new LinkedList();
		
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addFirst(50);
		
		ll.printLinkedList();
	}
 
 
 }
