import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public interface Horse {
		String getName ();
		int getWeight();
	}
	public static class HorseBarn {
		private Horse [] spaces;
		public int findHorseSpace (String name) {
			for (int i = 0; i<spaces.length; i++){
				Horse h = spaces[i];
				if (h !=null && name.equals(h.getName())) {
		 return i;
	 }
	 }
	 return -1;
	} 
				
		 public void consolidate (){
		 	int next = 0;
			for (int i = 0; i<spaces.length; i++) {
				if (spaces[i] !=null){
					spaces[next] = spaces[i];
					next++;
				}
			}
			for (int i = next; i<spaces.length; i++) {
				spaces[i] = null;
			}
		 }
	}
	public static void main(String args[]) {
		// Your code goes below here
	}
}
