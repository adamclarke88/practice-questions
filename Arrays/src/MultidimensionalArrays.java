
public class MultidimensionalArrays {

	public static void main(String[] args) {
		
		int[][] twoDimension = new int[][] { {1,2,3}, {4,5,6} };
		// this created 2 arrays. its an array of arrays.
		
		int d1 = twoDimension.length; // the first array
		int d2 = twoDimension[1].length; // the second array
		
		for (int i = 0; i < d1; i++) { // loops through the first array
			for (int j = 0; j <d2; j++) { // loops through the second array
				System.out.println(twoDimension[i][j]);
			}
		}

	}

}
