package simpleMultiply;

public class Test {
	private static final double TIME_INTERVAL = 7.2;
	private static final double SPEED = 1100;

	public static void main(String[] args) {
		Sound sc = new Sound();
		System.out.println(sc.calculation(TIME_INTERVAL,SPEED));
	}
	

}