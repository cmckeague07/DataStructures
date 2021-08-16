package Trie;

import java.util.HashMap;

public class Trie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//great for wordvalidation problems
class Node{
	HashMap<Character, Node> children;
	boolean isCompleteWord;
}