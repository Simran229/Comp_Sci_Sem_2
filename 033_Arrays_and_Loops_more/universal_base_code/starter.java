import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random ();
		int [] x = new int [100];
		int i = 0;
		int max = 0;
		int min = 100;
		int c = 0;
		while (i < x.length) {
		x [i] = rand.nextInt (99) + 1;
		System.out.print (x[i] + " ");
		c = x[i] + c;
		i ++;
		}
	//	System.out.println (c);
		
		i = 0;
		while (i < x.length) {
			if (x[i] < min) {
				min = x[i];
			}
			if (x[i] > max) {
				max = x[i];
			}
		i++;
		}
		System.out.println ();
		System.out.println ("min: " + min);
		System.out.println ("max: " + max );
		System.out.println ("average: " + c/x.length);
		System.out.println ("# of elements: " + x.length);
		
	}
}
