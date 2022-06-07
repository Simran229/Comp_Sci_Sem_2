import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [] arr = new int [200];
		int outer, inner, min_index;
		for (outer = 0; outer < arr.length; outer++){
			min_index = outer;
			for (inner= outer + 1; inner < arr.length; inner++){
				if (arr[inner]< arr[min_index]){
					min_index = inner;
				}
			}
			int temp = arr[outer];
			arr[outer] = arr[min_index];
			
		}


		
	}
}
