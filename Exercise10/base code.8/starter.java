import java.util.Scanner;
import java.util.Random;

class Cat {
	String name;
	public Cat () {
		name = "Garfield"; 
		
	}
	public Cat (String b) {
		name = b;
		
	}
	public void meow () {
		System.out.println (name + " meow");
		//return;
	}
	
	
}
class starter {
    public static void main(String args[]) {
    Cat x = new Cat ();
    Cat y = new Cat ("Tom");
    x.meow ();
    y.meow ();
    }
}