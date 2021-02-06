package problemSechs;

public class Projekt6 {

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


