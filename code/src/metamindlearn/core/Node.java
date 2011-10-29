package metamindlearn.core;

public class Node {
	String keyword;
	Integer type;
	NodeList parentnodes;
	NodeList subnodes;
	NodeList peernodes;
//	NodeStyle style;
	
	public void setkeyword(String keyword_p) {
		keyword = keyword_p;
	}
	
	public String getkeyword() {
		return keyword;
	}
	
}
