import java.util.Scanner;

public class ConvertToCelsius {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double fahrenheit, celsius, fc;
		
		System.out.println("Enter degrees fahrneheit");
		fahrenheit = scanner.nextInt();
		
		fc = (fahrenheit - 32) * 5/9;
		System.out.println(fahrenheit + " Degrees fahrenheit equals " + fc);
	}

}
