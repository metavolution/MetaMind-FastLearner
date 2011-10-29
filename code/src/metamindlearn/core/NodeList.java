package metamindlearn.core;

import java.util.*;

public class NodeList {
	private Vector<Node> nodes;

	void addNode(String keyword_p) {
		Node node = new Node();
		node.setkeyword(keyword_p);
		nodes.add(node);
	}
	
	
	public void setNodes(Vector<Node> nodes) {
		this.nodes = nodes;
	}

	public Vector<Node> getNodes() {
		return nodes;
	}
	
	
	
}
