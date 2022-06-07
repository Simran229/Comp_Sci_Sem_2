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
	x[0].perform ();
	x[0].practice();
	
	x[1].perform ();
	((Performer) x[1]).practice();
	
	((Apprentice)x[2]).practiceAtUniversity ();
	((Musician) x[2]).playInstrument ();
	
	((Actor)x[3]).monologue ();
	((Performer)x[3]).perform();
	}
}
