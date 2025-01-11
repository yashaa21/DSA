class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class Sol7 {
    TreeNode root;

    // Method to insert a node into the BST
    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // Method to calculate the height of the BST
    public int findHeight(TreeNode root) {
        if (root == null) {
            return -1; // Return -1 for empty tree
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Sol7 bst = new Sol7();

        // Construct the BST
        bst.root = bst.insert(bst.root, 4);
        bst.root = bst.insert(bst.root, 2);
        bst.root = bst.insert(bst.root, 6);
        bst.root = bst.insert(bst.root, 1);
        bst.root = bst.insert(bst.root, 3);

        // Calculate the height of the BST
        int height = bst.findHeight(bst.root);

        System.out.println("Height of the BST: " + height);
    }
}
