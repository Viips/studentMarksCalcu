package view;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Course;

public class CSPTab extends JPanel {
	private JLabel lblCourse, lblStudentName, lblPNo;
	private JComboBox<Course> cmbCourse;
	private JTextField tfStudentName, tfPNo;
	private JButton btnCreate;

	/****************************************************************************************************************************/	

	public CSPTab() {
		
		// ---------------- Labels ---------------- //
		
		lblCourse = new JLabel("Course: ");
		lblStudentName = new JLabel("Student Name: ");
		lblPNo = new JLabel("Student P No: ");
		
		// ---------------- ComboBox ---------------- //
		
		cmbCourse = new JComboBox();

		// ---------------- TextFields ---------------- //
		
		tfStudentName = new JTextField(15);
		tfStudentName.setToolTipText("Enter your full name here!");

		tfPNo = new JTextField(6);
		tfStudentName.setToolTipText("Enter your pnumber here!");

		// ---------------- Button ---------------- //
		
		btnCreate = new JButton("Create Profile");
		btnCreate.setToolTipText("Create profile for the user");

		// ---------------- Layout ---------------- //
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10,2,2,40);

		gbc.anchor = GridBagConstraints.WEST;

		this.add(lblCourse, gbc);

		gbc.gridx = 1;
		this.add(cmbCourse, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		this.add(lblStudentName, gbc);

		gbc.gridx = 1;
		this.add(tfStudentName, gbc);

		gbc.gridy = 2;
		gbc.gridx = 0;
		this.add(lblPNo, gbc);

		gbc.gridx = 1;
		this.add(tfPNo, gbc);

		gbc.gridy = 3;
		this.add(btnCreate, gbc);

	}

	/****************************************************************************************************************************/	

	// ---------------- Populate ComboBox ---------------- //
	public void populateComboBox(Course[] courses) { 
		for (Course c : courses) {
			cmbCourse.addItem(c);
		} 
	}

	/****************************************************************************************************************************/

	// ---------------- Create Button ---------------- //
	public void btnCreate(ActionListener crt) {
		btnCreate.addActionListener(crt);
	}

	/****************************************************************************************************************************/	

	// ---------------- Get Course ---------------- //
	public Course getSelectedCourse() {
		return (Course) cmbCourse.getSelectedItem();
	}

	/****************************************************************************************************************************/

	// ---------------- Get Name ---------------- //
	public String getInputtedName() {
		return tfStudentName.getText();
	}

	/****************************************************************************************************************************/	

	// ---------------- Get Pnumber ---------------- //
	public String getInputtedPnum() {
		return tfPNo.getText();
	}

	/****************************************************************************************************************************/	

	//	public CSPTab getCSPTab() {
	//		return cspTab;
	//	}
	//	
	//	public StudentProfile getSP() {
	//		return sp;
	//	}

	/****************************************************************************************************************************/
	
	// ---------------- Set Course ---------------- //
	public void setCourse(String name) {
		//System.out.println("String " + name + name.length());

		if (name.equals("Computer Science")) { 
			this.cmbCourse.setSelectedIndex(0);
		}
		else if (name.equals("Software Engineering")) {
			this.cmbCourse.setSelectedIndex(1);
		}
		else if (name.equals("Computer Security")) {
			this.cmbCourse.setSelectedIndex(2);
		}
		else if (name.equals("Forensic Computing")) {
			this.cmbCourse.setSelectedIndex(3);
		}
		else this.cmbCourse.setSelectedIndex(-1);
	}

	/****************************************************************************************************************************/	

	// ---------------- Set Name ---------------- //
	public void setName(String name) {
		this.tfStudentName.setText(name);
	}

	/****************************************************************************************************************************/

	// ---------------- Set Pnumber ---------------- //
	public void setpNumber(String name) {
		this.tfPNo.setText(name);
	}

	/****************************************************************************************************************************/

}









