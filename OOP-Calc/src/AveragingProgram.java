import java.util.Scanner;

public class AveragingProgram {

	
		public void runAveragingProgram() {
			Scanner scanner = new Scanner(System.in);
			
			int total = 0;
			int grade;
			int average;
			//int counter = 0;
			
			System.out.println("Enter 10 grades to find the average");
			
			for (int counter=0; counter < 5; counter++) {
				grade = scanner.nextInt();
				total = total + grade;
			}
			
//			while (counter <= 10) {
//				
//				grade = scanner.nextInt();
//				total = total + grade;
//				counter++;
//			}
			
			average = total/5;
			
			if (average > 20) {
				System.out.println("Average is more than 20");
			}
			System.out.println("Average is " + average);
			
			if (average >= 70) {
				System.out.println("You got an A");
			}
		}
}
