import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner (System.in);
		System.out.print ("What symbol would you like to use? ");
		String a = sc.nextLine();
		System.out.print ("What's the width of your box? ");
		int b = sc.nextInt();
		System.out.print("What's the height of your box? ");
		int c = sc.nextInt ();
		
		for (int x = 0; x<c; x++){
			System.out.println ();
			for (int y = 0; y<b; y++){
			System.out.print (a);
			}
		}

		
	}
}
