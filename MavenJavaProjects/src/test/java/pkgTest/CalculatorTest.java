package pkgTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pkgcalculator.Calculator;

public class CalculatorTest {
    public static Calculator objCalculator;
	@Before
	public void setUp() throws Exception {
		objCalculator=new Calculator();
	}
	@After
    public void tearDown() throws Exception{
    	System.out.println("Closing");
    }
	@Test
	public void additionTest() {
		assertEquals(25,objCalculator.addition(12,13));
	}
	public void subtractionTest() {
		assertEquals(-1,objCalculator.subtraction(12,13));
	}
	public void multiplicationTest() {
		assertEquals(156,objCalculator.multiplication(12,13));
	}
	public void divisionTest() {
		assertEquals(0,objCalculator.division(12,13));
	}

}