package Conditionalstatement;

public class IFAndElseStatement {

	public static void main(String[] args) {
		
		
		String examstatus="pass";
		
		if( examstatus=="pass") {
			System.out.println("wait for further round");
			String round1status="pass";
			if(round1status=="pass") {
				System.out.println("you have cleared first round wait for further rounu2");
				String round2status="fail";
				if(round2status=="pass") {
					System.out.println("you have cleared second round wait for further HR round");
		
				
			}
			else {
				System.out.println("you can go to home");
			}
		}

		
		else {
			System.out.println("you can go home");
		}
	}
	
	}
}
		
		
	
