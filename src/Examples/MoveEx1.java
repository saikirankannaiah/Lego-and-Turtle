
// MoveEx1.java

import ch.aplu.robotsim.*;

class MoveEx1
{
  MoveEx1()
  {
    TurtleRobot robot = new TurtleRobot();
    robot.forward(100);
    robot.left(90);
    robot.forward(50);
    robot.right(90);
    robot.forward(50); 
    robot.exit();
  }

  public static void main(String[] args)
  {
    new MoveEx1();
  }
} 