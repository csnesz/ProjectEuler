package problem4;

//A palindromic number reads the same both ways. 
//The largest palindrome made from the product of two 2-digit numbers is
// 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.
//
public class Projekt4 {

	public static void main(String[] args) {

		System.out.println(threedDigitsNr());

	}

	private static int threedDigitsNr() {
		int max = 0;

		for (int i = 999; i >= 100; i--) { // dreistellige Nummer 1
			for (int j = 999; j >= 100; j--) { // dreistellige Nummer 2
				boolean ok = isPalindrome(i * j); //
				if (ok) {
//					System.out.println("" + i + "*" + j + " " + (i * j));  //kontroll 
					if (i * j > max) {
						max = i * j;
					}
				}
			}
		}
		return max;
	}

	private static boolean isPalindrome(int i) {

		StringBuffer sb = new StringBuffer("" + i);
		sb.reverse();
		return ("" + i).equals(sb.toString());
	}
}