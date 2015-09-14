import ch.aplu.robotsim.*;


public class borderFollowListener implements LightListener {
	
	private Gear gear = new Gear();
	
	public void bright(SensorPort port, int level){
		
		gear.rightArc(0.1);
		
	}
	
	public void dark(SensorPort port, int level){
		
		gear.leftArc(0.1);
	}
	
	public borderFollowListener()
	  {
	    NxtRobot robot = new NxtRobot();

	    LightSensor ls = new LightSensor(SensorPort.S3);
	    robot.addPart(ls);
	    ls.addLightListener(this, 500);
	    ls.activate(true);
	    gear.setSpeed(30);
	    robot.addPart(gear);
	    gear.forward();
	  }
	
	
	 public static void main(String[] args)
	  {
	    new borderFollowListener();
	  }

	  static
	  {
	    NxtContext.setStartPosition(230, 490);
	    NxtContext.setStartDirection(-90);
	    NxtContext.useBackground("sprites/black_white.gif");
	  }
	
	

}
