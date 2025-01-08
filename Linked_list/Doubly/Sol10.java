
//Check palindrome

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

class Sol10 {
    Node head = null;

    boolean isPalindrome() {
        if (head == null) {
            return true;
        }

        Node start = head;
        Node end = head;

        while (end.next != null) {
            end = end.next;
        }

        while (start != null && end != null && start != end && start.prev != end) {
            if (start.data != end.data) {
                return false;
            }
            start = start.next;
            end = end.prev;
        }

        return true;
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
        Sol10 ll = new Sol10();

        ll.insertEnd(1);
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertEnd(4);
        ll.insertEnd(5);
        ll.printList();
	 if (ll.isPalindrome()) {
            System.out.println("The list is a palindrome.");
        } else {
            System.out.println("The list is not a palindrome.");
        }
    }
}
