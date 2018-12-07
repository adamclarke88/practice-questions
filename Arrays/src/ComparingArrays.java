import java.util.Arrays;

public class ComparingArrays {

	public static void main(String[] args) {
		
		int[] a = {1,1,2,1,1};
		int[] b = {0,0,3,0,0};
		int [][] c = {{1,1,2,1,1}, {0,0,3,0,0}};
		
		int[][] d = {a,b};
		System.out.println("equals() method: ");
			if(Arrays.equals(c, d)) {
				System.out.println("Arrays c and d are equal");
			}
			else {
				System.out.println("arrays c and d are not equal");
			}
			
			// using the equals method, they are not equal
			// deep equals looks deeper into the references
			// as two dim array d only has references to the arrays
			// so a and b {1,1,2,1,1} etc are not equal to 'a' and 'b'
			
			System.out.println("deepEquals() method: ");
				 if(Arrays.deepEquals(c, d)) {
					 System.out.println("Arrays c and d are equal");
				 }
				 else {
					 System.out.println("Arrays c and d are not equal");
				 }
	}

}
