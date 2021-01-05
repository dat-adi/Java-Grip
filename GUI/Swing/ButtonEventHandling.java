package GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEventHandling {
	
	JLabel lab;
	
	ButtonEventHandling(){
		JFrame jfrm = new JFrame("Testing button functionality");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(300, 200);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton AlphaButton = new JButton("Alpha Male Time");
		JButton BetaButton = new JButton("yes beta male");
		
		AlphaButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText("Alpha of the pack");
			}
		});
		
		BetaButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lab.setText("uwu i can't pick up heavy things");
			}
		});
		
		jfrm.add(AlphaButton);
		jfrm.add(BetaButton);
		
		lab = new JLabel("Press a button.");
		jfrm.add(lab);
		
		jfrm.setVisible(true);
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
