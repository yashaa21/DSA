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

    
    public static Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }

        Node pointerA = headA;
        Node pointerB = headB;

        
        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        
        return pointerA;
    }

    public static void main(String[] args) {
        Sol8 list1 = new Sol8();
        Sol8 list2 = new Sol8();

        
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);

        
        list2.addLast(6);
        list2.addLast(7);

        
        Node intersection = new Node(4);
        intersection.next = new Node(5);

        
        list1.head.next.next.next = intersection; 
        list2.head.next.next = intersection;     

     
        Node result = getIntersectionNode(list1.head, list2.head);

        if (result != null) {
            System.out.println("Intersection Node: " + result.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}
