package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public void showButton() { JFrame frame = new JFrame();
	frame.setVisible(true);
    JButton button = new JButton();
    frame.add(button);
    frame.pack();
    button.addActionListener(this);  
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	 int rand = new Random().nextInt(5);
	if (rand == 0) {
	JOptionPane.showMessageDialog(null, "Going to sleep is just logging out of your body");}
	if (rand == 1) {
		JOptionPane.showMessageDialog(null, "dunno, ask Zoltar?");}
	if (rand == 3) {
		JOptionPane.showMessageDialog(null, "You never think of something mundane until it's gone");}
	if (rand == 4) {
		JOptionPane.showMessageDialog(null, "Anything not natural tht you see, no matter how mundane was designed and revised and redesigned by someone");}
	if (rand == 5) {
		JOptionPane.showMessageDialog(null, "you will have a good day or something like that :/");}
		
}
}

