package dsa.Tree;

public class prac {
    // Define the structure of a node in the binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Define the binary tree class
    static class BinaryTree {
        static int idx = -1;

        // Function to build the binary tree from an array representation
        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // Function for pre-order traversal (root, left, right)
        public static void preOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");  // Visit the root node
            preOrderTraversal(root.left);      // Traverse the left subtree
            preOrderTraversal(root.right);     // Traverse the right subtree
        }
    }

    public static void main(String args[]) {
        // Array representation of the binary tree
        int nodes[] = {1, 2, 4, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // Build the binary tree from the array
        Node root = BinaryTree.buildTree(nodes);  // Access the static method in a static way

        // Print the root node's data
        System.out.println("Root data: " + root.data);

        // Perform and print the pre-order traversal
        System.out.print("Pre-order Traversal: ");
        BinaryTree.preOrderTraversal(root);  // Access the static method in a static way
    }
}
