//Reverse the list
class Node{
	int data;
	Node next = null;
	Node(int data){
	this.data = data;	
		}
	}

class Sol1{
	
Node head = null;
	void reverse(){
	Node after = null;
	Node curr = head;
	Node prev = null;
	while(curr!=null){
	after = curr.next;
	curr.next=prev;
	prev = curr;
	curr = after;
		}
	head = prev;
	}


	void addfirst(int data){
	Node nn = new Node(data);
	if(head == null){
	head = nn;
		}
else{
	nn.next =head;
	head = nn;
		}	
	}

	void printlist(){
		if(head==null){
		System.out.println("List is empty");
			}
		else{
		Node temp = head;
		while(temp.next!=null){
		System.out.print(temp.data + " -> ");
		temp=temp.next;
		}
	System.out.println(temp.data);
		}
	}
	
	public static void main(String [] args){
		Sol1 ll = new Sol1();
		ll.addfirst(5);
		ll.addfirst(4);
		ll.addfirst(3);
		ll.addfirst(2);
		ll.addfirst(1);
		ll.printlist();
		ll.reverse();
		ll.printlist();
	}
}