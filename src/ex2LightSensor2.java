import ch.aplu.robotsim.*;


public class ex2LightSensor2 implements LightListener {
	
	 private final int triggerLevel = 500;
	 private Gear gear;
	 static int strips = 0;
	
public ex2LightSensor2(){
	
		NxtRobot robot = new NxtRobot();
		LightSensor ls = new LightSensor(SensorPort.S3);
		robot.addPart(ls);
		ls.addLightListener(this, triggerLevel);
		ls.activate(true);
		gear = new Gear();
		robot.addPart(gear);
		gear.setSpeed(50);
		gear.forward(); 		
}

public void bright(SensorPort port, int level)
{
}

public void dark(SensorPort port, int level)
{
	strips = strips +1;
	System.out.println(strips);
	
	
}


public static void main(String[] args){
	new ex2LightSensor2();
}

static
{
	NxtContext.setStartPosition(500, 200);
	NxtContext.setStartDirection(-180);
	NxtContext.useBackground("sprites/panel.gif");
}

}
