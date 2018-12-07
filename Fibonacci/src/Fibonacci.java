
public class Fibonacci {

	public static void main(String[] args) {
		
//		The Fibonacci series is a series where the next term is the sum of pervious two terms. The first two terms of the Fibonacci sequence is 0 followed by 1.
//		The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
		
//		https://www.programiz.com/java-programming/examples/fibonacci-series
//		fibonacci variations

		int totalNums = 20;
		int t1 = 0;
		int t2 = 1;
		
		System.out.println("First " + totalNums + " fibonacci numbers: ");
		
		for (int i = 1; i <= totalNums; i++) {

			int sum = t1 + t2; // 0 + 1  :: 1+1 = 2  :: 1+2 = 3 :: 2+5 = 5 :: 3+5 =8
			t1 = t2; // t1 = 1  ::  t1 = 1 :: t1 = 2 :: t1 = 3
			t2 = sum; // t2 = 1 :: t2 = 2 :: t2 = 3 :: t2 = 5
			
			System.out.print(t1 + " + ");
		}

	}

}
