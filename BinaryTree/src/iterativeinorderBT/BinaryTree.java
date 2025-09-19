package iterativeinorderBT;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
    public List<Integer> inorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.data);
            curr = curr.right;
        }

        return list;
    }
}
