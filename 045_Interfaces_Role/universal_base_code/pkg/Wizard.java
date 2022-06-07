package pkg;
import java.util.Scanner;
import java.util.Random;


public class Wizard implements Role {
	Random rand = new Random ();
	int attack;
	String name;
	int health;
	int A;
	public Wizard (){
		this.name = "Ranger";
		health = 15;
		attack = 15;
	}
	public Wizard (int attack, String name, int health){
		this.name = name;
		this.attack = attack;
		this.health = health;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return name;
	}
	public void setHealth (int health) {
		this.health = health;
	}
	public int getHealth () {
		return health;
	}
	public void attack (Warrior w) {
		A = rand.nextInt (15) + 1;
		w.setHealth (w.getHealth () - A);
	}
}
		
	



