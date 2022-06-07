package pkg;
import java.util.Scanner;
import java.util.Random;


public class Science extends Course {
	public String field;
	public Science () {
		field = "Comp Sci";
	}
	public Science (String field) {
		this.field = field;
	}
	public String getfield (){
		return field;
	}
	public String toString () {
		super.toString();
		System.out.println ("Field name: " + field);
	}

}