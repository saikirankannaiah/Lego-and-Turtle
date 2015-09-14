import ch.aplu.robotsim.*;


public class lightSensorPollen {
	
	public lightSensorPollen(){
	
		NxtRobot robot = new NxtRobot();
		LightSensor ls = new LightSensor(SensorPort.S3);
		robot.addPart(ls);
		ls.activate(true);
		Gear gear = new Gear();
		gear.setSpeed(30);
		robot.addPart(gear);
		gear.forward();
		
		while(true){
			
			int v = ls.getValue();
			if (v < 500){
				
				gear.backward(3500);
				gear.left(480);
				gear.forward();
				
			}
		}
		
		
	}
	
public static void main(String[] args){
	
	new lightSensorPollen();
}

static
{
	NxtContext.setStartPosition(250,200);
	NxtContext.setStartDirection(-90);
	NxtContext.useBackground("sprites/whiteCircle.gif");
}

}
