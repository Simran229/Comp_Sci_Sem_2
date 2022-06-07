package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre {
	public String name;
//	boolean ugly;
	
	public Ogre() {
		name = "Shrek";
		boolean ugly = true;
	}

	private String getName(){
		return name;
	}

	public boolean isUgly(){
		return true;
	}

	public void interact(Donkey Donkey){
		System.out.println(Donkey.name + ", what are you doing in my swamp?!");
		return;
	}


}
