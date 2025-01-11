class Node {
    int data;
    Node next;


    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Sol3 {
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

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; 
            } else {
                current = current.next; 
            }
        }
    }

    public static void main(String[] args) {
        Sol3 ll = new Sol3();

        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(3);

        System.out.println("Original List:");
        ll.printList();

        ll.removeDuplicates();

        System.out.println("List after removing duplicates:");
        ll.printList();
    }
}
