package accesnodifier;

public class PrivateTest {
	private int a= 40;
	private int b=30;
	private void addition() {
		 int c=a+b;
		
	System.out.println("addition of a and b is :"+c);
	
	}
   public PrivateTest() {
	   System.out.println("explicit timing");
   }
	public static void main(String[] args) {
		PrivateTest pt= new PrivateTest();
		pt.addition();
		System.out.println(pt.a);
		System.out.println(pt.b);
		
		
	}
	
	

}
