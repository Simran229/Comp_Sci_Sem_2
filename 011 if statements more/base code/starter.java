import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println ("First variable: ");
		int a = sc.nextInt ();
		System.out.println ("Second variable: ");
		int b = sc.nextInt ();
		System.out.print ("Third variable:");
		int c = sc.nextInt ();
		
		if ((a > b) && (a > c)) {
			System.out.println ("Variable 1 is bigger");
		}
		if ((b > a) && (b > c)) {
			System.out.println ("Variable 2 is bigger");
		} 
		if ((c > a) && (c > b)) {
			System.out.println ("Variable 3 is bigger");
		}
		
	}
}
