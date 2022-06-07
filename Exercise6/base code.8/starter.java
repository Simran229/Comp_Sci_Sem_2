import java.util.Scanner;
import java.util.Random;

public class starter {
    public static void main(String args[]) {
    Scanner sc = new Scanner (System.in);
		Random rand = new Random ();
		System.out.println ("Slot machine rules:");
		System.out.println ("1. Each player starts with $100");
		System.out.println ("2. Input a wager less than your total amount of money");
		System.out.println ("The slot machine will roll 3 numbers from 1 to 10");
		System.out.println ("	a. If two numbers match, you double your money");
		System.out.println ("	b. If three numbers match, you triple your money");
		System.out.println ("	c. If none match, you lose your money.");
		System.out.println ("----------------------------------------------------------");
		System.out.println ("");
		int remaining = 100;
		int wager;
		while (true) {
		    System.out.print ("Would you like you play slots (Yes/yes/Y/y): ");
		    String a = sc.nextLine ();
	
		    if (a.equals ("Y")|| (a.equals ("y"))|| (a.equals("Yes"))||(a.equals(("yes")))) {
			    System.out.print ("You have $" + remaining + ". How much would you like to wager? ");
			    wager = sc.nextInt ();
			    sc.nextLine();
		    	//remaining = remaining - wager;
			    //System.out.print (remaining);
			   
			    System.out.println ("Great! Let's play!");
	    		System.out.println ("Your rolls are:");
		    	System.out.println ("______________");
			    int c = rand.nextInt (9)+ 1;
    			int d = rand.nextInt (9)+ 1;
	    		int e = rand.nextInt (9)+ 1;
		    	System.out.println ("| " + c + " | " + d +" | " + e + " | ");
			    
		    
		    	if ((c==d) || (c==e) || (d==e)) {
		    	    System.out.println ("You won! Your wager has now been doubled!");
		    	    remaining = (wager * 2)+ (remaining-wager);
		    	     System.out.println ("You now have $" + remaining + " left.");
		    	    System.out.println ("--------------------------------------------------");
		    	}
		    
		    	else if ((c==d)&& (d==e)) {
		    	    System.out.println ("All the numbers are the same. It's a jackpot!");
		    	    remaining = (wager *3) + (remaining-wager);
		    	    System.out.println ("You now have $" + remaining + " left.");
		    	    System.out.println ("--------------------------------------------------");
		    	}
		    	else {
		    		System.out.println ("Didn't win this time, better luck next time!");
		    	    remaining = remaining - wager;
		    	    System.out.println ("You now have $" + remaining + " left.");
		    	    System.out.println ("--------------------------------------------------");
		    	    
		    	}
		    	if (remaining == 0){
		    	    System.out.println ("Sorry you lose!");
		    	    System.out.println ("You now have $" + remaining+ " left");
		    	    System.out.println ("---------------------------------------------------");
		    	    System.out.println ("");
		    	    System.out.println ("You've run out of money! Thanks for coming! Come back soon!");
		    	    break;
		    	}
		    	if (remaining < wager) {
		    		remaining = remaining + wager;
		    		System.out.println ("You only have $" + remaining + " left. Please wager something smaller. ");
		    	//	remaining = remaining + wager;
		    	}
		    	if (wager < 0) {
		    		remaining = remaining + (2*wager)+ wager;
		    		System.out.println ("You must wager something greater than 0");
		    		
		    		
		    	}
		    	if (remaining < 0) {
		    		System.out.println ("You ran out off money! Come back soon!");
		    		break;
		    	}
			
		}
			else if (a.equals ("N")|| (a.equals ("n"))|| (a.equals("No"))||(a.equals(("no")))) {
				System.out.println ("Sad to see you go. You still have $" + remaining+  " Come back soon!");
			    break;	
			}
		
	    	else { 
	    		System.out.println ("That wasn't quite the right answer. Try again.");
		       
		}
		
		
	}
        
    }
}