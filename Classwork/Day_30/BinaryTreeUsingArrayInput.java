class TreeNode{

	TreeNode left;
	TreeNode right;
	int data;
	
	TreeNode(int data){
	
		this.data = data;
		right = null;
		left = null;
	}
	
}

class BinaryTree{
	
	int index = -1;
	
	TreeNode builtBinaryTree(int[] inputBTArr){
		
		index++;
		
		if(inputBTArr[index] == -1)
			return null;
		
		TreeNode newNode = new TreeNode(inputBTArr[index]);
		
		newNode.left = builtBinaryTree(inputBTArr);
		
		newNode.right = builtBinaryTree(inputBTArr);
		
		return newNode;
		
	}
	
	void preOrder(TreeNode root){
		
		if(root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	void inOrder(TreeNode root){
		
		if(root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	void postOrder(TreeNode root){
		
		if(root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

}

class Client{
	
	public static void main(String[] args){
		
		int[] inputBTArr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		BinaryTree bt = new BinaryTree();
		TreeNode root = bt.builtBinaryTree(inputBTArr);
		System.out.println();
		System.out.println();
		bt.preOrder(root);
		System.out.println();
		System.out.println();
		bt.inOrder(root);
		System.out.println();
		System.out.println();
		bt.postOrder(root);
		
	}
	
}