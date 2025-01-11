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
	
	void levelOrder(Node root){
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			
			Node temp = q.remove();
			
			if(temp == null){
				break;
			} else {
				System.out.print(temp.data + " ");
				q.add(temp.prev);
				q.add(temp.next);
			}
			
		}
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
		System.out.println("\n\nLevelOrder:");
		bt.levelOrder(root);
		
		
	}
	
}