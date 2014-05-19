package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Module;

public class Mod4 extends JPanel {

	private JLabel lblmod4;
	private JFormattedTextField tfMod4Course, tfMod4Exam;
	private Module mod4;
	
	/****************************************************************************************************************************/

	public Mod4() {
		// ---------------- Label ---------------- //

		lblmod4 = new JLabel("Module 3 NOT SELECTED");

		NumberFormat amountFormat;
		amountFormat = NumberFormat.getNumberInstance();

		tfMod4Course = new JFormattedTextField(amountFormat);
		tfMod4Course.setColumns(3);
		tfMod4Course.setToolTipText("Enter your coursework marks for Module 4");

		tfMod4Exam = new JFormattedTextField(amountFormat);
		tfMod4Exam.setColumns(3);
		tfMod4Exam.setToolTipText("Enter your course work marks for Module 4");

		// ---------------- Layout ---------------- //

		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(2,2,2,40);
		gbc.anchor = GridBagConstraints.WEST;

		gbc.weightx = 0.99;
		gbc.gridx = 0;
		this.add(lblmod4, gbc);

		gbc.weightx = 0.001;
		gbc.gridx = 1;
		this.add(tfMod4Exam, gbc);

		gbc.gridx = 2;
		this.add(tfMod4Course, gbc);
	}
	
	/****************************************************************************************************************************/

	// ---------------- Clear TextField ---------------- //
	public void clearFields() {
		tfMod4Course.setText("");
		tfMod4Exam.setText("");
	}
	
	/****************************************************************************************************************************/

	// ---------------- Setup Modules ---------------- //
	public void setMod(Module mod) {
		this.mod4 = mod;
		this.lblmod4.setText(mod.getModuleCode() + " " + mod.getModuleName());
		//this.tfMod4Course.setText("0");
		//this.tfMod4Exam.setText("0");
	}
	
	/****************************************************************************************************************************/

	// ---------------- Get Module ---------------- //
	public Module getMod() {
		return mod4;
	}
	
	/****************************************************************************************************************************/

	// ---------------- Get Exam Marks ---------------- //
	public int getMod4ExamMarks() {
		return Integer.parseInt(tfMod4Exam.getText());
	}
	
	/****************************************************************************************************************************/

	// ---------------- Get CourseMarks ---------------- //
	public int getMod4CourseMarks() {
		return Integer.parseInt(tfMod4Course.getText());	
	}
	
	/****************************************************************************************************************************/

	// ---------------- Set Exam Marks ---------------- //
	public void setMod4ExamMarks(String e) {
		this.tfMod4Exam.setText(e);
	}
	
	/****************************************************************************************************************************/

	// ---------------- Set Course Marks ---------------- //
	public void setMod4CourseMarks(String c) {
		this.tfMod4Course.setText(c);
	}
	
	/****************************************************************************************************************************/

}
