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

public class DoublyLinkedListLength {

    public int getLength(Node head) {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public Node push(Node head, char newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }

    public static void main(String[] args) {
        DoublyLinkedListLength dll = new DoublyLinkedListLength(); 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to create the doubly linked list: ");
        String input = scanner.nextLine();
        Node head = null;

        for (int i = input.length() - 1; i >= 0; i--) {
            head = dll.push(head, input.charAt(i));
        }

        int length = dll.getLength(head);
        System.out.println("Length of the doubly linked list: " + length);

        scanner.close();
    }
}
