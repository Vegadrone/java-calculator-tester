package org.generation.italy;

public class Calcolatrice {
	
	public float add (float num1,  float num2) {
		return num1 + num2;
	}
	
	public float subctract (float num1, float num2) {
		return num1 - num2;
	}
	
	public float divide(float num1, float num2) throws Exception {
		if(num2 == 0) {
			throw new Exception ("Non puoi dividere per 0");
		}
		return num1 / num2;
		
	}
	
	public float multiply(float num1, float num2) {
		return num1 * num2;
	}
}
