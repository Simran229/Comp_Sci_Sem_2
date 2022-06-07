import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer a = new Performer ();
		System.out.println ("Performer 1's name is " +  a.getName());
		a.practice();
		System.out.println ();
		
		Performer b = new Performer("Lil Nax X", 25);
		System.out.println ("Performer 2's name is " + a.getName());
		b.perform();
		System.out.println ();
		
		Musician c = new Musician ();
		System.out.println ("Musician 1's name is " + c.getName ());
		c.perform();
		c.playInstrument ();
		System.out.println ();
		
		Musician d = new Musician ("Musician 2");
		d.practice ();
		d.getInstrument ();
		System.out.println ();
		
		Musician e = new Musician ("Dwayne Johnson", "Coconuts");
		System.out.println ("Musician 3's name is " + e.getName ());
		e.practice();
		e.getInstrument();
		System.out.println ();
		
		Musician f = new Musician ("Elvis Presley", 26, "guitar");
		System.out.println ("Musician 4's name is " + f.getName ());
		f.perform ();
		f.playInstrument();
		System.out.println ();
	}
}
