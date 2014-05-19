package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Module;

public class Mod2 extends JPanel {

	private JLabel lblMod2;
	private JFormattedTextField tfMod2Course, tfMod2Exam;
	private Module mod2;

	/****************************************************************************************************************************/
	
	public Mod2() {

		// ---------------- Label ---------------- //

		lblMod2 = new JLabel("Module 2 NOT SELECTED");

		NumberFormat amountFormat;
		amountFormat = NumberFormat.getNumberInstance();

		tfMod2Course = new JFormattedTextField(amountFormat);
		tfMod2Course.setColumns(3);
		tfMod2Course.setToolTipText("Enter your coursework marks for Module 2");

		tfMod2Exam = new JFormattedTextField(amountFormat);
		tfMod2Exam.setColumns(3);
		tfMod2Exam.setToolTipText("Enter your exam marks for Module 2");

		// ---------------- Layout ---------------- //

		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(2,2,2,40);
		gbc.anchor = GridBagConstraints.WEST;


		gbc.weightx = 0.99;
		gbc.gridx = 0;
		this.add(lblMod2, gbc);

		gbc.weightx = 0.001;
		gbc.gridx = 1;
		this.add(tfMod2Exam, gbc);

		gbc.gridx = 2;
		this.add(tfMod2Course, gbc);
	}
	
	/****************************************************************************************************************************/

	// ---------------- Clear TextField ---------------- //
	public void clearFields() {
		tfMod2Course.setText("");
		tfMod2Exam.setText("");
	}

	/****************************************************************************************************************************/
	
	// ---------------- Setup Modules ---------------- //
	public void setMod(Module mod) {
		this.mod2 = mod;
		this.lblMod2.setText(mod.getModuleCode() + " " + mod.getModuleName());
		//this.tfMod2Course.setText("0");
		//this.tfMod2Exam.setText("0");
	}
	
	/****************************************************************************************************************************/

	// ---------------- Get Module ---------------- //
	public Module getMod2() {
		return mod2;
	}
	
	/****************************************************************************************************************************/

	// ---------------- Get Exam Marks ---------------- //
	public int getMod2ExamMarks() {
		return Integer.parseInt(tfMod2Exam.getText());
	}
	
	/****************************************************************************************************************************/

	// ---------------- Get CourseMarks ---------------- //
	public int getMod2CourseMarks() {
		return Integer.parseInt(tfMod2Course.getText());
	}
	
	/****************************************************************************************************************************/
	
	// ---------------- Set Exam Marks ---------------- //
	public void setMod2ExamMarks(String e) {
		this.tfMod2Exam.setText(e);
	}
	
	/****************************************************************************************************************************/

	// ---------------- Set Course Marks ---------------- //
	public void setMod2CourseMarks(String c) {
		this.tfMod2Course.setText(c);
	}
	
	/****************************************************************************************************************************/

}
