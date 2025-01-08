//Search an element for the code 
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class Sol8 {
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

    public boolean search(int element) {
        if (head == null) {
            return false; 
        }

        Node temp = head;
        do {
            if (temp.data == element) {
                return true; 
            }
            temp = temp.next;
        } while (temp != head); 

        return false; 
    }

    public void traverse() {
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
        Sol8 ll = new Sol8();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);

        
        ll.traverse();

        int element = 2;
        boolean found = ll.search(element);

        System.out.println("Element " + element + " found: " + found);
    }
}
