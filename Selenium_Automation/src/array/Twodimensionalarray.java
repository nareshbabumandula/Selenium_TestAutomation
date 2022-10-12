package array;

public class Twodimensionalarray {

	public static void main(String[] args) {
	    int a[][]=new int [3][2];
	    
	     a[0][0]=2;
	     a[0][1]=7;
	     a[1][0]=8;
	     a[1][1]=5;
	     a[2][0]=2;
	     a[2][1]=5;
	     for (int i = 0; i < a.length; i++) {
	    	 for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
				
	    	 }
	
		}
	     
	}

}
