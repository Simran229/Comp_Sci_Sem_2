package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ranger implements Role {
		Random rand = new Random();
		int A;
		String name;
		int health;
		int attack;
		public Ranger () {
			this.name = "Simran";
			health = 15;
			attack = 15;
			//name = "Ranger";
		}
		public Ranger (String name, int health, int attack) {
			this.name = name;
			//name = "Ranger";
			this.health = health;
			this.attack = attack;
		}
		public void setHealth (int health) {
			this.health = health;
		}
		public int getHealth () {
			return health;
		}
		public void setName (String name) {
			this.name = name;
		}
		public String getName (){
			return name;
		}
		public void attack (Warrior w) {
			A = rand.nextInt (15) + 1;
			w.setHealth(w.getHealth() - A);
		}
		public void attack (Wizard i) {
			A = rand.nextInt (15) + 1;
			i.setHealth (i.getHealth () - A);
		}
	}

