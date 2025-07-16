import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    TreeNode root;
    void bfsTraversal() {
        if (root == null) return; // if the tree is empty, return
        Queue<TreeNode> queue = new LinkedList<>(); // initialize the queue
        queue.add(root); // enqueue the root node
        while (!queue.isEmpty()) { // process the queue until it's empty
            TreeNode node = queue.poll(); // dequeue a node from the front
            System.out.println("node.value: " + node.value + " "); // process the node (print its value)
            // enqueue the left child if it exists
            if (node.left != null) {
                queue.add(node.left);
                System.out.println("node.left:" + node.left.value);
            }
            // enqueue the right child if it exists
            if (node.right != null) {
                queue.add(node.right);
                System.out.println("node.left:" + node.right.value);
            }
        }
    }

    public static void main(String[] args) {
        // create a binary tree and add some nodes
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        // perform BFS traversal
        System.out.println("BFS traversal of the tree:");
        tree.bfsTraversal();
        System.out.println("ipad yeah~"); 
    }
}