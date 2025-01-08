//delete at end
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Sol4 {
    Node head = null;

    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } 
	Node temp =head;
	while(temp.next!=null){
	temp=temp.next;
	}
	temp.prev.next=null;
	temp.prev=null;
    }

    void insertEnd(int data) {
        Node nn = new Node(data);

        if (head == null) {
            head = nn;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nn;
            nn.prev = temp;
        }
    }

    void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Sol4 ll = new Sol4();

        ll.insertEnd(3);
        ll.insertEnd(2);
        ll.insertEnd(1);
        ll.printList();

        ll.deleteEnd();
        
        ll.printList();

           }
}
