 package inheritance;

public class Banana extends Apple {
	 String colour ="yello";
		  public void  getcolour() {
		 System.out.println("Dog colour :" + colour);
		 
		 
	 }
	

	public static void main(String[] args) {
		Banana b=new Banana();
		System.out.println(b.Ttype);
		System.out.println(b.maxage);
		System.out.println(b.colour );
		b.eat();
		
		
		
		

	}

}
