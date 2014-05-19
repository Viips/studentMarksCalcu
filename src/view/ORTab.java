package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class ORTab extends JPanel {

	private JTextArea taOverResult;

	public ORTab() {

		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		taOverResult = new JTextArea(15,30);
		taOverResult.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
//		if (pass) {
//			setBackground(Color.pink);
//		}

		this.add(taOverResult, gbc);

	}


	public void setOverviewText(String text) {
		taOverResult.setText(text);
	}
	
}