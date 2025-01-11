class Node {
    int data;
    Node next;


    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Sol8 {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; 
        } else {
            Node temp = head;
            while (temp.next != head) { 
                temp = temp.next;
            }
            temp.next = newNode; 
            newNode.next = head; 
        }
    }

    public void split() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node slow = head, fast = head;

        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = slow.next;
        slow.next = head; 

        Node temp = secondHalf;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = secondHalf; 

        // Print the two halves
        System.out.println("First Half:");
        printList(head);

        System.out.println("Second Half:");
        printList(secondHalf);
    }

    public void printList(Node start) {
        if (start == null) return;

        Node temp = start;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != start);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        Sol8 list = new Sol8();
        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        
        list.split();
    }
}
