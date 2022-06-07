import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random ();
		int rand_int1 = rand.nextInt(10);
		System.out.print ("A number between 0 and 10: ");
		System.out.println (rand_int1);
		
		int rand_int2 = rand.nextInt (100) +1;
		System.out.print("A number between 1 and 100: ");
		System.out.println (rand_int2) ;
		
		double rand_int3 = rand.nextDouble () + 2.5;
		System.out.print("A number between 2.5 and 3.5: ");
		System.out.println (rand_int3);
		
		
		double rand_int4 = rand.nextDouble () + 14;
		double rand_int5 = rand.nextInt (589) + rand_int4;
		System.out.print("A number between 14 and 589: ");
		System.out.println (rand_int5);
		
		//Random rand = new Random ();
//	double e = rand.nextDouble ();
//	int f = rand.nextInt(43) + 12;
//	double g = e+f;
//	System.out.println (g);


//15.3 - 32.3
		//double a = rand.nextDouble () + 0.3;
		//int b = rand.nextInt (17) + 15;
		//System.out.println (a+b);
	}
}
