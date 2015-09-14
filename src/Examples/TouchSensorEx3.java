// TouchSensorEx3.java

import ch.aplu.robotsim.*;

public class TouchSensorEx3
{
  public TouchSensorEx3()
  {
    NxtRobot robot  = new NxtRobot();
    Gear gear = new Gear();
    robot.addPart(gear);
    TouchSensor ts1 = new TouchSensor(SensorPort.S1); // right
    TouchSensor ts2 = new TouchSensor(SensorPort.S2); // left
    robot.addPart(ts1);
    robot.addPart(ts2);
    gear.setSpeed(30);
    gear.forward();

    while (true)
    {
      if (ts1.isPressed())
      {
        gear.backward(1000);
        gear.left(200);
      }
      else if (ts2.isPressed())
      {
        gear.backward(1000);
        gear.right(300);
      }
    gear.forward();
    }
  }

  public static void main(String[] args)
  {
    new TouchSensorEx3();
  }
  // ------------------ Environment --------------------------
  static
  {
    NxtContext.useObstacle("sprites/obstacle.gif", 250, 250);  //draws a green frame around the window's edge
    NxtContext.setStartPosition(380,380);
    NxtContext.setStartDirection(-120);  //sets the starting direction of the robot
  }
}