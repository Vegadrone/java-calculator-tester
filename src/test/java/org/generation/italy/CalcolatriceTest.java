package org.generation.italy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
		float subtract= calcolatrice.subctract(4.6f, 9.3f);
		
		assertEquals(-4.7000003f, subtract, "Sottrazione non conforme");
	}
	
	@Test
	@DisplayName("Test divisione")
	void testDivisione() throws Exception {
		float divide= calcolatrice.divide(15, 5);
		
		assertEquals(3, divide, "Divisione non conforme");
	}
	
	@Test
	@DisplayName("Test divisione per 0")
	void testDivisioneEccezione(){
		
		assertThrows(Exception.class, () -> calcolatrice.divide(90, 0));
	}
	
	@Test
	@DisplayName("Test Moltiplicazione")
	void testMultiply() {
		float multiply = calcolatrice.multiply(4.57f, 6.37f);
		
		assertEquals(29.1109f, multiply, "Moltiplicazione non conforme");
	}
}
