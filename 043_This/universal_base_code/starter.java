import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
		public static class Dwarf {
			String name;
			int age;
			
			public Dwarf () {
				this("" , 0);
			}
			public Dwarf (String name, int age) {
				this.name = name;
				this.age = age;
		}
			public void setName (String name) {
				this.name = name;
				//a = name;
			}
			public String getName () {
				return name;
			}
			public void setAge (int age) {
				this.age = age;
			//	b = age;
			}
			public int getAge () {
				return age;
			}
			// public boolean isSameName (String name) {
			// 	this.name = x[ab].setName (y[0]);
			// 	System.out.println (count);	  
			// 	}
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
		int count = 0;
		while (ab < 100) {
		x[ab] = new Dwarf ();
		A = rand.nextInt (99) + 1;
		x[ab].setAge (A);
		n = rand.nextInt (7);
		x[ab].setName (y[n]);
		//System.out.println (x[ab].getName());
		
		if (x[0].getName().equals(x[ab].getName())) 
		{
			count ++;
		}
		ab++;
	}
	System.out.println (x[0].getName () + " was repeated " + count + " times");
	// ab = 0;
	// while (ab < 100) {
	// 	System.out.println (x[ab].getAge () + " " + x[ab].getName ());
	// 	ab++;
	// }
}
}

