package Trie;

public class Insertion_in_Trie {
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

		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';

			if (root.children[idx] == null) {
				root.children[idx] = new node();
			}
			if (i == word.length() - 1) {
				root.children[idx].end_of_word = true;
			}
			root = root.children[idx];
		}
	}

	public static void main(String[] args) {
		Insertion_in_Trie t = new Insertion_in_Trie();
		String words[] = { "the", "a", "there", "their", "any" };
		for (int i = 0; i < words.length; i++) {
			t.insert(words[i]);
		}
	}

}
