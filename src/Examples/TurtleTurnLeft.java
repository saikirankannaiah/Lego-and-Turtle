import ch.aplu.robotsim.*;


public class TurtleTurnLeft {
	
		TurtleTurnLeft(){
			
			TurtleRobot robot = new TurtleRobot();
			robot.forward(200);
			robot.left(90);
			robot.forward(200);
			robot.exit();
			
		}
		
		
public static void main(String[] args){
	
	new TurtleTurnLeft();
}
}
