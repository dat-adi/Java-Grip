package GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class InterestSwing {
	InterestSwing(){
		JFrame jfrm = new JFrame("Simple Interest Calculator");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(300, 300);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NumberFormat format = DecimalFormat.getInstance();
		
		JLabel pal = new JLabel("Principal Amount");
		jfrm.add(pal);
		JFormattedTextField palInput = new JFormattedTextField(format);
		palInput.setColumns(20);
		jfrm.add(palInput);
		
		JLabel roi = new JLabel("Rate of Interest (%): ");
		jfrm.add(roi);
		JFormattedTextField roiInput = new JFormattedTextField(format);
		roiInput.setColumns(20);
		jfrm.add(roiInput);
		
		JLabel time = new JLabel("Time: ");
		jfrm.add(time);
		JFormattedTextField timeInput = new JFormattedTextField(format);
		timeInput.setColumns(20);
		jfrm.add(timeInput);
		
		JLabel finAmount = new JLabel("Final Amount: ");
		jfrm.add(finAmount);
		JFormattedTextField finAmountInput = new JFormattedTextField(format);
		finAmountInput.setColumns(20);
		finAmountInput.setEditable(false);
		jfrm.add(finAmountInput);
		
		JButton calc = new JButton("Calculate");
		calc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double palInputNumber = (((Number)palInput.getValue()).doubleValue());
				double roiInputNumber = (((Number)roiInput.getValue()).doubleValue());
				int timeInputNumber = (((Number)timeInput.getValue()).intValue());
				
				double fain = palInputNumber*(1 + roiInputNumber*timeInputNumber);
				finAmountInput.setText(String.valueOf(fain));
			}
		});
		jfrm.add(calc);
		
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new InterestSwing();
			}
		});
	}
}
