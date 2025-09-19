package iterativepostorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Stack<Node> stack = new Stack<>();
        Node curr = root;
        Node lastVisited = null;

        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left; // go left first
            } else {
                Node peekNode = stack.peek();
                // if right child exists and not processed yet, go right
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    curr = peekNode.right;
                } else {
                    list.add(peekNode.data);
                    lastVisited = stack.pop();
                }
            }
        }

        return list;
    }
}
