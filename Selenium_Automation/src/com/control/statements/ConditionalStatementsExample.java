package com.control.statements;

public class ConditionalStatementsExample {

	int a=10;
	int b=20;

	void ifExample() {
		if (a>b) {
			System.out.println("a is greater than b");
		}else if(a==b) {
			System.out.println("a is equal to b");
		}else {
			System.out.println("a is less than b");
		}
	}
	
	void switchExample(String strDay){
		
		switch (strDay) {
		case "sun": case "sund":
			System.out.println("Sunday");
			break;
		case "mon":
			System.out.println("Monday");
			break;
		case "tue":
			System.out.println("Tuesday");
			break;
		case "wed":
			System.out.println("Wednesday");
			break;
		case "thu":
			System.out.println("Thursday");
			break;
		case "fri":
			System.out.println("Friday");
			break;
		case "sat":
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Invalid Day..!");
			break;
		}
		
		
	}

	public static void main(String[] args) {
		ConditionalStatementsExample ce = new ConditionalStatementsExample();
		ce.ifExample();
		ce.switchExample("asdfasf");
	}

}
