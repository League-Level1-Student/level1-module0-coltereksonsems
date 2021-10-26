package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot house = new Robot(50,539 );
	public void run() {
	house.setSpeed(100);
		for (int i = 0; i < 10; i++) {
			drawHouse("mixedBag");
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
	
	
	
	
	
	
	public void drawHouse (String height) {
		
		Random size = new Random();
		
		
		
		
		
		int wallHeight = 0 ;
		if (height.equals ("small")) {
			wallHeight = 60+size.nextInt(31) ;
		}
		if (height.equals ("medium")) {
			wallHeight = 120+size.nextInt(31);
		}
		if (height.equals ("large")) {
			wallHeight = 250+size.nextInt(31);
		}
		if (height.equals ("mixedBag")) {
			wallHeight = size.nextInt(250);
		}
		
		
		house.penDown();
		house.setRandomPenColor();
		house.move(wallHeight);
		house.turn(90);
		house.move(50);
		house.turn(90);
		house.move(wallHeight);
		house.turn(270);
		house.setPenColor(Color.green);
		house.move(50);
		house.turn(270);
	}
public void drawHouse (String height, Color color) {
		
		Random size = new Random();
		
		
		
		
		
		int wallHeight = 0 ;
		if (height.equals ("small")) {
			wallHeight = 60+size.nextInt(31) ;
		}
		if (height.equals ("medium")) {
			wallHeight = 120+size.nextInt(31);
		}
		if (height.equals ("large")) {
			wallHeight = 250+size.nextInt(31);
		}
		if (height.equals ("mixedBag")) {
			wallHeight = size.nextInt(250);
		}
		
		
		house.penDown();
		house.setPenColor(color);
		house.move(wallHeight);
		house.turn(90);
		house.move(50);
		house.turn(90);
		house.move(wallHeight);
		house.turn(270);
		house.setPenColor(Color.green);
		house.move(50);
		house.turn(270);
	}
		
		
		
	
	
	
	
	
	
	}

