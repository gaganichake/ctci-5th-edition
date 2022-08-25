package org.ctci.chapter18.Question18_7;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {
	public int compare(String o1, String o2) {
		return Integer.compare(o2.length(), o1.length());
	}
}
