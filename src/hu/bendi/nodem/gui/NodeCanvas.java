package hu.bendi.nodem.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import hu.bendi.nodem.Line;
import hu.bendi.nodem.Vec;
import hu.bendi.nodem.data.Canvas;
import hu.bendi.nodem.gui.components.Node;
import hu.bendi.nodem.utils.Utils2d;

@SuppressWarnings("serial")
public class NodeCanvas extends JPanel {
	
	
	public Line l = new Line();
	public Canvas c;
	private Node node;
	
	public NodeCanvas(Canvas c) {
		this.c = c;
		c.init();
		node = new Node(c);
		node.setPos(new Vec(10,10));
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Released X: "+e.getX() + " Y: " + e.getY());
				l.to = new Vec((int)e.getPoint().getX(),(int)e.getPoint().getY());
				EditorWindow.c.paint(EditorWindow.c.getGraphics());
				/*if (Utils2d.isInside(new Rectangle(node.getPos().x, node.getPos().y, node.getScale().x, node.getScale().y), l.from)) {
					node.setPos(l.to);
				}*/
				if (new Rectangle(node.getPos().x, node.getPos().y, node.getScale().x, node.getScale().y).contains(l.from.x, l.from.y)) {
					node.setPos(l.to);
				}
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Pressed X: "+e.getX() + " Y: " + e.getY());
				l.from = new Vec(e.getX(),e.getY());
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
		if (l.to != null) {
			g.drawLine(l.from.x, l.from.y, l.to.x, l.to.y);
		}
		node.setName("Teszt");
		node.draw(node.getPos(), g,new Vec(150,150));
		g.setColor(Color.GREEN);
		g.drawRect(node.getPos().x, node.getPos().y, node.getScale().x, node.getScale().y);
	}
	

}
