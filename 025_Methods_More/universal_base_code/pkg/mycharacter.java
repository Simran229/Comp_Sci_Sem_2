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
	public String setRole (String b) {
		if (b.equals("Wizard") || b.equals ("wizard")) {
			System.out.println ("You've chosen the Wizard!");
		}
		else if (b.equals("Warrior") || b.equals ("warrior")) {
			System.out.println ("You've chosen the Warrior!");
		}
		else if (b.equals("Rogue") || b.equals ("rogue")){
			System.out.println ("You've chosen the Rogue!");
		}
		else {
			b = "no role";
			System.out.println (b);
	}
	return b;
	}
	public int setStrength (int g) {
		g = strength;
		return g;
	}
	public int setDexterity (int h) {
		h = dexterity;
		return h;
	}
	public int setIntelligence (int i) {
		i = intelligence;
		return i;
	}
	public int setConstitution (int j) {
		j = constitution;
		return j;
	}
	public int setCharisma (int k) {
		k = charisma;
		return k;
	}
	public boolean setAll (String b, int g, int h, int i, int j, int k) {
		return true;
	}
	

}

