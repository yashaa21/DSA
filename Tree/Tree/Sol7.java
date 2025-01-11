import java.util.*;

class Node{

	int data;
	Node prev;
	Node next;
	
	Node(int data){
	
		this.data = data;
		next = null;
		prev = null;
	}

}

class BinaryTree{

	Scanner sc = new Scanner(System.in);
	
	Node builtBinaryTree(){
		
		System.out.println("Enter the data for this node");
		Node newNode = new Node(sc.nextInt());
		
		System.out.println("Do you want to enter the data for left side of " + newNode.data);
		char left = sc.next().charAt(0);
		
		if(left == 'y' || left == 'Y'){
			newNode.prev = builtBinaryTree();
		}
		
		System.out.println("Do you want to enter the data for right side of " + newNode.data);
		char right = sc.next().charAt(0);
		
		if(right == 'y' || right == 'Y'){
			newNode.next = builtBinaryTree();
		}
		
		return newNode;
	
	}

    // Helper function to check if the tree is a BST
    public boolean isBST(Node node, Integer min, Integer max) {
        // Base case: If the node is null, it's a valid BST
        if (node == null) {
            return true;
        }

        // Check the current node's value against the range [min, max]
        if ((min != null && node.data <= min) || (max != null && node.data >= max)) {
            return false;
        }

        // Recursively check the left and right subtrees with updated ranges
        return isBST(node.prev, min, node.data) && isBST(node.next, node.data, max);
    }

    public boolean isBST(Node root) {
        return isBST(root, null, null); // Start with no constraints
    }

}

class Sol7{
	
	public static void main(String[] args){
		
		BinaryTree bt = new BinaryTree();
		
		Node root = bt.builtBinaryTree();
		
		System.out.println("Is BST? --> " + bt.isBST(root));
		
		
	}
	
}