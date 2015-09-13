import ch.aplu.robotsim.*;

public class ex3RaceCourse {

	public static int count = 0;

	public ex3RaceCourse() {

		NxtRobot robot = new NxtRobot();
		ColorSensor cs1 = new ColorSensor(SensorPort.S1);
		ColorSensor cs2 = new ColorSensor(SensorPort.S2);
		Gear gear = new Gear();
		robot.addPart(gear);
		robot.addPart(cs1);
		robot.addPart(cs2);
		gear.setSpeed(80);
		gear.forward();

		while (true) {
			int rightValue = cs1.getColorID();
			int leftValue = cs2.getColorID();
			
			if (rightValue ==1 && leftValue ==1){
				count++;
				gear.rightArc(0.1);
			}
			
			
			
			if ((rightValue ==4 && leftValue ==4)|| (rightValue == 4 && leftValue !=4))
				gear.rightArc(0.1);
			else if(rightValue !=4 && leftValue ==4)
				gear.leftArc(0.1);
			/*else if(rightValue == 4 && leftValue !=4)
				gear.rightArc(0.1);*/
			
			if (count > 240)
				break;
			
			System.out.println(count);
			}
		robot.exit();
		}

	public static void main(String[] args) {

		new ex3RaceCourse();
	}

	static {
		NxtContext.setStartPosition(200, 250);
		NxtContext.setStartDirection(-90);
		NxtContext.useBackground("sprites/yellowpath.gif");
	}

}
