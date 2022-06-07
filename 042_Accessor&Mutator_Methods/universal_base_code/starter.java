import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
		public static class Dwarf {
			String name;
			int age;
			
			public Dwarf () {
				name = "";
				age = 0;
			}
			public void setName (String a) {
				name = a;
				//a = name;
			}
			public String getName () {
				return name;
			}
			public void setAge (int b) {
				age = b;
			//	b = age;
			}
			public int getAge () {
				return age;
			}
		}
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random ();
		Dwarf [] x = new Dwarf [100];
		String [] y = new String [7];
		y[0] = "Grumpy";
		y[1] = "Dopey";
		y[2] = "Doc";
		y[3] = "Happy";
		y[4] = "Bashful";
		y[5] = "Sneezy";
		y[6] = "Sleepy";
		int ab = 0;
		int A;
		int n;
		while (ab < 100) {
		x[ab] = new Dwarf ();
		A = rand.nextInt (99) + 1;
		x[ab].setAge (A);
	//	System.out.println (ab);
	//	System.out.println (x[ab].getAge ());
		n = rand.nextInt (7);
		x[ab].setName (y[n]);
		//System.out.println (x[ab].getName ());
		//System.out.println (A);
		ab++;
	}
	ab = 0;
	while (ab < 100) {
		System.out.println (x[ab].getAge () + " " + x[ab].getName ());
		//System.out.println (x[ab].getName ());
		ab++;
	}
}
}
