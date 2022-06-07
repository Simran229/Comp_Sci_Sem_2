import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("What is your name?");
		String a = sc.nextLine ();
		System.out.println ("What is your title? Ex: Slayer of Dragons");
		String b = sc.nextLine ();
		System.out.println ("Would you like to be a Wizard, Warrior, or Rogue?");
		String c = sc.nextLine ();
		if (c.equals("Wizard" || "wizard")) {
			System.out.println ("You've chosen the Wizard!");
		}
		else if (c.equals ("Warrior") || c.equals ("warrior")) {
			System.out.println ("You've chosen the Warrior!");
		}
		else if (c.equals("Rogue")){
			System.out.println ("You've chosen the Rogue!");
		}
		else {
			System.out.println ("You've decided not to chose a role!");
		
		}
		System.out.println ("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely");
		System.out.print ("Strength (1-10): ");
		int d = sc.nextInt ();
		if (d > 10) {
			System.out.println ("Number must be less than equal to 10");
			return;
		}
		else {
		System.out.println ("You have "+ (25-d) + " left to spend.");
		}
		
		System.out.print ("Dexterity (1-10): ");
		int e = sc.nextInt ();
		if (e > 10) {
			System.out.println ("Number must be less than equal to 10. Rerun program.");
			return;
		}
		else {
		System.out.println ("You have "+ (25-d-e) + " left to spend.");
		}
		
		System.out.print ("Intelligence (1-10): ");
		int f = sc.nextInt ();
		if (f >10) {
			System.out.println ("Number must be less than equal to 10. Rerun program.");
			return;
		}
		else if ((d +e +f) > 25) {
			System.out.println ("Too high! Rerun program!")
			return;
		}
		else {
			System.out.println ("You have "+ (25-d-e-f) + " left to spend.");
		}
		
		System.out.print ("Constitution (1-10): ");
		int g = sc.nextInt ();
		
		if (g >10) {
			System.out.println ("Number must be less than equal to 10. Rerun program.");
			return;
		}
		else if ((d +e +f) > 25) {
			System.out.println ("Too high! Rerun program!")
			return;
		}
		else {
			System.out.println ("You have "+ (25-d-e-f-g)  + " left to spend.");
		}
		
		System.out.print ("Charisma (1-10): ");
		int h = sc.nextInt ();
		if (h >10) {
			System.out.println ("Number must be less than equal to 10. Rerun program.");
			return;
		}
		else if ((d +e +f +g) > 25) {
			System.out.println ("Too high! Rerun program!")
			return;
		}
		else {
			System.out.println ("You have "+ (25-d-e-f-g-h)  + " left to spend.");
		}
		System.out.println ("You have " + (25-d-e-f-g-h) + " to spend for next time");
		System.out.println("-------------------------------------");
		System.out.println ("You are " + a + " the Slayer of CVHS");
		System.out.println ("You're a " + c + " with the following stats!");
		System.out.println ("Strength - " + d);
		System.out.println ("Dexterity - " + e);
		System.out.println ("Intelligence - " + f);
		System.out.println ("Constitution - " + g);
		System.out.println ("Charisma - " + h);
		System.out.println ();
		System.out.println ("Good luck on your quest " + a + "!");
		
	}
	}

