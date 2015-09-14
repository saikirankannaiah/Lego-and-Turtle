import ch.aplu.robotsim.*;


public class turtleRobotSquare {
	
	turtleRobotSquare(){
		
		TurtleRobot robot = new TurtleRobot();
		
		int count =0;
		
		while(count <=8){
			
			robot.setTurtleSpeed(80);
			robot.forward(200);
			robot.right(90);
			
		}
		
		robot.exit();
		
	}
	
public static void main(String[] args){
	
	new turtleRobotSquare();
}

}
