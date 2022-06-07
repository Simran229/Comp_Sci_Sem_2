import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the command window when you compile and run this program.
		Random rand = new Random ();
		Scanner sc = new Scanner (System.in);
		int [] x = new int [20];
		int [] y = new int [20];
		
		int i = 0;
		System.out.println ("These are the 20 numbers:");
		while (i < x.length) {
			x[i]  = rand.nextInt (49) + 1;
			System.out.print(x[i]);
			System.out.print (" ");
			i ++;
		}
		System.out.println ();
		i = 19;
		System.out.println ("These are the 20 numbers backwards:");
		
		while (i < y.length) {
			y[i] = x[i];
			System.out.print (y[i]);
			System.out.print (" ");
			if (i==0) {
				break;
			}
			i--;
		}
		
			}
		}
	
