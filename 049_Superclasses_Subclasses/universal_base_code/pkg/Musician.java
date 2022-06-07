package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer {
	public String instrument;

	public Musician() {
		instrument = "Cello";
	}
	public Musician (String instrument){
		this.instrument = instrument;
	}
	public String getInstrument (){
		System.out.println ("The " + instrument+ " is played beautifully");
		return instrument;
	}
	public void playInstrument(){
		System.out.println (getName() + "'s instrument is the " + instrument);
	}

}

