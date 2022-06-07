import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random ();
		int a = rand.nextInt (10);
		System.out.println (a);
		boolean x = a <= 5;
		boolean y = a > 5;
		if (x) {
			System.out.println ("Hello");
		}
		if (y) {
			System.out.println ("Hi");
		}
	}
}
