package Trie;

public class UniqueSubStrings {
	class node {
		node children[];
		boolean end_of_word;

		node() {
			children = new node[26];
			for (int i = 0; i < 26; i++) {
				children[i] = null;
			}
			end_of_word = false;
		}
	}

	node root = new node();

	public void insert(String word) {
		node current=root;

		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';

			if (current.children[idx] == null) {
				current.children[idx] = new node();
			}
			if (i == word.length() - 1) {
				current.children[idx].end_of_word = true;
			}
			current= current.children[idx];
		}
	}
	public int countUniqueSubStrings(node root) {
		
		if(root==null) {
			return 0;
		}
		int count=0;
		for(int i=0;i<26;i++) {
			if(root.children[i]!=null) {
				count+=countUniqueSubStrings(root.children[i]);
			}
		}
		return count+1;
	}

	public static void main(String[] args) {
		UniqueSubStrings t=new UniqueSubStrings();
		String str="ababa";
		for(int i=0;i<str.length();i++) {
			String suffix=str.substring(i);
			t.insert(suffix);
		}
		System.out.println("No of unique subString in the String : "+t.countUniqueSubStrings(t.root));

	}
}
