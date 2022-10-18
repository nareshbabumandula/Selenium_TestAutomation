
public class Exceptionhandling {
void m1() {
	
	try {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition of a and b is :" +c);
		String names  []= {"saran","jaipal","prashanth","raghu"};
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[6]);
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("m1 method failed :"+e.getMessage());
	}
	
}

void m2() {
	System.out.println("hello world");
}

	public static void main(String[] args) {
		Exceptionhandling nv= new Exceptionhandling();
		nv.m1();
		nv.m2();
		
		
	
	}

	}


