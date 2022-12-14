package org.ctci.chapter11.Question11_2;

import org.ctci.library.AssortedMethods;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class QuestionB {
	public static String sortChars(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static void sort(String[] array) {
		Hashtable<String, LinkedList<String>> hash = new Hashtable<>();
		
		/* Group words by anagram */
		for (String s : array) {
			String key = sortChars(s); 
			if (!hash.containsKey(key)) {
				hash.put(key, new LinkedList<>());
			}
			LinkedList<String> anagrams = hash.get(key);
			anagrams.push(s);
		}
		
		/* Convert hash table to array */
		int index = 0;
		for (String key : hash.keySet()) {
			LinkedList<String> list = hash.get(key);
			for (String t : list) {
				array[index] = t;
				index++;
			}
		}
	}
	
	public static void main(String[] args) {
		String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
		sort(array);
		System.out.println(AssortedMethods.stringArrayToString(array));
	}
}
