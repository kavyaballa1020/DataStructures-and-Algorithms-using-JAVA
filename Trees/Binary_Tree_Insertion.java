package Trees;

import java.util.*;

public class Binary_Tree_Insertion {

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

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " --> ");
        inorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " --> ");
    }
    
    public void levelorder(Node root) {
    	
    	Queue<Node> q=new LinkedList<Node>();
    	if(root==null) {
    		return;
    	}
    	q.add(root);    	
    	while(!q.isEmpty()) {
    		int levelsize=q.size();
    		for(int i=0;i<levelsize;i++) {
    			Node current=q.remove();
        		System.out.print(current.data+" ");
        		if(current.left!=null) {
        			q.add(current.left);
        		}
        		if(current.right!=null) {
        			q.add(current.right);
        		}
    		}
    		System.out.println();
    	}
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
        Binary_Tree_Insertion tree = new Binary_Tree_Insertion();

        Node root = tree.insert(scanner);

        System.out.println("\nPreorder Traversal:");
        tree.preorder(root);

        scanner.close();
    }
}
