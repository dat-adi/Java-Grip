package GUI.Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckboxHandling implements ItemListener {
	JLabel lab;
	
	CheckboxHandling(){
		JFrame jfrm = new JFrame("Checkbox Handling");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(250, 100);
		
		JCheckBox cb = new JCheckBox("C");
		cb.addItemListener(this);
		jfrm.add(cb);
		
		cb = new JCheckBox("C++");
		cb.addItemListener(this);
		jfrm.add(cb);
		
		cb = new JCheckBox("Java");
		cb.addItemListener(this);
		jfrm.add(cb);
		
		cb = new JCheckBox("Perl");
		cb.addItemListener(this);
		jfrm.add(cb);
		
		lab = new JLabel("Select Languages.");
		jfrm.add(lab);
		
		jfrm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent ie){
		JCheckBox cb = (JCheckBox)ie.getItem();
		if(cb.isSelected()){
			lab.setText(cb.getText() + " is selected.");
		} else {
			lab.setText(cb.getText() + " is cleared.");
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			 public void run(){
				  new CheckboxHandling();
			 }
		});
	}
}
