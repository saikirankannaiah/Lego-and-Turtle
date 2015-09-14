import ch.aplu.robotsim.*;


public class turtleRandom {
	
	turtleRandom(){
		
		double a = Math.random();
		TurtleRobot robot = new TurtleRobot();
		robot.setTurtleSpeed(80);
		robot.forward(80);
		if(a >0.5)
			robot.left(100);
		
		else
			robot.right(100);
		
		
	}
	
public static void main(String[] args){
	
	new turtleRandom();
}

}
