import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter a number:");
		int a = sc.nextInt ();
		int b = 0;
		int c = 1;
		int count = 1;
		
	while (true) {
		if (count == 5) {
			break;
		}
		System.out.println (a+c);
		c = c + 1;
		count = count + 1;
		
	}
	
	}
}
