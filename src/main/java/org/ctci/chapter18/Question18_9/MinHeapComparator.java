package org.ctci.chapter18.Question18_9;

import java.util.Comparator;

public class MinHeapComparator implements Comparator<Integer>{
	// Comparator that sorts integers from lowest to highest
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
}
