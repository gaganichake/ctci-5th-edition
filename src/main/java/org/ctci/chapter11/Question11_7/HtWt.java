package org.ctci.chapter11.Question11_7;

public class HtWt implements Comparable {
	private int Ht;
	private int Wt;
	public HtWt(int h, int w) { Ht = h; Wt = w; }
	
	public int compareTo( Object s ) {
		HtWt second = (HtWt) s;
		if (this.Ht != second.Ht) { 
			return Integer.compare(this.Ht, second.Ht);
		} else {
			return Integer.compare(this.Wt, second.Wt);
		}
	}
	
	public String toString() {
		return "(" + Ht + ", " + Wt + ")";
	}
	
	/* Returns true if �this� should be lined up before �other�. Note 
	 * that it�s possible that this.isBefore(other) and 
	 * other.isBefore(this) are both false. This is different from the 
	 * compareTo method, where if a < b then b > a. */
	public boolean isBefore(HtWt other) {
		return this.Ht < other.Ht && this.Wt < other.Wt;
	}
}
