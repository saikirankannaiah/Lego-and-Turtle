import ch.aplu.robotsim.*;

public class Exercise1a {
	
	private TurtleRobot robot;
	
	Exercise1a()
	{
		robot = new TurtleRobot();
	}
	

	public void run()
	{
		visitPoint(200,180);
		Tools.delay(100);
		visitPoint(200,90);
		Tools.delay(100);
		visitPoint(200,270);
		Tools.delay(100);
		robot.exit();
	}
	
	//method to visit points 
	private void visitPoint(int distance,int rotation)
	{
		switch (rotation) {
		case 90: {
			//visit the end point 2
			robot.forward(distance / 2);
			robot.right(rotation);
			robot.forward(distance / 2);
			robot.right(rotation * 2);
			
			//return back to starting point
			robot.forward(distance / 2);
			robot.left(rotation);
			robot.forward(distance / 2);
			robot.left(rotation * 2);
		}
			break;
		case 180: {
			//visit the end point 3
			robot.forward(distance);
			robot.left(rotation);
			
			//return back to starting point
			robot.forward(distance);
			robot.left(rotation);

		}
			break;
		case 270:{
			
			//visit the end point 4
			robot.forward(distance / 2);
			robot.left(rotation / 3);
			robot.forward(distance / 2);
			robot.left( (rotation + 90) / 2);
			
			//return to starting point
			robot.forward(distance / 2);
			robot.right(rotation / 3);
			robot.forward(distance / 2);
			robot.right( (rotation +90) / 2);
		}break;

		default:
			break;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1a ex1 = new Exercise1a();
		ex1.run();
	}

}
