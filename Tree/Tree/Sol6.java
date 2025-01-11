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

    	// Recursive function to count leaf nodes
    	public int countLeaves(Node root) {
        	if (root == null) {
            	return 0; // If tree is empty, return 0
        	}

        	// If the node is a leaf node
        	if (root.prev == null && root.next == null) {
            	return 1;
        	}

        	// Recursively count leaf nodes in the left and right subtrees
        	return countLeaves(root.prev) + countLeaves(root.next);
    	}

}

class Sol6{
	
	public static void main(String[] args){
		
		BinaryTree bt = new BinaryTree();
		
		Node root = bt.builtBinaryTree();
		
		System.out.println("Count Of Leaves : " + bt.countLeaves(root));
		
		
	}
	
}