// Split the list

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class Sol9 {
    Node head;

    public void insertAtEnd(int value) {
        Node nn = new Node(value);
        if (head == null) {
            nn.next = nn;
            nn.prev = nn;
            head = nn;
        } else {
            Node tail = head.prev;
            tail.next = nn;
            nn.prev = tail;
            nn.next = head;
            head.prev = nn;
        }
    }

    public void splitList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = slow.next;
        slow.next = head;
        head.prev = slow;

        secondHalf.prev.next = secondHalf;
        secondHalf.prev = secondHalf.prev;
        secondHalf.prev.next = secondHalf;

        System.out.println("First half:");
        printList(head);
        System.out.println("Second half:");
        printList(secondHalf);
    }

    public void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Sol9 ll = new Sol9();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);

        System.out.println("Original List:");
        ll.printList(ll.head);

        ll.splitList();
    }
}
