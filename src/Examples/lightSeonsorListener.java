import ch.aplu.robotsim.*;


public class lightSeonsorListener implements LightListener {
	
	private final int triggerLevel = 500;
	private Gear gear;
	
	public lightSeonsorListener(){
		
		NxtRobot robot = new NxtRobot();
		gear = new Gear();
		robot.addPart(gear);
		LightSensor ls = new LightSensor(SensorPort.S3);
		robot.addPart(ls);
		ls.addLightListener(this, triggerLevel);
		ls.activate(true);
		gear.setSpeed(30);
		gear.forward();	
		
	}
	
	public void bright(SensorPort port, int level){
		
		gear.backward(800);
		gear.left(480);
		gear.forward();
		
	}
	
	public void dark(SensorPort port, int level){
		
	}
	
	public static void main(String[] args){
		
		new lightSeonsorListener();
	}
	
static{
	NxtContext.setStartPosition(250,200);
	NxtContext.setStartDirection(-90);
	NxtContext.useBackground("sprites/blackSquare.gif");
}
}
