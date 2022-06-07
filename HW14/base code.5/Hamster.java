//import pkg.*;
import java.util.Scanner;
import java.util.Random;


//class starter {
		public class Hamster {
		String name;
		int age;
		boolean trained;
		public Hamster () {
			this ("Cupcake", 2, true);
			interact ();
		}
		public Hamster (int age) {
			this ("Cupcake", age, true);
			interact();
		}
		public Hamster (boolean trained) {
			this ("Cupcake", 2, trained);
			interact();
		}
		public Hamster (String name) {
			this (name, 2, true);
			interact ();
		}
		public Hamster (String name, boolean trained) {
			this (name, 2, trained);
			interact();
		}
		public Hamster (String name, int age, boolean trained) {
			this.name = name;
			this.age = age;
			this.trained = trained;
			interact ();
		}
		public void setName (String name) {
			this.name = name;
		}
		public String getName (){
			return name;
		}
		public void setAge (int age) {
			this.age = age;
		}
		public int getAge () {
			return age;
		}
		public void setIsTrained (boolean trained) {
			this.trained = trained;
		}
		public boolean getIsTrained () {
			return trained;
		}
		public void interact () {
			System.out.println ("squeak");
		}
		public void trick () {
			System.out.println (name + " stands up!");
		}
		
	}
