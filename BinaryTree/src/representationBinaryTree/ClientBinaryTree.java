package representationBinaryTree;

public class ClientBinaryTree {

	public static void main(String[] args) {
		
		Node root =new Node(1);
		
		root.left=new Node(2);
		
		root.right=new Node(3);

		root.left.right=new Node(5);
	}

}
