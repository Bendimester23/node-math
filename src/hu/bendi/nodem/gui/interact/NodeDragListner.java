package hu.bendi.nodem.gui.interact;

import hu.bendi.nodem.Vec;
import hu.bendi.nodem.gui.components.Node;

public interface NodeDragListner {

	public void onDrag(Vec pos, Vec to, Node n);
}
