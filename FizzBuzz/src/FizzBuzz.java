
public class FizzBuzz {
	
	public void runFizzBuzz() {
		
		int num = 100;
		
		for(int i = 1; i <= num; i++) { 
			
			if( i % 3 == 0 && i % 5 == 0) { 		// checks to see if its a multiple of 3 & 5
				System.out.println("FizzBuzz");		// % (modulus) gets the remainder after diving 2 numbers
			}										// will print out fizzbuzz every time both conditions are true
			
			else if (i % 5 == 0) {					// checks if the number is a multiple of 5 and prints it out
				System.out.println("Fizz");			// will avoid multiples of both 3 & 5 as they will have already 
			}										// been printed out from the first if statement
																			
			else if(i% 3 == 0 ) {					// checks if the number is a multiple of 3						
				System.out.println("Buzz");			// prints them all out
			}
			else {
				System.out.println(i);				// prints out all numbers that aren't a multiple of 3 or 5
			}
		}
		
	}

}
