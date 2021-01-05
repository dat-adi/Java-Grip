package GUI.Swing;

import javax.swing.*;

public class PaintDemo{
	SwingPainting sp;
	
	PaintDemo(){
		JFrame jfrm = new JFrame("Paint Demo");
		jfrm.setSize(200, 150);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		sp = new SwingPainting();
		jfrm.add(sp);
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(PaintDemo::new);
	}
}
