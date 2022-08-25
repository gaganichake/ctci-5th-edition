package org.ctci.chapter17.Question17_10;

import java.util.ArrayList;
import java.util.Objects;

public class Element {
	public ArrayList<Attribute> attributes;
	public ArrayList<Element> children;
	public String name;
	public String value;
	
	public Element(String n) {
		name = n;
		attributes = new ArrayList<>();
		children = new ArrayList<>();
	}
	
	public Element(String n, String v) {
		name = n;
		value = v;
		attributes = new ArrayList<>();
		children = new ArrayList<>();
	}	
	
	public String getNameCode() {
		if (Objects.equals(name, "family")) {
			return "1";
		} else if (Objects.equals(name, "person")) {
			return "2";
		} else if (Objects.equals(name, "firstName")) {
			return "3";
		} else if (Objects.equals(name, "lastName")) {
			return "4";
		} else if (Objects.equals(name, "state")) {
			return "5";
		} 
		return "--";
	}
	
	public void insert(Attribute attribute) {
		attributes.add(attribute);
	}
	
	public void insert(Element child) {
		children.add(child);
	}
}
