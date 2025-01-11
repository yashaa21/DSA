class Node {
    int data;
    Node next;

   
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Sol5 {
    Node head;

   
    public void append(int data) {
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

    
    public Node findMiddle() {
        if (head == null) {
            return null; 
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       
            fast = fast.next.next; 
        }

        return slow; 
    }

    public static void main(String[] args) {
        Sol5 ll = new Sol5();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        System.out.println("Original List:");
        ll.printList();

        Node middle = ll.findMiddle();
        System.out.println("Middle Node: " + (middle != null ? middle.data : "None"));
    }
}
