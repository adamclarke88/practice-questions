import java.util.Scanner;

public class SumToN {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int inputNumber = 0;
		int sum = 0;
		
		System.out.println("Enter a number "); // entered 5
		
		inputNumber = scanner.nextInt(); // n is now 5, for example
		System.out.println(); // new line for console readability 
		
		boolean isValid = false;
		// Loop will run while input is invalid (i.e less than 1)
		// Once input is 1 or greater isValid will be true and break out of the loop.
		while(!isValid) { 
			
			if (inputNumber < 1) {
				System.out.println("Enter a number greater than 1");
				inputNumber = scanner.nextInt();
			}
			else {
				isValid = true;
			}
		}
		
				
		for (int i = 1; i <= inputNumber ; i++) {	
			
			sum = sum + i;
			
			System.out.println(sum);
		}
		
	}

}
