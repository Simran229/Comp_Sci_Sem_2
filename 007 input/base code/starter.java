import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println ("What is your name?");
		String text  = sc.nextLine ();
		String name = new String (text);
		
		System.out.println ("What is your age?");
		int number = sc.nextInt ();
		int age;
		age = number;
		
		System.out.println ("What is your birthday month?");
		int word = sc.nextInt ();
		int month;
		month = word;
		
		System.out.println ("What is your birthday day?");
		int date = sc.nextInt ();
		int day;
		day = date;
		
		System.out.println ("What is your birthday year");
		int num = sc.nextInt ();
		int year;
		year = num;
		
		System.out.println ("How much is a buck fifty");
		double no = sc.nextDouble ();
		double fifty;
		fifty = no;
		
		
	}
}
