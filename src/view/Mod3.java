package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Module;

public class Mod3 extends JPanel {

	private JLabel lblmod3;
	private JFormattedTextField tfMod3Course, tfMod3Exam;
	private Module mod3;
	
	/****************************************************************************************************************************/

	public Mod3() {
		// ---------------- Label ---------------- //

		lblmod3 = new JLabel("Module 3 NOT SELECTED");

		NumberFormat amountFormat;
		amountFormat = NumberFormat.getNumberInstance();

		tfMod3Course = new JFormattedTextField(amountFormat);
		tfMod3Course.setColumns(3);
		tfMod3Course.setToolTipText("Enter your coursework marks for Module 3");

		tfMod3Exam = new JFormattedTextField(amountFormat);
		tfMod3Exam.setColumns(3);
		tfMod3Exam.setToolTipText("Enter your exam marks for Module 3");

		// ---------------- Layout ---------------- //

		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(2,2,2,40);
		gbc.anchor = GridBagConstraints.WEST;

		gbc.weightx = 0.99;
		gbc.gridx = 0;
		this.add(lblmod3, gbc);

		gbc.weightx = 0.001;
		gbc.gridx = 1;
		this.add(tfMod3Exam, gbc);


		gbc.gridx = 2;
		this.add(tfMod3Course, gbc);
	}
	
	/****************************************************************************************************************************/

	// ---------------- Clear TextField ---------------- //
	public void clearFields() {
		tfMod3Course.setText("");
		tfMod3Exam.setText("");
	}
	
	/****************************************************************************************************************************/

	// ---------------- Setup Modules ---------------- //
	public void setMod(Module mod) {
		this.mod3 = mod;
		this.lblmod3.setText(mod.getModuleCode() + " " + mod.getModuleName());
		//this.tfMod3Course.setText("0");
		//this.tfMod3Exam.setText("0");
	}
	
	/****************************************************************************************************************************/

	// ---------------- Get Module ---------------- //
	public Module getMod3() {
		return mod3;
	}
	
	/****************************************************************************************************************************/

	// ---------------- Get Exam Marks ---------------- //
	public int getMod3ExamMarks() {
		return Integer.parseInt(tfMod3Exam.getText());
	}
	
	/****************************************************************************************************************************/

	// ---------------- Get CourseMarks ---------------- //
	public int getMod3CourseMarks() {
		return Integer.parseInt(tfMod3Course.getText());
	}
	
	/****************************************************************************************************************************/

	// ---------------- Set Exam Marks ---------------- //
	public void setMod3ExamMarks(String e) {
		this.tfMod3Exam.setText(e);
	}
	
	/****************************************************************************************************************************/

	// ---------------- Set Course Marks ---------------- //
	public void setMod3CourseMarks(String c) {
		this.tfMod3Course.setText(c);
	}
	
	/****************************************************************************************************************************/

}
