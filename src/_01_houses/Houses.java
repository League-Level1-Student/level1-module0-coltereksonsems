package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot house = new Robot(50,539 );
	public void run() {
	house.setSpeed(100);
		for (int i = 0; i < 10; i++) {
			drawHouse();
		}
		
		
		
		
		
		
		
		
		
	}
	public void drawHouse (int height) {
		
	
		house.penDown();
		house.setRandomPenColor();
		house.move(height);
		house.turn(90);
		house.move(50);
		house.turn(90);
		house.move(height);
		house.turn(270);
		house.setPenColor(Color.green);
		house.move(50);
		house.turn(270);
		
		
		
		
		
		
	}
	}

