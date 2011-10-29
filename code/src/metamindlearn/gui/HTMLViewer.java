package metamindlearn.gui;

import metamindlearn.core.*;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;


public class HTMLViewer extends javax.swing.JFrame  {

    JEditorPane ContentPane;
    

    public HTMLViewer() {
    	init();
    }
    

    public void init() {
        Container content = getContentPane();
        content.setBackground(Color.white);

        
        ContentPane = new JEditorPane();
        ContentPane.setEditable(false);
        ContentPane.setContentType("text/html");
        JScrollPane ContentScroll = new JScrollPane(ContentPane);
        ContentScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
    
        
        //content.add(topScrollPane);
        content.add(ContentScroll);
        setTitle("Content Viewer");
      	setLocation(400, 120);
		setSize(520,700);
		setVisible(true);
		
		
        
        
        //ContentPane.setText("<p><b>Biologie</b></p>Biologie ist die Wissenschaft vom<br>Leben.");
    }
    
    public void update(InfoNode node_p) {
    	this.setTitle("Content Viewer - "+node_p.getkeyword());
    	ContentPane.setText(node_p.wikitext);
    	ContentPane.setCaretPosition(0);
    	
    	repaint();
    }

}
