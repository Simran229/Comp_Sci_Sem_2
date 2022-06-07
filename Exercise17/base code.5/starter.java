import java.util.Scanner;
import java.util.Random;

class starter {
 public static int getMedian (int []a) {
  
  if (a.length %2 !=0){
   median = a[arr.length/2];
  }
  else {
   median = a[arr.length/2 - 1];
  }
 public static int getMode (int []b) {
  for (int x =0; x<b.length; x++){
   int count = 0;
   for (int y = 0; y<b.length; y++) {
    if (b[x] == b[y]) {
     count++;
    }
   }
   if (mode<count){
    mode = count;
    median = b[x];
   }
  }
 }
 
	public static void main(String args[]) {
		// the command window when you compile and run this program.
  int [ ] arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};	
	int [ ] arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
	int [ ] arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
	int mode1 = getMode(arr1);		//The value of mode1 is 5.
	int mode2 = getMode(arr2);		//The value of mode2 is 7
	int mode3 = getMode(arr3);		// The value of mode3 is -1.

int [ ] arr4 = {1, 2, 3, 4, 5, 6, 7};
int [ ] arr5 = {1, 2, 3, 4, 5, 6};
int median1 = getMedian(arr4);  	//The value of median1 is 4.
int median2 = getMedian(arr5);	//The value of median2 is 3.


	}
}
