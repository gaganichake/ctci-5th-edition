package org.ctci.chapter10.Question10_7;

public class Node {
	public Node prev;
	public Node next;
	public String[] results;
	public String query;

	public Node(String q, String[] res) {
		results = res;
		query = q;
	}
}
