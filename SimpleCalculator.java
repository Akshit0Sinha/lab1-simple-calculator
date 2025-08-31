
public class SimpleCalculator {
	private double value;
	private char arthOperator;
	private boolean operatorEntered;

	public SimpleCalculator() {
		value = 0;
		arthOperator = '=';
		operatorEntered = false;
	}

	public double getDisplay() {
		return value;
	}

	public void inputArthOperator(char operator) {
		arthOperator = operator;
		operatorEntered = true;
	}

	public void inputNumber(double n) {
		if (arthOperator == '=') {
			value = n;
		} else if (!operatorEntered) {
			value = n;
		} else {

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
	operatorEntered = false;
	}

	public void reset() {
		value = 0;
		arthOperator = '=';
		operatorEntered = false;
	}

}
