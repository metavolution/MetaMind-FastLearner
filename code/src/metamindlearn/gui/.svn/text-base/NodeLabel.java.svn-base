package metamindlearn.gui;

import metamindlearn.main.*;
import metamindlearn.core.*;

import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;

public class NodeLabel extends JLabel {

	private static final long serialVersionUID = 1L;

	int index;
	InfoNode node = new InfoNode();
	int type = 0;

	public NodeLabel() {
		super();
		init();
	}

	public NodeLabel(InfoNode node_p) {
		super();
		init();
		node = node_p;
		setkeyword(node.getkeyword());
	}

	
	public void setkeyword(String keyword_p) {
		
		setText(keyword_p);
		setSize(130, 20);
		setToolTipText(keyword_p);
		setVisible(true);
	}
	
	public void setNode(InfoNode node) {
		setkeyword(node.getkeyword());
	}
	
	public void setType(int type_p) {
		type = type_p;
		if(type == 0) {
			setBackground(new Color(207, 241, 255));
		}
		if(type == 1) {
			setBackground(new Color(128, 200, 232));
		}
		if(type == 10) {
			setBackground(new Color(190, 190, 190));
		}
	}
	
	
	private void init() {
		setOpaque(true);
        setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        setHorizontalTextPosition(SwingConstants.CENTER);
        setHorizontalAlignment(SwingConstants.CENTER);
	  
        addMouseListener(mouseListener);
  
			
	}
	
	MouseListener mouseListener = new MouseListener() {
    	public void mouseEntered(java.awt.event.MouseEvent e) {
    		setForeground(new Color(190, 10, 10));
    		

    	}
    	public void mouseClicked(java.awt.event.MouseEvent e) {
    		node.displayNode();

    	}
    	public void mousePressed(java.awt.event.MouseEvent e) {
    	}
    	public void mouseReleased(java.awt.event.MouseEvent e) {
    	}
    	public void mouseExited(java.awt.event.MouseEvent e) {
    		setForeground(new Color(33, 33, 33));
    	}
    };
	
}
