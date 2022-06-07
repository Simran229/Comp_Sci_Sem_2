import pkg.*;
import java.util.*;

class starter {
	
	public static void main(String args[]) {
		int [] arr = new int [200];
		for (int i = 0; i < arr.length; i++){
			arr[i] = ((int) (Math.random () *100));
		}
		for (int outer= 0; outer < arr.length-1; outer++){
			for (int inner = 0; inner < arr.length-outer-1; inner++){
				if (arr[inner] > arr[inner +1]){
					int temp = arr[inner];
					arr[inner] = arr[inner+1];
					arr[inner+1] = temp;
				}
			}
		
		}
		for (int x = 0; x<arr.length ; x++){
			System.out.print (arr[x] + ", ");
		}
	}
}