import ch.aplu.robotsim.*;


public class CircleEx1 {

	CircleEx1(){
		
		NxtRobot robot = new NxtRobot();
		Gear gear = new Gear();
		robot.addPart(gear);
		gear.setSpeed(60);
		gear.leftArc(0.2, 7500);
		gear.rightArc(0.2);
		Tools.delay(5000);
		robot.exit();
		
	}

public static void main(String[] args){
	
	new CircleEx1();
}
}
