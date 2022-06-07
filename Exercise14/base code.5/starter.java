import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the command window when you compile and run this program.
		Random rand = new Random ();
		int []x = new int [20];
		int count = 0;
		System.out.println ("These are the 20 numbers:");
		if (count < 10) {
			for (int i = 0; i< x.length; i++) {
			x[i]= rand.nextInt (9) + 1;
			System.out.print (x[i]+ " ");
		}
		System.out.println ();
		System.out.println ("---------------------------------------------");
		int y = rand.nextInt (9) + 1;
		System.out.println ("The random number you are looking for is: " + y);
		for (int i = 0; i< x.length; i++) {
			if (x[i] ==y) {
			System.out.println ("Duplicate found at " + i);
			count ++;
		}
		}
		System.out.println ("Total number of duplicates for " + y + " is " + count);
		System.out.println ("---------------------------------------------");
		System.out.println ("Looking for two in a row:");
		for (int i = 0; i< x.length-1; i++) {
			if (x[i] == x[i+ 1]) {
				System.out.println ("Two in a row found at indexes " + i + " and " + (i+ 1));
			}
		}
		}
		}
}


	
