import java.util.Scanner;
import java.util.Random;


class starter {
	public static class Clothing {
		int price;
		String producer;
		public Clothing (){
			price = 20;
			producer = "Macy's";
		}
		 public Clothing (int price, String producer) {
			this.price = price;
			this.producer = producer;
		
		}
		public void getPrice () {
			System.out.println ("The price is $" + price);
		}
		public void getProducer (){
			System.out.println ("The producer is " + producer);
		}
	}
	public static class shirt extends Clothing {
		public shirt (){
			super(20, "Abercrombie");
		}
		public shirt (int price, String producer) {
			this.price = price;
			this.producer = producer;
		}
		public void getProducer (){
			System.out.println ("The producer is Express");
		}
		public void material (String c) {
			System.out.println ("The material is " + c);
		 }
	}
	public static class pant extends Clothing{
		public pant (){
			super(40, "Levi's");
		}
		public pant (int price, String producer) {
			this.price = price;
			this.producer = producer;
		}
		public void length (int b){
			System.out.println ("The length is " + b);	
		}
	}

	 public static class socks extends Clothing {
	 	public socks (){
			super(15, "Nike");
		}
		public socks (int price, String producer) {
			this.price = price;
			this.producer = producer;
		}
		public void type (String c) {
			System.out.println ("The type of sock is " + c);
		 }
	 }
	 public static class Designer_Shirts extends Clothing {
	 		public Designer_Shirts (){
			super(1400, "Gucci");
		}
		public Designer_Shirts (int price, String producer) {
			this.price = price;
			this.producer= producer;
		}
		public void brand (String c) {
			producer = c;
			System.out.println ("The brand is " + c);
		 }
	 }
	public static void main(String args[]) {
		// Your code goes below here
		shirt test = new shirt (21, "Abercrombie");
		test.getPrice();
		test.getProducer ();
		shirt a = new shirt ();
		a.getPrice();
		a.getProducer();
		a.material("Cotton");
		pant b = new pant ();
		b.getPrice();
		b.length (25);
		


		
	}
}
