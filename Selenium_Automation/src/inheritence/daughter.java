package inheritence;

public class daughter extends Son {
	String colour="white";
	public void travelling() {
		System.out.println("travelling");
		
	}

	public static void main(String[] args) {
		daughter dt=new daughter();
		System.out.println(dt.colour);
		System.out.println(dt.type);
		dt.eat();
		dt.walk();
		System.out.println(dt.legs);
		

	}

}
