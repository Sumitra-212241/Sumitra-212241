package Assignment_21_05;

public class SquareOfNumber {
	  
     
	
	public int findSquare(int number) {
		
		
		return(number*number) ;
	
	}
	public static void main(String[] args) {
		
		SquareOfNumber s = new SquareOfNumber();
		int square= s.findSquare(10);
		System.out.println("Square of number " +square);
		

	}

}
