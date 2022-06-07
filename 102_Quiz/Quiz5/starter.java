import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public class BatteryCharger {
		private int [] rateTable;
		private int getChargingCost (int startHour, int chargeTime){
			int x = 0;
			if (startHour>= 0 && startHour <=23){
				if (chargeTime >0) {
					int y = chargeTime + startHour;
					if (y> 23){
						for (int i = 0; i<chargeTime; i++) {
							if (startHour + i > 23) {
								x = x+rateTable[startHour + i];
							}
						return x;
						}
					}
					else{
					for (int i =0 ; i<chargeTime; i++){
						x= x + rateTable[startHour +i];
				}
					}
				return x;
				}
				return x;
			}
			return x;
		}
		public int getChargeStartTime (int chargeTime){
			int hour = 0;
			if (chargeTime > 0) {
				for (int i = 0; i<=23; i++){
					if (rateTable[i]<rateTable [i+ 1]){
	
					 hour = i;
					 }
					 return hour;
				}
				return hour;
			}
			return hour;
		}
		
	}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
}
