import ch.aplu.robotsim.*;

public class SimMover
{
  public SimMover()
  {
    NxtRobot robot = new NxtRobot();
    Gear gear = new Gear();
    TouchSensor ts = new TouchSensor(SensorPort.S3);
    robot.addPart(ts);
    gear.setSpeed(30);
    robot.addPart(gear);
    gear.forward();
    int i = 1;

    while (true)
    {
      if (ts.isPressed())
      {
        gear.backward(800);

        if (i % 2 == 1)    // odd lines, turn left
        {
          gear.left(480);
          gear.forward(800);
          gear.left(480);
        }
        else                // even lines, turn right
        {
          gear.right(480);
          gear.forward(800);
          gear.right(480);
        }
        gear.forward();
        i++;   
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
    NxtContext.setStartPosition(480, 475);
    NxtContext.setStartDirection(-90);
  }
}