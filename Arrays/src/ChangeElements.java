import java.util.Arrays;

public class ChangeElements {

	public static void main(String[] args) {
		
		int[] values = new int[] {1, 2, 3};
		values[0] = values[0] + 9; 
		values[1] *= 2;
		values[2] *= 2;
		System.out.println(Arrays.toString(values));
	}

}
