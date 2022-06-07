import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner (System.in);
	System.out.println ("Enter a word:");
	String a = sc.nextLine ();
	System.out.println ("Letter by letter:");
	for (int b = 0; b<a.length(); b++){
		System.out.print (b);
		System.out.print (" ");
		System.out.println (a.substring(b,b+ 1));
	}


		
	}
}
