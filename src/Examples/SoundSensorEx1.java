import ch.aplu.robotsim.*;

public class SoundSensorEx1 implements SoundListener
{
  private final int triggerLevel = 30;
  private Gear gear;

  public SoundSensorEx1()
  {
    NxtRobot robot = new NxtRobot();
    gear = new Gear();
    robot.addPart(gear);
    SoundSensor ss = new SoundSensor(SensorPort.S1);
    robot.addPart(ss);
    ss.addSoundListener(this, triggerLevel);
    gear.setSpeed(30);
    gear.forward();
    while (true){}
  }

  public void loud(SensorPort port, int level)
  {
    gear.right(480);
    gear.forward();
  }

  public void quiet(SensorPort port, int level)
  {
  }

  public static void main(String[] args)
  {
    new SoundSensorEx1();
  }
} 