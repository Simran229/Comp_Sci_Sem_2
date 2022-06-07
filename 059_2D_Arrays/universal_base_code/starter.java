import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [][] arr = new int [4][3];
		arr [0][0] = 1;
		arr [0][1] = 2;
		arr [0][2] = 3;
		arr [1][0] = 1;
		arr [1][1] = 2;
		arr [1][2] = 3;
		arr [2][0] = 1;
		arr [2][1] = 2;
		arr [2][2] = 3;
		arr [3][0] = 1;
		arr [3][1] = 2;
		arr [3][2] = 3;
		System.out.println ((arr [0][0] + arr [0][1] + arr [0][2] + arr [1][0] + arr [1][1] + arr [1][2] + arr [2][0]+ arr [2][1] + arr [2][2] + arr [3][0] + arr [3][1] + arr [3][2]) /2  );
		
	}
}
