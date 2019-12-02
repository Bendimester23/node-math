package hu.bendi.nodem.data;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import hu.bendi.nodem.Vec;
import hu.bendi.nodem.gui.NodeCanvas;
import hu.bendi.nodem.gui.components.Node;
import hu.bendi.nodem.gui.interact.NodeDragListner;

public class Canvas {
	
	
	public static ArrayList<Node> nodes = new ArrayList<Node>();
	public static BufferedImage nodeImg;
	public static NodeCanvas space;

	public static ArrayList<Node> getNodes() {
		return nodes;
	}
	
	

	public static void setNodes(ArrayList<Node> nodes) {
		Canvas.nodes = nodes;
	}
	
	public static void addNode(Vec pos,String name,NodeDragListner list) {
		
	}
	
	public void init() {
		try {                
	          nodeImg = ImageIO.read(new File("./node.png"));
	       } catch (IOException ex) {
	            ex.printStackTrace();
	       }
	}

	
	
}
