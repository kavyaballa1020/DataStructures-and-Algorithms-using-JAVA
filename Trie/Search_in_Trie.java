package Trie;

public class Search_in_Trie {
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
		word=word.toLowerCase();
		node current = root;
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

	public boolean search(String word) {
		word=word.toLowerCase();
		node current = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			node Node = current.children[idx];
			if (Node == null) {
				return false;
			}
			if (i == word.length() - 1 && Node.end_of_word == false) {
				return false;
			}
			current = Node;
		}
		return true;
	}

	public static void main(String[] args) {
		Search_in_Trie t = new Search_in_Trie();
		String words[] = { "The", "a", "There", "Their", "any" };
		
		for (int i = 0; i < words.length; i++) {
			t.insert(words[i]);
		}
		
		System.out.println(t.search("Their"));
		System.out.println(t.search("an"));
		System.out.println(t.search("thor"));

	}

}
