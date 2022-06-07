import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString (String a, String b) {
		System.out.println (a);
		System.out.println (b);
	}
	public static String toStringCombined (String a , String b) {
		System.out.print(a + " " + b);
		return a;
		
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter a sentence:");
		String a = sc.nextLine ();
		System.out.println ("Enter another sentence:");
		String b = sc.nextLine ();
		toStringCombined (a,b);



		
	}
}
