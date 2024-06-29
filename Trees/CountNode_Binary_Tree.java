package Trees;

import java.util.Scanner;

public class CountNode_Binary_Tree {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insert(Scanner scanner) {
        System.out.println("Enter data (-1 for no node):");
        int data = scanner.nextInt();

        if (data == -1) {
            return null;
        }

        Node newNode = new Node(data);

        System.out.println("Enter left child of " + data);
        newNode.left = insert(scanner);

        System.out.println("Enter right child of " + data);
        newNode.right = insert(scanner);

        return newNode;
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " --> ");
        preorder(root.left);
        preorder(root.right);
    }
    public int countNode(Node root) {
    	if(root==null) {
    		return 0;
    	}else {
    		int leftnodes=countNode(root.left);
    		int rightnodes=countNode(root.right);
    		return leftnodes+rightnodes+1;
    	}
    }
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        CountNode_Binary_Tree tree = new CountNode_Binary_Tree();

	        Node root = tree.insert(scanner);

	        System.out.println("\nPreorder Traversal:");
	        tree.preorder(root);
	        
	        System.out.println("The number of nodes in Binary Tree : "+tree.countNode(root));

	        scanner.close();
	}

}
