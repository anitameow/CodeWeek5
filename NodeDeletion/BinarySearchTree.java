import java.util.LinkedList;
import java.util.Queue;


public class BinarySearchTree {
    TreeNode root;

    // method to insert a new node with a given value
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // recursive function to insert a new value in the BST
    private TreeNode insertRec(TreeNode root, int value) {
        // if the tree is empty, return a new node
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        // otherwise, recur down the tree
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        // return the (unchanged) node pointer
        return root;
    }

    // method to remove a node with a given value
    public void remove(int value) {
        root = removeRec(root, value);
    }

    // recursive function to remove a value in the BST
    private TreeNode removeRec(TreeNode root, int value) {
        // if the tree is empty, return null
        if (root == null) {
            return root;
        }

        // otherwise, recur down the tree
        if (value < root.value) {
            root.left = removeRec(root.left, value);
        } else if (value > root.value) {
            root.right = removeRec(root.right, value);
        } else {
            // node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // node with two children: Get the inorder predecessor (largest in the left subtree)
            root.value = maxValue(root.left);

            // delete the inorder predecessor
            root.left = removeRec(root.left, root.value);
        }

        return root;
    }

    // method to find the maximum value in a given tree
    private int maxValue(TreeNode root) {
        int maxValue = root.value;
        while (root.right != null) {
            maxValue = root.right.value;
            root = root.right;
        }
        return maxValue;
    }

    // method for BFS traversal
    void bfsTraversal() {
        if (root == null) return; // if the tree is empty, return

        Queue<TreeNode> queue = new LinkedList<>(); // initialize the queue
        queue.add(root); // enqueue the root node

        while (!queue.isEmpty()) { // process the queue until it's empty
            TreeNode node = queue.poll(); // dequeue a node from the front
            System.out.print(node.value + " "); // process the node (print its value)

            // enqueue the left child if it exists
            if (node.left != null) {
                queue.add(node.left);
            }

            // enqueue the right child if it exists
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // inserting elements into the BST
        bst.insert(11);
        bst.insert(6);
        bst.insert(8);
        bst.insert(19);
        bst.insert(4);
        bst.insert(10);
        bst.insert(5);
        bst.insert(17);
        bst.insert(43);
        bst.insert(49);
        bst.insert(31);

        // print BFS traversal of the BST
        System.out.print("BFS traversal of the BST: ");
        bst.bfsTraversal();
        System.out.println();

        // removing an element from the BST
        bst.remove(11);

        // print BFS traversal of the BST after removal
        System.out.print("BFS traversal of the BST after removal: ");
        bst.bfsTraversal();
    }
}