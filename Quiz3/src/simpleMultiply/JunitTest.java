package simpleMultiply;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTest {
	private static final double TIME_INTERVAL = 7.2;
	private static final double SPEED = 1100;

	@Test
	void test() {
		Sound sc = new Sound();
		assertEquals(7920.0,sc.calculation(TIME_INTERVAL,SPEED)," ");

	}

}