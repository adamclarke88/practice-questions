import java.util.Arrays;

public class LoopingArray {

	public static void main(String[] args) {

		String[] planets = new String[] {"earth", "mars", "venus", "pluto", "neptune"};
		
		for (int i = 0; i < planets.length; i++) {
			System.out.println(planets[i]);
		}
		
		// regular for loop method
		
		System.out.println();
		
		String[] months = new String[] {"april", "may", "june", "july", "august"};
			for(String month : months) {
				System.out.println(month);
			}
			
		// enhanced for loop i.e. for every month in months, print out a month
	}

}
