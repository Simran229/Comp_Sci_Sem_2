package pkg;
import java.util.Scanner;
import java.util.Random;


public class mycharacter {
	int example = 0;
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence ;
	public int constitution;
	public int charisma;
	public String a;

	public mycharacter() {
	
	role = "no role";
	strength = 0;
	dexterity = 0;
	intelligence = 0;
	constitution = 0;
	charisma = 0;
	
		
	}
	public mycharacter(String a) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println ("Do you want to be a Wizard, Warrior, or Rogue");
	role = a;
	a = sc.nextLine();
	
	
		if (a.equals("Wizard") || a.equals ("wizard")) {
			System.out.println ("You've chosen the Wizard!");
		}
		else if (a.equals("Warrior") || a.equals ("warrior")) {
			System.out.println ("You've chosen the Warrior!");
		}
		else if (a.equals("Rogue") || a.equals ("rogue")){
			System.out.println ("You've chosen the Rogue!");
		}
		else {
			a = "no role";
			System.out.println (a);
		}
	strength = 0;
	dexterity = 0;
	intelligence = 0;
	constitution = 0;
	charisma = 0;
		
	}
	public void print (int z) {
		//System.out.println (role);
		System.out.println ("Your role is " + role);
		System.out.println ("Your strength trait is " + strength);
		System.out.println ("Your dexterity trait is " + dexterity);
		System.out.println ("Your intelligence trait is " + intelligence);
		System.out.println ("Your constitution trait is " + constitution);
		System.out.println ("Your charisma trait is " + charisma);
	}
}

