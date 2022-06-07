import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {		
public static void toStringArray (int [] x) {
		Random rand = new Random ();
		int c = 0;
		for (int i = 0; i< x.length; i++ ) {
		x[i] = rand.nextInt (99) + 1;
		System.out.print (x[i] + " ");
		c = x[i] + c;
		}
		
		System.out.println ();
}
		
public static int getArrayAverage (int [] a) {
	int c = 0;
	for (int i = 0; i < a.length; i ++) {
		c = a[i] +c;
	}
	System.out.println ("average: " + c/a.length);
	return c;
}

public static int getArrayMax (int [] b) {
	int max = 0;
	for (int i = 0; i<b.length; i++) {
		if (b[i] > max) {
		max = b[i];
		}
	}
	
	System.out.println ("maximum: " + max);
	return max;
}
public static int getArrayMin (int []c) {
	int min = 100;
	for (int i = 0; i< c.length; i++) 
	if (c[i] < min) {
		min = c[i];
	}
	System.out.println ("minimum: " + min);
	return min;	
}


	public static void main(String args[]) {
		// Your code goes below here
		
		int [] z = new int [100];
		toStringArray (z);
		getArrayAverage (z);
		getArrayMax (z);
		getArrayMin (z);


		
	}
}
