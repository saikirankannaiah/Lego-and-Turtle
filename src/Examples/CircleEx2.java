import ch.aplu.robotsim.*;


public class CircleEx2 {
	
	CircleEx2(){
		
		NxtRobot robot = new NxtRobot();
		Motor motA = new Motor(MotorPort.A);
		Motor motB = new Motor(MotorPort.B);
		robot.addPart(motA);
		robot.addPart(motB);
		motA.setSpeed(60);
		motB.setSpeed(30);
		motA.forward();
		motB.forward();
		Tools.delay(7000);
		robot.exit();
		
	}
public static void main(String[] args){
	
	new CircleEx2();
}
}
