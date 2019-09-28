package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot oceanbuttface = new Robot();
	oceanbuttface.hide();
	oceanbuttface.penDown();
	oceanbuttface.setPenColor(248, 24, 49);
	oceanbuttface.setSpeed(200);
	oceanbuttface.move(100);
	oceanbuttface.turn(90);
	oceanbuttface.move(100);
	oceanbuttface.turn(90);
	oceanbuttface.move(100);
	oceanbuttface.turn(90);
	oceanbuttface.move(100);
	oceanbuttface.turn(90);
	oceanbuttface.move(100);
	oceanbuttface.turn(45);
	oceanbuttface.move(50);
	oceanbuttface.turn(45);
	oceanbuttface.move(100);
	oceanbuttface.turn(135);
	oceanbuttface.move(50);
	oceanbuttface.turn(-45);
	oceanbuttface.move(100);
	oceanbuttface.turn(-135);
	oceanbuttface.move(50);
	oceanbuttface.turn(-45);
	oceanbuttface.move(100);
	oceanbuttface.penUp();
	oceanbuttface.move(50);
	
	Robot chunkyBoi = new Robot();
	chunkyBoi.penDown();
	chunkyBoi.setSpeed(420);
	for(int i=0; i<3; i++) {
		chunkyBoi.move(68);
		chunkyBoi.turn(120);
	}
	chunkyBoi.hide();
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	}
}
