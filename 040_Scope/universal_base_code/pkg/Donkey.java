package pkg;
import java.util.Scanner;
import java.util.Random;


public class Donkey {
	public String name;

	public Donkey() {
		name = "donkey";
	}

	private String getName(){
		return name;
	}

	public void interact(Ogre shrek){
		System.out.println(shrek.name + ", parfaits may be the most delicious thing on the whole planet!");
		return;
	}



}
