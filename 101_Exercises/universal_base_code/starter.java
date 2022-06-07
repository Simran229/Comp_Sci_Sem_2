import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii a = new Ascii();
		Ascii b = new Ascii("mad");
		Ascii c = new Ascii ("mad", "bad");
		Ascii d = new Ascii ("mad", 2);
		Scanner sc = new Scanner (System.in);
		System.out.print ("Enter a type (human, cactus, tree, or other): ");
		String x = sc.nextLine();
		System.out.print ("Enter a name:");
		String y = sc.nextLine ();
		System.out.print ("Enter a number:");
		int z = sc.nextInt ();
		sc.nextLine ();
		
		System.out.print ("Enter a type (human, cactus, or other): ");
		String g = sc.nextLine();
		System.out.print ("Enter a name:");
		String h = sc.nextLine ();
		System.out.print ("Enter a number:");
		int i = sc.nextInt ();
		sc.nextLine ();
		
		System.out.print ("Enter a type (human, cactus, or other): ");
		String l = sc.nextLine();
		System.out.print ("Enter a name:");
		String m = sc.nextLine ();
		System.out.print ("Enter a number:");
		int n = sc.nextInt ();
		
		
		a.setType (x);
		a.setName (y);
		a.setNumber (z);
		a.printArt ();
		
		b.setType(g);
		b.setName (h);
		b.setNumber (i);
		b.printArt ();
		
		c.setType (l);
		c.setName (m);
		c.setNumber (n);
		c.printArt ();

		
	}
}
