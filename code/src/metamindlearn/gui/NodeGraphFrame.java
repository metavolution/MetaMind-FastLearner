package metamindlearn.gui;

import javax.swing.JPanel;
import javax.swing.JFrame;

import metamindlearn.main.Main;
import metamindlearn.core.*;

public class NodeGraphFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public NodeGraphPanel nodegraphpanel = new NodeGraphPanel();

	public NodeGraphFrame() {
		super();
		init();
	}

	private void init() {
		this.setSize(380, 700);
		this.setTitle("Node Graph");
		this.setLocation(20,120);
		this.setVisible(true);
		this.setContentPane(nodegraphpanel);
		//this.add(nodegraphpanel);
	
	}

	public void render(InfoNode node_p) {
		nodegraphpanel.render(node_p);
		repaint();
	}
	                                 

}
