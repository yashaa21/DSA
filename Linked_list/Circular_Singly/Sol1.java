class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class Sol1 {
    private Node head;

    public Sol1() {
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
        Sol1 circularList = new Sol1();

        circularList.insertAtBeginning(3);
        circularList.insertAtBeginning(2);
        circularList.insertAtBeginning(1);

        System.out.println("Original list:");
        circularList.display();

        System.out.println("After inserting 0 at the beginning:");
        circularList.insertAtBeginning(0);
        circularList.display();
    }
}