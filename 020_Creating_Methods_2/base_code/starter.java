import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow (int a, int b) {
		int c = 0;
		int x = 0;
		int y = 1;
		while (b > c) {
			x = y *a;
			y=x;
			c = c + 1;
		}
		
		System.out.println (x);
		return x;
		
	}
	
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner (System.in);
	
	System.out.println ("Enter a number");
	int a = sc.nextInt ();
	System.out.println ("Enter a power");
	int b = sc.nextInt ();
	pow (a,b);
	


		
	}
}
