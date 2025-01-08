//Length of the list


class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class Sol6 {
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

    public int findLength() {
        if (head == null) {
            return 0;
        }

        int length = 1;  
        Node temp = head.next;
        while (temp != head) {
            length++;
            temp = temp.next;
        }
        return length;
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
        Sol6 ll = new Sol6();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.print();
        int length = ll.findLength();
        System.out.println("Length  " + length);
    }
}
