class Node{

	int data;
	Node next = null;
	
	Node(int data){
	
		this.data = data;
	
	}

}


class Sol1{
	
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
	
	// Method to reverse the linked list
    	void reverse() {
        	Node prev = null;
        	Node current = head;
        	Node next = null;

        	while (current != null) {
        	    next = current.next; // Store the next node
        	    current.next = prev; // Reverse the link
        	    prev = current;      // Move prev forward
            	    current = next;      // Move current forward
        	}

      		head = prev; // Update the head to the new first node
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
	

	
	public static void main(String[] args){
	
		Sol1 ll = new Sol1();
		ll.addFirst(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		
		ll.printLinkedList();

		ll.reverse();
		ll.printLinkedList();
	
	}

}