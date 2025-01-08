//Delete at position
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

class Sol7 {
    Node head = null;

    void deletePosi(int posi) {
        if (head == null) {
            System.out.println("List is empty.");
        }
        if (posi == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
                    }

        Node current = head;
        int currentPosition = 0;

        while (current != null && currentPosition < posi) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            System.out.println("Position is out of bounds.");
            
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
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
        Sol7 ll = new Sol7();

        ll.insertEnd(1);
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertEnd(4);
	ll.printList();
	ll.deletePosi(2);
	ll.printList();
    }
}
