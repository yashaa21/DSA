//Revesrse the list


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

class Sol5 {
    Node head = null;

    
    void reverseList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node temp = null;
        Node current = head;
        
       
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; 
        }

        
        if (temp != null) {
            head = temp.prev;
        }
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
        Sol5 ll = new Sol5();

        ll.insertEnd(3);
        ll.insertEnd(2);
        ll.insertEnd(1);
        ll.printList();
	ll.reverseList(); 
        ll.printList();
    }
}
