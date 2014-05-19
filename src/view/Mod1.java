package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Module;

public class Mod1 extends JPanel {

	private JLabel lblMod1;
	private JFormattedTextField tfMod1Exam;
	private JFormattedTextField tfMod1Course;
	private Module mod1;

	/****************************************************************************************************************************/
	
	public Mod1() {

		// ---------------- Label ---------------- //

		lblMod1 = new JLabel("Module 1 NOT SELECTED");

		NumberFormat amountFormat;
		amountFormat = NumberFormat.getNumberInstance();

		tfMod1Course = new JFormattedTextField(amountFormat);
		tfMod1Course.setColumns(3);
		tfMod1Course.setToolTipText("Enter your coursework marks for Module 1");

		tfMod1Exam = new JFormattedTextField(amountFormat);
		tfMod1Exam.setColumns(3);
		tfMod1Exam.setToolTipText("Enter your exam marks for Module 1");

		// ---------------- Layout ---------------- //

		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(2,2,2,40);
		gbc.anchor = GridBagConstraints.WEST;

		gbc.weightx = 0.99;
		gbc.gridx = 0;

		this.add(lblMod1, gbc);

		gbc.weightx = 0.001;
		gbc.gridx = 1;
		this.add(tfMod1Exam, gbc);

		gbc.gridx = 2;
		this.add(tfMod1Course, gbc);

	}
	
	/****************************************************************************************************************************/
	
	// ---------------- Clear TextField ---------------- //
	public void clearFields() {
		tfMod1Course.setText("");
		tfMod1Exam.setText("");
	}
	
	/****************************************************************************************************************************/

	// ---------------- Setup Modules ---------------- //
	public void setMod(Module mod) {
		this.mod1 = mod;
		this.lblMod1.setText(mod.getModuleCode() + " " + mod.getModuleName());
		//this.tfMod1Course.setText("0");
		//this.tfMod1Exam.setText("0");
	}
	
	/****************************************************************************************************************************/
	
	// ---------------- Get Module ---------------- //
	public Module getMod() {
		return mod1;
	}
	
	/****************************************************************************************************************************/

	// ---------------- Get Exam Marks ---------------- //
	public int getMod1ExamMarks() {
		return Integer.parseInt(tfMod1Exam.getText());
	}
	
	/****************************************************************************************************************************/

	// ---------------- Get CourseMarks ---------------- //
	public int getMod1CourseMarks() {
		return Integer.parseInt(tfMod1Course.getText());
	}
	
	/****************************************************************************************************************************/

	// ---------------- Set Exam Marks ---------------- //
	public void setMod1ExamMarks(String e) {
		this.tfMod1Exam.setText(e);
	}
	
	/****************************************************************************************************************************/

	// ---------------- Set Course Marks ---------------- //
	public void setMod1CourseMarks(String c) {
		this.tfMod1Course.setText(c);
	}
	
	/****************************************************************************************************************************/

}
