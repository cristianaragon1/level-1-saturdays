import org.jointheleague.graphical.robot.Robot;

public class robotGrafitti {
	public static void main(String[] args) {
		second();
		first();
		}
	public static void first(){
		Robot bender = new Robot();
		bender.moveTo(650,500);
		bender.setAngle(-90);
		bender.penDown();
		for (int i = 0; i < 180; i++) {
			bender.move(2);
			bender.turn(1);
		}
		
	}
	public static void second(){
		Robot goldenBender = new Robot();
		goldenBender.moveTo(800, 500);
		//goldenBender.setSpeed(1000);
		goldenBender.setAngle(55);
		goldenBender.penDown();
		goldenBender.move(200);
		goldenBender.turn(90);
		goldenBender.move(50);
		goldenBender.turn(80);
		goldenBender.move(200);
		goldenBender.turn(-180);
		goldenBender.move(120);
		goldenBender.turn(-80);
		goldenBender.move(100);
	}
	}
