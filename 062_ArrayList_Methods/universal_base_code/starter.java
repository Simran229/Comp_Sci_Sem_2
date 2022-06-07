import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util. *;


class starter {
	public static void toStringArrayList(ArrayList<Integer> arr){
		for (int i = 0; i<arr.size(); i++){
			System.out.println (arr.get(i));
		}
	}
	public static int getArrayListAverage (ArrayList<Integer>arr){
		int x= 0;
		for (int i = 0; i<arr.size(); i++){
			x= x+arr.get(i);
		}
		System.out.print ("Average: " + x/arr.size());
		return x/arr.size();
	}
	public static int getArrayListMax (ArrayList<Integer>arr){
		int x =0;
		for (int i = 0; i<arr.size(); i++){
			if (arr.get(i+ 1)> arr.get(i)){
				x= arr.get(i+ 1);
			}
		}
		System.out.print("Max: " + x);
		return x;
	}
	public static int getArrayListMin (ArrayList <Integer>arr){
		for (int i =0; i<arr.size(); i++){
			int x = arr.get(i);
			if (arr.get(i+ 1)< arr.get(i)){
				x = arr.get(i+ 1);
			}
			System.out.print ("Min: "+ x);
			return x;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList <Integer> a = new ArrayList <Integer> ();
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter a value between 1 and 100:");
		int b = sc.nextInt();
		for (int i = 0; i<b; i++){
			int z = (int) ((Math.random()*99) + 1);
			a.add (i,z);
		}
		toStringArrayList(a);
		System.out.println ();
		getArrayListAverage(a);
		System.out.println ();
		getArrayListMax(a);
		System.out.println ();
		getArrayListMin(a);
		


		
	}
}
