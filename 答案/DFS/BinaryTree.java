// Ex3b
public class BinaryTree {
    TreeNode root;
    // Preorder traversal (NLR)
    public void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    // Inorder traversal (LNR)
    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }
    // Postorder traversal (LRN)
    public void postorder(TreeNode node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        // perform Preorder traversal
        System.out.print("Preorder traversal: ");
        tree.preorder(tree.root);
        System.out.println();
        // perform Inorder traversal
        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.println();
        // perform Postorder traversal
        System.out.print("Postorder traversal: ");
        tree.postorder(tree.root);
        System.out.println();
    }
}