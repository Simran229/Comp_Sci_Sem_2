//import pkg.*;
import java.util.Scanner;
import java.util.Random;

		public class GuineaPig {
		String name;
		int age;
		boolean trained;
		public GuineaPig () {
			this ("Ginger", 4, true);
			interact ();
		}
		public GuineaPig (int age) {
			this ("Ginger", age, true);
			interact();
		}
		public GuineaPig (boolean trained) {
			this ("Ginger", 4, trained);
			interact();
		}
		public GuineaPig (String name) {
			this (name, 4, true);
			interact ();
		}
		public GuineaPig (String name, boolean trained) {
			this (name, 4, trained);
			interact();
		}
		public GuineaPig (String name, int age, boolean trained) {
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
			System.out.println ("wheek");
		}
		public void trick () {
			System.out.println (name + " turns in circles!");
		}
		
	}
