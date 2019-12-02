package hu.bendi.nodem.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private int width;
	private int height;
	private BufferedImage image;

    public ImagePanel(int width,int height,File img) {
       try {                
          image = ImageIO.read(new File("./icon.png"));
       } catch (IOException ex) {
            ex.printStackTrace();
       }
       this.width = width;
       this.height = height;
       this.setBackground(new Color(0,0,0,0));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0,0,0,0));
        g.drawImage(image, (width/2)-(image.getWidth()/2), (height/2)-(image.getHeight()/2), this);          
    }
}
