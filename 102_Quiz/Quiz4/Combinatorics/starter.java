import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
public static class Combinatorics {
	public static int factorial (int n) {
		    int x =0;
		    int z = 1;
		if (n>=1 && n<=12){
			if (n==1) {
			    //System.out.println (1);
				return 1;
			}
			else {
				for (int i = 1; i<=n; i++){
			        z = z*(i);
				}
				//System.out.println (z);
				return z;
			}
	}
		return -1;
}
	public static void numCombinations (int n , int r) {
		if (n>=1 && n<=12) {
			if (r>n) {
				System.out.println ("There are 0 ways of choosing " + r + " items from " + n + " choices.");
			}
			int x = factorial (n)/(factorial (r) * factorial(n-r));
			System.out.println ("There are " +x + " ways of choosing "  + r + " items from " + n + " choices.");
	}
	
}
}
	public static void main(String args[]) {
		// Your code goes below here
		Combinatorics a = new Combinatorics();
		a.factorial (5);
		a.numCombinations (5,3);
	}
}
