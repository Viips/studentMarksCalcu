package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class IMMheader extends JPanel {
	
	private JLabel lblTitle, lblCourseMark, lblExamMark;
	
	/****************************************************************************************************************************/
	
	public IMMheader() {
		
		// ---------------- Label ---------------- //
		
		lblTitle = new JLabel("Modules");
		lblCourseMark = new JLabel("Cwk Marks");
		lblExamMark = new JLabel("Exam Marks");
		
		// ---------------- Layout ---------------- //
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(2,2,2,20);
		gbc.anchor = GridBagConstraints.WEST;
		
		gbc.weightx = 0.99;
		gbc.gridx = 0;
		this.add(lblTitle, gbc);
		
		gbc.weightx = 0.001;
		gbc.gridx = 1;
		this.add(lblExamMark, gbc);
		
		gbc.gridx = 2;
		this.add(lblCourseMark, gbc);
	}
	
	/****************************************************************************************************************************/
	
}
