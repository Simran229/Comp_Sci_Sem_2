import java.util.*;

class starter {
	public static void bubblesort (ArrayList <Integer> arr){
		for (int outer = 0; outer<arr.size()-1; outer ++){
			for (int inner = 0; inner <arr.size()-outer-1; inner++){
				if (arr.get(inner)> arr.get(inner+1)){
					int temp = arr.get(inner);
					arr.set(inner, arr.get(inner +1));
					arr.set(inner+1, temp);
				}
			}
		}
	}
	public static void selectionSort (ArrayList <Integer> arr){
		int outer, inner , min_index;
		for (outer = 0; outer < arr.size(); outer ++){
			min_index = outer;
			for (inner = outer+ 1; inner< arr.size(); inner ++){
				if (arr.get(inner) < arr.get(min_index)){
					min_index = inner;
				}
			}
			int temp = arr.get(outer);
			arr.set (outer, min_index);
			arr.set (min_index,temp);
		}
		
	}
	public static void insertionSort (ArrayList <Integer> arr){
		int outer, inner, key;
		for (outer = 1; outer < arr.size(); outer ++){
			key = arr.get (outer);
			inner = outer -1;
			while (inner >=0 && arr.get(inner)> key){
				arr.set (inner + 1, inner);
				inner = inner -1;
			}
			arr.set (inner + 1, key);
		}
	}
	
	public static void main(String args[]) {
		ArrayList <Integer> arr1 = new ArrayList <Integer> (100);
		for (int i = 0; i<100; i++){
			arr1.add((int) (Math.random()*100));
		}
		//System.out.println (arr1);
		ArrayList <Integer> arr2 = new ArrayList <Integer> (100);
		arr2 = arr1;
		
	//	System.out.println (arr2);
		ArrayList <Integer> arr3 = new ArrayList <Integer> (100);
		arr3 = arr1;
	//	System.out.println (arr3);
		
		bubblesort(arr1);
		System.out.println (arr1);
		System.out.println ();
		
		selectionSort (arr2);
		System.out.println (arr2);
		System.out.println ();
		
		insertionSort (arr3);
		System.out.println (arr3);
		System.out.println ();
		
		System.out.println ("Median:");
		System.out.println (arr1.get ((50+51)/2));
		
		
	}
}
