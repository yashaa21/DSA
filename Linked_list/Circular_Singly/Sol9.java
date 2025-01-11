class SinglyNode {
    int data;
    SinglyNode next;

    SinglyNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode prev;

    DoublyNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Sol9 {
    SinglyNode head;

    public void insert(int data) {
        SinglyNode newNode = new SinglyNode(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; 
        } else {
            SinglyNode temp = head;
            while (temp.next != head) { 
                temp = temp.next;
            }
            temp.next = newNode; 
            newNode.next = head; 
        }
    }

    public DoublyNode convertToCircularDoublyLinkedList() {
        if (head == null) {
            return null;
        }

        SinglyNode temp = head;
        DoublyNode newHead = null, prevDoublyNode = null;


        do {
            DoublyNode newDoublyNode = new DoublyNode(temp.data);

            if (newHead == null) {
                newHead = newDoublyNode; 
            }

            if (prevDoublyNode != null) {
                prevDoublyNode.next = newDoublyNode; 
                newDoublyNode.prev = prevDoublyNode; 
            }

            prevDoublyNode = newDoublyNode; 

            temp = temp.next;
        } while (temp != head); 


        if (prevDoublyNode != null) {
            prevDoublyNode.next = newHead; 
            newHead.prev = prevDoublyNode; 
        }

        return newHead;
    }


    public void printDoublyList(DoublyNode start) {
        if (start == null) return;

        DoublyNode temp = start;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != start);
        System.out.println("(head)");
    }


    public static void main(String[] args) {
        Sol9 singlyList = new Sol9();
        
        singlyList.insert(1);
        singlyList.insert(2);
        singlyList.insert(3);
        
        DoublyNode doublyHead = singlyList.convertToCircularDoublyLinkedList();
        
        System.out.println("Circular Doubly Linked List:");
        singlyList.printDoublyList(doublyHead);
    }
}
