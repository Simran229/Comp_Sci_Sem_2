import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random ();
		int a = 100;
		 int b = 0;
		while (true) {
			if (a > b) {
			int c;
			c = rand.nextInt (100)+ 1;
			System.out.println (c);
			}
			else {
				break;
			}
			b ++;
		}


		
	}
}
