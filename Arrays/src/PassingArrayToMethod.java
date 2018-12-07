import java.util.Arrays;

public class PassingArrayToMethod {

	public static void main(String[] args) {
		
		int[] a = new int[] {3, 4, 5, 6, 7};
		int[] r = reverseArray(a);   				//calling reverseArray method
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(r));

	}

	private static int[] reverseArray(int[] b) {
		int[] c = new int[b.length];
		for (int i=b.length -1, j=0; i>=0; i--, j++) {
			c[j] = b[i];
		}
		return c;
	}
	
//	The example reorders the elements of an array. For this task, 
//	a reverseArray() method is created. The reverseArray() method 
//	takes an array as a parameter and returns an array. The method 
//	takes a copy of the passed array. Inside the body of the method, 
//	a new array is created; it will contain the newly ordered elements. 
//	In the for loop, the new array is filled with the elements of the 
//	copied array. The elements are reversed. The newly formed array is 
//	returned back to the caller.

}

