package br.com.web.model;

public class Calculator {
	
	public static float result(int number1, int number2, Operation operation) {
		
		float value = 0;
		
		switch(operation) {
		case DIVIDE:
			value = number1/number2;
			break;
		case MULTIPLY:
			value = number1 * number2;
			break;
		case SUM:
			value = number1 + number2;
			break;
		case SUBTRACT:
			value = number1 - number2;
			break;
		}
		
		return value;
	}
	
}
