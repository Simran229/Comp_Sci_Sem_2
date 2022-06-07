import java.util. *;

class starter {
 public static void printArrayList(ArrayList <Integer> a){
  for (int x= 0; x<a.size(); x++){
   System.out.println(a.get(x));
  }
 }
 public static void addValuesArrayList(ArrayList <Integer> a, int value){
  for (int x=0; x<value; x++){
    int b = (int) ((Math.random () *99)+ 1);
    a.add(x,b);
  }
  
 }
 
	public static void main(String args[]) {
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
	 ArrayList <Integer> arr = new ArrayList<Integer>();
	 System.out.print ("Enter the number of values you want to add to the array:");
	 int a = sc.nextInt ();
	  addValuesArrayList(arr, a);
	  printArrayList(arr);
	}
}
