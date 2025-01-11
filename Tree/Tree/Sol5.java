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

    // Method to check if a binary tree is a full binary tree
    public boolean isFullBinaryTree(Node root) {
        if (root == null) {
            return true; // An empty tree is a full binary tree
        }

        // If the node has both children, check recursively for left and right subtrees
        if (root.prev != null && root.next != null) {
            return isFullBinaryTree(root.prev) && isFullBinaryTree(root.next);
        }

        // If the node has no children, it's a leaf node and hence valid
        if (root.prev == null && root.next == null) {
            return true;
        }

        // If the node has only one child, it's not a full binary tree
        return false;
    }

}

class Sol5{
	
	public static void main(String[] args){
		
		BinaryTree bt = new BinaryTree();
		
		Node root = bt.builtBinaryTree();
		
		System.out.println("Is Full Binary? --> " + bt.isFullBinaryTree(root));
		
		
	}
	
}