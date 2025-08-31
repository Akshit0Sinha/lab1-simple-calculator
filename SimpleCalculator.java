
public class SimpleCalculator {
	private double value;
	private char arthOperator;

	public SimpleCalculator() {
		value = 0;
		arthOperator = '=';
	}

	public double getDisplay() {
		return value;
	}

	public void inputArthOperator(char operator) {
		arthOperator = operator;
	}

	public void inputNumber(double n) {
		switch (arthOperator) {
		case '+':
			value += n;
			break;
		case '-':
			value -= n;
			break;
		case '*':
			value *= n;
			break;
		case '/':
			if (n != 0) {
				value /= n;
			} else {
				System.out.println("error: cannot divide by 0!");
			}
			break;

		case '=':
			value = n;
			break;

		}
	}

	public void reset() {
		value = 0;
		arthOperator = '=';
	}

}
