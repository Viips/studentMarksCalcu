package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

//note extending JMenuBar
public class MenuBar extends JMenuBar {

	private JMenuItem load, save, exit, about;

	/****************************************************************************************************************************/
	
	public MenuBar() {      

		//temp vars for menus and menu items within this JMenuBar
		JMenu menu;

		// ---------------- Menu ---------------- //
		menu = new JMenu("File");

		// ---------------- Load ---------------- //
		load = new JMenuItem("Load Student Profile");
		load.setMnemonic(KeyEvent.VK_L);
		load.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
		menu.add(load);
		this.add(menu);
		
		// ---------------- Save ---------------- //
		//'Save' menu item
		save = new JMenuItem("Save Student Profile");
		save.setMnemonic(KeyEvent.VK_S);
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		menu.add(save);
		this.add(menu);

		// ---------------- Separator ---------------- //
		menu.addSeparator();

		// ---------------- Exit ---------------- //
		exit = new JMenuItem("Exit");
		exit.setMnemonic(KeyEvent.VK_E);
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		menu.add(exit);
		this.add(menu); //add the menu to this menubar;


		// ---------------- Second Menu ---------------- //
		menu = new JMenu("Help");

		// ---------------- About ---------------- //
		about = new JMenuItem("About");
		about.setMnemonic(KeyEvent.VK_A);
		about.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		menu.add(about);

		this.add(menu); //add the menu to this menubar 
	}

	/****************************************************************************************************************************/

	// ---------------- Load Marks ---------------- //
	public void loadStuPro(ActionListener al) {
		load.addActionListener(al);
	}

	/****************************************************************************************************************************/

	// ---------------- Save Marks ---------------- //
	public void saveStuPro(ActionListener al) {
		save.addActionListener(al);
	}

	/****************************************************************************************************************************/

	// ---------------- Exit ---------------- //
	public void exit(ActionListener al) {
		exit.addActionListener(al);
	}

	/****************************************************************************************************************************/

	// ---------------- About ---------------- //
	public void about(ActionListener al) {
		about.addActionListener(al);
	}

	/****************************************************************************************************************************/
}
