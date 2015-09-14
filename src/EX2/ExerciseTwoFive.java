//ExerciseTwoFour.java

import ch.aplu.robotsim.*;

public class ExerciseTwoFive {

	/**
	 * @param args
	 */
	
	ExerciseTwoFive()
	{
		NxtRobot robot = new NxtRobot();
	    
		LightSensor leftSensor = new LightSensor(SensorPort.S1); //Object instantiation for left Sensor
	    LightSensor rightSensor = new LightSensor(SensorPort.S2); //Object instantiation for right Sensor
	    
	    robot.addPart(leftSensor);		//Add the sensors to robot body
	    robot.addPart(rightSensor);
	    
	    leftSensor.activate(true);		//Activate the sensors
	    rightSensor.activate(true);
	    
	    Gear gear = new Gear();			//Add the gear to the robot body
	    gear.setSpeed(30);
	    robot.addPart(gear);
	    gear.forward();
	    while (true)
	    {
	      int leftSensorValue = leftSensor.getValue();		//Get the sensor values
	      int rightSensorValue = rightSensor.getValue();
	      int diff =  leftSensorValue - rightSensorValue ;	//Compare the sensor values
	      
	      if (diff > 100)			//Right sensor is receiving more light than left, so turn right 
	      {
	        gear.left(90);
	        gear.forward();
	      }
	      
	      else if (diff < -100)		//Left sensor is receiving more light than right, so turn left
	      {
	    	  gear.right(90);
		      gear.forward();

	      }
	      
	      else
	    	  gear.forward();
	    }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExerciseTwoFive();
	}
	
	  // ------------------ Environment --------------------------
	  static
	  {
	    NxtContext.setStartPosition(350, 100);
	    NxtContext.setStartDirection(90);
	    NxtContext.useBackground("sprites/roundPath.gif");
	  }

}

