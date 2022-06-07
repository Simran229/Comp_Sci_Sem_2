import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random ();
		Scanner sc = new Scanner (System.in);
		int a = rand.nextInt (1000) + 1;
		//System.out.println (a);
		System.out.println ("Enter a number between 1 and 1000:");
		int x = sc.nextInt ();
		if (x > a){
			System.out.println ("too high");
		}
		else if (x < a){
			System.out.println ("too low");
		}
		else if (x==a) {
			System.out.println ("You are correct!");
		}
		
	}
}
