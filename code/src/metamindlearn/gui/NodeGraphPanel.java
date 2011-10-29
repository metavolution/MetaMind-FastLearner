package metamindlearn.gui;

import javax.swing.JPanel;

import metamindlearn.core.InfoNode;
import metamindlearn.main.*;

import java.awt.Color;

public class NodeGraphPanel extends JPanel {

	byte graphtype = 0;
	byte orientation = 0;
	
	int currentpos;
	int viewpos;
	
	int xpos = 0;
	int maxx = this.getWidth();
	int maxy = 660;
	int levelx = 50;
	int levelwidth = 150;
	
	public NodeGraphPanel() {
		super();
		init();
	}
	
	public void init() {
		setBackground(new Color(84,95,99));
		setLayout(null);
		System.out.println(getWidth());

		
	}
	
	public void renderNode(InfoNode node, int x, int y, int type_p) {
		NodeLabel nodelabel = new NodeLabel(node);
		
		//nodelabel.setNode(node);
		nodelabel.setLocation(x, y);
		
		//nodelabel.setToolTipText("test");
		
		nodelabel.setType(type_p);
		nodelabel.setVisible(true);
		this.add(nodelabel);
	}
	

	public void render(InfoNode node_p) {

		this.removeAll();
		
		//currentnode
		renderNode(node_p, 40, 10, 0);

		//subnodes
		for(int i=0;i<node_p.subnodes.getsize();i++) {
			InfoNode node = node_p.subnodes.getNode(i);
			renderNode(node, levelwidth*1+levelx, 20+25*i, 1);
		}
	
		//history
		int historysize = Main.global.history.visitednodes.getsize();
		for(int i=historysize; i>0 ;i--) {
			InfoNode node = Main.global.history.visitednodes.getNode(i-1);
			renderNode(node, 20, 60+25*(historysize-i), 10);
		}


		
/*
		//partentnodes
		InfoNode parentnode;
		for(int i=0; i < node_p.parentnodes.getsize();i++) {
			parentnode = node_p.parentnodes.nodes.elementAt(i);
			System.out.println(parentnode);
			renderNode(parentnode, 0, 20+25*i);
		}
*/
		
		repaint();
		
		
	}
}
