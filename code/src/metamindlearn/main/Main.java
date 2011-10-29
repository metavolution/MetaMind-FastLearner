package metamindlearn.main;

import metamindlearn.core.*;
import metamindlearn.gui.*;

public class Main {

	public static GlobalData global = new GlobalData();
	
	public static void main(String[] args) {

		System.out.println("program start");
		
		
		global.infomap.addNode("Biology");
		global.infomap.addNode("Physics");
		global.infomap.addNode("Chemistry");
		global.infomap.addNode("Computer Science");
		global.infomap.addNode("Mechanical engineering");
		global.infomap.addNode("Neuroscience");
		global.infomap.addNode("Philosophy");
		
		global.infomap.addNode("Romanticism");
		global.infomap.addNode("Love");
		
		

		
		
		
		
		
		
		
		try{
		Thread.sleep(2000);
		}
		catch (Exception e){};

		//infomapframe.setVisible(false);
		System.out.println("program end");
		
	
	
	}

}
