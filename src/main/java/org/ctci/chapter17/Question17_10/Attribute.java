package org.ctci.chapter17.Question17_10;

import java.util.Objects;

public class Attribute {
	public String tag;
	public String value;
	public Attribute(String t, String v) {
		tag = t;
		value = v;
	}
	
	public String getTagCode() {
		if (Objects.equals(tag, "family")) {
			return "1";
		} else if (Objects.equals(tag, "person")) {
			return "2";
		} else if (Objects.equals(tag, "firstName")) {
			return "3";
		} else if (Objects.equals(tag, "lastName")) {
			return "4";
		} else if (Objects.equals(tag, "state")) {
			return "5";
		} 
		return "--";
	}
}
