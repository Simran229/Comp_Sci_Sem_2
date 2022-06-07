import java.util.Scanner;
import java.util.Random;

class starter {
	public static boolean checkPrime (int x){
		int y= x- 1;
		while (true){
			y = y- 1;
			if (y<=1){
				return true;
		}
			else if (x % y == 0) {
				return false;
		}

	}
	
	}
	public static void printPrimes (int x) {
		int y = x-1;
		while (true) {
			//	System.out.println (y);
				//System.out.println (checkPrime (y));
				y = y- 1;
			if (checkPrime(y)) {
				System.out.println (y);
				}
				
			
			if (y==2) {
				break;
			}
			
	}
	}
	
    public static void main(String args[]) {
    	Scanner sc = new Scanner (System.in);
    	System.out.println ("Enter a number: ");
    	int x = sc.nextInt();
    	System.out.println (checkPrime (x));
    	printPrimes (x);
    }
}