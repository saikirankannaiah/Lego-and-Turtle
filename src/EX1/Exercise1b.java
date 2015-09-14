import ch.aplu.robotsim.*;
public class Exercise1b {

	private TurtleRobot robot;
	
	Exercise1b()
	{
		robot = new TurtleRobot();
	}
	
	public void run()
	{
		int i = 0;
		while(i < 2)
		{
			traversePath();
			i++;
		}
	}
	
	//method to traverse the path specified
	private void traversePath()
	{
		robot.forward(50);
		robot.right(90);
		robot.forward(50);
		robot.right(90);
		robot.forward(50);
		robot.left(90);
		robot.forward(50);
		robot.left(90);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1b ex1b = new Exercise1b();
		ex1b.run();
	}

}
