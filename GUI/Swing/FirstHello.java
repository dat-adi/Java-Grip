package GUI.Swing;

import javax.swing.*;

public class FirstHello {
	FirstHello(){
		JFrame rootFrame = new JFrame("Main window");
		rootFrame.setSize(400, 200);
		rootFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lab1 = new JLabel("Powerful start to this GUI Project.");
		JLabel lab2 = new JLabel("Perhaps might need to increase the functionality though.");
		rootFrame.getContentPane().add(lab1);
		rootFrame.getContentPane().add(lab2);
		
		rootFrame.setVisible(true);
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FirstHello();
				new ButtonEventHandling();
			}
		});
	}
}
