package GUI.Swing;

import javax.swing.*;
import java.awt.*;

public class RadioSwing {
	JButton jb;
	
	RadioSwing(){
		JFrame jfrm = new JFrame("Swing.RadioSwing");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(400, 250);
		
		JTextField textInput = new JTextField(20);
		jfrm.add(textInput);
		
		jb = new JButton("Hourglass");
		jfrm.add(jb);
		jb.setActionCommand("Hourglass");
		jb.addActionListener(e -> textInput.setText("Hourglass"));
		
		jb = new JButton("Rabbit");
		jfrm.add(jb);
		jb.setActionCommand("Rabbit");
		jb.addActionListener(e -> textInput.setText("Rabbit"));
		
		jb = new JButton("Horse");
		jfrm.add(jb);
		jb.setActionCommand("Horse");
		jb.addActionListener(e -> textInput.setText("Horse"));
		
		jb = new JButton("Tadpole");
		jfrm.add(jb);
		jb.setActionCommand("Tadpole");
		jb.addActionListener(e -> textInput.setText("Tadpole"));
		
		JLabel userInput = new JLabel();
		jfrm.add(userInput);
		
		textInput.addActionListener(e -> userInput.setText("You selected : " + e.getActionCommand()));
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(RadioSwing::new);
	}
}