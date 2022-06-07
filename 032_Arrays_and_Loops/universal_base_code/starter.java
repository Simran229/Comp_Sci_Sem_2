import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here

		Random rand = new Random ();
		int count = 1;
		int a = 0;
		int [] x = new int [1000];
		while (count < x.length) {
			//int a  = rand.nextInt (999) + 1;
			x[a] = rand.nextInt (10) + 1;
			System.out.println (x[a]);
			count ++;
		}
	//	
	//	
	//	}


		
	}
}
