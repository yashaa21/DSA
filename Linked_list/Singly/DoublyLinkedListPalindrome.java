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

public class DoublyLinkedListPalindrome {

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node left = head;
        Node right = head;

        while (right.next != null) {
            right = right.next;
        }

        while (left != right && left.prev != right) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }

        return true;
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
        DoublyLinkedListPalindrome dll = new DoublyLinkedListPalindrome();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();
        Node head = null;

        for (int i = input.length() - 1; i >= 0; i--) {
            head = dll.push(head, input.charAt(i));
        }

        boolean result = dll.isPalindrome(head);
        if(result==true){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
