import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

class BinarySearchTree {

    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.prev = insert(root.prev, data);
        } else if (data > root.data) {
            root.next = insert(root.next, data);
        }
        return root;
    }

    void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.prev);
        preOrder(root.next);
    }

    void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.prev);
        System.out.print(root.data + " ");
        inOrder(root.next);
    }

    void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.prev);
        postOrder(root.next);
        System.out.print(root.data + " ");
    }

    int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSubTreeNodesCount = countNodes(root.prev);
        int rightSubTreeNodesCount = countNodes(root.next);

        return leftSubTreeNodesCount + rightSubTreeNodesCount + 1;
    }

    int sumOfDataOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSubTreeNodesSum = sumOfDataOfNodes(root.prev);
        int rightSubTreeNodesSum = sumOfDataOfNodes(root.next);

        return leftSubTreeNodesSum + rightSubTreeNodesSum + root.data;
    }

}

class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;

        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter data for node " + (i + 1) + ":");
            int data = sc.nextInt();
            root = bst.insert(root, data);
        }

        System.out.println("\n\nPreOrder:");
        bst.preOrder(root);
        System.out.println("\n\nInOrder:");
        bst.inOrder(root);
        System.out.println("\n\nPostOrder:");
        bst.postOrder(root);
        System.out.println();
        System.out.println("Count of Nodes in Tree: " + bst.countNodes(root));
        System.out.println();
        System.out.println("Sum of data of Nodes in Tree: " + bst.sumOfDataOfNodes(root));
    }
}
