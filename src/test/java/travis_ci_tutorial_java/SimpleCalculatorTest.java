package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	SimpleCalculator calc = new SimpleCalculator();
	@Test
	public void testAdd() {
		assertEquals(calc.add(1, 1), 2);
	}

	// TESTS FOR MINUS
	@Test
	public void testSubPositive() {
		assertEquals(calc.minus(5, 2), 3);
	}

	@Test
	public void testSubNegative() {
		assertEquals(calc.minus(4, -2), 6);
	}

	@Test
	public void testMultiplyNegatives() {assertEquals(calc.multiply(-1,-1),1);}
}
