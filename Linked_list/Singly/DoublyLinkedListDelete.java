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

public class DoublyLinkedListDelete {

    public Node deleteNodeAtPosition(Node head, int position) {
        if (head == null || position < 0) {
            return head;
        }

        Node current = head;

        if (position == 0) {
            if (head.next != null) {
                head.next.prev = null;
            }
            head = head.next;
            return head;
        }

        for (int i = 0; current != null && i < position; i++) {
            current = current.next;
        }

        if (current == null) {
            return head;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }

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
        DoublyLinkedListDelete dll = new DoublyLinkedListDelete();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to create the doubly linked list: ");
        String input = scanner.nextLine();
        Node head = null;

        for (int i = input.length() - 1; i >= 0; i--) {
            head = dll.push(head, input.charAt(i));
        }

        System.out.print("Original List: ");
        dll.printList(head);

        System.out.print("Enter the position to delete the node: ");
        int position = scanner.nextInt();
        head = dll.deleteNodeAtPosition(head, position);

        System.out.print("List after deletion: ");
        dll.printList(head);

        scanner.close();
    }
}
