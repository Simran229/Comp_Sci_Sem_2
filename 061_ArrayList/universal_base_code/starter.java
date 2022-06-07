import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util. *;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList <String> arr= new ArrayList <String>();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter  number:");
		int a = sc.nextInt ();
		for (int x = 0; x<a; x++){
			arr.add("Cookie");
		}
		System.out.println (arr);
	}
}
