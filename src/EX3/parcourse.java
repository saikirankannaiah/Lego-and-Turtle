import ch.aplu.robotsim.*;


public class parcourse {
	static int count1 = 1, count2 =1;
	public parcourse()
	{
		 	NxtRobot robot = new NxtRobot();
		    Gear gear = new Gear();
		    TouchSensor ts1 = new TouchSensor(SensorPort.S3);
		    TouchSensor ts2 = new TouchSensor(SensorPort.S4);
		    robot.addPart(ts1);
		    robot.addPart(ts2);
		    gear.setSpeed(60);
		    robot.addPart(gear);
		    gear.forward();
		    
		    while (true)
		    {
		    	if ((ts1.isPressed()) &&(count1 %2 !=0)){
		    		
		    		gear.backward(900);
		    		gear.left(375);
		    		gear.backward();
		    		count1++;
		    	}
		    	
		    	if ((ts1.isPressed()) &&(count1 %2 == 0)){
		    		
		    		gear.backward(900);
		    		gear.right(375);
		    		gear.forward();
		    		count1++;
		    		count2++;
		    	}
		    	/*if ((ts2.isPressed()) &&(count1 %2 == 2)){
		    		
		    		gear.backward(900);
		    		gear.right(375);
		    		gear.forward();
		    		count1++;
		    	}*/
		    	
		    	
		    	if (ts2.isPressed() && (count2 % 2 != 0)){
		    		
		    		//gear.forward(300);
		    		//gear.left(375);
		    		gear.forward();
		    	}
		    	
		    	
		    	if ((ts2.isPressed()) &&(count2 % 2 ==0)){
		    		
		    		gear.forward(900);
		    		gear.right(375);
		    		gear.forward();
		    	}
		    	
	}
	
	}
	
	public static void main(String[] args){
		
		new parcourse();
		
	}
	static
	  {
	    NxtContext.useObstacle("sprites/parcours.gif",250, 250);
	    NxtContext.setStartPosition(320,450);
	    NxtContext.setStartDirection(-90);
	  }	
	
}
