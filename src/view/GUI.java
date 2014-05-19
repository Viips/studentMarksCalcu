package view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author vipin
 */
public class GUI extends JFrame {
	
	private MenuBar menu;
	private CSPTab firstTab;
	private IMMTab secondTab;
	private ORTab thirdTab;
	
	/****************************************************************************************************************************/
	
	public GUI() {
	
	// ---------------- Layout ---------------- //
		
	this.setTitle("Student Profile Calculator");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	// ---------------- MenuBar ---------------- //
	
	menu = new MenuBar();
	this.setJMenuBar(menu);

	// ---------------- Tabs ---------------- //
	
	JTabbedPane tabPane = new JTabbedPane(JTabbedPane.TOP);
	tabPane.setPreferredSize(new Dimension(650, 300));
	
	firstTab = new CSPTab();
	tabPane.addTab("Create Student Profile", firstTab);
	
	secondTab = new IMMTab();
	tabPane.addTab("Input Module Marks", secondTab);
    
	thirdTab = new ORTab();
	tabPane.addTab("Overview Results", thirdTab);
	
	// ---------------- Layout ---------------- //
	
	this.add(tabPane);
    this.pack();
    this.setVisible(true);
}
	/****************************************************************************************************************************/
	//Returns firstTab
	public CSPTab getCSPTab() {
		return firstTab;
	}

	/****************************************************************************************************************************/
	
	public IMMTab getIMMTab() {
		return secondTab;
	}

	/****************************************************************************************************************************/
	
	public ORTab getORTab() {
		return thirdTab;
	}
	
	/****************************************************************************************************************************/
	
	public MenuBar getMenu() {
		return menu;
	}
	
	/****************************************************************************************************************************/
	
}






