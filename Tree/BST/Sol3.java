
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }


     int minValueNode(){
	return minValue(root);
     }

    int minValue(Node root) {
        int minVal = root.key;
        while (root.left != null) {
            minVal = root.left.key;
            root = root.left;
        }
        return minVal;
    }

     int maxValueNode(){
	return maxValue(root);
     }

    int maxValue(Node root) {
        int maxVal = root.key;
        while (root.right != null) {
            maxVal = root.right.key;
            root = root.right;
        }
        return maxVal;
    }


}

class Sol3{
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

	System.out.println("Min Value : " + bst.minValueNode());
	System.out.println("Max Value : " + bst.maxValueNode());

    }
}