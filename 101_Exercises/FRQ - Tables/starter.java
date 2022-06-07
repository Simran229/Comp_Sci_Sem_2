import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public class CombinedTable {
		public int a=0;
		public int b=0;
			public CombinedTable (SingleTable t1 , SingleTable t2){
				a = t1;
				b = t2;
			}
		public boolean canSeat (int c) {
			int seats = (t1.getNumSeats() + t2.getNumSeats()) -2;
			if (seats >= c ){
				return true;
			}
			else {
				return false;
			}
		}
		public double getDesirability(){
			int h1 = t1.getHeight ();
			int h2 = t2.getHeight();
			if (h1==h2){
				double a = (t1.getViewQuality() + t2.getViewQuality())/2;
				return a;
			}
			else {
				double b = ((t1.getViewQuality() + t2.getViewQuality())/2) - 10;
				return b;
			}
		}
	}
	public static void main(String args[]) {
		// Your code goes below here
		


		
	}
}
