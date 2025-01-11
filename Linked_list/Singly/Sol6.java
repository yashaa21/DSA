class Node {
    int data;
    Node next;

    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Sol6 {
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

   
    public void removeNthFromEnd(int n) {
        Node dummy = new Node(0); 
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;

       
        for (int i = 0; i <= n; i++) {
            if (first == null) {
                System.out.println("Invalid N value!");
                return;
            }
            first = first.next;
        }

        
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        
        second.next = second.next.next;

        
        head = dummy.next;
    }

    public static void main(String[] args) {
        Sol6 ll = new Sol6();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        System.out.println("Original List:");
        ll.printList();

        int n = 2;
        ll.removeNthFromEnd(n);

        System.out.println("List after removing " + n + "-th node from the end:");
        ll.printList();
    }
}
