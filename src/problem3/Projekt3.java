package problem3;

public class Projekt3 {

//	Largest prime factor
//	Show HTML problem content 
//	Problem 3
//	The prime factors of 13195 are 5, 7, 13 and 29.
//
//	What is the largest prime factor of the number 600851475143 ?

	public static void main(String[] args) {

		long l = 600851475143L;

		for (long i = 2; i < l; i++) {
			if (l % i == 0) {
				boolean isPrime = true;
				
					for (long j = 2; j < l; j++) {
						if (l % j == 0) {
							isPrime = false;
							break;
						}

					}
				
				if(isPrime) {
				System.out.println(i);
				}
			}
			
		}
	}
	}
