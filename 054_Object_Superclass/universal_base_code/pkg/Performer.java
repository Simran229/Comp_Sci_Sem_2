package pkg;
import java.util.Scanner;
import java.util.Random;


public class Performer {
	public String name;
	public int age;

	public Performer() {
		name = "Doja Cat";
		age = 26;
	}
	public Performer (String name) {
		this.name = name;
		this.age = 26;
	}
	public Performer (String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName () {
		return name;
	}
	public void practice (){
		System.out.println (name + " is practices!");
	}
	public void perform (){
		System.out.println (name + " performes on stage to an audience!");
	}
	public String toString (){
		return "The name of the performer is " + this.name + " and the age is " + this.age;
	}
	public boolean equals (Object other){
		return this.name == ((Performer)other).getName();
	}
}

