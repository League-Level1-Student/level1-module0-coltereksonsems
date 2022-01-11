package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	public void showButton() { JFrame frame = new JFrame(); 		
	frame.setVisible(true);
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	panel.add(button1);
	button1.addActionListener(this);
	JButton button2 = new JButton();
	panel.add(button2);
	button2.addActionListener(this);
	JButton button3 = new JButton();
	panel.add(button3);
	frame.add(panel);
	frame.pack();
	button3.addActionListener(this);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}}
