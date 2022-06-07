import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println ("What is your first period?");
		String a = sc.nextLine ();
		System.out.println ("What is your second period?");
		String b = sc.nextLine ();
		System.out.println ("What is your third period?");
		String c = sc.nextLine ();
		
		System.out.println ("What is your GPA for first period?");
		int d = sc.nextInt ();
		System.out.println ("What is your GPA for second period?");
		int e = sc.nextInt ();
		System.out.println ("What is your GPA for third period?");
		int f = sc.nextInt ();
		
		
	}
}
