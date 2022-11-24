package org.generation.italy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcolatriceTest {
	
	private static Calcolatrice calcolatrice;
	
	@BeforeAll
	private static void beforeAll() {
		calcolatrice = new Calcolatrice();
	}
	
	@Test
	@DisplayName("Test somma")
	void testSomma() {
		float sum = calcolatrice.add(5, 5);
		
		assertEquals(10, sum, "Somma non conforme");
	}
	
	@Test
	@DisplayName("Test sottrazione")
	void testSottrazione() {
		float subtract= calcolatrice.subctract(10, 5);
		
		assertEquals(5, subtract, "Sottrazione non conforme");
	}
	
	@Test
	@DisplayName("Test divisione")
	void testDivisione() {
		float divide= calcolatrice.divide(15, 5);
		
		assertEquals(3, divide, "Divisione non conforme");
	}
	
	@Test
	@DisplayName("Test Moltiplicazione")
	void testMultiply() {
		float multiply = calcolatrice.multiply(7, 8);
		
		assertEquals(56, multiply, "Moltiplicazione non conforme");
	}
}
