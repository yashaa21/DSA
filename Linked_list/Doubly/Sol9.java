//find middle element


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

class Sol9 {
    Node head = null;

    Node findMid() {
        if (head == null) {
            return null;
        }
        Node one = head;
        Node two = head;

        while (two != null && two.next != null) {
            one = one.next;
            two = two.next.next;
        }

        return one;
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
        Sol9 ll = new Sol9();

        ll.insertEnd(1);
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertEnd(4);
        ll.insertEnd(5);
        ll.printList();
	 Node mid = ll.findMid();
        if (mid != null) {
            System.out.println("Middle node: " + mid.data);
        } else {
            System.out.println("List is empty.");
        }
    }
}
