import java.util.Scanner;

class Node {
    char data;
    Node next;
    Node prev;

    Node(char data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedListInsert {

    public Node insertNodeAtPosition(Node head, int position, char newData) {
        if (position < 0) {
            return head;
        }

        Node newNode = new Node(newData);
        Node current = head;

        if (position == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return head;
        }

        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }

        if (current == null) {
            return head;
        }

        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;

        return head;
    }

    public Node push(Node head, char newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }

    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedListInsert dll = new DoublyLinkedListInsert();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to create the doubly linked list: ");
        String input = scanner.nextLine();
        Node head = null;

        for (int i = input.length() - 1; i >= 0; i--) {
            head = dll.push(head, input.charAt(i));
        }

        System.out.print("Original List: ");
        dll.printList(head);

        System.out.print("Enter the position to insert the node: ");
        int position = scanner.nextInt();
        System.out.print("Enter the character to insert: ");
        char newData = scanner.next().charAt(0);

        head = dll.insertNodeAtPosition(head, position, newData);

        System.out.print("List after insertion: ");
        dll.printList(head);

        scanner.close();
    }
}
