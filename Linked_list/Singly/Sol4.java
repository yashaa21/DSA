class Node {
    int data;
    Node next;

    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Sol4 {
    Node head;

    
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    
    public static Sol4 mergeSortedLists(Sol4 list1, Sol4 list2) {
        Node dummy = new Node(0); 
        Node tail = dummy;

        Node current1 = list1.head;
        Node current2 = list2.head;

        while (current1 != null && current2 != null) {
            if (current1.data <= current2.data) {
                tail.next = current1;
                current1 = current1.next;
            } else {
                tail.next = current2;
                current2 = current2.next;
            }
            tail = tail.next; 
        }

       
        if (current1 != null) {
            tail.next = current1;
        } else {
            tail.next = current2;
        }

        
        Sol4 mergedList = new Sol4();
        mergedList.head = dummy.next; 
        return mergedList;
    }

    public static void main(String[] args) {
        Sol4 list1 = new Sol4();
        Sol4 list2 = new Sol4();

        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(5);

        list2.addLast(2);
        list2.addLast(4);
        list2.addLast(6);

        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        Sol4 mergedList = mergeSortedLists(list1, list2);

        System.out.println("Merged Sorted List:");
        mergedList.printList();
    }
}
