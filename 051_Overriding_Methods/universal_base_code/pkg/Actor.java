package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer {
	public String type;
	public Actor (){
		type = "theater";
		name = "Morgan Freeman";
	}
	public Actor (String name, String type) {
		this.type = type;
		this.name = name;
	}
	public void practice (){
		System.out.println (name + " practices for their next stage performance!");
	}
	public void perform (){
		System.out.println (name + " acts amazingly on stage!");
	}
	public void monologue () {
		System.out.println ("I find I'm so excited I can barely sit still or hold a thought in my head. I think it's the excitement only a free man can feel.");
	}
	
}

