//insert at specific position

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

class Sol6 {
    Node head = null;

       void insertAtPosition(int data, int position) {
        Node nn= new Node(data);

            if (position == 0) {
            nn.next = head;
            if (head != null) {
                head.prev = nn;
            }
            head = nn;
            return;
        }

        Node current = head;
        int currentPosition = 0;

     
        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        if (current == null) {
        System.out.println("Position is out of bounds.");
        return;
        }

           nn.next = current.next;
        if (current.next != null) {
            current.next.prev = nn;
        }
        current.next = nn;
        nn.prev = current;
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
            System.out.println("List is empty.");
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
        Sol6 ll = new Sol6();

        ll.insertEnd(1);
        ll.insertEnd(2);
        ll.insertEnd(4);
	ll.printList();
	ll.insertAtPosition(3, 2);
        ll.printList();
    }
}
