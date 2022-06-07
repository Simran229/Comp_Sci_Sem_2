package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician {
	public String school;
	public int yearsOFExperience;
	
	public Apprentice (){
		school = "CVHS";
		yearsOFExperience = 0;
	}
	public Apprentice (String school, int yearsOFExperience){
		this.school = school;
		this.yearsOFExperience = yearsOFExperience;
	}
	public Apprentice (String instrument, String school, int yearsOFExperience) {
		super.getInstrument();
		this.school = school;
		this.yearsOFExperience = yearsOFExperience;
	}
	public Apprentice (String name, int age, String instrument, String school, int yearsOFExperience ){
		super(name, age, instrument);
		//super.getInstrument ();
		this.school = school;
		this.yearsOFExperience = yearsOFExperience;
	}
	public void playInstrument (){
		System.out.println ("The " + super.getInstrument() + " is played just okay...");
	}
	public void practice (){
		super.practice ();
		System.out.println (super.getName () + " has played for " + yearsOFExperience+ " years");
	}
	public void perform () {
		super.perform ();
		System.out.println ("The performance needs some work still");
	}
	public void practiceAtUniversity () {
		super.practice ();
		System.out.println (super.getName() + " practices " + super.getInstrument () + " at USC");
	}
	public String toString (){
		return ("Name: " + super.getName() + " Instrument: " + super.getInstrument() + " University: " + school);
	}
}

