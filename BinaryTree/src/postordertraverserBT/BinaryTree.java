package postordertraverserBT;


class BinaryTree {
    public void postorderTraverser(Node node) {
        if (node == null) {
            return; 
        }
      
        postorderTraverser(node.left);
        postorderTraverser(node.right);
        System.out.println(node.data);
 
       
    }
}
