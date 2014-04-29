import java.awt.*;

/**
 * Runs the Robot class
 */
public class Fenrir {
	Robot fenrir;

	private static Robot newRobot() {
		try {
			return new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static Robot newRobot(GraphicsDevice screen) {
		try {
			return new Robot(screen);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		return null;
	}
}
