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
	
	void preOrder(Node root){
		
		if(root == null)
			return;
		
		System.out.print(root.data+ " ");
		preOrder(root.prev);
		preOrder(root.next);
		
	}
	
	void inOrder(Node root){
		if(root == null)
			return;
		inOrder(root.prev);
		System.out.print(root.data+ " ");
		inOrder(root.next);
		
	}
	
	void postOrder(Node root){
		if(root == null)
			return;
		postOrder(root.prev);
		postOrder(root.next);
		System.out.print(root.data + " ");
		
	}
	
	int countNodes(Node root){
		
		if(root == null){
			return 0;
		}
		
		int leftSubTreeNodesCount = countNodes(root.prev);
		int rightSubTreeNodesCount = countNodes(root.next);
		
		return leftSubTreeNodesCount + rightSubTreeNodesCount +1;
		
	}
	
	int sumOfDatOfNodes(Node root){
		
		if(root == null){
			return 0;
		}
		
		int leftSubTreeNodesSum = sumOfDatOfNodes(root.prev);
		int rightSubTreeNodesSum = sumOfDatOfNodes(root.next);
		
		return leftSubTreeNodesSum + rightSubTreeNodesSum + root.data;
		
	}

}

class Client{
	
	public static void main(String[] args){
		
		BinaryTree bt = new BinaryTree();
		
		Node root = bt.builtBinaryTree();
		
		System.out.println("\n\nPreOrder:");
		bt.preOrder(root);
		System.out.println("\n\nInOrder:");
		bt.inOrder(root);
		System.out.println("\n\nPostOrder:");
		bt.postOrder(root);
		System.out.println();		
		System.out.println("Count of Nodes in Tree :"+bt.countNodes(root));
		System.out.println();
		System.out.println("Sum of data of Nodes in Tree :"+bt.sumOfDatOfNodes(root));
		
		
	}
	
}