package iterativepreorderBT;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
	public List<Integer> preorder(Node root){
		List<Integer> list =new ArrayList<Integer>();
		if(root==null) {
			return list;
		}
		Stack<Node> stk = new Stack<Node>();
		stk.push(root);
		while(!stk.isEmpty()) {
			root=stk.pop();
			list.add(root.data);
			if(root.right!=null) {
				stk.push(root.right);
			}
			if(root.left!=null) {
				stk.push(root.left);
			}
		}
		return list;
	}
}
