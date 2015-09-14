import ch.aplu.robotsim.*;



public class TurnLeft {
	
	TurnLeft()
	{
		NxtRobot robot = new NxtRobot();
		Gear gear = new Gear();
		robot.addPart(gear);
		gear.setSpeed(30);
		gear.forward(2000);
		gear.left(480);
		gear.forward(2000);
		robot.exit();
	}
	
public static void main(String[] args){
	
	new TurnLeft();
}

}
