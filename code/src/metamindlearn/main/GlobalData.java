package metamindlearn.main;

import metamindlearn.core.*;
import metamindlearn.gui.*;
import rainlib.*;

public class GlobalData {

	public Debug debug = new Debug();
	
	public InfoNodeList infomap = new InfoNodeList();
	public NodeHistory history = new NodeHistory();
	
	public InfoMapFrame infomapframe = new InfoMapFrame();
	public NodeGraphFrame nodegraphframe = new NodeGraphFrame();
	public HTMLViewer htmlview = new HTMLViewer();
	
	
	
	public String wikiurl = new String("http://en.wikipedia.org/wiki/");
	
}
