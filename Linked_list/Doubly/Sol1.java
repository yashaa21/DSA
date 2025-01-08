// insert At first

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

class Sol1 {
    Node head = null;

        void insertFirst(int data) {
        Node nn = new Node(data);

        if (head == null) {
            head = nn;
        } else {
            nn.next = head;
            head.prev = nn;
            head = nn;
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
        Sol1 ll = new Sol1();


        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(1);
        ll.printList();
	ll.insertFirst(0);
        ll.printList();
    }
}
