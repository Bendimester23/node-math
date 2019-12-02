package hu.bendi.nodem.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JWindow;


public class SplashScreen extends JWindow {

	private static final long serialVersionUID = 1L;
	private static SplashScreen result = new SplashScreen();
	private static int height = 200;
	private static int width = 450;
	
	
	public static SplashScreen init() {
		result.setType(Type.POPUP);
		Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
		result.setLocation((sSize.width/2)-(width/2), (sSize.height/2)-(height/2));
		result.setSize(width, height);
		result.setBackground(new Color(0, 0, 0, 0));
		result.add(new ImagePanel(width,height,null));
		return result;
	}
	
	public static void open() {
		result.setVisible(true);
		System.out.println("gfhf");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("gfhf");
		close();
	}
	
	@SuppressWarnings("deprecation")
	public static void close() {
		result.hide();
		System.gc();
	}
}
