package bankingApp.display;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonBar extends JPanel {

	JButton Accept, Cancel, button;
	JPanel panel, secondPanel;

	public ButtonBar() {

		this.setPreferredSize(new Dimension(360, 240));
		this.setBackground(Color.blue);

		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;

		secondPanel = new JPanel();
		secondPanel.setLayout(new GridBagLayout());
		GridBagConstraints x = new GridBagConstraints();
		x.fill = GridBagConstraints.HORIZONTAL;

		panel.setBackground(Color.pink);

		button = new JButton("1");

		c.ipady = 60;
		c.ipadx = 60;
		c.gridx = 0;
		c.gridy = 0;
		panel.add(button, c);

		button = new JButton("2");
		c.ipady = 60;
		c.ipadx = 60;
		c.gridx = 1;
		c.gridy = 0;
		panel.add(button, c);

		button = new JButton("3");
		c.ipady = 60;
		c.ipadx = 60;
		c.gridx = 2;
		c.gridy = 0;
		panel.add(button, c);

		button = new JButton("4");
		c.ipady = 60;
		c.ipadx = 60;
		c.gridx = 0;
		c.gridy = 1;
		panel.add(button, c);

		button = new JButton("5");
		c.ipady = 60;
		c.ipadx = 60;
		c.gridx = 1;
		c.gridy = 1;
		panel.add(button, c);

		button = new JButton("6");
		c.ipady = 60;
		c.ipadx = 60;
		c.gridx = 2;
		c.gridy = 1;
		panel.add(button, c);

		button = new JButton("7");
		c.ipady = 60;
		c.ipadx = 40;
		c.gridx = 0;
		c.gridy = 2;
		panel.add(button, c);

		button = new JButton("8");
		c.ipady = 60;
		c.ipadx = 60;
		c.gridx = 1;
		c.gridy = 2;
		panel.add(button, c);

		button = new JButton("9");
		c.ipady = 60;
		c.ipadx = 60;
		c.gridx = 2;
		c.gridy = 2;
		panel.add(button, c);

		button = new JButton("0");
		c.ipady = 60;
		c.ipadx = 60;
		c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 3;
		panel.add(button, c);

		Cancel = new JButton("cancel");
		x.ipady = 60;
		x.ipadx = 60;
		x.weightx = .5;
		x.weighty = .5;
		x.gridwidth = 2;
		x.gridx = 0;
		x.gridy = 5;
		secondPanel.add(Cancel, x);

		Accept = new JButton("accept");
		x.ipady = 60;
		x.ipadx = 60;
		x.weightx = .5;
		x.weighty = .5;
		x.gridwidth = 2;
		x.gridx = 2;
		x.gridy = 5;
		secondPanel.add(Accept, x);

		this.add(panel);
		this.add(secondPanel);

	}
}
