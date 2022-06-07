import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static class DnD {
		Random rand = new Random();
		int A;
		String name;
		int health;
		int attack;
		public DnD () {
			this.name = name;
			health = 15;
			attack = 15;
			//name = "Ranger";
		}
		public DnD (String name, int health, int attack) {
			this.name = name;
			//name = "Ranger";
			this.health = health;
			this.attack = attack;
		}
		public void setHealth (int health) {
			this.health = health;
		}
		public int getHealth () {
			return health;
		}
		public void setName (String name) {
			this.name = name;
		}
		public String getName (){
			return name;
		}
		public void attack (Warrior w) {
			A = rand.nextInt (15) + 1;
			w.setHealth(w.getHealth() - A);
		}
		public void attack (Wizard i) {
			A = rand.nextInt (15) + 1;
			i.setHealth (i.getHealth () - A);
		}
	}
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random ();
		DnD Warrior = new DnD();
	//	x.attack ();
		Warrior.setName("Ranger");
		System.out.println ("This is " + Warrior.getName());
		DnD Wizard = new DnD ();
		Wizard.setName ("Sorcerer");
		System.out.println ("This is " + Wizard.getName());
		//x.setHealth(7);
		//System.out.println (x.getHealth());


		
	}
}
