package bankingApp.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import bankingApp.display.ButtonBar;
import bankingApp.display.DisplayScreen;

public class Appframe extends JFrame {

	private DisplayScreen displayScreen;
	private ButtonBar buttons;

	Appframe() {
		this.setVisible(true);
		this.setSize(1080, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		displayScreen = new DisplayScreen();
		buttons = new ButtonBar();

		this.add(displayScreen, BorderLayout.WEST);
		this.add(buttons, BorderLayout.EAST);

	}

}