import java.util.Arrays;
import java.util.Scanner;

public class ListEnds {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many numbers do you want in the array? ");
		int arrayLength = scanner.nextInt();
		
		int[] inputtedArray = new int[arrayLength];
		
		for (int counter = 0; counter < arrayLength; counter++) {
			System.out.println("Enter number " + (counter+1));
			inputtedArray[counter] = scanner.nextInt();
		}
		
		System.out.println("Original list " + Arrays.toString(inputtedArray));

		int firstNum = inputtedArray[0];					   // gets the first element
		int lastNum = inputtedArray[inputtedArray.length -1];  // gets the last element
		int[] newArray = new int[] {firstNum, lastNum};		// creates new int with
		
		System.out.println(Arrays.toString(newArray));
	}

}
