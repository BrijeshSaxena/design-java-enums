package org.trishinfotech.javaenums.example5;

enum Operator {
	ADD {
		@Override int execute(final int num1, final int num2) {
			return num1 + num2;
		}
	},
	SUBTRACT {
		@Override int execute(final int num1, final int num2) {
			return num1 - num2;
		}
	},
	MULTIPLY {
		@Override int execute(final int num1, final int num2) {
			return num1 * num2;
		}
	},
	DIVIDE {
		@Override int execute(final int num1, final int num2) {
			if (num2 != 0) {
				return num1 / num2;
			} else {
				System.out.println("Can't divide by zero.");
			}
			return 0;
		}
	};
	
	abstract int execute(int num1, int num2);
	
}

public class EnumWithDefinedFunctions {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		Operator operator = Operator.DIVIDE;
		int result = operator.execute(num1, num2);
		System.out.println("result: " + result);
	}

}
