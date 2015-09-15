import ch.aplu.robotsim.*;

public class SimMover
{	
	static int count =1;
  public SimMover()
  {
    NxtRobot robot = new NxtRobot();
    Gear gear = new Gear();
    TouchSensor ts = new TouchSensor(SensorPort.S3);
    robot.addPart(ts);
    gear.setSpeed(60);
    robot.addPart(gear);
    gear.forward();

    while (true)
    {
      if ((ts.isPressed()) && (count%2 !=0))
      {
    	
        gear.backward(900);
        gear.left(375);
        gear.forward(600);
        gear.left(400);
        gear.forward();
        count++;
        
      }
      
      if ((ts.isPressed()) && (count%2 == 0)){
    	  
    	  gear.backward(900);
          gear.right(375);
          gear.forward(600);
          gear.right(400);
          gear.forward();
          count++;
    	  
      }
      
      
    }
  }

  public static void main(String[] args)
  {
    new SimMover();
  }

  // ------------------ Environment --------------------------
  static
  {
    NxtContext.useObstacle("sprites/box.gif", 250, 250);
    NxtContext.setStartPosition(450,50);
    NxtContext.setStartDirection(180);
  }
}

