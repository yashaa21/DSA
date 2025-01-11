class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class Sol6 {
    private Node head;

    public Sol6() {
        this.head = null;
    }

    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }

            newNode.next = head;
            current.next = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }

            current.next = newNode;
            newNode.next = head;
        }
    }

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        if (head.next == head) {
            head = null;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }

            current.next = head.next;
            head = head.next;
        }
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        if (head.next == head) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != head) {
                current = current.next;
            }

            current.next = head;
        }
    }

    public int getLength() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Node current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }

    public void traverseAndPrint() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.value + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.value + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        Sol6 circularList = new Sol6();

        circularList.insertAtBeginning(3);
        circularList.insertAtBeginning(2);
        circularList.insertAtBeginning(1);

        System.out.println("Original list:");
        circularList.display();

        System.out.println("Traverse and print the list:");
        circularList.traverseAndPrint();

        System.out.println("After inserting 0 at the beginning:");
        circularList.insertAtBeginning(0);
        circularList.display();

        System.out.println("After inserting 4 at the end:");
        circularList.insertAtEnd(4);
        circularList.display();

        System.out.println("After deleting from the beginning:");
        circularList.deleteFromBeginning();
        circularList.display();

        System.out.println("After deleting from the end:");
        circularList.deleteFromEnd();
        circularList.display();

        System.out.println("Length of the list: " + circularList.getLength());
    }
}
