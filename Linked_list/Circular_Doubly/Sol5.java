//Reverse the list


class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class Sol5 {
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

    public void reverse() {
        if (head == null || head.next == head) {
            return;
        }

        Node current = head;
        Node temp = null;

        do {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        } while (current != head);

        head = head.prev;
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
        Sol5 ll = new Sol5();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.print();
        ll.reverse();
        ll.print();
    }
}