package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class IMMTab extends JPanel{
	
	private IMMheader header;
	private Mod1 mod1;
	private Mod2 mod2;
	private Mod3 mod3;
	private Mod4 mod4;
	private IMMFooter footer;
	
	/****************************************************************************************************************************/
	
	public IMMTab() {
		
		// ---------------- Layout ---------------- //
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		
		header = new IMMheader();
		this.add(header, gbc);
		
		gbc.gridy = 1;
		mod1 = new Mod1();
		this.add(mod1, gbc);
		
		gbc.gridy = 2;
		mod2 = new Mod2();
		this.add(mod2, gbc);
		
		gbc.gridy = 3;
		mod3 = new Mod3();
		this.add(mod3, gbc);
		
		gbc.gridy = 4;
		mod4 = new Mod4();
		this.add(mod4, gbc);
		
		gbc.gridy = 6;
		footer = new IMMFooter();
		this.add(footer, gbc);
}		
		
	/****************************************************************************************************************************/
	
	// ---------------- Get Header ---------------- //
	public IMMheader getHeader() {
		return header;
	}
	
	/****************************************************************************************************************************/
	
	// ---------------- Get Mod1 ---------------- //
	public Mod1 getMod1() {
		return mod1;
	}
	
	/****************************************************************************************************************************/
	
	// ---------------- Get Mod2 ---------------- //
	public Mod2 getMod2() {
		return mod2;
	}
	
	/****************************************************************************************************************************/
	
	// ---------------- Get Mod3 ---------------- //
	public Mod3 getMod3() {
		return mod3;
	}
	
	/****************************************************************************************************************************/
	
	// ---------------- Get Mod4 ---------------- //
	public Mod4 getMod4() {
		return mod4;
	}
	
	/****************************************************************************************************************************/
	
	// ---------------- Get Footer ---------------- //
	public IMMFooter getFooter() {
		return footer;
	}
	
	/****************************************************************************************************************************/
	
}
