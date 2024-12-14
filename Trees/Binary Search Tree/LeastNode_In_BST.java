package Trees;

import java.util.Scanner;

public class LeastNode_In_BST {
	class node {
		int data;
		node left, right;

		node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public node insertion(node root, int data) {
		if (root == null) {
			return new node(data);
		}
		if (data < root.data) {
			root.left = insertion(root.left, data);
		}
		if (data > root.data) {
			root.right = insertion(root.right, data);
		}
		return root;
	}
	public int leastNode(node root) {
		if(root==null) {
			return 0;
		}
		while(root.left!=null) {
			root=root.left;
		}
		return root.data;
		
	}

	public void Inorder(node root) {
		if (root == null) {
			return;
		}
		Inorder(root.left);
		System.out.print(root.data + " ");
		Inorder(root.right);
	}

	public static void main(String[] args) {
		LeastNode_In_BST t = new LeastNode_In_BST();
		node root;
		root = null;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Data (negative numbers to break)");
		while (true) {
			int data = obj.nextInt();
			if (data < 0) {
				break;
			}
			root = t.insertion(root, data);
		}
		System.out.println("Inorder");
		t.Inorder(root);
		System.out.println();
		System.out.println("The least Element in BST is "+t.leastNode(root));
	}

}
