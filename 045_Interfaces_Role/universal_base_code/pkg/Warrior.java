package pkg;
import java.util.Scanner;
import java.util.Random;


public class Warrior {
	Random rand = new Random ();
	int attack;
	String name;
	int health;
	int A;
	public Warrior (){
		this.name = "Simran";
		health = 15;
		attack = 15;
	}
	public Warrior (int attack, String name, int health){
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
	public void attack (Wizard i) {
		A = rand.nextInt (15) + 1;
		i.setHealth (i.getHealth () - A);
	}
}