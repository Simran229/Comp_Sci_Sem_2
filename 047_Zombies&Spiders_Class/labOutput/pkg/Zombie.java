package pkg;
import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Zombie implements Creature {
	static Random rand = new Random ();
	int A;
	String name;
	int health;
	int attack;
	public Zombie (){
		this.name = "Zack";
		this.attack = rand.nextInt (6) + 5;
		this.health = rand.nextInt (6) + 5;
	}
	public Zombie (String name) {
		this (name, rand.nextInt (6) + 5 , rand.nextInt (6) + 5);
	}
	public Zombie (int attack){
		this ("Zack" , attack, rand.nextInt (6) + 5);
	}
	public Zombie (String name, int attack) {
		this (name, attack, rand.nextInt (6) + 5);
	}
	public Zombie (int attack, int health) {
		this ("Zack", attack, health);
	}
	public Zombie (String name, int attack, int health) {
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
	public boolean takeDamage (int a) {
		if (isDead() == true) {
			return true;
		}
		else {
			return false;
		}
		//health - a	
	  }
	public void setName (String a) {
		name = a;
	}
	public String getName () {
		return name;
	}
	public int health (int b){
		return health;
	} 
}