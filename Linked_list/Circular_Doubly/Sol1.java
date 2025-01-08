
//Insert at the beginning

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class Sol1 {
    Node head;

    
    public void insertAtBegin(int value) {
        Node nn = new Node(value);
        if (head == null) {
            nn.next = nn;
            nn.prev = nn;
            head = nn;
        } else {
            Node tail = head.prev;
            nn.next = head;
            nn.prev = tail;
            tail.next = nn;
            head.prev = nn;
            head = nn;
        }
    }
    public void print() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println(" ");
    }



    public static void main(String[] args) {
        Sol1 ll = new Sol1();
        ll.insertAtBegin(3);
        ll.insertAtBegin(2);
        ll.insertAtBegin(1);
        ll.print();
        ll.insertAtBegin(0);
        ll.print();
    }
}
