package problem6;

public class Projekt6 {

	
	/*
	  Sum square difference
	Show HTML problem content 
	Problem 6
	The sum of the squares of the first ten natural numbers is,

	The square of the sum of the first ten natural numbers is,	

	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.



	 */
	public static void main(String[] args) {
		long result=squaresSum(10)-sumSqaures(10);
		System.out.println(result);

	}

	private static long sumSqaures(int n) {
		int total=0;
		for (int i = 1; i <= n; i++) 
			total+=(i*i);
		System.out.println("Sum of the Squares: "+total);
		
		return total;
	}

	private static long squaresSum(int n) {
		long total=0;
		 
		for (int i = 1; i <= n; i++) 
			total+=i;
			total*=total;
			System.out.println("Squares of the Sum: "+total);
			return total;
	}
		
		
		
	}


