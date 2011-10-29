package metamindlearn.core;

import metamindlearn.main.*;

import java.util.Vector;

public class InfoNodeList  {
	
	

	public Vector<InfoNode> nodes = new Vector<InfoNode>();
	protected int windex = 0;
	protected int rindex = 0;
	
	
	public InfoNode addNode(String keyword_p) {
		InfoNode node = new InfoNode();
		node.setkeyword(keyword_p);
		
		
		windex++;
		nodes.add(node);
		Main.global.infomapframe.addInfoNode(node);
		
		
		return node;
		
	}
	
	public InfoNode getNode(int index_p) {
		return nodes.elementAt(index_p);
	}
	
	public String getkeyword(int index_p) {
		return nodes.elementAt(index_p).getkeyword();
	}
	
	public void getwikicontent() {
		for(int i=0;i < nodes.size();i++) {
			InfoNode node = nodes.elementAt(i);
			node.getwikitext();
			node.parsewikicontent();

		}

	
	}
	
	public String getwikistring(int index_p) {
		InfoNode node = nodes.elementAt(index_p);
		return node.wikistring;
	}
	
	public String getwikitext(int index_p) {
		InfoNode node = nodes.elementAt(index_p);
		
		return node.wikitext;
	}
	
	public int getsize() {
		return nodes.size();
	}
	
	public int getsubnodessize(int index_p) {
		InfoNode node = nodes.elementAt(index_p);
		return node.subnodes.getsize();
		
	}
	
	public InfoNode getnextNode() {
		rindex++;
		return nodes.elementAt(rindex-1);
		
	}
	
	public InfoNode getsubNode(int index_p) {
		InfoNode node = nodes.elementAt(index_p);
		return node;
	}
	
}
