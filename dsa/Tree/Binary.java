package dsa.Tree;

import java.util.*;

public class Binary {
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

        // Reset the index for building the tree
        public static void resetIndex() {
            idx = -1;
        }
    }

    // print the preorder of the nodes.
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    // print the inorder of the nodes.
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    // print the postorder of the nodes.
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    public static void lvlorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                // check if queue empty
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);

                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);

                }

                if (currNode.right != null) {

                    q.add(currNode.right);
                }
            }
        }
    }

    public static int count(Node root){

        if (root == null) {
            return 0;
        }

        int leftNodes = count(root.left);
        int rightNodes = count(root.right);

        return leftNodes + rightNodes + 1;

    }

    public static int maxDepth(Node root){
        if(root == null){
            return 0;
        }

        int leftNodes = maxDepth(root.left);
        int rightNodes = maxDepth(root.right);
        
        
        return Math.max(leftNodes,rightNodes) + 1;
    }

    public static void leafnode(Node root){
        if (root == null){
            return;
        }
        if(root.left == null && root.right == null){
            System.out.print(root.data + " ");
        }
    }

    public static void main(String args[]) {
        // Array representation of the binary tree
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        // Reset the index before building the tree
        BinaryTree.resetIndex();

        // Build the binary tree from the array
        Node root = BinaryTree.buildTree(nodes);

        // Print the root node's data
        if (root != null) {
            System.out.println("Root data: " + root.data);
        } else {
            System.out.println("The tree is empty.");
        }
        System.out.print("This is Pre-order Traversal: ");
        preorder(root);
        System.out.println("\n");
        System.out.print("This is In-order Traversal: ");
        inorder(root);
        System.out.println("\n");
        System.out.print("This is Post-order Traversal: ");
        postorder(root);
        System.out.println("\n");
        System.out.print("This is Level-order Traversal:\n ");
        lvlorder(root);
        
        
        System.out.println("\n" + count(root));

        System.out.print(maxDepth(root));



    }
}
