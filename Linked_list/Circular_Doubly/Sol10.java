class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class Sol10 {
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

    public Node mergeLists(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node mergedHead = null;
        Node mergedTail = null;

        Node ptr1 = head1;
        Node ptr2 = head2;

        do {
            if (ptr1.data <= ptr2.data) {
                if (mergedHead == null) {
                    mergedHead = ptr1;
                    mergedTail = ptr1;
                } else {
                    mergedTail.next = ptr1;
                    ptr1.prev = mergedTail;
                    mergedTail = ptr1;
                }
                ptr1 = ptr1.next;
            } else {
                if (mergedHead == null) {
                    mergedHead = ptr2;
                    mergedTail = ptr2;
                } else {
                    mergedTail.next = ptr2;
                    ptr2.prev = mergedTail;
                    mergedTail = ptr2;
                }
                ptr2 = ptr2.next;
            }
        } while (ptr1 != head1 && ptr2 != head2);

        while (ptr1 != head1) {
            mergedTail.next = ptr1;
            ptr1.prev = mergedTail;
            mergedTail = ptr1;
            ptr1 = ptr1.next;
        }

        while (ptr2 != head2) {
            mergedTail.next = ptr2;
            ptr2.prev = mergedTail;
            mergedTail = ptr2;
            ptr2 = ptr2.next;
        }

        mergedTail.next = mergedHead;
        mergedHead.prev = mergedTail;

        return mergedHead;
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
        Sol10 ll1 = new Sol10();
        ll1.insertAtEnd(1);
        ll1.insertAtEnd(3);
        ll1.insertAtEnd(5);

        Sol10 ll2 = new Sol10();
        ll2.insertAtEnd(2);
        ll2.insertAtEnd(4);
        ll2.insertAtEnd(6);

        System.out.println("List 1:");
        ll1.printList(ll1.head);

        System.out.println("List 2:");
        ll2.printList(ll2.head);

        Sol10 mergedList = new Sol10();
        mergedList.head = mergedList.mergeLists(ll1.head, ll2.head);

        System.out.println("Merged List:");
        mergedList.printList(mergedList.head);
    }
}
