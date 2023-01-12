package model;

public class SampleController {
	public static void main(String []args) {
		Robot robo = RobotFactory.createRobot("schoo");

		System.out.println("ロボット「" + robo.getName() + "」の製造が完了しました。");
	}

}
