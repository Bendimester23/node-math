package hu.bendi.nodem.gui;

import javax.swing.JFrame;

import hu.bendi.nodem.data.Canvas;

public class EditorWindow extends JFrame {

	private static final long serialVersionUID = 5947871089472818909L;
	public static NodeCanvas c = new NodeCanvas(new Canvas());

	public EditorWindow() {
		this.add(c);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1280, 720);
	}
	  
}