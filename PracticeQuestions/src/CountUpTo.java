import java.util.Scanner;

public class CountUpTo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number to count to ");
		int number = scanner.nextInt();
		
		for(int i = 1; i <= number; i++) {
			System.out.println(i);
		}


	}

}
