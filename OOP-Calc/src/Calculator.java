import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

	public void runCalculator() {
		Scanner scanner = new Scanner(System.in); // new scanner object
		DecimalFormat df = new DecimalFormat("#.0"); // decimal formatting to one decimal place
		
		double firstNumber, secondNumber, answer;
		String operator;
		
		System.out.println("Enter first number");
		firstNumber = scanner.nextDouble();
		
		System.out.println("Enter second number");
		secondNumber = scanner.nextDouble();
		
		System.out.println("Choose which mathmatical operation you want to perform");
		operator = scanner.next();
		
		switch (operator) {
		case "+":
			answer = firstNumber + secondNumber;
			System.out.println(firstNumber + " plus " + secondNumber + " equals " + answer);
			break;
			
		case "-":
			answer = firstNumber - secondNumber;
			System.out.println(firstNumber + " minus " + secondNumber + " equals " + answer);
			break;
		
		case "*":
			answer = firstNumber * secondNumber;
			System.out.println(firstNumber + " times " + secondNumber + " equals " + df.format(answer)); // syntax to use decim
			break;
			
		case "/":
			answer = firstNumber / secondNumber;
			System.out.println(firstNumber + " divided by " + secondNumber + " equals " + answer);
		}
	}
	
}
