package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_first implements ActionListener {
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI_first(){
		frame = new JFrame();
		
		JButton button = new JButton("Click me ");
		button.addActionListener(this);
		label = new JLabel("Number of clicks : " + count);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("First GUI");
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		new GUI_first();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks : " + count);
	}
}
