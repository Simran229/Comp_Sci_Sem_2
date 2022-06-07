import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	 public static void rows (int [][] arr){
	 	int z = 0;
	 	int num = 0;
	 	System.out.println (arr[0].length);
		 for (int x = 0; x<arr.length; x++){
		 	for (int y= 0; y <arr[0].length; y++){
		 		z = z+ arr[x][y];
		 		num++;
		 	}
		 	System.out.println  ("average: " + z/num);
		 }
	
	 }
	 //public static int average (){
	 //	int z = 0;
	 //	for (int x = 0; x<arr.length;x++){
	 //		for (int y= 0;y<arr[0].length;y++){
	 //			z  = z + arr[x][y];	
	 //		}
	 //		return z;
	 //	}
	 //}
	 //public static void print (){
	 //	for (int x = 0; x<arr.length; x++){
	 //		for (int y = 0; y<arr[0].length; y++){
	 //			System.out.println (arr[x][y]);
	 //		}
	 //	}
	 //}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner (System.in);
		System.out.print ("Enter a number:");
		int a = sc.nextInt ();
		System.out.print ("Enter a number:");
		int b = sc.nextInt();
		int x = a;
		int y = b;
		
		int m= 0;
		int [][] arr = new int [x][y];
		for (int j = 0; j<arr.length; j++){
			for (int k = 0; k<arr[0].length; k++){
				 m=(int) (Math.random()*10);
				 System.out.println (m)
			}
		}
		rows(arr);
	//	arr.average();
	//	arr.print();


		
	}
}
