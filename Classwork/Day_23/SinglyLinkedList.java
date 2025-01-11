class Node{

	int data;
	Node next = null;
	
	Node(int data){
	
		this.data = data;
	
	}

}

class SinglyLinkedList{
	
	Node head = null;
	
	void addFirst(int data){
		
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;			
		}
		
	}
	
	void deleteFirst(){
		
		if(head == null)
			System.out.println("Linked List in Empty");
		else
			head = head.next;
	}
	
	void addLast(int data){
		
		Node newNode = new Node(data);
		
		if(head != null){
			Node temp = head;
			
			while(temp.next != null){
				temp = temp.next;
			}
			
			
			temp.next = newNode;
		}else{
			
			addFirst(data);
		}
	}
	
	void deleteAtLast(){
		
		if(head == null)
			System.out.println("Linked List in Empty");
		else{
			Node temp = head;
			while(temp.next.next != null){
				temp = temp.next;
				System.out.println("In while");
			}
			temp.next = null;
		}
			
			
	}
	
	void printLinkedList(){
		
		if(head == null){
			System.out.println("Linked List is Empty");
		}
		else{
			Node temp = head;
			
			while(temp.next != null){
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			
			System.out.println(temp.data);
		}
	}
	
	int countNodes(){
		
		int count = 0;
		Node temp = head;
		
		while(temp != null){
			count++;
			temp = temp.next;
		}
		
		System.out.println(count);
		return count;
	}
	
	public static void main(String[] args){
	
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.addFirst(50);
		ll.addFirst(40);
		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(10);
		ll.addLast(60);
		//ll.deleteFirst();
		ll.printLinkedList();
		//ll.deleteAtLast();
		//ll.printLinkedList();
		ll.countNodes();
	
	}

}