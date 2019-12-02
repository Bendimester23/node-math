package hu.bendi.nodem.utils;

import java.awt.Rectangle;

import hu.bendi.nodem.Vec;

public class Utils2d {

	
	public static boolean isInside(Rectangle r, Vec p) {
		if (r.x <= p.getX()&&(r.x+r.width) >=p.x) {
			return true;
		}else {
			return false;
		}
	}
}
