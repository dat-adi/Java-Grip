package GUI.Swing;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.CYAN;
import static java.awt.Color.BLACK;
import static java.awt.Color.ORANGE;
import static java.awt.Color.RED;
import static java.awt.Color.BLUE;
import static java.awt.Color.YELLOW;
import static java.awt.Color.GREEN;

import static java.awt.Font.BOLD;
import static java.awt.Font.ITALIC;

public class SwingMenu {
	SwingMenu(){
		JFrame jfrm = new JFrame("Swing Menu");
		jfrm.setSize(300, 100);
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		
		JMenuBar jmb = new JMenuBar();
		jfrm.setJMenuBar(jmb);
		
		JMenu country = new JMenu("Country");
		jmb.add(country);
		JMenuItem c1 = new JMenuItem("India");
		country.add(c1);
		JMenuItem c2 = new JMenuItem("Pakistan");
		country.add(c2);
		JMenuItem c3 = new JMenuItem("Nation of the doggo");
		country.add(c3);
		JMenuItem c4 = new JMenuItem("Nekotaro Tribe");
		country.add(c4);
		JMenuItem c5 = new JMenuItem("The Tadpoles Militia");
		country.add(c5);
		JMenuItem c6 = new JMenuItem("Flippity flappity");
		country.add(c6);
		JMenuItem c7 = new JMenuItem("God is dead");
		country.add(c7);
		
		JMenu Font = new JMenu("Font");
		jmb.add(Font);
		JMenu Fname = new JMenu("Name");
		Font.add(Fname);
		
		JMenuItem fn1 = new JMenuItem("Arial");
		Fname.add(fn1);
		JMenuItem fn2 = new JMenuItem("Times New Roman");
		Fname.add(fn2);
		JMenuItem fn3 = new JMenuItem("Verdana");
		Fname.add(fn3);
		JMenuItem fn4 = new JMenuItem("Serif");
		Fname.add(fn4);
		
		JMenu Ftype = new JMenu("Type");
		Font.add(Ftype);
		JMenuItem ft1 = new JMenuItem("Bold");
		Ftype.add(ft1);
		JMenuItem ft2 = new JMenuItem("Italic");
		Ftype.add(ft2);
		
		JMenu Fsize = new JMenu("Size");
		Font.add(Fsize);
		JMenuItem fs1 = new JMenuItem("12");
		Fsize.add(fs1);
		JMenuItem fs2 = new JMenuItem("14");
		Fsize.add(fs2);
		JMenuItem fs3 = new JMenuItem("16");
		Fsize.add(fs3);
		JMenuItem fs4 = new JMenuItem("18");
		Fsize.add(fs4);
		
		JMenu Color = new JMenu("Color");
		jmb.add(Color);
		JMenuItem clr1 = new JMenuItem("Black");
		Color.add(clr1);
		JMenuItem clr2 = new JMenuItem("Cyan");
		Color.add(clr2);
		JMenuItem clr3 = new JMenuItem("Blue");
		Color.add(clr3);
		JMenuItem clr4 = new JMenuItem("Green");
		Color.add(clr4);
		JMenuItem clr5 = new JMenuItem("Yellow");
		Color.add(clr5);
		JMenuItem clr6 = new JMenuItem("Orange");
		Color.add(clr6);
		JMenuItem clr7 = new JMenuItem("Red");
		Color.add(clr7);
		
		JLabel lab = new JLabel("Pick a country");
		jfrm.add(lab);
		
		c1.addActionListener(e -> lab.setText("India"));
		c2.addActionListener(e -> lab.setText("Pakistan"));
		c3.addActionListener(e -> lab.setText("Nation of the doggo"));
		c4.addActionListener(e -> lab.setText("Nekotaro Tribe"));
		c5.addActionListener(e -> lab.setText("The Tadpole Militia"));
		c6.addActionListener(e -> lab.setText("Flippity Flappity"));
		c7.addActionListener(e -> lab.setText("God is dead"));
		
		fn1.addActionListener(e -> lab.setFont(new Font("Arial", lab.getFont().getStyle(), lab.getFont().getSize())));
		fn2.addActionListener(e -> lab.setFont(new Font("Times New Roman", lab.getFont().getStyle(), lab.getFont().getSize())));
		fn3.addActionListener(e -> lab.setFont(new Font("Verdana", lab.getFont().getStyle(), lab.getFont().getSize())));
		fn4.addActionListener(e -> lab.setFont(new Font("Serif", lab.getFont().getStyle(), lab.getFont().getSize())));
		
		ft1.addActionListener(e -> lab.setFont(new Font(lab.getFont().getFontName(), BOLD, lab.getFont().getSize())));
		ft2.addActionListener(e -> lab.setFont(new Font(lab.getFont().getFontName(), ITALIC, lab.getFont().getSize())));
		
		fs1.addActionListener(e -> lab.setFont(new Font(lab.getFont().getFontName(), lab.getFont().getStyle(), 12)));
		fs2.addActionListener(e -> lab.setFont(new Font(lab.getFont().getFontName(), lab.getFont().getStyle(), 14)));
		fs3.addActionListener(e -> lab.setFont(new Font(lab.getFont().getFontName(), lab.getFont().getStyle(), 16)));
		fs4.addActionListener(e -> lab.setFont(new Font(lab.getFont().getFontName(), lab.getFont().getStyle(), 18)));
		
		clr1.addActionListener(e -> lab.setForeground(BLACK));
		clr2.addActionListener(e -> lab.setForeground(CYAN));
		clr3.addActionListener(e -> lab.setForeground(BLUE));
		clr4.addActionListener(e -> lab.setForeground(GREEN));
		clr5.addActionListener(e -> lab.setForeground(YELLOW));
		clr6.addActionListener(e -> lab.setForeground(ORANGE));
		clr7.addActionListener(e -> lab.setForeground(RED));
		
		jfrm.setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(SwingMenu::new);
	}
}