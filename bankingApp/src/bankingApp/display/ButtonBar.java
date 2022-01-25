package bankingApp.display;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonBar extends JPanel {

	JButton[] numberButtons = new JButton[10];
	JButton Accept, Cancel;
	JPanel panel;

	public ButtonBar() {

		this.setPreferredSize(new Dimension(360, 240));
		this.setBackground(Color.blue);

		Accept = new JButton("accept");

		for (int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].setFont(new Font("San-serif", Font.PLAIN, 30));
//			numberButtons[i].addActionListener((ActionListener) this);
			numberButtons[i].setFocusable(false);

		}

		panel = new JPanel();

		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		c.fill = GridBagConstraints.HORIZONTAL;

		panel.setBackground(Color.pink);

		Cancel = new JButton("cancel");
		c.ipady = 20;
		c.weightx = .5;
		c.gridwidth = 2;
		c.gridx = 0;
		c.gridy = 5;

		Accept = new JButton("accept");
		c.ipady = 20;
		c.weightx = .5;
		c.gridwidth = 2;
		c.gridx = 2;
		c.gridy = 5;

		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);

		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);

		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);

		panel.add(numberButtons[0]);

		panel.add(Accept, c);
		panel.add(Cancel, c);

		this.add(panel);

	}
}
