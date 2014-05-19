package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Course;
import model.Module;
import model.StudentProfile;

import view.CSPTab;
import view.GUI;
import view.IMMTab;
import view.ORTab;
import view.MenuBar;

public class CSPController {

	private CSPTab firstTab;
	private IMMTab secondTab;
	private ORTab thirdTab;
	private StudentProfile stuPro;
	private MenuBar menu;


	/****************************************************************************************************************************/
	
	// ---------------- Create Student Profile Constructor ---------------- /
	public CSPController(GUI mainFrame, StudentProfile studentPro) {

		this.stuPro = studentPro;
		this.firstTab = mainFrame.getCSPTab();
		this.secondTab = mainFrame.getIMMTab();
		this.thirdTab = mainFrame.getORTab();
		this.menu = mainFrame.getMenu();

		firstTab.populateComboBox(setupAndGetCourses());
		firstTab.btnCreate(new cspHand());

		secondTab.getFooter().btnClear(new clear());
		secondTab.getFooter().btnSubmit(new submit());

		menu.loadStuPro(new load());
		menu.saveStuPro(new save());
		menu.exit(new exit());
		menu.about(new about());

	}			

	/****************************************************************************************************************************/

	// ---------------- Submit Button ---------------- //
	private class submit implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			passingMarks();
			//System.out.println(stuPro.toString());
			thirdTab.setOverviewText(stuDetail());
		}

	}

	/****************************************************************************************************************************/

	// ---------------- Load Menu ---------------- //
	private class load implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				readFromFile();
			} catch (IOException e1) {
				e1.printStackTrace();
				System.out.println("Error loading the Student Profile ");
			}

		}

	}

	/****************************************************************************************************************************/	
	
	// ---------------- Read Data ---------------- //
	private void readFromFile() throws IOException {


		FileReader fr = new FileReader("StudentProfile");
		BufferedReader textReader = new BufferedReader(fr);

		int numberOfLines = 12;
		String[] textData = new String[numberOfLines];

		int i;
		for (i=0; i<numberOfLines; i++) {
			textData[i] = textReader.readLine();
			//System.out.println(textData[i]);
		}

		i=0;
		firstTab.setCourse(textData[0]);
		firstTab.setName(textData[1]);		
		firstTab.setpNumber(textData[2]);
		secondTab.getMod1().setMod1ExamMarks(textData[3]);
		secondTab.getMod1().setMod1CourseMarks(textData[4]);
		secondTab.getMod2().setMod2ExamMarks(textData[5]);
		secondTab.getMod2().setMod2CourseMarks(textData[6]);
		secondTab.getMod3().setMod3ExamMarks(textData[7]);
		secondTab.getMod3().setMod3CourseMarks(textData[8]);
		secondTab.getMod4().setMod4ExamMarks(textData[9]);
		secondTab.getMod4().setMod4CourseMarks(textData[10]);
		stuPro.setCourse(firstTab.getSelectedCourse());
		setUpModules();
		passingMarks();
		stuDetail();
		thirdTab.setOverviewText(stuDetail());
		textReader.close();

		/*
		for (i=0; i<12; i++) {
			System.out.println(textData[i]);
		}
		 */
	}

	/****************************************************************************************************************************/

	// ---------------- Save Menu ---------------- //
	private class save implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				writeToFile();
			} catch (IOException e1) {
				e1.printStackTrace();
				System.out.println("Error saving the Student Profile ");
			}
		}

	}

	/****************************************************************************************************************************/

	// ---------------- Write Data ---------------- //
	private void writeToFile() throws IOException {
		FileWriter write = new FileWriter("StudentProfile");
		PrintWriter printLine = new PrintWriter(write);

		printLine.println(firstTab.getSelectedCourse());
		printLine.println(firstTab.getInputtedName());
		printLine.println(firstTab.getInputtedPnum());

		printLine.println(secondTab.getMod1().getMod1ExamMarks());
		printLine.println(secondTab.getMod1().getMod1CourseMarks());

		printLine.println(secondTab.getMod2().getMod2ExamMarks());
		printLine.println(secondTab.getMod2().getMod2CourseMarks());

		printLine.println(secondTab.getMod3().getMod3ExamMarks());
		printLine.println(secondTab.getMod3().getMod3CourseMarks());

		printLine.println(secondTab.getMod4().getMod4ExamMarks());
		printLine.println(secondTab.getMod4().getMod4CourseMarks());

		printLine.close();
	}

	/****************************************************************************************************************************/	
	
	// ---------------- Exit Menu ---------------- //
	private class exit implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}	
	}

	/****************************************************************************************************************************/	

	// ---------------- About Menu ---------------- //
	private class about implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Welcome to about page\nThis application is made for educatonal purpose only." +
					"\nMade by P12214763");
		}

	}

	/****************************************************************************************************************************/	

	
	private Course[] setupAndGetCourses() {
		Module ctec2121 = new Module("CTEC2121", "Organisations, Project Management and Research");
		Module ctec2122 = new Module("CTEC2122", "Forensics and Security");
		Module ctec2602 = new Module("CTEC2602", "OO Software Design and Development"); 
		Module ctec2701 = new Module("CTEC2701", "Multi-tier Web Applications");
		Module ctec2901 = new Module("CTEC2901", "Data Structures and Algorithms"); 
		Module lawg2003 = new Module("LAWG2003", "Issues in Criminal Justice");
		//Module courseNotSelected = new Module("CourseNotSelected", "CourseNotSelected");

		Course compSci = new Course("Computer Science"); 
		compSci.addModule(ctec2121); 
		compSci.addModule(ctec2602); 
		compSci.addModule(ctec2701); 
		compSci.addModule(ctec2901);

		Course softEng = new Course("Software Engineering"); 
		softEng.addModule(ctec2121); 
		softEng.addModule(ctec2602); 
		softEng.addModule(ctec2701); 
		softEng.addModule(ctec2901);

		Course compSecu = new Course("Computer Security"); 
		compSecu.addModule(ctec2121); 
		compSecu.addModule(ctec2122); 
		compSecu.addModule(ctec2701); 
		compSecu.addModule(ctec2901);

		Course forenComp = new Course("Forensic Computing"); 
		forenComp.addModule(ctec2121); 
		forenComp.addModule(ctec2122); 
		forenComp.addModule(ctec2701); 
		forenComp.addModule(lawg2003);

		//Course select = new Course("Select Course");
		//select.addModule(courseNotSelected);	

		Course[] courses = new Course[4]; 
		courses[0] = compSci;
		courses[1] = softEng;
		courses[2] = compSecu;
		courses[3] = forenComp;
		//courses[0] = select;

		return courses;
	}

	/****************************************************************************************************************************/

	// ---------------- Settingup Modules ---------------- //
	private void setUpModules() {
		int i = 0;
		for (Module m :stuPro.getCourse().getModules()){ 
			switch(i) {
			case 0: secondTab.getMod1().setMod(m); break;
			case 1: secondTab.getMod2().setMod(m); break;
			case 2: secondTab.getMod3().setMod(m); break;
			case 3: secondTab.getMod4().setMod(m); break;
			}
			i++;
		}
	}

	/****************************************************************************************************************************/

	// ---------------- Sending Marks ---------------- //
	private void passingMarks() {
		ArrayList<Integer> CourseMark = new ArrayList<Integer>();
		CourseMark.add(secondTab.getMod1().getMod1CourseMarks());
		CourseMark.add(secondTab.getMod2().getMod2CourseMarks());
		CourseMark.add(secondTab.getMod3().getMod3CourseMarks());
		CourseMark.add(secondTab.getMod4().getMod4CourseMarks());

		ArrayList<Integer> ExamMark = new ArrayList<Integer>();
		ExamMark.add(secondTab.getMod1().getMod1ExamMarks());		
		ExamMark.add(secondTab.getMod2().getMod2ExamMarks());
		ExamMark.add(secondTab.getMod3().getMod3ExamMarks());			
		ExamMark.add(secondTab.getMod4().getMod4ExamMarks());

		int i = 0;
		int j = 0;
		for (Module m : stuPro.getCourse().getModules()) {
			m.setCwkMark(CourseMark.get(i));
			m.setExamMark(ExamMark.get(j));
			i++;
			j++;
		}
	}

	/****************************************************************************************************************************/

	// ---------------- ORTab text ---------------- //
	private String stuDetail() {
		return "Name: " + stuPro.getStudentName() + "\nPnumber: " + stuPro.getpNumber() +
				"\nCourse: " + stuPro.getCourse() + "\n\n" +
				"2nd year Average:\n===================\nCredit Passed: " + 
				stuPro.getCourse().creditsPassed() + 
				"\nYear Average Mark: " + stuPro.getCourse().yearAverageMark();

	}

	/****************************************************************************************************************************/

	// ---------------- Create Student Profile Handler ---------------- //
	private class cspHand implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			stuPro.setCourse(firstTab.getSelectedCourse());
			stuPro.setStudentName(firstTab.getInputtedName());
			stuPro.setpNumber(firstTab.getInputtedPnum());

			setUpModules();
		}
	}

	/****************************************************************************************************************************/

	// ---------------- Clear Button ---------------- //
	private class clear implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			secondTab.getMod1().clearFields();
			secondTab.getMod2().clearFields();
			secondTab.getMod3().clearFields();
			secondTab.getMod4().clearFields();
		}	
	}

	/****************************************************************************************************************************/	

}