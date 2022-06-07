import java.util.Scanner;
import java.util.Random;

class character {
	String Wizard = new String ("Wizard");
	String Warrior = new String ("Warrior");
	String Rogue = new String ("Rogue");
	int strength = 5;
	int dexterity = 5;
	int intelligence = 5;
	int constitution = 5;
	int charisma = 5;
	
	}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
	character a = new character ();
	System.out.println ("Your role is "+ a.Wizard);
	System.out.println ("Your strenth trait is " + a.strength);
	System.out.println ("Your dexterity trait is " + a.dexterity);
	System.out.println ("Your intelligence trait is " + a.intelligence);
	System.out.println ("Your constitution trait is " + a.constitution);
	System.out.println ("Your charisma trait is " + a.charisma);
	}
}
