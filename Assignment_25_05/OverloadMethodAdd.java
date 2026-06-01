package Assignment_25_05;

public class OverloadMethodAdd {
	
	public void add(int a,int b ){
		
		int sum = a+b;
		
		System.out.println("Sum of 2 integers "+sum);
	}
	
public void add(int a,int b,int c ){
		
		int sum = a+b+c;
		
		System.out.println("Sum of 3 integers "+sum);
	}
	
	
	
		

	public static void main(String[] args) {
		
		OverloadMethodAdd A = new OverloadMethodAdd();
		A.add(5, 6);
		A.add(10, 20, 30);
		
	        
			
			
		}

	}

