package de.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends Frame {

	public Fenster() {
		setSize(300, 300);
		
		Button button = new Button("Dr�ck mich");
		button.addActionListener(e->buttonPressed());
		add(button);
		
		setVisible(true);
	}
	
	private void buttonPressed() {
		System.out.println("Buttom wurde gedr�ckt");
		
	}
	
	
	public static void main(String[] args) {
		new Fenster();

	}

}
