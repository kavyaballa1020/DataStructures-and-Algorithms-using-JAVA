package Trees;

import java.util.Scanner;

public class Search_Key_In_BST {
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
	public boolean searchKey(node root,int key) {
		if(root==null) {
			return false;
		}
		if(key<root.data) {
			return searchKey(root.left,key);
		}else if(key==root.data) {
			System.out.println("Found");
			return true;
		}else {
			return searchKey(root.right,key);
		}
	}

	public static void main(String[] args) {
		Search_Key_In_BST t = new Search_Key_In_BST();
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
		System.out.println("Enter key ");
		int key=obj.nextInt();
		System.out.println(t.searchKey(root, key));
		
	}

}
