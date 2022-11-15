package com.control.statements;

public class LoopsTest {
	
	void forLoopExample() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Iteration is : " +i);
		}
	}
	
	void evenorOddExample() {
		for (int i = 1; i < 100; i++) {
			if(i%2==0) {
				System.out.println(i + " : is an even number");
			}else {
				System.out.println(i + " : is an odd number");
			}
		}
	}
	
	void enhancedForLoopExample() {
		int numbers[] = {10,20,30,40,50,60};
		String names[] = {"padma","saran","vikas","raju","akhil", "priyanka","priyaveena"};
		
		for(int n : numbers) {
			System.out.println("Value is : " + n);
		}
		
		for(String name:names) {
			System.out.println(name);
		}
		
	}
	
	void whileloopExample() {
		int i=10;
		
		while(i<10) {
			System.out.println("Value is : " +i);
			i++;
		}
	}
	
	void doWhileLoopExample() {
		int i=0;
		do {
			System.out.println("Iteration is : " +i);
			i++;
		}while(i<=10);
	}
			
	public static void main(String[] args) {
		LoopsTest lt = new LoopsTest();
		lt.forLoopExample();
		lt.enhancedForLoopExample();
		lt.whileloopExample();
		lt.doWhileLoopExample();
		lt.evenorOddExample();

	}

}
