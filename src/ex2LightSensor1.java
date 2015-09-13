import ch.aplu.robotsim.*;

public class ex2LightSensor1 {
	
	public ex2LightSensor1(){
		
		NxtRobot robot = new NxtRobot();
		LightSensor ls = new LightSensor(SensorPort.S3);
		robot.addPart(ls);
		ls.activate(true);
		Gear gear = new Gear();
		robot.addPart(gear);
		gear.setSpeed(50);
		gear.forward();
		
		while(true)
		{
			
			int v = ls.getValue();
			
			if(v < 500){
				
				gear.left(1200);
				gear.forward();
				
		}
		}
		
	}
	
public static void main(String[] args){
	new ex2LightSensor1();
}

static
{
	NxtContext.setStartPosition(250, 200);
	NxtContext.setStartDirection(-180);
	NxtContext.useBackground("sprites/blackPanels.gif");
}

}
