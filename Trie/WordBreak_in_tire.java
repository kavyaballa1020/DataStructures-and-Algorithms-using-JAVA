package Trie;

public class WordBreak_in_tire {
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
	public boolean wordBreak(String key) {
		if(key.length()==0) {
			return true;
		}
		for(int i=1;i<=key.length();i++) {
			String firstPart=key.substring(0,i);
			String secondPart=key.substring(i);
			if(search(firstPart) && wordBreak(secondPart)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		WordBreak_in_tire t = new WordBreak_in_tire();
		String words[] = { "i", "love", "krishna", "amma", "america" };
		String key="ilikekrishna";
		
		for (int i = 0; i < words.length; i++) {
			t.insert(words[i]);
		}
		System.out.print(t.wordBreak(key));
	}

}
