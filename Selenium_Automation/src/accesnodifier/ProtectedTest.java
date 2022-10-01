package accesnodifier;

public class ProtectedTest {
	protected int a=10;
	protected int b=20;
	
	protected void addition() {
		int c= a+b;
		
		System.out.println("addition a and b is :"+c);
	}
	


	public static void main(String[] args) {
		ProtectedTest pt=new ProtectedTest();
		pt.addition();
		System.out.println(pt.a);
		System.out.println(pt.b);
		
	}

}
