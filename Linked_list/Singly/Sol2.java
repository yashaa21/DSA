//Detect a loop insdide liat

class Node {
    int data;
    Node next;


    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Sol2 {
    Node head;

    public void addFirst(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = nn;
    }

    public void createLoop(int position) {
        if (position == 0) return;

        Node loopNode = null;
        Node current = head;
        int count = 1;
        while (current.next != null) {
            if (count == position) {
                loopNode = current;
            }
            current = current.next;
            count++;
        }
        current.next = loopNode;     }

    public boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          
            fast = fast.next.next;    

            if (slow == fast) {        
                return true;
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        Sol2 ll = new Sol2();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(2);

        System.out.println("No Loop: " + ll.detectLoop()); 

        ll.createLoop(2); 

        System.out.println("Loop Detected: " + ll.detectLoop()); 
    }
}
