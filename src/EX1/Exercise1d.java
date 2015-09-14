import ch.aplu.robotsim.*;

public class Exercise1d {

	private TurtleRobot robot;

	Exercise1d() {

		robot = new TurtleRobot();
		robot.setTurtleSpeed(80);
	}

	public void square(int rotation) {
		switch (rotation) {
		case 0: {

			for (int i = 0; i < 4; i++) {
				robot.forward(100);
				robot.right(90);

			}

		}
			break;
		case 90: {

			for (int i = 0; i < 4; i++) {
				robot.forward(100);
				robot.left(90);
			}

		}
			break;
		case 180: {

			for (int i = 0; i < 4; i++) {
				robot.left(90);
				robot.forward(100);
			}

		}
			break;
		case 270: {

			for (int i = 0; i < 4; i++) {
				robot.right(90);
				robot.forward(100);

			}

		}
			break;
		default:
			break;
		}
	}

	public void run() {
		for (int i = 0; i < 360; i += 90) {
			square(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1d ex1d = new Exercise1d();
		ex1d.run();
	}

}
