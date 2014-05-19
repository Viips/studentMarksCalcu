package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class IMMFooter extends JPanel {
	
	private JButton btnClear;
	private JButton btnSubmit;
	
	/****************************************************************************************************************************/
	
	public IMMFooter() {
		
		// ---------------- Button ---------------- //
		
		btnClear = new JButton("Clear");
		btnSubmit = new JButton("Submit");
		
		// ---------------- Layout ---------------- //
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(2,2,2,20);
		
		gbc.gridx = 1;
		this.add(btnClear, gbc);
		
		gbc.gridx = 2;
		this.add(btnSubmit, gbc);
		
	}
	
	/****************************************************************************************************************************/
	
	// ---------------- Clear Button ---------------- //
	public void btnClear(ActionListener clr) {
		btnClear.addActionListener(clr);
	}
	
	/****************************************************************************************************************************/
	
	// ---------------- Submit Button ---------------- //
	public void btnSubmit(ActionListener sub) {
		btnSubmit.addActionListener(sub);
	}
	
	/****************************************************************************************************************************/
	
}
