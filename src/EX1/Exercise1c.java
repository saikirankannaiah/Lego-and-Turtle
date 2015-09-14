import ch.aplu.robotsim.*;

public class Exercise1c {

	private NxtRobot robot;
	private Gear gear;

	Exercise1c() {
		robot = new NxtRobot();
		gear = new Gear();
		init();
	}

	private void init() {
		robot.addPart(gear);
		gear.setSpeed(60);
	}
	

	public void run() {
		for(int i = 0,j = 0,k = 0;i < 4;i++ , j+=250 , k+=50) {
			gear.rightArc(0.25, 4000 + j);
			gear.left(800 + k);
			Tools.delay(1000);
		}
		
		robot.exit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1c ex1c = new Exercise1c();
		ex1c.run();

	}
	
	static
	{	//to set start position of robot.
		NxtContext.setStartPosition(50,150);
	}


}
