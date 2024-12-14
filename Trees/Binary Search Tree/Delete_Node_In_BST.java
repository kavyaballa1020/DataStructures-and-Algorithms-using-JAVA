package Trees;

import java.util.Scanner;

public class Delete_Node_In_BST {
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

	public void Inorder(node root) {
		if (root == null) {
			return;
		}
		Inorder(root.left);
		System.out.print(root.data + " ");
		Inorder(root.right);
	}

	public node deleteNode(node root, int val) {
		if (root == null) {
			return null;
		}
		if (val < root.data) {
			root.left = deleteNode(root.left, val);
		} else if (val > root.data) {
			root.right = deleteNode(root.right, val);
		} else {
			// leaf nodes
			if (root.right == null && root.left == null) {
				return null;
			}
			// one child
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			// two childs
			node isc=inorderSuccessor(root.right);
			root.data=isc.data;
			root.right=deleteNode(root.right,isc.data); // deleting the inorder successor
		}
		return root;
	}
	public node inorderSuccessor(node root) {
		while(root.left!=null) {
			root=root.left;
		}
		return root;
	}

	public static void main(String[] args) {
		Delete_Node_In_BST t = new Delete_Node_In_BST();
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
		System.out.println("Enter the data you want to delete");
		int val = obj.nextInt();

		System.out.println("Before Deletion");
		t.Inorder(root);

		t.deleteNode(root, val);

		System.out.println();
		System.out.println("After Deletion");
		t.Inorder(root);

	}

}
