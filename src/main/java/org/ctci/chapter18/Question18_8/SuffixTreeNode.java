package org.ctci.chapter18.Question18_8;

import java.util.ArrayList;
import java.util.HashMap;

public class SuffixTreeNode {
	HashMap<Character, SuffixTreeNode> children = new HashMap<>();
	
	char value;
	ArrayList<Integer> indexes = new ArrayList<>();
	public SuffixTreeNode() { }
	
	public void insertString(String s, int index) {
		indexes.add(index);
		if (s != null && s.length() > 0) {
			value = s.charAt(0);
			SuffixTreeNode child;
			if (children.containsKey(value)) {
				child = children.get(value);
			} else {
				child = new SuffixTreeNode();
				children.put(value, child);
			}
			String remainder = s.substring(1);
			child.insertString(remainder, index);
		}
	}
	
	public ArrayList<Integer> search(String s) {
		if (s == null || s.length() == 0) {
			return indexes;
		} else {
			char first = s.charAt(0);
			if (children.containsKey(first)) {
				String remainder = s.substring(1);
				return children.get(first).search(remainder);
			}
		}
		return null;
	}
}

