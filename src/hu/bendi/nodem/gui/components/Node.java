package hu.bendi.nodem.gui.components;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import hu.bendi.nodem.Vec;
import hu.bendi.nodem.data.Canvas;

public class Node {
	

	private BufferedImage image;
	
	@SuppressWarnings("unused")
	private Canvas parent;
	private String name;
	private Vec pos;
	private Vec scale;
	
	@SuppressWarnings("static-access")
	public Node(Canvas c) {
		image = c.nodeImg;
		c.nodes.add(this);
	}
	
	public void draw(Vec pos, Graphics g, Vec s) {
		this.setPos(pos);
		this.scale = s;
		g.drawImage(image, pos.getX(), pos.getY(), 150, 150, new ImageObserver() {
			
			@Override
			public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
				return false;
			}
		});
		g.drawString(name, pos.getX()+15, pos.getY()+15);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vec getScale() {
		return scale;
	}

	public Vec getPos() {
		return pos;
	}

	public void setPos(Vec pos) {
		this.pos = pos;
	}

	
}
