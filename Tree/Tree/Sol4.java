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

	// Method to find the maximum depth of the binary tree
        public int findMaxDepth(Node root) {
        	if (root == null) {
            		return 0; // Return 0 for empty tree
        	}
        	int leftDepth = findMaxDepth(root.prev);
        	int rightDepth = findMaxDepth(root.next);
        	return Math.max(leftDepth, rightDepth) + 1;
    	}

}

class Sol4{
	
	public static void main(String[] args){
		
		BinaryTree bt = new BinaryTree();
		
		Node root = bt.builtBinaryTree();
		
		System.out.println("Maximum Depth of tree is " + bt.findMaxDepth(root));
		
		
	}
	
}