//import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	public static void main(String args[]) {
		// Your code goes below here
	int ab = 0;
	Hamster [] Cookie = new Hamster[5];
	GuineaPig [] Ginger = new GuineaPig [5];
	while (ab < 5) {
		Cookie[ab] = new Hamster ();
		Cookie[ab].trick ();
		Ginger [ab] = new GuineaPig ();
		Ginger[ab].trick ();
		ab++;
	}
		
	}
}
