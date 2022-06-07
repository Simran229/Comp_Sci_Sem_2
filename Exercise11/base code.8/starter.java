import java.util.Scanner;
import java.util.Random;

class Dog {
	String name;
	int age;
	String breed;
	public Dog () {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
		
	}
	public Dog (String b) {
		name = b;
		age = 1;
		breed = "dog dog";
		
	}
	public Dog (String b, String  a) {
		name = b;
		age = 1;
		breed = a;
		
	}
	public Dog (String b, int c) {
		name = b;
		age = c;
		breed = "dog dog";
	}
	public void setName (String b) {
		System.out.println (name);
	}
	public void setAge (int c) {
		System.out.println (age);
	}
	public void setBreed (String a) {
		System.out.println (breed);
	}
	public String getName () {
		//System.out.println (name);
		return name;
	}
	public int getAge () {
		//System.out.println (age);
		return age;
	}
	public String getBreed () {
		//System.out.println (breed);
		return breed;
	}
	public static boolean isSleeping () {
		Random rand = new Random ();
		int z;
		z = rand.nextInt (2);
		if (z==0) {
			return true;
		}
		return false;
	}
	public void bark () {
		System.out.println (name + " is awake! bark");
	}
	
	
}
class starter {
    public static void main(String args[]) {
    	Scanner sc = new Scanner (System.in);
    	String name;
    	String a = "Toto";
    	System.out.println ("Enter a name: ");
    	name = sc.nextLine ();
		int age;
    	System.out.println ("What age should " + name + " be?");
    	age = sc.nextInt();
    	System.out.println (name + " is a dog that is " + age + " years old");
    	Dog x = new Dog ("Toto", "Cairn Terrier");
    	System.out.println (x.getName() + " is a " + x.getBreed() + " that is " + x.getAge () + " years old!");
   if (x.isSleeping () == true) {
    	System.out.println (a +" is asleep");
    }
    else {
    	x.bark ();
    }
    
    Dog y = new Dog ("Toto");
    //a = name;
    if (y.isSleeping () == true) {
    	System.out.println (name + " is asleep.");
    }
    else {
    	y.bark ();
    }
   
    
    }
}