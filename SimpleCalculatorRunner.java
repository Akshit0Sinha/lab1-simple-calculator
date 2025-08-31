import java.util.Scanner;
public class SimpleCalculatorRunner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SimpleCalculator calculator = new SimpleCalculator();

		System.out.printf("%30s%n", "SIMPLE CALCULATOR");
		System.out.printf("%30s%n", "(please enter commands in separate lines)");
		System.out.printf("%-15s | %-15s%n", "Input", "Display");
		System.out.printf("%s%n", "-------------------------------");

		while (true) {
			System.out.printf("%-15s: ", "Enter number/operator");
			String i = in.nextLine();

			if (i.equalsIgnoreCase("exit")) {
				System.out.println("Calculator terminated.");
				break;
			}

			if (i.isEmpty()) {
				System.out.printf("%-15s | %-15s%n", "", "");
				continue;
			}

			try {
				double num = Double.parseDouble(i);
				calculator.inputNumber(num);
				System.out.printf("%-15s | %-15.2f%n", i, calculator.getDisplay());

			} catch (NumberFormatException e) {
				if (i.length() == 1) {

					char op = i.charAt(0);

					if ("+-*/=".indexOf(op) != -1) {

						calculator.inputArthOperator(op);

						System.out.printf("%-15s | %-15.2f%n", i, calculator.getDisplay());
					} else {
						System.out.printf("%-15s | %-15s%n", i, "Invalid operator");
					}
				} else {
					System.out.printf("%-15s | %-15s%n", i, "Invalid input");
				}
			}
		}
	}
}


