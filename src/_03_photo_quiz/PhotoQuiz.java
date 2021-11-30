package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String link = "https://media.sandiegoreader.com/img/photos/2019/12/02/Screen_Shot_2019-12-02_at_11.45.30_AM_t670.png?b3f6a5d7692ccc373d56e40cf708e3fa67d9af9d";
		// 2. create a variable of type "Component" that will hold your image
		Component part;
		// 3. use the "createImage()" method below to initialize your Component
		part = createImage(link);
		// 4. add the image to the quiz window
		quizWindow.add(part);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String Q = JOptionPane.showInputDialog("Where was this photograph taken?");
		// 7. print "CORRECT" if the user gave the right answer
		if (Q.equals("San Diego")) {
			System.out.print("CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.print("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(part);
		// 10. find another image and create it (might take more than one line
		// of code)
		String link2 = "https://tbrnewsmedia.com/wp-content/uploads/2020/08/Coney-Island-Panorama-scaled.jpg";
		// 11. add the second image to the quiz window
		Component part2;
		part2 = createImage(link2);
		quizWindow.add(part2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String Q2 = JOptionPane.showInputDialog("Where was this photograph taken?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (Q2.equals("New York")) {
			System.out.print("CORRECT");
		}
		if (Q2.equals("Coney Island")) {
			System.out.print("CORRECT");
		}

		else {
			System.out.print("INCORRECT");
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
