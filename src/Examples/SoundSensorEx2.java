import ch.aplu.robotsim.*;

public class SoundSensorEx2
{
  public SoundSensorEx2()
  {
    int triggerLevel = 30;
    NxtRobot robot = new NxtRobot();
    Gear gear = new Gear();
    robot.addPart(gear);
    SoundSensor ss = new SoundSensor(SensorPort.S1);
    robot.addPart(ss);

    while (true)
    {
      if (ss.getValue() > triggerLevel)
        gear.forward();
    } 
  }

  public static void main (String[] args)
  {
    new SoundSensorEx2();
  }
} 
