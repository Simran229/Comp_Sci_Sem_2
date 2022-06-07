import java.util.Scanner;
import java.util.Random;

class starter {
	public static int fact (int y) {
	int x = y- 1;
	while (true){
		System.out.println (y);
		y = y*x;
		if (x==1)
		{
			return y;
		}
		x = x- 1;
	}
	}
    public static void main(String args[]) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter a number: ");
	int y = sc.nextInt ();
	fact (y);
	System.out.println ("This is the factoral of 10");
	System.out.println (fact (10));
    }
}