import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer [] x = new Performer [4];
		x[0] = new Performer ();
		x[1] = new Musician ();
		x[2] = new Apprentice();
		x[3] = new Actor ();
		
		System.out.println (x[0].toString());
		System.out.println (x[1].toString());
		System.out.println (x[2].toString());
		System.out.println (x[3].toString());
		
		System.out.println(x[0].equals(x[1]));
		System.out.println(x[1].equals(x[2]));
		System.out.println(x[2].equals(x[3]));
	}
}
