package br.com.web.model;

public enum Operation {
	
	SUM('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/');
	
	private final char operator;
	
	Operation(char operator) {
		this.operator = operator;
	}
	
	public static Operation valueOf(char operator) {
			
		if (operator == SUM.operator) {
			return SUM;
		} 
		
		if (operator == DIVIDE.operator) {
			return DIVIDE;
		}
		
		if (operator == MULTIPLY.operator) {
			return MULTIPLY;
		}
		
		return SUBTRACT;
	}
	
	
	
	
}
