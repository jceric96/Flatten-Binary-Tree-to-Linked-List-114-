public class flattenBT {
    // Thought:(put all left nodes after right nodes).
    // 1.find the parent node of the most left leaf
    // 2.find the most right child node of the node from step1.
    // 3.add the left node after the node from step 2.
    public void flatten(TreeNode root) {
        // checke if root node is null
        // yes, terminal it
        // no, go on
        if (root == null)
            return;

        flatten(root.left);
        flatten(root.right);

        // find check the parent node of the most left leaf
        if (root.left == null)
            return;

        // set the most left leaf node as newTree node
        TreeNode newTree = root.left;

        // find the most right node of the newTree node
        // and set the node as newTree node
        while (newTree.right != null) {
            newTree = newTree.right;
        }
        // add the left node after newTree
        // and set left node as null
        newTree.right = root.right;
        root.right = root.left;
        root.left = null;

    }

    public static void main(String[] args) {
        flattenBT flat = new flattenBT();
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        flat.flatten(root);
        while (root != null) {
            System.out.println(root.val);
            root = root.right;
        }
    }
}
