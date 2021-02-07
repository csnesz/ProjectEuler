package textAufgabe;

public class Aufgabe8 {
public static void main(String[] args) {

	nummer8(); 
}


	private static void nummer8() {
	//Die Zahl 30 soll in drei Summanden zerlegt werden, 
		//so dass jeder Summand um 3 kleinerals der vorige ist.//
	
	int a = 1;
	while(30 != a+  (a -3) + (a-6)) {
		a++;
	}
	System.out.println(a);
	System.out.println(a + a -3 + a-6);
	System.out.println("a=" + a +" " + "b="+ (a-3)+" "+ "c=" + (a-6));

	
	
	}
	
}
