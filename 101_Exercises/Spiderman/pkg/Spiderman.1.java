package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name!
	int age;			// How many times should it be printed
	String villain;		// Who's the arch nemesis of this Spiderman

	public Spiderman() {	
		this("Tobey Maguire", 46, "Green Goblin");
	}
		// actor = "Tobey Maguire";
		// age = 46;
		// villain = "Green Goblin";
	
	public Spiderman (String actor) {
		this (actor, 46,"Green Goblin");
	}
	public Spiderman (int age) {
		this ("Tobey Maguire", age, "Green Goblin");
	
	}
	public Spiderman (String actor, int age) {
		this (actor, age, "Green Goblin");
		
	}
	public Spiderman (String actor, int age, String villian) {
		this.actor = actor;
		this.age = age;
		this.villain = villian;
	//	printArt();
	}
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	public String getActor () {
		return actor;
	} 
	public int getAge () {
		return age;
	}
	public String getVillain () {
		return villain;
	}
	public void setActor (String actor) {
		this.actor = actor;
	}
	public void setAge (int age) {
		this.age = age;
	}
	public void setVillain (String villian) {
		this.villain = villian;
	}


	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}

	

}
