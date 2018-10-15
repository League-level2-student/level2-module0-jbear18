package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
int yvalue;
		// 2. create an array of 5 robots.
		Robot[] mikes = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < mikes.length; i++) {
			mikes[i] = new Robot("batman");
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			mikes[i].setX(i * 100 + 200);
			mikes[i].setY(729);

		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean atTheTop = false;
		while (!atTheTop) {
			for (Robot jessie : mikes) {
				jessie.setWindowSize(900, 1000);
				jessie.setSpeed(12);
				yvalue=jessie.getY();
				//make robot move at a random amount less than 50
				
				Random random= new Random();
				int randomint= random.nextInt(50);
			jessie.move(randomint);
				if(yvalue<=0) {
					atTheTop = true;
					JOptionPane.showMessageDialog(null, "The robot won! Congratulation!! Let's party!");
			jessie.setRandomPenColor();
					jessie.penDown();
					jessie.sparkle();
					jessie.move(-300);
					jessie.miniaturize();
				}

			}
		}
	
	
		System.exit(0);

	}
}

// 6. use a while loop to repeat step 5 until a robot has reached the top of the
// screen.

// 7. declare that robot the winner and throw it a party!

// 8. try different races with different amounts of robots.

// 9. make the robots race around a circular track.
