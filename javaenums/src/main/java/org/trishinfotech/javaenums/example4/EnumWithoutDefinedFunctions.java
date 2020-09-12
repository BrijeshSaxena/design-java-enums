package org.trishinfotech.javaenums.example4;

enum Operator {
	ADD, SUBTRACT, MULTIPLY, DIVIDE;
}

public class EnumWithoutDefinedFunctions {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		Operator operator = Operator.DIVIDE;
		int result = 0;
		switch (operator) {
		case ADD:
			result = num1 + num2;
			break;
		case SUBTRACT:
			result = num1 - num2;
			break;
		case MULTIPLY:
			result = num1 * num2;
			break;
		case DIVIDE:
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Can't divide by zero.");
			}
			break;
		}
		System.out.println("result: " + result);
	}
}
