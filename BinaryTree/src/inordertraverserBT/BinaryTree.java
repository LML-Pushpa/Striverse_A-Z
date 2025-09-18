package inordertraverserBT;


class BinaryTree {
 
    public void inorderTraverser(Node node) {
        if (node == null) {
            return;
        }
        inorderTraverser(node.left);
        System.out.println(node.data);
        inorderTraverser(node.right);
    }
}
