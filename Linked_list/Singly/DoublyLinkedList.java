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

public class DoublyLinkedList {

    public Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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
        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to create the doubly linked list: ");
        String input = scanner.nextLine();
        Node head = null;

        for (int i = input.length() - 1; i >= 0; i--) {
            head = dll.push(head, input.charAt(i));
        }

        Node middle = dll.findMiddle(head);
        if (middle != null) {
            System.out.println("Middle node: " + middle.data);
        } else {
            System.out.println("The list is empty.");
        }

        scanner.close();
    }
}
