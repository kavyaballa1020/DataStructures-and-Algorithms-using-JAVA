package Trie;

public class startsWith_in_Trie {
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
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (current.children[idx] == null) {
				current.children[idx] = new node();
			}
			if (i == word.length() - 1) {
				current.children[idx].end_of_word = true;
			}
			current = current.children[idx];
		}
	}

	public boolean startsWith(String word) {
		node current = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (current.children[idx] == null) {
				return false;
			}
			current = current.children[idx];
		}
		return true;
	}

	public static void main(String[] args) {
		startsWith_in_Trie t = new startsWith_in_Trie();
		String words[] = { "apple", "RadhaKrishna", "Amma", "Nanna" };
		for (int i = 0; i < words.length; i++) {
			t.insert(words[i]);
		}
		System.out.println(t.startsWith("app"));
	}

}
