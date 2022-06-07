package pkg; 
import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Spider implements Creature {
    static Random rand = new Random ();
	int A;
	String name;
	int health;
	int attack;
	public Spider (){
		this.name = "Charlotte";
		this.attack = rand.nextInt (6) + 5;
		this.health = rand.nextInt (6) + 5;
	}
	public Spider (String name) {
		this (name, rand.nextInt (6) + 5 , rand.nextInt (6) + 5);
	}
	public Spider (int attack){
		this ("Charlotte" , attack, rand.nextInt (6) + 5);
	}
	public Spider (String name, int attack) {
		this (name, attack, rand.nextInt (6) + 5);
	}
	public Spider (int attack, int health) {
		this ("Charlotte", attack, health);
	}
	public Spider (String name, int attack, int health) {
		this.name = name;
		this.attack = attack;
		this.health = health;
	}
	public boolean isDead () {
		A = rand.nextInt (2) + 1;
		if (A == 1) {
			return true;
		}
		else {
			return false;
		}
	}
    public String getName () {
	    return name;
}
    public int health (int b){
	return health;
}
}
