package metamindlearn.gui;

import metamindlearn.core.*;
import metamindlearn.main.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
//import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;

public class SearchPanel extends JPanel {
	
	Dimension textdim = new Dimension();
	Dimension buttondim = new Dimension();
	Font font;
	
	JTextField searchfield = new JTextField();
	JButton searchbutton = new JButton();
	
	SearchPanel() {
		super();
		init();
	}
	
	public void init() {
		
		//searchfield.setSize(100, 50);
		
		//searchfield.setText("Open Source");
		
		textdim.setSize(100, 20);
		searchfield.setPreferredSize(textdim);

		buttondim.setSize(80,20);
		searchbutton.setPreferredSize(buttondim);
		searchbutton.setFont(font);
		searchbutton.setText("Search");
	
        searchbutton.addMouseListener(mouseListener);
        searchfield.addKeyListener(keyListener);	
		
		this.add(searchfield);
		this.add(searchbutton);
		
    		
	}
	
	public void search() {
		String searchstring = searchfield.getText();
		
		InfoNode node = Main.global.infomap.addNode(searchstring);
		node.displayNode();
	}
	
	MouseListener mouseListener = new java.awt.event.MouseListener() {
    	public void mouseEntered(java.awt.event.MouseEvent e) {
    		setForeground(new Color(190, 10, 10));
  
    	}
    	public void mouseClicked(java.awt.event.MouseEvent e) {
    		search();

    	}
    	public void mousePressed(java.awt.event.MouseEvent e) {
    	}
    	public void mouseReleased(java.awt.event.MouseEvent e) {
    	}
    	public void mouseExited(java.awt.event.MouseEvent e) {
    		setForeground(new Color(33, 33, 33));
    	}
		};
	
    KeyListener keyListener = new KeyListener() {
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER) {
          	  search();
            }
        }

        public void keyReleased(KeyEvent e) {
   
        }

        public void keyTyped(KeyEvent e) {
          

        }

    };
}