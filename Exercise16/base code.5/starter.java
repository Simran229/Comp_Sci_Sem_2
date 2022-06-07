import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the command window when you compile and run this program.
    Random rand = new Random ();
   int [] a = new int [5];
   int x = 0;
   int y = 0;
   for (int i = 0; i< a.length;i++) {
       a[i] = rand.nextInt (9)+ 1;
       System.out.print (a[i]+ " ");
   }
   for (int i = 0; i< a.length; i++) {
   	x = x+a[i];
   }
   System.out.println ();
   System.out.println ("Mean: " + x/2);
   
   int mode_num = 5;
   for (int i=0; i< mode_num; i++){
       int counter = 0;
       for (int j = 0; j<mode_num; j++){
           if (a[i] == a[j]){
               counter++;
               y = a[i];
               //System.out.print (counter + " ");
           }
       }
   }
   System.out.println ("Mode:" + y);
    }
}





	
