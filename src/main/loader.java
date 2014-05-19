package main;

import view.GUI;
import controller.CSPController;
import model.Module;
import model.StudentProfile;

public class loader {

	public static void main(String [] args)
	{
		GUI view = new GUI();
		StudentProfile sp = new StudentProfile();
		CSPController cspCont = new CSPController(view, sp);

	}

}
