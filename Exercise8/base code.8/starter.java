import java.util.Scanner;
import java.util.Random;

class starter {
	public static boolean multiply (int a, int b) {
	int c = a*b;
	if (c%3 == 0){
		return true;
		//return "It is divisible by 3";
		//and change boolean to String
	}
	else {
		return false;
		//return "It is not divisible ny 3";
	}
	}
	
    public static void main(String args[]) {
    	Scanner sc = new Scanner (System.in);
    	System.out.println ("Enter a number: ");
    	int a = sc.nextInt();
    	System.out.println ("Enter another number:");
    	int b = sc.nextInt();
    	
    	System.out.println (multiply (a,b));
    	
    	
   
    }
}