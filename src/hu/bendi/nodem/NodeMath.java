package hu.bendi.nodem;

import hu.bendi.nodem.gui.EditorWindow;
import hu.bendi.nodem.gui.SplashScreen;

public class NodeMath {

	public static Thread splashThread;
	private static SplashScreen s;
	
	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
		splashThread = new Thread(new Runnable() {
			
			@SuppressWarnings("static-access")
			@Override
			public void run() {
				s = SplashScreen.init();
				s.open();
				
			}
		});
		new EditorWindow().show();
	}
	
}
