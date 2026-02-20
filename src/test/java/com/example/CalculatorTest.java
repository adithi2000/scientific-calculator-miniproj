package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest{
	Calculator calc = new Calculator();
	@Test
	void testSquareRoot(){
		assertEquals(4.0,calc.squareRoot(16));
	}
	@Test
	void testFactorial(){
		assertEquals(120,calc.factorial(5));
	}
	 @Test
	 void testLog(){
		 assertEquals(1.0,calc.naturalLog(Math.E));
	 }
	 @Test
	 void testPow(){
		 assertEquals(8.0,calc.power(2,3));
	 }
}

