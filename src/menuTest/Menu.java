package menuTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame implements ActionListener{
	
	JMenuBar bar = new JMenuBar();
	JMenu help = new JMenu("Help");
	JMenu opt = new JMenu("Options");
	JMenuItem pref = new JMenuItem("Preferences");
	JMenuItem exit = new JMenuItem("Exit");
	
	
	public Menu() {
		//Menu
		setJMenuBar(bar);
		bar.add(opt);
		bar.add(help);
		
		opt.add(pref);
		help.add(exit);	
		
		exit.addActionListener(this);
		
		//Window
		setTitle("Menu");
		setSize(1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		
		//Visible
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Menu();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit) {
			System.exit(0);
		}
	}

}
