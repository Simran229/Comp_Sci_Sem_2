package pkg;
import java.util.Scanner;
import java.util.Random;


public class RecoverySci extends Science {
	public String passfail (){
		if (super.grade()>60) {
			return "pass";
	}
		else{
			return "fail";
		}
}
}
