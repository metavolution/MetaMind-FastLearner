package metamindlearn.core;

import metamindlearn.gui.InfoMapFrame;
import metamindlearn.main.*;


public class InfoMap extends InfoNodeList {
	
	InfoMapFrame infomapframe = new InfoMapFrame();
	
	public InfoMap() {
		infomapframe.setVisible(true);
	}
	/*
	public void addNode(String keyword_p) {
		
		infomapframe.addInfoNode(super.addNode(keyword_p));
		
	}
*/
	
	public void testinit() {
		addNode("Biologie");
		addNode("Informatik");
		addNode("Physik");
		addNode("Chemie");
		addNode("Maschinenbau");
		addNode("Neurowissenschaft");
		
		//getwikicontent();
		
	}
	
	public void rendermap() {
		
	}
}
