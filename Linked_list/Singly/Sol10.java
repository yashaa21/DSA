class Node {
    int data;
    Node next;

    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Sol10 {
    Node head;

    
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

   
    public Node partition(int x) {
        Node lessHead = new Node(0); 
        Node greaterHead = new Node(0); 
        Node less = lessHead, greater = greaterHead;

        Node current = head;
        while (current != null) {
            if (current.data < x) {
                less.next = current; 
                less = less.next;
            } else {
                greater.next = current; 
                greater = greater.next;
            }
            current = current.next;
        }


        greater.next = null; 
        less.next = greaterHead.next; 

        return lessHead.next; 
    }



    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Sol10 ll = new Sol10();


        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(8);
        ll.addLast(5);
        ll.addLast(10);
        ll.addLast(2);
        ll.addLast(1);

        System.out.println("Original List:");
        ll.printList();


        ll.head = ll.partition(5);

        System.out.println("Partitioned List:");
        ll.printList();
    }
}
