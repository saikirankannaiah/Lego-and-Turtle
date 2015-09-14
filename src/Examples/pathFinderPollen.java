import ch.aplu.robotsim.*;

public class pathFinderPollen {

  public pathFinderPollen()
  {
    NxtRobot robot = new NxtRobot();
    Gear gear = new Gear();
    LightSensor ls1 = new LightSensor(SensorPort.S1); // right
    LightSensor ls2 = new LightSensor(SensorPort.S2); // left
    robot.addPart(gear);
    robot.addPart(ls1);
    robot.addPart(ls2);
    gear.forward();

    while (true)
    {
      int rightValue = ls1.getValue();
      int leftValue = ls2.getValue();
      int d = rightValue - leftValue;
      if (d > 100) // left dark , turn right
        gear.rightArc(0.1);
      if (d < -100) // right dark, turn left
        gear.leftArc(0.1);
      if (d > -100 && d < 100 && rightValue > 500)
        gear.forward();
    }
  }

  public static void main(String[] args)
  {
    new pathFinderPollen();
  }

  // ------------------ Environment --------------------------
  static
  {
    NxtContext.setStartPosition(250, 490);
    NxtContext.setStartDirection(-90);
    NxtContext.useBackground("sprites/path.gif");
  }
} 

