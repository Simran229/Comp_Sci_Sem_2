import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter a phrase: ");
		String a = sc.nextLine ();
		int b = a.indexOf (" ");
		System.out.println (a.substring (b+ 1));
		System.out.println (" ");

	}
}
