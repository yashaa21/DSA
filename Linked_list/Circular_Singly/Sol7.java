class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Sol7 {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; 
        } else {
            Node temp = head;
            while (temp.next != head) { 
                temp = temp.next;
            }
            temp.next = newNode; 
            newNode.next = head; 
        }
    }


    public boolean search(int element) {
        if (head == null) {
            return false; 
        }
        
        Node temp = head;
        do {
            if (temp.data == element) {
                return true; 
            }
            temp = temp.next;
        } while (temp != head); 
        
        return false; // Element not found
    }



    public static void main(String[] args) {
        Sol7 list = new Sol7();
        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        
        // Searching for an element
        int elementToSearch = 2;
        boolean found = list.search(elementToSearch);
        
        // Output result
        System.out.println("Element " + elementToSearch + " found: " + found);
    }
}
