import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	
		Wizard [] a = new Wizard [100];
		Warrior [] b = new Warrior [100];
		int x = 100;
		int y = 100;
		int ad = 0;
		int bd = 0;
		int z = 1;
		while (bd < 100) {
				a[ad] = new Wizard ();
				b[bd] = new Warrior ();
				
				if (z %2 != 0) {
					a[ad].attack(b[bd]);
					z++;
				}
				else {
					b[bd].attack(a[ad]);
					z++;
				}
				if (a[ad].isDead ()) {
					ad++;
				//	System.out.println (ad);
					if (ad == 100 ) {
						System.out.println ("Warriors won with " + (y-(100 -bd)) + " left in their army");
					}
				}
				else {
					bd++;
					//System.out.println (bd);
					if (bd == 100 ) {
						System.out.println ("Wizards won with " + (x-(100- ad)) + " left in their army");
					}
				}
	
	}
}
}
