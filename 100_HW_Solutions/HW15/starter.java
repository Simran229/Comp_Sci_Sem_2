import pkg.*;
import java.util.Scanner;

class starter {
	public static class specialSquare {
		Scanner sc = new Scanner (System.in);
		public static double perfectSquare (double a) {
		double b = Math.sqrt(a);
		if (b%1 ==0){
			return a;
		 }
		 else {
		 	return a;
		 }
		}
		public static int sum (int b, int c){
			int y = 0;
			for (int i=1; i<=c; i++) {
				y =y+i; 
			}
			return y;
		}
		public static int checkspecialSquare (int r, int s, int t ) {
			if (perfectSquare (r) == sum(s,t)){
				System.out.println ("special Square");
				return r;
			}
			else {
				System.out.println ("not special square");
				return r;
			}
		}
		}
	
	public static void main(String args[]) {
		specialSquare CVMath = new specialSquare ();
		 Scanner sc = new Scanner (System.in);
		 System.out.println ("Enter 3 numbers between 1 and 100: ");
		 int x = sc.nextInt ();
		 int y = sc.nextInt ();
		 int z = sc.nextInt ();
		
		CVMath.checkspecialSquare (x,y,z);
		
		//specialSquare.perfectSquare(1225);
		//specialSquare.sum(1,49);
		
	//System.out.println(CVMath.findMid(2,3,1));
	}
}

