import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter a number:");
		int a = sc.nextInt ();
		System.out.println ("Enter another number:");
		int b = sc.nextInt ();
		if (a %2 == 0){
			System.out.println ("Your first number is even");
		}
		else if (a == 0) {
			System.out.println ("Your first number is neither even nor odd");
		}
		else {
			System.out.println ("Your first number is odd");
		}
		if ((a%3 == 0) && (a%4 == 0) && (a%5 == 0)){
			System.out.println ("Your number is divisible by 3, 4 ,and 5. ");
		}
		else {
			System.out.println ("Your number is not divisible by 3, 4, and 5");
		}
		if (b %2 == 0){
			System.out.println ("Your second number is even");
		}
		else if (b == 0) {
			System.out.println ("Your second number is neither even nor odd");
		}
		else {
			System.out.println ("Your second is odd");
		}
		if  ((b %3 == 0) && (b %4 == 0) && (b%5 == 0)) {
			System.out.println ("Your second number is divisible by 3, 4 and 5");
		}
		else {
			System.out.println ("Your second number is not divisible by 3, 4, and 5 ");
			
		}
	
	}
}
