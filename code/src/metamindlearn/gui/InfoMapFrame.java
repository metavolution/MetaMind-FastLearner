package metamindlearn.gui;

import metamindlearn.core.*;
import metamindlearn.main.Main;

import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseListener;

public class InfoMapFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;

	int xpos = 50;
	
	/**
	 * This is the default constructor
	 */
	public InfoMapFrame() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		
		this.setLocation(20, 20);
		this.setContentPane(getJContentPane());
		this.setTitle("InfoMap View");
		this.setSize(900, 100);
		this.setVisible(true);
		
		ControlPanel controlbar = new ControlPanel();
		this.add(controlbar);

	
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			//jContentPane.setLayout(new GridLayout(3,0));
			
		}
		return jContentPane;
	}

	public void addInfoNode(InfoNode node_p) {
		NodeLabel nodelabel = new NodeLabel(node_p);

		
		nodelabel.setBackground(new Color(250, 250, 250));
		//nodelabel.setkeyword(keyword_p);
		//nodelabel.setLocation(xpos, 40);
		//xpos += 100;


		
		//this.add(nodelabel);
		jContentPane.add(nodelabel);
		
		//this.setSize(500, 151);
		jContentPane.validate();
	}
	
}
