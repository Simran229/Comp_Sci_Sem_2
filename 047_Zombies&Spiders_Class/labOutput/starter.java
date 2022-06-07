
import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Creature [] test = new Creature [2];
		Random rand = new Random ();
		test[0] = new Zombie ();
		test[1] = new Spider ();
		System.out.println(test[0].getName ());
		System.out.println(test[1].getName ());
		//System.out.println (test[0].takeDamage (3));
	//	test[0].health (rand.nextInt(6) + 5);
	


		
	}
}
