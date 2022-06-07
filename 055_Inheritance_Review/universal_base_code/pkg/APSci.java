package pkg;
import java.util.Scanner;
import java.util.Random;


public class APSci extends Science {
	public int getCredit(){
		int a = super.getCredit() + 1;
		return a;
}
}
