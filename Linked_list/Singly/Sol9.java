class Node {
    int data;
    Node next;


    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Sol9 {
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

    
    public void deleteNode(Node node) {
        if (node == null || node.next == null) {
            System.out.println("Cannot delete this node.");
            return;
        }

        
        node.data = node.next.data;

       
        node.next = node.next.next;
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
        Sol9 ll = new Sol9();

        
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println("Original List:");
        ll.printList();

       
        Node middleNode = ll.head.next.next; 
        ll.deleteNode(middleNode);

        System.out.println("List after deleting the middle node:");
        ll.printList();
    }
}
